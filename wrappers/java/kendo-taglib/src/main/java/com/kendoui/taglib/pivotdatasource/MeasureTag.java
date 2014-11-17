
package com.kendoui.taglib.pivotdatasource;


import java.util.HashMap;

import com.kendoui.taglib.BaseTag;






import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class MeasureTag extends  BaseTag  /* interfaces */ /* interfaces */ {

    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        MeasuresTag parent = (MeasuresTag)findParentWithClass(MeasuresTag.class);

        parent.addMeasure(new HashMap<String, Object>() {{
            put("name", getName());
            put("type", getType());
        }});        

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "pivotDataSource-measure";
    }

    public java.lang.String getName() {
        return (java.lang.String)getProperty("name");
    }

    public void setName(java.lang.String value) {
        setProperty("name", value);
    }

    public java.lang.String getType() {
        return (java.lang.String)getProperty("type");
    }

    public void setType(java.lang.String value) {
        setProperty("type", value);
    }

//<< Attributes

}
