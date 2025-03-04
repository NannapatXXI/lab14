import java.util.Scanner;

public class Mainlab1 {
    
    public static void main(String[] args) {
         //new lab14_1();
         try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input number : ");
            int number = Integer.parseInt(input.nextLine());
            input.close();
            System.out.println("Summation = " + Suminput(number));
         } catch (Exception e) {
            System.out.println(e);
         }   
    }
    static int sum  = 0;
    public static int Suminput(int number ){   
                
        if (number < 10) {
            sum += number;
        }else{
            sum += number%10;
            Suminput(number / 10);
            
        }
        return sum;
            
    }
        
     }
