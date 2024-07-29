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
        switch (number){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }

    public static void printNumberInWordIfElse(int number) {
        if(number==0)
            System.out.println("ZERO");
        else if (number==1)
            System.out.println("ONE");
        else if (number==2)
            System.out.println("TWO");
        else if (number==3)
            System.out.println("THREE");
        else if (number==4)
            System.out.println("FOUR");
        else if (number==5)
            System.out.println("FIVE");
        else if (number==6)
            System.out.println("SIX");
        else if (number==7)
            System.out.println("SEVEN");
        else if (number==8)
            System.out.println("EIGHT");
        else if (number==9)
            System.out.println("NINE");
        else
            System.out.println("OTHER");
    }

}
