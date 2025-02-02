public class Greeter
{
    public String greet()
    {
        return "Hi";
    }

    public static void main(String[] args)
    {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet());
        Greeter g2 = new MeanGreeter();
        System.out.println(g2.greet());
        Greeter g3 = new SpanishGreeter();
        System.out.println(g3.greet());
    }
}

class MeanGreeter extends Greeter
{
    public String greet()
    {
        return "Go Away";
    }
}

class SpanishGreeter extends Greeter
{
    public String greet()
    {
        return "Hola";
    }
}

//****************************************************************************
public class Greeter
{
    public String greet()
    {
        return "Hi";
    }

    public String greet(String who)
    {
        return "Hello " + who;
    }

    public static void main(String[] args)
    {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet("Sam"));
        Greeter g2 = new MeanGreeter();
        System.out.println(g2.greet("Nimish"));
    }
}

class MeanGreeter extends Greeter
{
    @Override
    public String greet(String who)
    {
        return "Go away "+ who;
    }
}