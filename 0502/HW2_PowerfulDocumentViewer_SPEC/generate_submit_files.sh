#!/bin/bash

folder_path="submit"
if [ ! -d "$folder_path" ]; then
    mkdir -p "$folder_path"
fi

cp src/* "$folder_path"/
rm "$folder_path"/MainTest.java

javac -d target ./"$folder_path"/*.java
cd target
java Main ../sampleInput > ../outputFiles/sampleOutput
