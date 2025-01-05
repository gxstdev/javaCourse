package fileBufferedReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {
	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}

		}

	}
}
