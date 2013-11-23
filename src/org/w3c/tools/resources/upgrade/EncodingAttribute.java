// EncodingAttribute.java
// $Id: EncodingAttribute.java,v 1.1 2010/06/15 12:22:53 smhuang Exp $
// (c) COPYRIGHT MIT and INRIA, 1996.
// Please first read the full copyright statement in file COPYRIGHT.html

package org.w3c.tools.resources.upgrade ;

public class EncodingAttribute extends StringAttribute {

    public EncodingAttribute(String name, String def, Integer flags) {
	super(name, def, flags) ;
	this.type = "java.lang.String";
    }

}
