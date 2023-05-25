#!/bin/bash

folder_path="submit"
team_name="Team4"
if [ ! -d "$folder_path" ]; then
    mkdir -p "$folder_path"
    cd $folder_path
    if [ ! -d "$team_name" ]; then
        mkdir -p "$team_name"
    fi
fi

cd ..
cp src/* "$folder_path"/"$team_name"/
rm "$folder_path"/"$team_name"/MainTest.java

javac -d target ./"$folder_path"/"$team_name"/*.java
cd target
java Main ../Sample.in > ../outputFiles/sampleOutput
