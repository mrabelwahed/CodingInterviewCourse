package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Play {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("printing the list:");
        ListIterator iterator = list.listIterator();
        String s ="";
//        while (iterator.hasNext()){
//           s = (String) iterator.next();
//           if(s.equals("A"))
//               iterator.remove();
//
//           else
//            System.out.println(":"+ s);
//        }


        //ConcurrentModificationException
        for (String sr : list){
            if (sr.equals("A"))
                list.add("AA");
            else
                System.out.println(sr);
        }


//
//        while (iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
    }
}
