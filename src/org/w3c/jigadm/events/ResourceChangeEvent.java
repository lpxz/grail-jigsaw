// ResourceChangedEvent
// $Id: ResourceChangeEvent.java,v 1.1 2010/06/15 12:29:20 smhuang Exp $
// (c) COPYRIGHT MIT and INRIA, 1997.
// Please first read the full copyright statement in file COPYRIGHT.html

package org.w3c.jigadm.events ;

import java.beans.PropertyChangeEvent;

import org.w3c.jigadm.RemoteResourceWrapper;

public class ResourceChangeEvent extends PropertyChangeEvent {

    /**
     * Creates a ResourceChangeEvent
     * this correspond to a change in one resource
     * @param source The resource father whose resource has changed.
     * @param name The name of the attribute that has changed.
     * @param oldvalue The old attribute value.
     * @param newvalue The new attribuyte value.
     */

    public ResourceChangeEvent(Object source, String name
			       , Object oldvalue, Object newvalue) {
	super(source, name, oldvalue, newvalue);
    }
}    
