package in.thiru.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessing {
	
	public static void main(String[] args) {
		// Define the path to the file
        String filePath = "D:\\ASHOKIT\\24-JAVA8FEATURES\\Advanced\\src\\example.txt";

        try {
            // Read lines from the file, process them, and collect them into a list
            List<String> processedLines = Files.lines(Paths.get(filePath))
                    .map(String::trim) // Trim whitespace from each line
                    .filter(line -> !line.isEmpty()) // Filter out empty lines
                    .filter(line -> !line.startsWith("#")) // Filter out lines that start with "#"
                    .map(String::toUpperCase) // Convert each line to uppercase
                    .collect(Collectors.toList()); // Collect the processed lines into a list

            // Print each processed line
            processedLines.forEach(System.out::println);
        } catch (IOException e) {
            // Handle the exception if an I/O error occurs
            e.printStackTrace();
        }
	}

}
