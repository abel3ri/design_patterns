interface ButtonFactory{
    Button createButton();
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


public class AbstractFactoryPattern {

    public static void main(String[] args) {
       ButtonFactory androidButtonFactory = new AndroidButtonFactory();
       ButtonFactory iosButtonFactory = new IOSButtonFactory();

       final Button androidButton = androidButtonFactory.createButton();
       final Button iosButton = iosButtonFactory.createButton();


       androidButton.render();
       iosButton.render();
    }
}
