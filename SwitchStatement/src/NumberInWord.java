public class NumberInWord {
    public static void main(String[] args) {
        System.out.println("\tSwitch statement");
        printNumberInWordSwitch(5);
        printNumberInWordSwitch(-1);
        printNumberInWordSwitch(10);
        printNumberInWordSwitch(2);
        System.out.println("\n\tIf-else statement");
        printNumberInWordIfElse(5);
        printNumberInWordIfElse(-1);
        printNumberInWordIfElse(10);
        printNumberInWordIfElse(2);
    }

    public static void printNumberInWordSwitch(int number) {

        String numberInWord=switch (number){
            case 0 -> {yield numberInWord="ZERO";}
            case 1 -> {yield numberInWord="ONE";}
            case 2 -> {yield numberInWord="TWO";}
            case 3 -> {yield numberInWord="THREE";}
            case 4 -> {yield numberInWord="FOUR";}
            case 5 -> {yield numberInWord="FIVE";}
            case 6 -> {yield numberInWord="SIX";}
            case 7 -> {yield numberInWord="SEVEN";}
            case 8 -> {yield numberInWord="EIGHT";}
            case 9 -> {yield numberInWord="NINE";}
            default -> {yield numberInWord="OTHER";}
        };

        System.out.println(numberInWord);
    }

    public static void printNumberInWordIfElse(int number) {
        String numberInWord="OTHER";
        if(number==0)
            numberInWord="ZERO";
        else if (number==1)
            numberInWord="ONE";
        else if (number==2)
            numberInWord="TWO";
        else if (number==3)
            numberInWord="THREE";
        else if (number==4)
            numberInWord="FOUR";
        else if (number==5)
            numberInWord="FIVE";
        else if (number==6)
            numberInWord="SIX";
        else if (number==7)
            numberInWord="SEVEN";
        else if (number==8)
            numberInWord="EIGHT";
        else if (number==9)
            numberInWord="NINE";

        System.out.println(numberInWord);
    }

}
