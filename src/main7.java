public class main7 {
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
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double sw=(b-80)*0.7;
            double h=(b-sw)/sw*100;
            if(sw<(c*0.8))
            {
                System.out.println("瘦弱");
            }
            if(sw>=c*0.8&&sw<=c*0.9);
            {
                System.out.println("過瘦");
            }
            if(sw>=c*0.9&&sw<=c*1.1);
            {
                System.out.println("正常");
            }
            if(sw>c*1.1&&sw<=c*1.2);
            {
                System.out.println("過重");
            }
            if(sw>c*1.2)
            {
                System.out.println("肥胖");
            }
        }
        else
        {
            System.out.println("請輸入身高");
            System.out.println("請輸入體重");
            double e=sc.nextDouble();
            double f=sc.nextDouble();
            double sw1=(e-70)*0.6;
            if(sw1<(f*0.8))
            {
                System.out.println("瘦弱");
            }
            if(sw1>=f*0.8&&sw1<=f*0.9);
            {
                System.out.println("過瘦");
            }
            if(sw1>=f*0.9&&sw1<=f*1.1);
            {
                System.out.println("正常");
            }
            if(sw1>f*1.1&&sw1<=f*1.2);
            {
                System.out.println("過重");
            }
            if(sw1>f*1.2)
            {
                System.out.println("肥胖");
            }

        }


    }
}
