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

