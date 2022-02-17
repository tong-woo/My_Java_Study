public class BurritoCalculator {
    public static boolean hasLeftoverFunds(int burritoCost) {
        int budget = 100;
        int numBurritos = 0;

        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }
        System.out.println("Remaining budget: " + budget);
        return budget > 0;
    }
    public static int getBurritosSold(int lastOrderNumber) {
        int totalBurritosSold = 0;
        while(lastOrderNumber>0) totalBurritosSold += lastOrderNumber--;
        return totalBurritosSold;
    }

    public static int getTip(int budget) {
        int maxDigit = 0;
        while(budget>0){
            int digit = budget%10;
            if(maxDigit < digit) maxDigit = digit;
            budget/=10;
        }
        return maxDigit * 900;
    }

    public static int getReverseBudget(int budget) {
        int reverseBudget = 0;
        while(budget>0){
            int digit = budget%10;
            reverseBudget = reverseBudget*10 + digit;
            budget/=10;
        }


        return reverseBudget;
    }

    public static void main(String []args) {
        // Below are some sample values you can use to run your code.
        // When you're ready, uncomment the following lines one at a time to test each case. Before running each test case, think about what value you expect to see printed out.
         System.out.println(hasLeftoverFunds(7));
         System.out.println(hasLeftoverFunds(10));
        // Try testing your code with different arguments in the method call
         System.out.println(getBurritosSold(548));

    }
}



