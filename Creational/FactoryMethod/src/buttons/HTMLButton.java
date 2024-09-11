package buttons;

public class HTMLButton implements Button{
    @Override
    public void render(){
        System.out.println("<button>Test Button HTML</button>");
        onClick();
    }

    @Override
    public void onClick(){
        System.out.println("Click! Button says - Hello");
    }
}
