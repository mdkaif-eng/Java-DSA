  /* Question3: You are given an array priceswhere prices is the price of a given stock on the ih day.
Return the maximimum profit you can achieve from this transction. if you cannot any profit return 0. 
Example 1:
Input: prices=[7,1,5,3,6,4]
Output: 5
Explanation
: Buy on day 2 (price 1) and sell on day 5 (price 6), profit 61-5 Note that buying on day 2 and selling on day 1 in not allowed because you must buy before you sell.
Example 2:
Input: Prices = 7,6,4,3,1
Output: 0
Explanation:
In this case, no transactions are done and the max profit D.
Constraints:
~ 1<=prices.length <= 10
0 <= prices[i] <=10^4
*/
import java.util.*;

public class Que3 {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int[] prices = {7, 1, 5, 3, 6, 4};
        int [] prices = { 7,6,4,3,1};
        
        System.out.println(maxProfit(prices));
    }
}