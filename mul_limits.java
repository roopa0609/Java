import java.util.Scanner;
public class mul_limits {
    public static void main(String args[]){

        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_num=myObj.nextInt();

        System.out.println("Enter the last number ");
        int last_num=myObj.nextInt();
      for(;first_num<=last_num;first_num++){  
        for(int i=1;i<=10;i++){
            int p=first_num*i;
            System.out.println(first_num+"*"+i+"="+p);
        }
}

    }
}
