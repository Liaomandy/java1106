public class main5 {
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int a=sc.nextInt();
        if(a>=60)
        {
            System.out.println("及格");
        }
        else{
            if(a>=50)
            {
                System.out.println("補考");
            }
            else{
                System.out.println("死當");
            }
        }
    }

}
