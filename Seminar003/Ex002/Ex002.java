package Ex002;

public class Ex002 {
    public static void main(String[] args) {

        try (Counter cou = new Counter(22)) {

            System.out.printf("Текущее значение счётчика: %d\n\n", cou.getCounter());

            cou.add();
            cou.add();
            cou.add();
            cou.add();
            System.out.printf("Текущее значение счётчика: %d\n\n", cou.getCounter());

            cou.close();

            cou.open();
            cou.add();
            System.out.printf("Текущее значение счётчика: %d", cou.getCounter());

        } catch (CloseCounterException e) {
            System.out.println(e.getMessage());
        }

    }
}
