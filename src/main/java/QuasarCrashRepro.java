import com.google.common.base.Throwables;

import java.util.concurrent.ExecutionException;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableRunnable;
import co.paralleluniverse.strands.channels.Channel;
import co.paralleluniverse.strands.channels.Channels;

public class QuasarCrashRepro {

  public static void main(final String... args) throws InterruptedException, SuspendExecution {
    final Channel<Object> channel = Channels.newChannel(10);
    while (true) {
      new Fiber<>((SuspendableRunnable) () -> {
        final Fiber<Object> child = new Fiber<Object>(() -> "pong").start();
        channel.send(getUnchecked(child));
      }).start();
      channel.receive();
    }
  }

  private static <T> T getUnchecked(final Fiber<T> f) throws InterruptedException {
    try {
      return f.get();
    } catch (ExecutionException e) {
      throw Throwables.propagate(e);
    }
  }
}
