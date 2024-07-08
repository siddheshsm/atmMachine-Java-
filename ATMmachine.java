import java.util.*;

public class ATMmachine {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int a;
        do{
            atm.CheckPin();
            System.out.println("Enter 1 if you want to continue");
            a = sc.nextInt();
        }while(a == 1);

    }
}

