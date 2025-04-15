import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CollectionDemo{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--------Stack--------");
            Stack<String> stack = new Stack<>();
            System.out.println("Enter the elements for the stack(type 'done' to finish):");
            while (true){
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")){
                    break;
                }
                stack.push(input);
            }
            System.out.println("Stack after push operations: " + stack);
            
            if (!stack.isEmpty()) {
                System.out.println("Top element (peek): " + stack.peek());
                String poppedElement = stack.pop();
                System.out.println("Popped element: " + poppedElement);
                System.out.println("Stack after pop: " + stack);
            } else {
                System.out.println("Stack is empty, cannot peek or pop.");
            }
            System.out.println("Is stack empty? " + stack.isEmpty());
            if (!stack.isEmpty()) {
                System.out.println("Enter an element to search for in the stack:");
                String searchElement = scanner.nextLine();
                System.out.println("Position of '" + searchElement + "' in stack: " + stack.search(searchElement));
            }
            
            // Demonstrating Vector with User Input
            // Demonstrating ArrayList instead of Vector (which is obsolete)
            System.out.println("\n----- ArrayList Demo (Integer) -----");
            ArrayList<Integer> vector = new ArrayList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    vector.add(Integer.valueOf(input));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'done'.");
                }
            }
            System.out.println("Vector after adding elements: " + vector);
            
            if (!vector.isEmpty()) {
                System.out.println("Enter an index to access:");
                int indexToAccess = Integer.parseInt(scanner.nextLine());
                if (indexToAccess >= 0 && indexToAccess < vector.size()) {
                    System.out.println("Element at index " + indexToAccess + ": " + vector.get(indexToAccess));
                } else {
                    System.out.println("Index out of bounds.");
                }
                System.out.println("Enter an index to insert at:");
                int indexToInsert = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the value to insert:");
                int valueToInsert = Integer.parseInt(scanner.nextLine());
                if (indexToInsert >= 0 && indexToInsert <= vector.size()) {
                    vector.add(indexToInsert, valueToInsert);
                    System.out.println("Vector after inserting " + valueToInsert + " at index " + indexToInsert + ": " + vector);
                } else {
                    System.out.println("Index out of bounds.");
                }
                System.out.println("Enter an index to remove:");
                int indexToRemove = Integer.parseInt(scanner.nextLine());
                if (indexToRemove >= 0 && indexToRemove < vector.size()) {
                    vector.remove(indexToRemove);
                    System.out.println("Vector after removing element at index " + indexToRemove + ": " + vector);
                } else {
                    System.out.println("Index out of bounds.");
                }
            } else {
                System.out.println("Vector is empty.");
            }
            System.out.println("Size of the vector: " + vector.size());
            
            // Demonstrating ArrayList with User Input
            System.out.println("\n----- ArrayList Demo -----");
            List<String> arrayList = new ArrayList<>();
            System.out.println("Enter elements for the ArrayList (type 'done' to finish):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                arrayList.add(input);
            }
            System.out.println("ArrayList after adding elements: " + arrayList);
            
            if (!arrayList.isEmpty()) {
                System.out.println("Enter an index to access:");
                int indexToAccess = Integer.parseInt(scanner.nextLine());
                if (indexToAccess >= 0 && indexToAccess < arrayList.size()) {
                    System.out.println("Element at index " + indexToAccess + ": " + arrayList.get(indexToAccess));
                } else {
                    System.out.println("Index out of bounds.");
                }
                System.out.println("Enter an index to insert at:");
                int indexToInsert = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the value to insert:");
                String valueToInsert = scanner.nextLine();
                if (indexToInsert >= 0 && indexToInsert <= arrayList.size()) {
                    arrayList.add(indexToInsert, valueToInsert);
                    System.out.println("ArrayList after inserting '" + valueToInsert + "' at index " + indexToInsert + ": " + arrayList);
                } else {
                    System.out.println("Index out of bounds.");
                }
                System.out.println("Enter an element to remove:");
                String elementToRemove = scanner.nextLine();
                arrayList.remove(elementToRemove);
                System.out.println("ArrayList after removing '" + elementToRemove + "': " + arrayList);
                System.out.println("Enter an element to check if it exists:");
                String elementToCheck = scanner.nextLine();
                System.out.println("Does ArrayList contain '" + elementToCheck + "'? " + arrayList.contains(elementToCheck));
            } else {
                System.out.println("ArrayList is empty.");
            }
            System.out.println("Size of the ArrayList: " + arrayList.size());
        }
}
}
