public class TypeCasting {
    public static void main(String[] args) {

        // Widening Type Casting
        int num = 100;
        double value = num;

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + value);

        // Narrowing Type Casting
        double price = 99.99;
        int result = (int) price;

        System.out.println("Double value: " + price);
        System.out.println("Integer value: " + result);
    }
}
