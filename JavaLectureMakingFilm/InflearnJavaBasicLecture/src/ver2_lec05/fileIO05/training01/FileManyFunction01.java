package ver2_lec05.fileIO05.training01;

import java.io.File;
import java.util.Date;

public class FileManyFunction01 {
	
	public static void main(String[] args) throws Exception {
		
		File txtFile = new File("C:\\dev\\FileIOTextFile.txt");
		File txtFolder = new File("C:\\dev\\FileIOFolder");
		
		String fileName = txtFile.getName();
		System.out.println("fileName : " + fileName);
		
//		long longLastModified = txtFile.lastModified();
//		System.out.println("longLastModified : " + longLastModified);
//		Date dateLastModified = new Date(longLastModified);
//		System.out.println("dateLastModified : " + dateLastModified);
//		
//		String filePath = txtFile.getPath();
//		System.out.println("filePath : " + filePath);
//		String fileAbsolutePath = txtFile.getAbsolutePath();
//		System.out.println("fileAbsolutePath : " + fileAbsolutePath);
//		String fileCanonicalPath = txtFile.getCanonicalPath();
//		System.out.println("fileCanonicalPath : " + fileCanonicalPath);
//		
//		boolean txtFileExists = txtFile.exists();
//		System.out.println("txtFileExists : " + txtFileExists);
//		
//		boolean txtFileFile = txtFile.isFile();
//		System.out.println("txtFileFile : " + txtFileFile);
//		boolean txtFolderFile = txtFolder.isFile();
//		System.out.println("txtFolderFile : " + txtFolderFile);
//		
//		boolean txtFileDirectory = txtFile.isDirectory();
//		System.out.println("txtFileDirectory : " + txtFileDirectory);
//		boolean txtDirectory = txtFolder.isDirectory();
//		System.out.println("txtDirectory : " + txtDirectory);
		
//		String[] txtFileList = txtFile.list();
//		System.out.println("txtFileList : " + txtFileList);
//		String[] txtFolderList = txtFolder.list();
//		for (int i = 0; i < txtFolderList.length; i++) {
//			System.out.println(txtFolderList[i]);
//		}
		
//		boolean mkdir = txtFolder.mkdir();
//		System.out.println("mkdir : " + mkdir);
//		boolean mkdirs = txtFolder.mkdirs();
//		System.out.println("mkdirs : " + mkdirs);
//		
//		File createFolder = new File("C:\\dev\\FileIOFolder\\newFolder");
//		boolean createMkdirs = createFolder.mkdirs();
//		System.out.println("createMkdirs : " + createMkdirs);
		
//		File txtNewFileCreate = new File("C:\\dev\\createNewFile.txt");
//		boolean newFile = txtNewFileCreate.createNewFile();
//		System.out.println("newFile : " + newFile);
//		
//		File txtNewFileCreate1234 = new File("C:\\dev\\createNewFile1234.txt");
//		boolean tfRenameTo = txtNewFileCreate.renameTo(txtNewFileCreate1234);
//		System.out.println("tfRenameTo : " + tfRenameTo);
		
//		File deleteFolder = new File("C:\\dev\\deleteFolder");
//		boolean tfDelete = deleteFolder.delete();
//		System.out.println("tfDelete : " + tfDelete);
		
		long freeSpace = txtFile.getFreeSpace();
		System.out.println("freeSpace : " + freeSpace);
		long freeSpaceGB = ((freeSpace / 1024) / 1024) / 1024;
		System.out.println("freeSpaceGB : " + freeSpaceGB);
		
		long totalSpace = txtFile.getTotalSpace();
		System.out.println("totalSpace : " + totalSpace);
		long totalSpaceGB = ((totalSpace / 1024) / 1024) / 1024;
		System.out.println("totalSpaceGB : " + totalSpaceGB);
		
		/**
		 * ./
		 * ../
		 */
		
	}

}
