public class Task2 {
    public static void main(String[] args) {
        //Вывести на экран меньшее по модулю число
        byte num1 = -20;
        byte num2 = 38;
        byte num3 = 13;
        float a;
        float b;
        float c;
        a = num1 < 0 ? (num1 * -1) : (num1);
        b = num2 < 0 ? (num2 * -1) : (num2);
        c = num3 < 0 ? (num3 * -1) : (num3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int m1 = 20;
        int m2 = 38;
        int m3 = 13;
        int less;
        if (m2 > m1) {
            if (m1 > m3) {
                less = m3;
                System.out.println("Меньшее по модулю");
                System.out.println(less);
            }
        }

    }
}
