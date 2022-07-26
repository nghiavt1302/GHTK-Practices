import java.sql.Timestamp;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        Date a1 = new Date(a);
        System.out.println(a1);

        Timestamp a2 = new Timestamp(System.currentTimeMillis());
        System.out.println(a2);
    }
}
