Quasar Crash
============

This repo reproduces an issue when using [Quasar](https://github.com/puniverse/quasar) 0.6.0 with
JDK 8 Streams.

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
objc[29284]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/bin/java and /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/libinstrument.dylib. One of the two will be used. Which one is undefined.
[quasar] ERROR: Unable to instrument class QuasarCrashRepro
java.lang.IllegalArgumentException: INVOKESPECIAL/STATIC on interfaces require ASM 5
	at org.objectweb.asm.MethodVisitor.visitMethodInsn(Unknown Source)
	at org.objectweb.asm.ClassReader.a(Unknown Source)
	at org.objectweb.asm.ClassReader.b(Unknown Source)
	at org.objectweb.asm.ClassReader.accept(Unknown Source)
	at org.objectweb.asm.ClassReader.accept(Unknown Source)
	at co.paralleluniverse.fibers.instrument.QuasarInstrumentor.instrumentClass(QuasarInstrumentor.java:100)
	at co.paralleluniverse.fibers.instrument.QuasarInstrumentor.instrumentClass(QuasarInstrumentor.java:81)
	at co.paralleluniverse.fibers.instrument.JavaAgent$Transformer.transform(JavaAgent.java:187)
	at sun.instrument.TransformerManager.transform(TransformerManager.java:188)
	at sun.instrument.InstrumentationImpl.transform(InstrumentationImpl.java:428)
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:760)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:455)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:367)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:360)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:495)
[quasar] ERROR: while transforming QuasarCrashRepro: INVOKESPECIAL/STATIC on interfaces require ASM 5
java.lang.IllegalArgumentException: INVOKESPECIAL/STATIC on interfaces require ASM 5
	at org.objectweb.asm.MethodVisitor.visitMethodInsn(Unknown Source)
	at org.objectweb.asm.ClassReader.a(Unknown Source)
	at org.objectweb.asm.ClassReader.b(Unknown Source)
	at org.objectweb.asm.ClassReader.accept(Unknown Source)
	at org.objectweb.asm.ClassReader.accept(Unknown Source)
	at co.paralleluniverse.fibers.instrument.QuasarInstrumentor.instrumentClass(QuasarInstrumentor.java:100)
	at co.paralleluniverse.fibers.instrument.QuasarInstrumentor.instrumentClass(QuasarInstrumentor.java:81)
	at co.paralleluniverse.fibers.instrument.JavaAgent$Transformer.transform(JavaAgent.java:187)
	at sun.instrument.TransformerManager.transform(TransformerManager.java:188)
	at sun.instrument.InstrumentationImpl.transform(InstrumentationImpl.java:428)
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:760)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:455)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:367)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:360)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:495)
```
