# abcl-play
Play with ABCL to learn how to make CL projects compatible with Java

## Building and Running Instructions
To compile 

    cmd$ javac -cp /opt/java/abcl.jar Main.java

where "/opt/java/abcl.jar" represents the path to your abcl.jar file.

This compiles the Java source file "Main.java" into a JVM runtime or class file named "Main.class".

To run the example (Main.class for example) from a Unix-like OS use:

    cmd$ java -cp /opt/java/abcl.jar:. Main

where "Main" is the initial class to run in your Java program.
