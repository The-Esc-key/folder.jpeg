public class telephone {
    public static void main(String[] args) {
        int hit = 5892;
        hit = addNum(hit);
        hit = subNum(hit);
        hit = multNum(hit);
        hit = numSQUARED(hit);
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

    public static int numSQUARED(int b){
        return b*b;
    }
}
