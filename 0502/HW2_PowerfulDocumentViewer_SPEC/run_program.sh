#!/bin/bash
javac -cp "lib/*" -d target *.java
cd target
java -jar ../lib/junit-platform-console-standalone-1.9.1.jar -cp . --scan-class-path
java Main sampleInput > output.txt
echo "Press any key to exit..."
read -n 1 -s
