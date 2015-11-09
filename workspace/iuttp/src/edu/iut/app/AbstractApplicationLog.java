package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList<IApplicationLogListener> listeners;

	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}

    abstract void setMessage(String message);

    public String getMessage()
    {
        return message;
    }

    public void addListener(IApplicationLogListener listener)
    {
        listeners.add(Listener);
    }

    public IApplicationLogListener[] getpplicationLogListeners()
    {
        return listeners;
    }


    /** TP1 : Fonction venant de l'interface par héritage */

    abstract setMessage(String message);


	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
