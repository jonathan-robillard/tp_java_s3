package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
        
        for(int i=0; i<listeners.size(); i++)
        {
            listeners.get(i).newMessage("String level", message);
        }

	}

}
