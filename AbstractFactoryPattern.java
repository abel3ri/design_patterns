import java.util.*;

interface AbstractFactory{
    Button createButton(String buttonType);
}

class ButtonFactory implements AbstractFactory{

    @Override
    public Button createButton(String buttonType) {
     
        if(buttonType.equalsIgnoreCase("ios")){
            return new IOSButton();
        } else if(buttonType.equalsIgnoreCase("android")){
            return new AndroidButton();
        }
        return null;
    }
}


interface Button{
    void render();
    void onPressed();
}


class AndroidButton implements Button{

    @Override
    public void render(){
        System.out.println("Android button rendered.");
    }

    @Override
    public void onPressed(){
        System.out.println("Android button pressed.");
    }
}

class IOSButton implements Button{

    @Override
    public void render(){
        System.out.println("IOS button rendered.");
    }

    @Override
    public void onPressed(){
        System.out.println("IOS button pressed.");
    }
}



/**
 * AbstractFactory
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory buttonFactory = new ButtonFactory();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of button to create(ios/ANDROID): ");
        String buttonType = sc.nextLine();

        Button button = buttonFactory.createButton(buttonType);
        System.out.println("Congratulations!");
        button.render();
        sc.close();
    }
}
