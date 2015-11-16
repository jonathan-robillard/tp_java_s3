package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {

	@Override
	protected void showMessage() {
		System.err.println("Erreur lors de l'affichage du message");
	}

}
