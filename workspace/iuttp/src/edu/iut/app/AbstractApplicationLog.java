package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	public ArrayList<IApplicationLogListener> listeners;

	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}

    public String getMessage()
    {
        return message;
    }

    public void addListener(IApplicationLogListener listener)
    {
        listeners.add(listener);
    }

    public ArrayList<IApplicationLogListener> getApplicationLogListeners()
    {
        return listeners;
    }


    /** TP1 : Fonction venant de l'interface par héritage */

    public abstract void setMessage(String message);


	/** Listener action */
	protected void fireMessage(String level,String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(message);
		}
	}
}
