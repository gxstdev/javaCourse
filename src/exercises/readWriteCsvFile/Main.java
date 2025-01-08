package exercises.readWriteCsvFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String path = "C:\\temp\\arq\\products.csv";
		generateProductSumaryFile(getProductsCsvFile(path), generateOutDir(path));
		
	}

	private static List<Product> getProductsCsvFile(String path) {
		List<Product> products = new ArrayList<Product>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while ((line = br.readLine()) != null) {
				String[] data = line.replaceAll("\"", "").split(",");			
				products.add(new Product(data[0], Double.valueOf(data[1]), 
						          Integer.valueOf(data[2])));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return products;
	}
	
	private static void generateProductSumaryFile(List<Product> products, String path) {
		String summaryFile = "summary.csv";
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(path + "\\" + summaryFile))) {
			for (Product product : products) {
				String name = product.getName();
				Double totalValue = (product.getPrice() * product.getAmount());
				pw.println(new ProductSummary(name, totalValue).toString());
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String generateOutDir(String path) {
		String pathOutDir = path.replace(new File(path).getName(), "") + "\\out";	
		return new File(pathOutDir).mkdir() ? pathOutDir : null;
	}
}
