package ver2_lec05.fileIO05.training02;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class IOManyFunction11 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");
		
		BufferedOutputStream bufferedOutputStream = null;
		
		try {
			
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
			
			bufferedOutputStream.write('b');
			bufferedOutputStream.write('a');
			bufferedOutputStream.write('n');
			bufferedOutputStream.write('k');
			bufferedOutputStream.write('.');
			bufferedOutputStream.write('\r');
			bufferedOutputStream.write('\n');
			
			bufferedOutputStream.write("deposit and withdrawal.".getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
