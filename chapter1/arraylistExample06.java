package chapter1;
import java.util.*;
public class arraylistExample06 {
    Scanner sc = new Scanner(System.in);
    //syntax
   // ArrayList<Type> arrayListName = new ArrayList<Type>();
   //ArrayList<Integer> list = new ArrayList<Integer>();
   ArrayList<Integer> list = new ArrayList<>(10); // initial capacity is 10
   list.add(1);
   list.add(2);         
list.add(3);
   list.add(4);
   list.add(5);
   list.add(6);
   list.add(7);
   list.add(8);
   list.add(9);
   list.add(10);
   list.add(11); // will increase the capacity of the list
   System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
   System.out.println(list.size()); // 11
   System.out.println(list.contains(5)); // true
   System.out.println(list.get(5)); //6
   list.set(5, 100); // set element at index 5 to 100
  
    System.out.println(list.get(5)); // 100
   list.remove(2); // remove element at index 2
   System.out.println(list); // [1, 2, 100, 5]
   list.remove(Integer.valueOf(4)); // remove element with value 4
   System.out.println(list); // [1, 2, 5]

//input from user
for(int i = 0; i < list.size(); i++){
    list.add(sc.nextInt());
   
}
//get item at the index
for(int i = 0; i < list.size(); i++){
System.out.println(list.get(i));
    
}
System.out.println(list); // [1, 2, 5, 6, 7, 8, 9, 10, 11]
}
}


1.size is fixed internally.
2. size is dynamic internally.
3.arraylist fills by some amount of memory and when it is full, it will 
create a new array with double the size and copy the old array to the new array.
4.
