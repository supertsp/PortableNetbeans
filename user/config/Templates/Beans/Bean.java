<#if package?? && package != "">
package ${package};
</#if>

import java.util.List;
import java.util.ArrayList;
import java.beans.*;
import java.io.Serializable;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author ${user}, ${date}, ${time}
 * Last update: -
 */// </editor-fold>
public class ${name} implements Serializable {
	
	public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
	private String sampleProperty;
	private PropertyChangeSupport propertySupport;
	
	public ${name}() {
		propertySupport = new PropertyChangeSupport(this);
	}
	
	public String getSampleProperty() {
		return sampleProperty;
	}

	public void setSampleProperty(String value) {
		String oldValue = sampleProperty;
		sampleProperty = value;
		propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertySupport.removePropertyChangeListener(listener);
	}

}//class
