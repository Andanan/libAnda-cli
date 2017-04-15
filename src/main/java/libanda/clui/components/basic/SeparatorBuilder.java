package libanda.clui.components.basic;

import java.util.List;

import libanda.clui.Controller;
import libanda.clui.components.Component;

public class SeparatorBuilder extends Component {

	private SeparatorType separatorType;
	private List<Integer> sectionWidths;

	public SeparatorBuilder(Controller ctrl) {
		super(ctrl);
	}

	public SeparatorBuilder(Controller ctrl, SeparatorType separatorType) {
		super(ctrl);
		this.separatorType = separatorType;
	}

	public SeparatorBuilder setSeparatorType(SeparatorType separatorType) {
		return null;
	}

	public SeparatorType getSeparatorType() {
		return null;
	}

	public SeparatorBuilder addSection(int sectionWidths) {
		return null;
	}

	public SeparatorBuilder addSections(int... sections) {
		return null;
	}

	public List<Integer> getSections() {
		return null;
	}

	public SeparatorBuilder clearSections() {
		return null;
	}

	private String createSeparator(char left, char center, char right, char horizontal) {
		return null;
	}

	@Override
	public String build() {
		return null;
	}

}
