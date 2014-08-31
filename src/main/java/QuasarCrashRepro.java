import com.google.common.base.Throwables;

import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.strands.SuspendableRunnable;

public class QuasarCrashRepro {

  public static void main(final String... args) {
    new Fiber<>((SuspendableRunnable) () -> {
      IntStream.range(0, 1)
          .mapToObj((s) -> new Fiber<>(() -> "pong").start())
          .map((t) -> {
            try {
              return t.get();
            } catch (ExecutionException | InterruptedException e) {
              throw Throwables.propagate(e);
            }
          });
    }).start();
  }
}
