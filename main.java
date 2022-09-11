public class Main {
    public static void main(String[] args){
        /*-------- Exercise with the if conditional --------*/
        positiveAndNegative(-32);
        /*-------- Exercise with the while and do while conditional --------*/
        increaseNumber(0);
        increaseNumberDo(1);
        /*-------- Exercise with the conditional for --------*/
        conditionalFor(0);
        /*-------- Exercise with the conditional Switch --------*/
        conditionalSwitch("Winter");
    }

    static void positiveAndNegative(int number){
        if(number > 0){
            System.out.println("This is a number Positive!!");
        } else if (number < 0) {
            System.out.println("This is a number negative!!");
        } else {
            System.out.println("This is a zero");
        }
    }

    static void increaseNumber(int number_while){
        while (number_while < 3){
            number_while++;
            System.out.println(number_while);

        }
    }

    static void increaseNumberDo(int number_while_do){
        do{
            System.out.println("Do While :)");
            number_while_do++;
            System.out.println(number_while_do);
        } while (number_while_do > 3);
    }

    static void conditionalFor(int numberFor){
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
    }

    static void conditionalSwitch(String season){
        switch (season){
            case "Spring":
                System.out.println("This is Spring");
                break;
            case "Fall":
                System.out.println("this is a Fall");
                break;
            case "Summer":
                System.out.println("This is a Summer!! :D");
                break;
            case "Winter":
                System.out.println("Winter is coming!! :d");
                break;
            default:
                System.out.println("Is it the end of the World!!!");
        }
    }

}