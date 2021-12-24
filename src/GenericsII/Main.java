package GenericsII;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Container<Integer, String> container = new Container<>(12, "Hello");

       int val1 = container.getItem1();
       String val2 = container.getItem2();

       Container<Double, Character> container2 = new Container<>(20.5,'R');

       //Since our generic class Container can accept any Type we can instantiate another obj with different types

       Set<String> mySet1 = new HashSet<>();
       mySet1.add("first");
       mySet1.add("second");
       mySet1.add("third");

        Set<String> mySet2 = new HashSet<>();
        mySet1.add("fourth");
        mySet1.add("fifth");
        mySet1.add("sixth");

        Set<String> resultSets =  union(mySet1,mySet2);
        System.out.println(resultSets);

        for (String myVar : resultSets) {
            System.out.println(myVar);
        }

        Iterator<String> i = resultSets.iterator();
        while(i.hasNext()){
            String myVar = i.next();
        }

    }

    //Important to see the syntax of this method...

    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
      Set<E> result = new HashSet<>(set1);
      result.addAll(set2);
      return result;
    }
}
