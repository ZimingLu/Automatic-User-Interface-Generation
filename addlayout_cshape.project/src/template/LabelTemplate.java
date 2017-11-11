package template;

import org.eclipse.emf.common.util.*;

public class LabelTemplate {

	public LabelTemplate() {
		// TODO Auto-generated constructor stub
	}

	public static String generateLabel(String labelName, String value){
		return 	"JLabel " +  value + "Label = new JLabel(\"" + labelName + ": " + value + "\");";
	}
}
