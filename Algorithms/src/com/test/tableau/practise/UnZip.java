package com.test.tableau.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {

	public static void main(String[] args) {
		
		byte[] buffer = new byte[4096];
		String input_zip = "C:\\Users\\Rishu\\Desktop\\zipper\\FloweringTimeDash.twbx";
		String output_dir = "C:\\Users\\Rishu\\Desktop\\zipper\\output";
		
		//create output dir
		File folder = new File(output_dir);
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		try {
			ZipInputStream zip = new ZipInputStream(new FileInputStream(input_zip));
			ZipEntry ze = zip.getNextEntry();
			while(ze!=null) {

				String filename = ze.getName();
				File newFile = new File(output_dir + File.separator + filename);
				
				System.out.println("Unzipping File:"+ newFile);
				
				//create subfolders
				new File(newFile.getParent()).mkdirs();
				
				FileOutputStream fos = new FileOutputStream(newFile);
				
				int len;
				while((len = zip.read(buffer))>0) {
					fos.write(buffer, 0, len);
				}
				
				fos.close();
				ze = zip.getNextEntry();
			}
			
			zip.closeEntry();
			zip.close();
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
