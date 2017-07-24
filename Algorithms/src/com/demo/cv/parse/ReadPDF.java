package com.demo.cv.parse;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 * Reading and parsing PDF documents using PDFBox
 * @author Rishu
 *
 */
public class ReadPDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String file="F:\\\\MyCV\\\\Resume_323585_Rishu Shrivastava.pdf";
			PDDocument document = null;
			document = PDDocument.load(new File(file));
			document.getClass();
			if (!document.isEncrypted()) {
		        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		        stripper.setSortByPosition(true);
		        PDFTextStripper Tstripper = new PDFTextStripper();
		        String st = Tstripper.getText(document);
		        System.out.println("Text:" + st);
		    }			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
