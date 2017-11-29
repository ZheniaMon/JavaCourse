package ua.training;

public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] array = {4,7,2,1,6};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(array);

        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(array);
    }
}
