class ItemForSale
{
    private String name;
    private int price;

}

class Movie extends ItemForSale
{
    private String director;
    private String actor;
}

class Book extends ItemForSale
{
    private String authorname;
    private int numberofpage;

}

class Author
{
    private String authorname;
    private int authorage;

}

public class Store
{
    // instance variable (could be an array or ArrayList of one of the classes
    // above)

    public static void main(String[] args)
    {
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);
    }
}

