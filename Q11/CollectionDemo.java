import java.util.*;
public class CollectionDemo {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
Stack<String> stack = new Stack<>();
System.out.print("Enter number of elements to push in Stack: ");
int stackCount = sc.nextInt();
sc.nextLine();
for (int i = 0; i < stackCount; i++) {
System.out.print("Enter element " + (i + 1) + ": ");
stack.push(sc.nextLine());
}
System.out.println("Stack: " + stack);
if (!stack.isEmpty()) {
System.out.println("Popped from Stack: " + stack.pop());
System.out.println("Stack after pop: " + stack);
}
ArrayList<Integer> vector = new ArrayList<>();
System.out.print("\nEnter number of elements in Vector: ");
int vectorCount = sc.nextInt();
for (int i = 0; i < vectorCount; i++) {
System.out.print("Enter element " + (i + 1) + ": ");
vector.add(sc.nextInt());
}
System.out.println("Vector: " + vector);
if (!vector.isEmpty()) {
System.out.println("Element at index 1: " + (vectorCount > 1 ? vector.get(1) : "Not enough elements"));
}
ArrayList<String> arrayList = new ArrayList<>();
System.out.print("\nEnter number of elements in ArrayList: ");
int listCount = sc.nextInt();
sc.nextLine();
for (int i = 0; i < listCount; i++) {
System.out.print("Enter element " + (i + 1) + ": ");
arrayList.add(sc.nextLine());
}

System.out.println("ArrayList: " + arrayList);
if (!arrayList.isEmpty()) {
System.out.print("Enter an element to remove from ArrayList: ");
String toRemove = sc.nextLine();
arrayList.remove(toRemove);
System.out.println("ArrayList after removal: " + arrayList);
}
}
}
}