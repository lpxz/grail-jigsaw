// Main.java
// $Id: Main.java,v 1.1 2010/06/15 12:30:03 smhuang Exp $  
// (c) COPYRIGHT MIT and INRIA, 1997.
// Please first read the full copyright statement in file COPYRIGHT.html

package org.w3c.jigsaw;


/**
 * A place holder for running Jigsaw.
 */

public class Main {

    public static void main(String args[]) {
    	String[] newArgs= new String[args.length-2];
    	for(int i=0;i<newArgs.length; i++)
    	{
    		newArgs[i]= args[i+2];
    	}
    	
	org.w3c.jigsaw.daemon.ServerHandlerManager.main(newArgs);
    }

}
