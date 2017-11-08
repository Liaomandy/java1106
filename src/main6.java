public class main6 {
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("男生請輸入1");
        System.out.println("女生請輸入2");
        System.out.println("請輸入性別");
        int a=sc.nextInt();
        if(a==1)
        {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            Double b=sc.nextDouble();
            Double c=sc.nextDouble();
            Double d=(b-80)*0.7;
            System.out.println(d);
        }
        else
        {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            Double e = sc.nextDouble();
            Double f = sc.nextDouble();
            Double g = (e - 70) * 0.6;
            System.out.println(g);
        }

    }
}

