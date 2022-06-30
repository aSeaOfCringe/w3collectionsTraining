package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Blue");
        myList.add("Red");
        myList.add("Pink");
        System.out.println(myList);
        for(int i=0; i<myList.size(); i++) {
            myList.set(i, myList.get(i)+ " color");
        }
        System.out.println(myList);
        myList.add(0, "Black");
        System.out.println(myList);
        myList.set(0, "Black color");
        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
        int i=myList.indexOf("Red color");
        System.out.println("Index: " + i);
        boolean cont = myList.contains("Black color");
        System.out.println(cont);
        myList.add(0, "Green color");
        myList.add("a");
        myList.add("A");
        System.out.println(myList);
        Collections.sort(myList); // 8
        System.out.println("Array after sorting: " + myList);
        ArrayList<String> myList2 = new ArrayList<String>(); // 9
        myList2.add("B");
        myList2.add("C");
        myList2.add("D");
        myList2.add("e");
        myList2.add("5");
        myList2.add("6");
        myList2.add("extra");
        System.out.println(myList2);
        Collections.copy(myList2, myList);
        System.out.println(myList2);
        Collections.shuffle(myList2); // 10
        System.out.println("Shuffled: " + myList2);
        Collections.reverse(myList2); // 11
        System.out.println("Reversed: " + myList2);
        List<String> myList3 = new ArrayList<String>(); // 12
        myList3 = myList2.subList(1, 5+1);
        System.out.println("Sublist: " + myList3);
        System.out.println(myList2);
        ArrayList<String> myList4 = new ArrayList<>(); // 13
        for (String e : myList2){
            myList4.add(myList.contains(e) ? "Yes" : "No");
        }
        System.out.println("Compare:");
        System.out.println(myList);
        System.out.println(myList2);
        System.out.println(myList4);
        System.out.println("Before swapping" + myList); // 14 swap
        /* String temp = myList.get(0);
        myList.set(0, myList.get(4));
        myList.set(4, temp);*/
        Collections.swap(myList, 0, 4);
        System.out.println("After swapping" + myList);
        myList4.addAll(myList3);                              // 15 concatenate
        System.out.println("Concatenate: " + myList4);
        ArrayList<String> myList5 = new ArrayList<String>();     // 16 clone
        myList5 = (ArrayList<String>)myList.clone();
        System.out.println("Cloned array: " + myList);
        myList4.removeAll(myList4);                           // 17 clear all
        System.out.println("Cleared array: " + myList4);
        boolean empty = myList4.isEmpty();                   // 18 empty check
        System.out.println("Array is empty: " + empty);
        myList5.trimToSize();                              // 19 trim size to current data filling
        System.out.println("Array after trim to size: " + myList5);
        myList5.add("Pink");
        System.out.println("Array after trim to size and adding one more element: " + myList5); // don't understand the purpose of this function
        myList5.ensureCapacity(10);                // 20 increase array size
        System.out.println("Array size after ensuring capacity of 10: " + myList5.size());   // still don't get it
        String color = "White";                              // 21 Replace element
        myList5.set(4, color);
        System.out.println("Replace element: " + myList5);
        for (int j =0; j<myList.size(); j++) System.out.println(myList.get(j));   // 22 Print using element index
    }
}
