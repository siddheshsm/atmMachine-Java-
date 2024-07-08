import java.util.Scanner;

class ATM{
    int pin = 1234;
    float balence;

    public void CheckPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int PIN = sc.nextInt();
        if(pin == PIN){
            menu();
        }else{
            System.out.println("ENTERED PIN IS WRONG !!!");
        }

    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check A/C balence");
        System.out.println("Withdrow money");
        System.out.println("Deposite money");
        System.out.println("Exit");
        System.out.println("Enter Option number : \t");
        int option = sc.nextInt();

        switch(option){
            case 1: checkBal();
                break;
            case 2: withdrow();
                break;
            case 3: deposit();
                break;
            case 4: System.out.println("EXITED !!!");
                break;
        }

    }

    public void checkBal(){
        System.out.println("Account Balence : "+ balence);
    }
    public void withdrow(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be Withdrown : ");
        float amount = sc.nextInt();
        if(balence >= amount){
            balence -= amount;
            System.out.println(amount+"withdrown");
            checkBal();
        }else{
            System.out.println("No sufficient balence avilable in account");
        }

    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be deposited : ");
        float amount = sc.nextInt();
        balence += amount;
        System.out.println(amount+"withdrown");
        checkBal();
    }
}

