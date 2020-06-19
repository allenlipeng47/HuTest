package stacktrace;

public class App {

    public static void main(String[] args) throws Exception{
        a();
    }

    public static void a() throws Exception{
        b();
    }

    public static void b() throws Exception{
        try {
            throw new Exception("abcde");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
