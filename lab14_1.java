import java.util.Scanner;

public class lab14_1 {
    int sum = 0 ;
    public lab14_1(){
        Input();
    }
    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = input.nextInt();
        input.close();
        Suminput(number);
    }
    public void Suminput(int number ){   
        if (number < 10) {
            sum += number;
            System.out.println("Summation = "+ sum);
        }else{
            sum += number%10;
            Suminput(number / 10);
            
        }
    }
}
