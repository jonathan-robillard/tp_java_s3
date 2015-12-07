package edu.iut.tools;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import edu.iut.app.Agenda;
import edu.iut.app.CommandLineOption;
import edu.iut.app.CommandLineParser;
import edu.iut.app.ExamEvent;
import edu.iut.io.XMLProjectWriter;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;


public class IUTScheduler {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		Locale.setDefault(Locale.FRANCE);
		
		
		
		CommandLineParser commandLineParser = new CommandLineParser();
		CommandLineOption<java.io.File> configOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE, 
				                                                                           "config","configuration file",
				                                                                           new java.io.File("/tmp"));
		CommandLineOption<String> localeOption = new CommandLineOption<String>(CommandLineOption.OptionType.STRING, 
																			   "locale","en|fr",
																			   new String("fr"));

		CommandLineOption<java.io.File> projectOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE, 
				   																			"project file","xml project file",
				   																		    new java.io.File("/tmp"));
		
		commandLineParser.addOption(configOption);
		commandLineParser.addOption(localeOption);
		commandLineParser.addOption(projectOption);
		
		
		commandLineParser.parse(args);
		
		
		
		System.err.println("Option:"+commandLineParser.getOption("config").getValue());
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});
		
		Date date = new Date(1900, 12, 23);
		ArrayList agenda = new ArrayList<ExamEvent>();
		ExamEvent e1 = new ExamEvent(date, null, null,null, null );
		ExamEvent e2 = new ExamEvent(date, null, null,null, null );
		ExamEvent e3 = new ExamEvent(date, null, null,null, null );
		ExamEvent e4 = new ExamEvent(date, null, null,null, null );
		ExamEvent e5 = new ExamEvent(date, null, null,null, null );
		
		agenda.add(e1);
		agenda.add(e2);
		agenda.add(e3);
		agenda.add(e4);
		agenda.add(e5);
		
		XMLProjectWriter writer = new XMLProjectWriter();
		
		writer.save(agenda);
	}
	
}
