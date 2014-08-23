package net.garamsoft.common.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileUtil {
	
	public static void main(String[] args) throws IOException {
		saveFile("/Users/garam/java/test/FileUtil", "test", "안녕하세요");
	}
	
	public final static void saveFile(String pathname,String fileName,String contents) throws IOException{
		
		File filePath = new File(pathname);
		
		if(!filePath.exists())
			filePath.mkdirs();
		
		File file = new File(filePath, fileName);
		if(file.exists())
			file.createNewFile();
		
		OutputStream os = null;
		
		try {
			os = new BufferedOutputStream(new FileOutputStream(file));
			os.write(contents.getBytes());
			os.flush();	
		} catch (IOException e) {
			throw e;
		} finally{
			if(os !=null){
				os.close();
				os = null;
			}
		}
		
	}
	
}
