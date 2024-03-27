public class StockProfit {

    public int maxProfit(int[] prices){
        int maxprofit = 0;
        int minprice = prices[0];

        if(prices==null || prices.length<=1){
            return 0;
        }
        for(int i=0; i<prices.length; i++){
            int currentprofit = prices[i] - minprice;
            if(currentprofit > maxprofit){
                maxprofit = currentprofit;
            }
            if(prices[i] < minprice){
                minprice = prices[i];
            }
        }
        return maxprofit;
    }
    public void arrayPrinter(int[] array){
        StringBuilder string = new StringBuilder();
        string.append("[");
        for(int i = 0; i<array.length; i++){
            string.append(array[i]);
            if(i<array.length-1){
                string.append(", ");
            }
        }
        string.append("]");
        System.out.println(string);
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        StockProfit object = new StockProfit();
        int profit = object.maxProfit(prices);
        object.arrayPrinter(prices);
        System.out.println(profit);
    }
}