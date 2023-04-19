public class Ex001 {
    public static void main(String[] args) {
        int[] xx = new int[5];
        try {
            xx[10] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Код выполняется дальше");
    }
}
