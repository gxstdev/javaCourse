package fileAccessDirectories;

import java.io.File;

public class FileAcessDirectories {
	public static void main(String[] args) {
		File path = new File("C:\\temp");
		
		File[] pathFolders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders");
		
		for (File pathFolder : pathFolders) {
			System.out.println(pathFolder);
		}
		
		File[] pathFiles = path.listFiles(File::isFile);
		
		System.out.println("Files \n");
		
		for (File filePath : pathFiles) {
			System.out.println(filePath);
		}
		
		File[] pathFilesAndFolders = path.listFiles();
		
		System.out.println("Folders and Files \n");
		
		for (File pathFileFolder : pathFilesAndFolders) {
			System.out.println(pathFileFolder);
		}
		
		//getName -> retorna o nome do diretório ou arquivo
		System.out.println(path.getName());
		
		//retorna o nome da pasta em que o arquivo está 
		//ou o nome da pasta que o diretório/arquivo está dentro
		System.out.println(path.getParent());
		
		//retorna o nome completo do caminho
		System.out.println(path.getPath());
		
		//criando pastas com File
		boolean sucess = new File(path + "\\subdir").mkdir();
	}
}
