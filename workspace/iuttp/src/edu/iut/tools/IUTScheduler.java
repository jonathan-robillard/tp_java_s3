package edu.iut.tools;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import edu.iut.app.Agenda;
import edu.iut.app.Classroom;
import edu.iut.app.CommandLineOption;
import edu.iut.app.CommandLineParser;
import edu.iut.app.Document;
import edu.iut.app.ExamEvent;
import edu.iut.app.Person;
import edu.iut.io.XMLProjectWriter;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;


public class IUTScheduler {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException, FileNotFoundException {
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
		
		
		
		/*System.err.println("Option:"+commandLineParser.getOption("config").getValue());
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});*/
		
		Date date = new Date(1900, 12, 23);
		Agenda agenda = new Agenda();
		Person p1 = new Person(Person.PersonFunction.STUDENT, "Jean", "Jacques", "jean@hotmail.fr", "0633333333");
		Person p2 = new Person(Person.PersonFunction.STUDENT, "Jeanne", "Jacques", "jean@hotmail.fr", "0633333333");
		Person p3 = new Person(Person.PersonFunction.JURY, "Pierre", "Jacques", "jean@hotmail.fr", "0633333333");
		Person p4 = new Person(Person.PersonFunction.JURY, "Henry", "Jacques", "jean@hotmail.fr", "0633333333");
		
		ArrayList<Person> jury = new ArrayList<Person>();
		jury.add(p3);
		jury.add(p4);
		Classroom classroom = new Classroom("1");
		ArrayList<Document> documents = new ArrayList<Document>();
		Document doc1 = new Document("document 1");
		documents.add(doc1);
		
		ExamEvent e1 = new ExamEvent(date, p1, jury,classroom, documents );
		ExamEvent e2 = new ExamEvent(date, p1, jury,classroom, documents );
		ExamEvent e3 = new ExamEvent(date, p2, jury,classroom, documents );
		ExamEvent e4 = new ExamEvent(date, p2, jury,classroom, documents );
		ExamEvent e5 = new ExamEvent(date, p2, jury,classroom, documents );
		
		
		agenda.add(e1);
		agenda.add(e2);
		agenda.add(e3);
		agenda.add(e4);
		agenda.add(e5);
		
		XMLProjectWriter writer = new XMLProjectWriter();
		
		writer.save(agenda, "m.xml");
	}
	
}
