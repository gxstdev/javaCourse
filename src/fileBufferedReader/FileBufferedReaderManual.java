package fileBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//forma manual de se fazer a leitura de um arquivo
public class FileBufferedReaderManual {
	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";
		
		FileReader fl = null;
		BufferedReader bf = null;
		
		try {
			//abrir e ler arquivo
			fl = new FileReader(path);
				//fl.read();
			bf = new BufferedReader(fl);
			
			//quando chega ao final do arquivo, readLine() retorna NULL
			String line = null;
			
			while (true) {
				line = bf.readLine();
				
				if (line != null) {
					System.out.println(line);
				}else {
					System.out.println("break loop");
					break;
				}	
			}
			
		} catch (IOException e) {
			e.printStackTrace();	
		} finally {
			try {
				if (bf != null) {
					bf.close();
				}	
				if (fl != null) {
					fl.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
