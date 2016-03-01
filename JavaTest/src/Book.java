/**
 * Created by admin on 2016/3/1.
 */
public class Book {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
        System.out.println(bookName+" is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(bookName+" is freed");
    }
}
