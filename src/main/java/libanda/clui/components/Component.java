package libanda.clui.components;

import libanda.clui.Controller;

public abstract class Component {

	private Controller ctrl;

	public Component(Controller ctrl) {
		setController(ctrl);
	}

	public abstract String build();

	public void setController(Controller ctrl) {
		this.ctrl = ctrl;
	}

	public Controller getController() {
		return this.ctrl;
	}
}
