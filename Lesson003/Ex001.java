import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Ex001
 */
public class Ex001 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Ex001_1.txt");
                FileWriter writer = new FileWriter("Ex001_2.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }

        } catch (Exception e) {
            System.out.println("Eror 404");
        }

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Посмотрите файл и введите любой символ в строку для удаления файла 2: ");
            scan.next();
        } catch (Exception e) {

        }

        File file = new File("Ex001_2.txt");
        if (file.delete()) {
            System.out.println("Фаил удалён");
        } else {

        }
    }
}