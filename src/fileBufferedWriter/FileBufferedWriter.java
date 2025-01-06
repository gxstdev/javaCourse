package fileBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileBufferedWriter {
	public static void main(String[] args) {
		//arquivo não precisa existir, pois o BufferedWriter cria ele, como o nome passado
		String path = "C:\\temp\\out.md";
		
		String[] lines = new String[] {"FileReader", "FileWriter", "BufferedReader", 
				"BufferedWriter"};
		
		//bw irá criar e escrever no arquivo que está em 'path'
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				
				//quebra de linha
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//caso o arquivo em path não existe, ele criará, mas se o arquivo já existir 
		//com o segundo parâmetro true, a cada vez que o código for executado, ele 
		//adiciona o texto passado para .write()
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				
				//quebra de linha
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
