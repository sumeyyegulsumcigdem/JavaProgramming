package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public double calcCost(){
        double startingPrice = (size == 'S') ? 10: (size == 'M')? 12 : 14;

        double totalPrice = startingPrice + (numberOfCheeseTopping+ numberOfCheeseTopping)* 2;

        return totalPrice;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price = $" + calcCost() +
                '}';
    }

}
