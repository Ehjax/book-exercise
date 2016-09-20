/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ben Fasinski
 * @version 9/19/2016
 */
class Book
{
    // The fields.
    /**
     * 2.85 add pages variable
     */
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     * 2.85 added pages field
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

   
    /**
     * 2.83 Accessor for the title field
     */
    public String getTitle()
    {
       return title;
    }
    
     /**
     * 2.83 Accessor for the author field
     */
    public String getAuthor()
    {
        return author;
    }
    
     /**
     * 2.85 Accessor for the pages field
     */
    public String getPages()
    {
        return pages;
    }
       
     /**
     * 2.84Print utility for the title field
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
     /**
     * 2.84 Print Feature for the author field
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    /**
     * 2.85 Print Feature for the pages field
     */
    public void printPages()
    {
        System.out.println("Number of pages: " + pages);
    }
}
