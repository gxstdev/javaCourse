package fileBufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class FilePrintWriter {
	public static void main(String[] args) {
		Object[] records = new Object[] {"Lista tarefas", 1, "Mercado", 2, "Trabalho", 
				3, "Estudo"};
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("C:\\temp\\tasks.md"))) {
			for (int i = 0; i < records.length; i++) {
				switch (i) {
					case 0: 
						pw.printf("## %s", (String) records[i]);
						//adiciona o caractere especifíco do sistema operacional 
						//para quebra de linha, ex: \n
						pw.print(System.getProperty("line.separator"));  
						break;
					case 1:
						pw.printf("- %d: ", (int) records[i]);
						break;
					case 2:
						pw.printf(" %s", (String) records[i]);
						pw.print(System.getProperty("line.separator"));
						break;
					case 3:
						pw.printf("- %d: ", (int) records[i]);
						break;
					case 4:
						pw.printf(" %s", (String) records[i]);
						pw.print(System.getProperty("line.separator"));
						break;	
					case 5:
						pw.printf("- %d: ", (int) records[i]);
						break;
					case 6:
						pw.printf(" %s", (String) records[i]);
						pw.print(System.getProperty("line.separator"));
						break;		
					default:
						throw new IllegalArgumentException("Unexpected value: " + i);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
