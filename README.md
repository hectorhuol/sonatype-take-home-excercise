# Convert Number To Text
This source code contains the solution for the take home exercise on Sonatype

## Prerequisites
You need to ensure you have the next tools installed: 
* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Maven](https://maven.apache.org/)

## Run the code
To run the code please execute this line on CLI

```shell
mvn clean compile exec:java -Dexec.mainClass=com.sonatype.exercise.Main
```
* You will be asked to enter an integer number between  -2147483648 and 2147483647
* You can use any of the next formats. Note, D is a digit in this range [0-9]:
    * DDDDDDDDDD
    * D,DDD,DDD,DDD

## Some Decisions
* The program is running using CLI, you will need to enter the number you want to convert from number to english text equivalent
* Unit tests were created in BDD style to help group and interpreting of the tests  