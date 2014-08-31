import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableRunnable;
import co.paralleluniverse.strands.channels.Channel;
import co.paralleluniverse.strands.channels.Channels;

public class QuasarCrashRepro {

  public static void main(final String... args) throws InterruptedException, SuspendExecution {
    final int M = 10;

    final Channel<String> requests = Channels.newChannel(M * 2);
    final Channel<String> replies = Channels.newChannel(M * 2);

    // Put M requests in-flight
    for (int i = 0; i < M; i++) {
      requests.send("ping");
      new Fiber<>((SuspendableRunnable) () -> {
        requests.receive();
        replies.send("pong");
      }).start();
    }

    // Spawn a new request for every reply
    while (true) {
      replies.receive();
      requests.send("ping");
      new Fiber<>((SuspendableRunnable) () -> {
        requests.receive();
        replies.send("pong");
      }).start();
    }
  }

}
