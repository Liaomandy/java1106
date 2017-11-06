public class main3 {
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //if(a>b&&a>c)
        //{
           // System.out.printf("%d最大",a);
       // }
       // else
        //{
           // if(b>a&&b>c)
           //{
               // System.out.printf("%d最大",b);
           // }
            //else
           // {
               // System.out.printf("%d最大",c);
           // }
        //}
        if(a>b)
        {
            if(a>c){
            System.out.printf("%d最大",a);
            }
            else {
                System.out.printf("%d最大", b);
            }
            }
        else
        {
            if(b>c) {
                System.out.printf("%d最大", b);
            }
            else{
                System.out.printf("%d比較大",c);
            }

        }


    }
}
