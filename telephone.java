public class telephone {
    public static void main(String[] args) {
        int hit = 1;
        hit = addNum(hit);
        hit = subNum(hit);
        hit = multNum(hit);
        hit = addNum2(hit);

        System.out.println(hit);
    }

    public static int addNum(int y) {
        return y + 482;
    }

    public static int subNum(int a) {
        return a - 600;
    }

    public static int multNum(int a) {
        return a * -1;
    }
    public static int addNum2(int a){
        return a + 2;
    }
}
