package factory;

import buttons.HTMLButton;
import buttons.Button;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton(){
        return new HTMLButton();
    }
}
