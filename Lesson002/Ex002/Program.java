package Ex002;

import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test");

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
