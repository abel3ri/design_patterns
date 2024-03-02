interface ButtonFactory{
    Button createButton();
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

class AndroidButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(){
        return new AndroidButton();
    }

}
class IOSButtonFactory implements ButtonFactory{

    @Override
    public Button createButton(){
        return new IOSButton();
    }

}

/**
 * AbstractFactory
 */
public class AbstractFactory {

    public static void main(String[] args) {
        AndroidButtonFactory androidButtonFactory = new AndroidButtonFactory();
        Button androidButton = androidButtonFactory.createButton();

        androidButton.render();
        androidButton.onPressed();


        IOSButtonFactory iosButtonFactory = new IOSButtonFactory();
        Button iosButton = iosButtonFactory.createButton();
        
        iosButton.render();
        androidButton.onPressed();
    }
}
