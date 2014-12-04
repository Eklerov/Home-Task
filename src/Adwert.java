import com.sourceit.hometask.collections.CollectionUtils;
import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

public class Adwert implements SetUtils{
 public static void main(String [] args){

     Set<String> set=new TreeSet<>();
     set.add("e");
     set.add("a");
     set.add("b");
     set.add("f");
     set.add("d");



 Collection<Integer> coll=new ArrayList<>();

     coll.add(1);
     coll.add(3);
     coll.add(2);
     coll.add(6);
     coll.add(4);


Adwert ad=new Adwert();

System.out.println(ad.orderedSet(coll, set));
}
    public SortedSet<String> orderedSet(Collection<Integer> coll, Set<String> set){

//        List<String> list=new ArrayList<>(set);
        List<Integer> listI=new ArrayList<>(coll);

        Object [] arr= set.toArray();
       final Map<String,Integer> map=new HashMap<>();



        for(int i=0;i<arr.length;i++){

           map.put(arr[i].toString(),listI.get(i));
        }
        SortedSet<String> sort=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String s2) {
                return map.get(s).compareTo(map.get(s2));

            }
        }) ;
sort.addAll(set);
        return sort;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        return null;
    }
}
