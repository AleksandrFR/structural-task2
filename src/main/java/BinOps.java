public class BinOps {
    public String sum(String a, String b) {
        int sumInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sumInt);
    }

    public String mult(String a, String b) {
        int multInt = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(multInt);
    }
}
