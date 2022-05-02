public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String binsSumStr = bins.sum("101111", "111111");
        String binsMultStr = bins.mult("101111", "111111");
        System.out.println("Сумма a и b в двоичной записи: " + binsSumStr);
        System.out.println("Сумма a и b в десятичной записи: " + Integer.parseInt(binsSumStr, 2));
        System.out.println("Произведение a и b в двоичной записи: " + binsMultStr);
        System.out.println("Произведение a и b в ддесятичной записи: " + Integer.parseInt(binsMultStr, 2));
    }
}
