package factory;

import buttons.Button;
import buttons.HTMLButton;
import buttons.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton(){
        return new WindowButton();
    }
}
