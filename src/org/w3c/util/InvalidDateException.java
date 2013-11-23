// InvalidDateException.java
// $Id: InvalidDateException.java,v 1.1 2010/06/15 12:25:41 smhuang Exp $
// (c) COPYRIGHT MIT, INRIA and Keio, 2000.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.util;

/**
 * @version $Revision: 1.1 $
 * @author  Beno�t Mah� (bmahe@w3.org)
 */
public class InvalidDateException extends Exception {

    public InvalidDateException(String msg) {
	super(msg);
    }
    
}
