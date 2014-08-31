Quasar Crash
============

This repo reproduces a crash when using [Quasar](https://github.com/puniverse/quasar) 0.6.0.

```
mvn clean compile exec:exec
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building quasar-crash 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ quasar-crash ---
[INFO] Deleting /Users/dano/projects/quasar-crash/target
[INFO]
[INFO] --- maven-dependency-plugin:2.8:properties (getClasspathFilenames) @ quasar-crash ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ quasar-crash ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/dano/projects/quasar-crash/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ quasar-crash ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/dano/projects/quasar-crash/target/classes
[INFO]
[INFO] --- exec-maven-plugin:1.3.2:exec (default-cli) @ quasar-crash ---
objc[28600]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/bin/java and /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/libinstrument.dylib. One of the two will be used. Which one is undefined.
Exception in Fiber "fiber-10000513" java.lang.IllegalMonitorStateException: attempt by Fiber@10000513[task: ParkableForkJoinTask@42c67e2d(Fiber@10000513), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@47cf6bc6, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000513" java.lang.IllegalMonitorStateException: attempt by Fiber@10000513[task: ParkableForkJoinTask@42c67e2d(Fiber@10000513), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@47cf6bc6, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
Exception in Fiber "fiber-10000524" java.lang.IllegalMonitorStateException: attempt by Fiber@10000524[task: ParkableForkJoinTask@18a7ddb6(Fiber@10000524), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@1c985a7a, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000556" java.lang.IllegalMonitorStateException: attempt by Fiber@10000556[task: ParkableForkJoinTask@25d934f9(Fiber@10000556), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@21e6b49a, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000556" java.lang.IllegalMonitorStateException: attempt by Fiber@10000556[task: ParkableForkJoinTask@25d934f9(Fiber@10000556), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@21e6b49a, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000583" java.lang.IllegalMonitorStateException: attempt by Fiber@10000583[task: ParkableForkJoinTask@63a59c1c(Fiber@10000583), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@6edb5be3, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
Exception in Fiber "fiber-10000529" java.lang.IllegalMonitorStateException: attempt by Fiber@10000529[task: ParkableForkJoinTask@3fbdffaa(Fiber@10000529), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@3b827c85, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000583" 	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
java.lang.IllegalMonitorStateException: attempt by Fiber@10000583[task: ParkableForkJoinTask@63a59c1c(Fiber@10000583), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@6edb5be3, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000529" java.lang.IllegalMonitorStateException: attempt by Fiber@10000529[task: ParkableForkJoinTask@3fbdffaa(Fiber@10000529), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@3b827c85, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000524" java.lang.IllegalMonitorStateException: attempt by Fiber@10000524[task: ParkableForkJoinTask@18a7ddb6(Fiber@10000524), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@1c985a7a, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001192" java.lang.IllegalMonitorStateException: attempt by Fiber@10001192[task: ParkableForkJoinTask@64e43ec2(Fiber@10001192), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@39585c3b, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001192" java.lang.IllegalMonitorStateException: attempt by Fiber@10001192[task: ParkableForkJoinTask@64e43ec2(Fiber@10001192), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@39585c3b, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001312" java.lang.IllegalMonitorStateException: attempt by Fiber@10001312[task: ParkableForkJoinTask@7e80f591(Fiber@10001312), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@1f24800b, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001312" java.lang.IllegalMonitorStateException: attempt by Fiber@10001312[task: ParkableForkJoinTask@7e80f591(Fiber@10001312), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@1f24800b, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001413" java.lang.IllegalMonitorStateException: attempt by Fiber@10001413[task: ParkableForkJoinTask@55cad915(Fiber@10001413), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@419ce552, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001413" java.lang.IllegalMonitorStateException: attempt by Fiber@10001413[task: ParkableForkJoinTask@55cad915(Fiber@10001413), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@419ce552, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
Exception in Fiber "fiber-10001441" java.lang.IllegalMonitorStateException: attempt by Fiber@10001441[task: ParkableForkJoinTask@3d53829a(Fiber@10001441), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@3c1086dd, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10001441" java.lang.IllegalMonitorStateException: attempt by Fiber@10001441[task: ParkableForkJoinTask@3d53829a(Fiber@10001441), target: co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable@3c1086dd, scheduler: co.paralleluniverse.fibers.FiberForkJoinScheduler@67eb075e] but owned by null
	at co.paralleluniverse.strands.OwnedSynchronizer.register(OwnedSynchronizer.java:36)
	at co.paralleluniverse.strands.channels.QueueChannel.receive(QueueChannel.java:332)
	at QuasarCrashRepro.lambda$main$1f5289dc$2(QuasarCrashRepro.java:29)
	at QuasarCrashRepro$$Lambda$2/1709366259.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
^C%
```
