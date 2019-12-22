package com.github.single.sc.util;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScannerUtil {
	private static final String DEFAULT_DELIMITER = " ";

	private static ScannerUtil instance = new ScannerUtil();

	private Scanner sc = new Scanner(System.in);

	private ScannerUtil() {
	};

	public static ScannerUtil getInstance() {
		return instance;
	}
	
	public void cleanUp() {
		sc.close();
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public boolean hasNextLine() {
		return sc.hasNextLine();
	}

	public Integer[] nextLineAsIntArray() {
		return nextLineAsIntArray(DEFAULT_DELIMITER);
	}

	public Integer[] nextLineAsIntArray(String delim) {
		return toIntArr(splitToStream(delim));
	}

	public String[] nextLineAsStrArr() {
		return nextLineAsStrArr(DEFAULT_DELIMITER);
	}

	public String[] nextLineAsStrArr(String delim) {
		return toStrArr(splitToStream(delim));
	}

	public Double[] nextLineAsDoubleArr() {
		return nextLineAsDoubleArr(DEFAULT_DELIMITER);
	}

	public Double[] nextLineAsDoubleArr(String delim) {
		return toDoubleArr(splitToStream(delim));
	}

	private Integer[] toIntArr(Stream<String> inpStream) {
		return inpStream.map(Integer::valueOf).collect(Collectors.toList()).toArray(new Integer[0]);
	}

	private String[] toStrArr(Stream<String> inpStream) {
		return inpStream.map(String::valueOf).collect(Collectors.toList()).toArray(new String[0]);
	}

	private Double[] toDoubleArr(Stream<String> inpStream) {
		return inpStream.map(Double::valueOf).collect(Collectors.toList()).toArray(new Double[0]);
	}

	private Stream<String> splitToStream(String delim) {
		return Arrays.stream(sc.nextLine().split(delim));
	}
}