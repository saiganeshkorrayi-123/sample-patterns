import java.util.Scanner;

public class diamond {
    
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        for(int i=0;i<=num;i++){

        
        //space
        for(int j=0;j<num-i-1;j++){
            System.out.print(" ");
        }
        

        //star
        for(int j=0;j<2*i+1;j++){
            System.out.print("*"+" ");
        }

        //space
         for(int j=0;j<num-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
        }
        
        int nums=num-1;
        
        for(int i=nums;i>=0;i--){

        
        //space
        for(int j=0;j<num-i-1;j++){
            System.out.print(" ");
        }
        

        //star
        for(int j=0;j<2*i+1;j++){
            System.out.print("*"+" ");
        }

        //space
         for(int j=0;j<num-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
        }
    }
}

    

