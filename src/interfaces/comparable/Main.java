package interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		String path = "C:\\temp\\comparable\\func.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String textEmployee = br.readLine();
			
			while (textEmployee != null) {
				String[] data = textEmployee.split(",");
				
				list.add(new Employee(data[0], Double.valueOf(data[1])));
				textEmployee = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee e : list) {
				System.out.println(e);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
