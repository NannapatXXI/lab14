import java.util.Scanner;

public class lab14_2 {
    
    public lab14_2(){
        Input();
    }
     public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int sum = input.nextInt();
        int arr[] = new int[sum];
        for (int i = 0; i < sum; i++) {
            System.out.print("Arr[" + i+ "] = " );
            int base = input.nextInt();
            arr[i] = base;
        }
        peramit(arr);
        
        input.close();
    }
    public void peramit(int arr[]){
        System.out.println("Output :  ");
        int n =0;
        
    }
}
