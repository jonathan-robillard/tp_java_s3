package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
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
                JMenu mView;
                JMenuItem miAbout;
                JMenuItem miMonth;
                JMenuItem miWeek;
                JMenuItem miDay;
		
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
                
                // Menu...
                miLoad = new JMenuItem("Load");
                miLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miLoad.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miLoad);
                
                miSave = new JMenuItem("Save");
                miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miSave.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miSave);
                
                miQuit = new JMenuItem("Quit");
                miQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miQuit.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuFile.add(miQuit);
                
                mView = new JMenu("View");
                mView.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
                menuEdit.add(mView);
                
                miAbout = new JMenuItem("About");
                miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miAbout.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                menuHelp.add(miAbout);
                
                // Sous-menu...
                miMonth = new JMenuItem("Month");
                miMonth.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miMonth.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                mView.add(miMonth);
                
                miWeek = new JMenuItem("Week");
                miWeek.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miWeek.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                mView.add(miWeek);
                
                miDay = new JMenuItem("Day");
                miDay.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
                miDay.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
                mView.add(miDay);
                
                
                // contentPane.add(menuBar);
		
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
                
                miLoad.addActionListener((ActionEvent event) -> {
                    JOptionPane j;
                    j = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Fonction non-implémentée !", "Information", JOptionPane.INFORMATION_MESSAGE);
                });
                
                miSave.addActionListener((ActionEvent event) -> {
                    JOptionPane j;
                    j = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Fonction non-implémentée !", "Information", JOptionPane.INFORMATION_MESSAGE);
                });
                
                miQuit.addActionListener((ActionEvent event) -> {
                    JOptionPane j;
                    j = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Fonction non-implémentée !", "Information", JOptionPane.INFORMATION_MESSAGE);
                });
                
                miAbout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        JOptionPane j;
                        j = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Fonction non-implémentée !", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
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
