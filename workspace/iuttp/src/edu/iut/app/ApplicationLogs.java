package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for(int i = 0; i<filteredLogs.size(); i++)
		{
			filteredLogs.get(i).getMessage();
		}
		
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for(int i = 0; i<filteredLogs.size(); i++)
		{
			filteredLogs.get(i).getMessage();
		}
		
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		
		for(int i = 0; i<filteredLogs.size(); i++)
		{
			filteredLogs.get(i).getMessage();
		}
		// une boucle à faire ici, penser à utiliser instanceof
		return filteredLogs;
	}
	

}
