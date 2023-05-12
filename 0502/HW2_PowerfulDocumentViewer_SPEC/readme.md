# Steps to run & test the project

1. Copy `lib.zip` under `Homework/` to the project's root directory and unzip the file
1. Finish your code in IntelliJ IDEA
1. Double click to run `run_test.sh`, `run_test.sh` will do the following things:
   * compile the java code in `src/` to `target/`
   * generate the System.out of your code to `outputFiles/` using both sampleInput and testCases
   * run junit test to compare the expected and actual output
1. Double click to run `generate_submit_files.sh`, `generate_submit_files.sh` will do the following things:
   * copy the java code in `src/` to `submit/` except `MainTest.java` (can't submit test code with the third party library)
   * compile the java code in `submit/` to `target/`
   * generate the System.out of your code to `outputFiles/` using sampleInput
