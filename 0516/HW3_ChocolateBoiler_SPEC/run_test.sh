#!/bin/bash
javac -cp "lib/*" -d target ./src/*.java
cd target
java Main ../sampleInput > ../outputFiles/sampleResult

for ((i=1; i<=3; i++))
do
    java Main ../testCase/test"$i"_Input.txt > ../outputFiles/test"$i"_Result.txt
done
# run junit test
java -jar ../lib/junit-platform-console-standalone-1.9.1.jar -cp . --scan-class-path

echo "Press any key to exit..."
read -n 1 -s
