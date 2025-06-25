public class Main {
    public static void main(String[] args) {
        System.out.println("Static Array:");
        Array arr = new Array(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.print();

        System.out.println("Dynamic Array:");
        DynamicArray darr = new DynamicArray();
        for (int i = 1; i <= 10; i++) {
            darr.add(i * 10);
        }
        darr.print();
    }
}
