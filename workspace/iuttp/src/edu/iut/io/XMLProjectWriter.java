package edu.iut.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.beans.XMLEncoder;
import java.util.ArrayList;

import edu.iut.app.Agenda;
import edu.iut.app.ExamEvent;

//EX 1 Completer la classe 

public class XMLProjectWriter {
	
	public XMLProjectWriter() {		
	}
	
	public void save(Agenda data/*, java.io.File xmlfile*/) throws FileNotFoundException{
		XMLEncoder encoder = new XMLEncoder(new FileOutputStream("toto.xml"));
		try {
            // serialisation de l'objet
			for(ExamEvent e : data)
			{
				encoder.writeObject(e.getDate());
	            encoder.flush();
			}
			
        } finally {
            // fermeture de l'encodeur
            encoder.close();
        }
	}
}
