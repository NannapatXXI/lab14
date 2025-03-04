import java.util.Scanner;

public class Mainlab2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input number : ");
            int number = Integer.parseInt(input.nextLine());
            
            int arr[] = new int[number];
            for (int i = 0; i < number; i++) {
            System.out.print("Arr[" + i+ "] = " );
            arr[i] = Integer.parseInt(input.nextLine());
             }
             System.out.println("Output :  ");
             TriArray(arr);
        input.close();
         } catch (Exception e) {
            System.out.println(e);
         }  
         
    }
    public static void TriArray(int arr[]){
        
       if (arr.length == 1) {
        System.out.println(arr[0]);
       }
       else{
        int tmp[] =  new int[arr.length -1];
        for (int i = 0; i < arr.length-1; i++) {
            tmp[i] = arr[i]+arr[i+1];
        }
        TriArray(tmp);
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
       }
       
        
    }

}