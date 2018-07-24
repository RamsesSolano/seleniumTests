package threeC.seleniumTests.main;

import javax.swing.JFrame;

import threeC.seleniumTests.view.MainWindow;
import threeC.seleniumTests.world.TestUrl;

public class Main {

	public static void main(String[] args) {

		
		MainWindow mainWindow = new MainWindow(); 
		mainWindow.setVisible(true);
		mainWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
		return ; 
		
		
		/*
		TestUrl newTests = new TestUrl("http://demo.guru99.com/test/newtours/");
		String result = newTests.browserLogs();
		System.out.println(result);
		*/
	}

}
