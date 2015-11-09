package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
        
        for(int i=0; i<listeners.size(); i++)
        {
            listeners.get(i).newMessage("String level", message);
        }
	}
}
