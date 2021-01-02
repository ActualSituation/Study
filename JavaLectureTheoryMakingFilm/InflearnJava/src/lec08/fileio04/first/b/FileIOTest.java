package lec08.fileio04.first.b;

import java.io.File;

public class FileIOTest {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\dev\\test.txt");
		
		boolean fileExists = file.exists();
		if (fileExists == false) {
			file.mkdirs();
		}
		System.out.println("������ �����մϱ�? : " + fileExists);
		
		File notExistsFile = new File("C:\\dev\\fileFolder\\test.txt");
		if (notExistsFile.exists() == false) {
			System.out.println("notExistsFile�� �����ϴ�.");
			File folderPath = notExistsFile.getAbsoluteFile().getParentFile();
			if (folderPath.exists() == false) {
				boolean folderpathMkdirs = folderPath.mkdirs();
				if (folderpathMkdirs == true) {
					System.out.println("notExistsFile ������ ��������ϴ�.");
				}
				try {
					notExistsFile.createNewFile();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("notExistsFile �����Ǿ��°�? : " + notExistsFile.exists());
		
	}

}
