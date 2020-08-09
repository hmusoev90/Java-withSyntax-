package com.syntax.class26;

/*Create a class File that will have the following behaviors: 
 * open, edit, close. Edit and close are implemented method 
 * while open is an abstract. Create 3 subclasses: 
 * JavaFile, WordFile, PdfFile that will provide specific 
 * implementation of open behaviour: Example: to open .java file 
 * we need notepad++ or sublime text, to open .doc file we need 
 * Microsoft word to be installed etc.
 * 
 */
abstract public class Open {

	abstract void open();

	public void edit() {
		System.out.println("Files can be edited.");
	}

	public void close() {
		System.out.println("Once you saved your files, simply close it.");
	}
}

class JavaFile extends Open {

	void open() {
		System.out.println(".java File can be opened by Notepad.");
	}
}

class WordFile extends Open {
	void open() {
		System.out.println(".docx files can be opened by MS Word.");
	}
}

class PdfFile extends Open {
	void open() {
		System.out.println(".pdf files can be opened by Adobe Reader.");
	}
}