public class WaterBottles {
    public static int numberOfBottles(int numBottles, int numExchange){
        int out = numBottles;

        while (numBottles >= numExchange){
            out += numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
        }

        return out;
    }
    public static void main(String[] args) {
        System.out.println(numberOfBottles(9,3));
    }
}
