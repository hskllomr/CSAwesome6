public class Person
{
    private String name = null;

    public Person(String theName)
    {
        name = theName;
    }

    public String getFood()
    {
        return "No Hamburger";
    }

    public static void main(String[] args)
    {
        Person p = new Student("Javier");
        System.out.println(p.getFood());
    }
}

class Student extends Person
{
    private int id;
    private static int nextId = 0;

    public Student(String theName)
    {
        super(theName);
        id = nextId;
        nextId++;
    }

    public String getFood()
    {
        String output = super.getFood();
        return output + " and Pizza but *";
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int theId)
    {
        this.id = theId;
    }
}

class Vegan extends Person
{
    public Vegan(String name)
    {
        super(name);

    }

    public String getFood()
    {
        return "No "+super.getFood();

    }

}

