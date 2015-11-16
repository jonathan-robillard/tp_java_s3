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
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(message);
		}
	}

	@Override
	public IApplicationLogListener[] getpplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}

}
