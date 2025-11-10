import java.util.ArrayList;
import java.util.Iterator;
public class Lab9 {
public static void main(String[] args) {
ArrayList<Integer> marks = new ArrayList<>();
marks.add(85);
marks.add(90);
marks.add(75);
marks.add(88);
System.out.println("Initial Marks List: " + marks);
System.out.println("\nMarks (using Iterator):");
Iterator<Integer> itr = marks.iterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
marks.set(2, 80);
System.out.println("\nAfter Updating 3rd mark: " + marks);
marks.remove(1);
System.out.println("\nAfter Removing 2nd mark: " + marks);
System.out.println("\nFinal Marks List (using Iterator):");
Iterator<Integer> finalItr = marks.iterator();
while (finalItr.hasNext()) {
System.out.println(finalItr.next());
}
}
}
