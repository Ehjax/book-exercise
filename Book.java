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
    private String refNumber;
    private int borrowed;
    final private boolean isCourseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     * 2.85 added pages field
     * 2.88 added refNumber field
     * 2.91 added borrowed field
     * 2.92 added course text field
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        isCourseText = courseText; 
        borrowed = 0;
        refNumber = "";
    }
    
    /**
     * 2.88 Setting the reference number
     * 2.90 Added check on length of reference number
     */
    
    public void setRefNumber (String ref)
    {
        
        if (ref.length() < 3)
        {
            System.out.println ("Please enter three characters or more");
        }else{
            refNumber = ref;
        }
    }
    
    /**
     * 2.88 Getting the reference number
     */
    public String getRef()
    {
        return refNumber;
    }
    
    /**
     * 2.91 Getting the times borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * 2.91 Update the number of times borrowed
     */
    public int setBorrowed()
    {
        borrowed++;       
        return borrowed;
    }
    
    /**
     * 2.92 Accessor for the isCourseText field
     */
    
    public boolean getCourseText()
    {
        return isCourseText;
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
    public int getPages()
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
    
    /**
     * 2.87 Print Details Feature
     * 2.89 Added reference number
     * 2.91 Added number of times borrowed
     */
    public void printDetails()
    {
        System.out.println ("Title: " + title);
        System.out.println ("Author: " + author);
        System.out.println ("Pages: " + pages);
        
        if (refNumber == "") {
            System.out.println ("ZZZ");
        }else{
            System.out.println ("Reference Number: " + refNumber);
        }
        
        System.out.println ("Number of times borrowed: " + borrowed);
    }
   
     
}
