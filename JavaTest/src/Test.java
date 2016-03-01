
/**
 * Created by admin on 2016/3/1.
 */
public class Test {
    public static void main(String args[]) {
        Book l1 = new Book("book1");
        Book l2 = new Book("book2");
        l1 = l2 = null;
        System.gc();
    }
}
