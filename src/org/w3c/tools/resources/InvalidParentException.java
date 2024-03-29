// InvalidParentException.java
// $Id: InvalidParentException.java,v 1.1 2010/06/15 12:20:17 smhuang Exp $
// (c) COPYRIGHT MIT and INRIA, 1998.
// Please first read the full copyright statement in file COPYRIGHT.html

package org.w3c.tools.resources;

/**
 * @version $Revision: 1.1 $
 * @author  Beno�t Mah� (bmahe@w3.org)
 */
public class InvalidParentException extends RuntimeException {

    public InvalidParentException(String msg) {
	super(msg);
    }

}
