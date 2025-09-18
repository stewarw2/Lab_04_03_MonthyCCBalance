public class Main {
    public static void main(String[] args) {

        int BALANCE = 5000;
        double INTEREST_RATE =  0.17;
        double monthOneInterest = BALANCE * INTEREST_RATE;
        double monthTwoInterest = (BALANCE + monthOneInterest) * INTEREST_RATE;

        System.out.println("Your interest due after month one is: $" + monthOneInterest);
        System.out.println("Your interest due after month two is: $" + monthTwoInterest);
    }
}
