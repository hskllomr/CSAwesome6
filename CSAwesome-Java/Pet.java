public class Pet
{
    private String name;
    private String type;

    public Pet(String n, String t)
    {
        name = n;
        type = t;
    }

    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public void speak()
    {
        System.out.println("grr!");
    }

    public static void main(String[] args)
    {
        Pet p = new Pet("Sammy", "hamster");
        System.out.println(p.getType());
        p.speak();

        Dog d = new Dog("Fido");
        System.out.println(d.getType());
        d.speak();
        Cat c = new Cat("Fluffy");
        System.out.println(c.getType());
        c.speak();
    }
}

// Complete the Dog class
class Dog extends Pet
{
    public Dog(String name)
    {
        super(name,"dog");
    }

    @Override
    public void speak()
    {
        System.out.println("Woof!");
    }
}

// Add a Cat class
class Cat extends Pet
{
    public Cat(String type)
    {
        super(type,"cat");
    }

    @Override
    public void speak()
    {
        System.out.println("Meow!");
    }
}

//*************************************************************************************************

import java.util.*; // for ArrayList

public class Pet
{
    private String name;
    private String type;

    public Pet(String n, String t)
    {
        name = n;
        type = t;
    }

    public String toString()
    {
        return name + " is a " + type;
    }

    public static void main(String[] args)
    {
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(new Pet("Sammy", "hamster"));
        petList.add(new Dog("Fido"));
        petList.add(new Cat(""));
        // This loop will work for all subclasses of Pet
        for (Pet p : petList)
        {
            System.out.println(p);
        }
    }
}

class Dog extends Pet
{
    public Dog(String n)
    {
        super(n, "dog");
    }
}

class Cat extends Pet
{
    public Cat(String k)
    {
        super(k,"cat");
    }
}