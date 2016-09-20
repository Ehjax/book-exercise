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
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Accessor for the String Fields
    public String getTitle ()
    {
       return title;
    }
    
    public String getAuthor ()
    {
        return author;
    }
    
}
