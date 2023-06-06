#!/bin/bash

main_class="Main"
sample_input="Sample0.in"
folder_path="submit"
team_name="Team4"
if [ -d "$folder_path" ]; then
    rm -rf "$folder_path"
fi

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
java "$main_class" "../$sample_input" > ../outputFiles/sampleOutput

echo "Press any key to exit..."
read -n 1 -s
