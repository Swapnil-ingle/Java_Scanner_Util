# Java_Scanner_Util

## A wrapper utility class for 'java.util.Scanner'.

Often times while coding, mostly competitive-coding, developers have to manually write the scanning logic to take input from the end user or from an automated test-case. 

This is redundant, as 80% of the such competetive puzzles uses a similar type of input fetching and parsing. The motivation of this Wrapper utility is to alleviates the users from writing their own logic to read input and convert them into workable List, Arrays, Strings, etc and instead focus on the real business logic and let the class handle the peripheral scanning and converting.


## Adding this as a dependency to your project.

I've included the JAR file in the _**Java_Scanner_Util/build/libs/**_ directory.

1. `git clone https://github.com/Swapnil-ingle/Java_Scanner_Util`

2. `cd Java_Scanner_Util/build/libs/`

3. Add the 'sc-util-1.0.0.jar' to your classpath.
> `javac -classpath Java_Scanner_Util/build/libs/sc-util-1.0.0.jar com/example/Foo.java`

4. Add the 'sc-util-1.0.0.jar' to your project in Eclipse.
> ![alt text](https://github.com/Swapnil-ingle/Java_Scanner_Util/docs/img/Add_Ext_Jar_Eclipse.png "Add External JAR to Eclipse")

## Building the project.

1. `git clone https://github.com/Swapnil-ingle/Java_Scanner_Util`

2. `cd Java_Scanner_Util/build/libs/`

3. `gradle clean; gradle eclipse`

4. Import the project from Eclipse IDE.

## Pending features

1. Ability to add this JAR as a Maven or Gradle dependency.

2. Extending the functionality to read from a file and inputStream.
