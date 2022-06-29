package org.language;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public void Selenium() {
		System.out.println("Class Selenium");
	}
	public void Java() {
		System.out.println("Class Java");
	}
	
	public static void main(String[] args) {
		Automation test = new Automation();
		test.python();
		test.Selenium();
		test.Java();
		test.ruby();
		
	}
	}
