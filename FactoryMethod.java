abstract class ProgrammingLanguage{
    public abstract void display();
}


class JavaPL extends ProgrammingLanguage{

    @Override
    public void display(){
        System.out.println("This is Java programming language.");
    }
}

abstract class PLFactory{
    abstract ProgrammingLanguage factoryMethod();
}

class JavaFactory extends PLFactory{

    @Override
    public ProgrammingLanguage factoryMethod(){
        return new JavaPL();
    }
}


class JavaScriptFactory extends PLFactory{

    @Override
    public ProgrammingLanguage factoryMethod(){
        return new JavaScriptPL();
    }
}

class JavaScriptPL extends ProgrammingLanguage{

    @Override
    public void display(){
        System.out.println("This is JavaScript programming language.");
    }
}



public class FactoryMethod {
    public static void main(String[] args) {
        
    }
}
