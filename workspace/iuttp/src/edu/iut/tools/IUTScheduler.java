package edu.iut.tools;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// Test

public class IUTScheduler {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);    
		    }
		});
	}
	
}
