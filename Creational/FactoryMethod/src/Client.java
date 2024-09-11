import factory.Dialog;
import factory.HTMLDialog;
import factory.WindowDialog;

public class Client {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runLogic();
        return;
    }
    static void configure(){
        if(System.getProperty("os.name").equals("Window 11")){
            dialog = new WindowDialog();
        }
        else {
            dialog = new HTMLDialog();
        }
    }
    static void runLogic(){
        dialog.renderWindow();
    }
}
