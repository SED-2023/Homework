#!/bin/bash
javac -cp "lib/*" -d target ./src/*.java
cd target
java LibrarySystem ../sample.in > ../outputFiles/sampleResult

directory="../testCase"
search_string="_Input"
replacement_string="_Result"
for file in "$directory"/*; do
    # Check if the current item is a file
    if [[ -f "$file" ]]; then
        filename=$(basename "$file")
        if [[ $filename == *_Input.txt ]]; then
          echo "Processing file: $filename"
          result="${filename//$search_string/$replacement_string}"
          java LibrarySystem ../testCase/"$filename" > ../outputFiles/"$result"
        fi
    fi
done

# run junit test
java -jar ../lib/junit-platform-console-standalone-1.9.1.jar -cp . --scan-class-path

echo "Press any key to exit..."
read -n 1 -s
