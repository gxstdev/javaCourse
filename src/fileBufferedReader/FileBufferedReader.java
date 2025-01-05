package fileBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferedReader {
	public static void main(String[] args) {
		String line = null;
		
		//instanciando objetos Buffer e File reader dentro do try, para não precisar
		//aninhar try catch dentro do finally
		//Try With Resources, fecha os objetos recebidos no try automaticamente
		//por isso não precisamos chamar bf.close()
		try(BufferedReader bf = new BufferedReader(new FileReader("C:\\temp\\in.txt"))) {
			
			line = bf.readLine();	
			
			while (line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("end");
		}
	}
}
