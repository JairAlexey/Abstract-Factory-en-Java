package factories;

import buttons.Button;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;
import buttons.MacOSButton;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}