class StockSpanner {

    Stack<Integer> span,prices;
    public StockSpanner() {
        prices=new Stack<>();
        span=new Stack<>();
        
    }
    
    public int next(int price) {
        int sum=1;
        while(!prices.isEmpty() && prices.peek()<= price)
            {
            prices.pop();
            sum += span.pop();
            }
        prices.push(price);
        span.push(sum);
        return sum;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */