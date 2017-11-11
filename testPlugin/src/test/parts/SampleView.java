package test.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SampleView {

	@PostConstruct
	public void createPartControl(Composite parent) {
		new SWTViewer(parent, SWT.NONE);
	}

	public void setFocus() {

	}

	
}
