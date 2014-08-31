Quasar Crash
============

This repo reproduces an issue when using [Quasar](https://github.com/puniverse/quasar) 0.6.0.

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
objc[29974]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/bin/java and /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/libinstrument.dylib. One of the two will be used. Which one is undefined.
Exception in Fiber "fiber-10000001" If this exception looks strange, perhaps you've forgotten to instrument a blocking method. Run your program with -Dco.paralleluniverse.fibers.verifyInstrumentation=true to catch the culprit!
java.lang.NullPointerException
	at co.paralleluniverse.strands.Strand.park(Strand.java:485)
	at co.paralleluniverse.strands.ConditionSynchronizer.await(ConditionSynchronizer.java:54)
	at co.paralleluniverse.strands.dataflow.Val.get(Val.java:154)
	at co.paralleluniverse.fibers.Fiber.get(Fiber.java:1279)
	at QuasarCrashRepro.getUnchecked(QuasarCrashRepro.java:26)
	at QuasarCrashRepro.lambda$main$7448ad48$1(QuasarCrashRepro.java:18)
	at QuasarCrashRepro$$Lambda$1/1513712028.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
Exception in Fiber "fiber-10000001" If this exception looks strange, perhaps you've forgotten to instrument a blocking method. Run your program with -Dco.paralleluniverse.fibers.verifyInstrumentation=true to catch the culprit!
java.lang.NullPointerException
	at co.paralleluniverse.strands.Strand.park(Strand.java:485)
	at co.paralleluniverse.strands.ConditionSynchronizer.await(ConditionSynchronizer.java:54)
	at co.paralleluniverse.strands.dataflow.Val.get(Val.java:154)
	at co.paralleluniverse.fibers.Fiber.get(Fiber.java:1279)
	at QuasarCrashRepro.getUnchecked(QuasarCrashRepro.java:26)
	at QuasarCrashRepro.lambda$main$7448ad48$1(QuasarCrashRepro.java:18)
	at QuasarCrashRepro$$Lambda$1/1513712028.run(Unknown Source)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:42)
	at co.paralleluniverse.strands.SuspendableUtils$VoidSuspendableCallable.run(SuspendableUtils.java:30)
	at co.paralleluniverse.fibers.Fiber.run(Fiber.java:1001)
^C%
```
