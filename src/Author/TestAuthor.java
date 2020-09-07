package Author;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("pasha","job", 'm');
        Author a2 = new Author("fedor", "book", 'm');
        Author a3 = new Author("masha", "root",'w');
        System.out.println(a1);
        a2.setEmail("young");
        a3.getEmail();
    }
}
