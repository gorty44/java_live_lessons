package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionTest {
	public static void main(String[] args) {
		Path path = Paths.get("src", "exceptions");

		// TRY-WITH-RESOURCES for any class that implements AutoCloseable
		try (BufferedReader bf = Files.newBufferedReader(path.resolve("ExceptionTest.java"))) {
			bf.lines().forEach(System.out::println);
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		
		// TRY MULTI-CATCH BLOCK
		try {
			ExceptionTest et = ExceptionTest.class.newInstance();
			System.out.println(et);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// Self-made exception class
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
