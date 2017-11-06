public class main2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入數值");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.printf("%d>%d",a,b);
        } else {
            if (a == b)
                System.out.printf("%d==%d",a,b);

            else {
                System.out.printf("%d<%d",a,b);
            }
        }

    }
}