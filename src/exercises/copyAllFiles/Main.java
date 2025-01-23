package exercises.copyAllFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		File p1 = new File("C:\\temp\\csvs");
		File p2 = new File(p1.getPath() + "\\" + "allnfcsv.csv");
		
		convertNfToCsvFile(getAllNfFiles(p1), p2);	
	}
	private static Nf convertCsvLineToNf(String line) {
		String[] data = line.split(",");
		return new Nf(data[0], data[1], data[2]);
	}
	
	private static List<Nf> getAllNfFiles(File path){
		List<Nf> list = new ArrayList<Nf>();
		
		File[] pathFiles = path.listFiles(File::isFile);
		
		String line; 
		
		for (File p : pathFiles) {
			try (BufferedReader br = new BufferedReader(new FileReader(p.getPath()))) {
				while(true) {
					if ((line = br.readLine()) != null) {
						if (!line.contains("\"ID_NF\"")) {
							list.add(convertCsvLineToNf(line));
						}
					}else {
						break;
					}				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}			
		return list;
	}
	
	public static void convertNfToCsvFile(List<Nf> nfs, File file) {
		try(PrintWriter pw = new PrintWriter(new FileWriter(file.getPath()))) {
			for (Nf nf : nfs) {
				pw.println(nf.toString());
				pw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
