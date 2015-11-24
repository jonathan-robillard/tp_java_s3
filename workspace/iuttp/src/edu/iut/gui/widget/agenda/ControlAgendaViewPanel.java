package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;
import javax.swing.SpinnerListModel;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
                
                // Spinner Années
                String[] year = 
                    { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" };
                    // null;
                /* A REGARDER !!! */
                /*for( int i=0 ; i<10 ; i++) {
                    year[i] = Integer.toString(2010 + i);
                }*/
                SpinnerModel listModel = new SpinnerListModel(year);
                JSpinner spinner = new JSpinner(listModel);
                this.add(spinner);
                
                
                
                /*String[] year = null;
                for( int i=0 ; i<10 ; i++) {
                    int y = 2010 + i;
                    year[i] = Integer.toString(y);
                }
                SpinnerListModel yearModel = new SpinnerListModel(year);
                JSpinner spinner = new JSpinner(yearModel);*/
                
                //Spinner nextView = new JButton("Next");
		/*spinner.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				agendaViewLayout.next(contentPane);				
			}			
		});*/
		
                
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
