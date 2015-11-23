package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile;
                JMenu menuEdit;
                JMenu menuHelp;
		JMenuItem miLoad;
                JMenuItem miSave;
                JMenuItem miQuit;
                JMenuItem miView;
                JMenuItem miDisplay;
                JMenuItem miAbout;
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		
		menuFile = new JMenu("File");
                menuEdit = new JMenu("Edit");
                menuHelp = new JMenu("Help");
		menuBar.add(menuFile);
                menuBar.add(menuEdit);
                menuBar.add(menuHelp);
                
                
                
                menuFile.setMnemonic(KeyEvent.VK_A);
                menuFile.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
                menuBar.add(menuFile);
                menuBar.add(menuEdit);
                menuBar.add(menuHelp);
                
                
                miLoad = new JMenuItem("Load", KeyEvent.VK_T);
                miLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miLoad.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miLoad);
                
                miSave = new JMenuItem("Save", KeyEvent.VK_T);
                miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miSave.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miSave);
                
                miQuit = new JMenuItem("Quit", KeyEvent.VK_T);
                miQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miQuit.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miQuit);
                
                miView = new JMenuItem("View", KeyEvent.VK_T);
                miView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miView.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuEdit.add(miView);
                
                miAbout = new JMenuItem("About", KeyEvent.VK_T);
                miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miAbout.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuHelp.add(miAbout);
                
                
                // contentPane.add(menuBar);
		
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}
	
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
}
