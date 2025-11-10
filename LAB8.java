import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.addItem(10);
        intBox.addItem(20);
        intBox.addItem(30);
        System.out.println("Integer Box:");
        intBox.displayItems();

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Apple");
        stringBox.addItem("Banana");
        stringBox.addItem("Cherry");
        System.out.println("\nString Box:");
        stringBox.displayItems();

        Box<Double> doubleBox = new Box<>();
        doubleBox.addItem(3.14);
        doubleBox.addItem(6.28);
        System.out.println("\nDouble Box:");
        doubleBox.displayItems();
    }
}
