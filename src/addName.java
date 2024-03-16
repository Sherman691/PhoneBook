import com.sun.source.tree.Tree;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class addName {
    private static HashMap<String, List<Integer>> nameAndPhone = new HashMap<>();

    public static void main(String[] args) {

        addName("anna", 99999);
        addName("Ivan", 1);
        addName("Ivan", 4);
        addName("Igor", 5341);
        addName("anna", 11111);
        addName("alex", 12343);
        addName("Ivan", 3);

//        sortAndPrint();
        System.out.println(nameAndPhone);


    }

    static void addName(String nameForAdd, Integer phoneNumb) {
        if (nameAndPhone.get(nameForAdd) == null) {
            List arrayPhones = new ArrayList();
            arrayPhones.add(phoneNumb);
            nameAndPhone.put(nameForAdd, arrayPhones);
        } else {
            List addNumb = nameAndPhone.get(nameForAdd);
            addNumb.add(phoneNumb);
            nameAndPhone.put(nameForAdd, addNumb);
        }
    }

//    static void sortAndPrint() {
//        HashMap<String, Integer> sort = new HashMap<>();
//        for (Map.Entry<String, List<Integer>> entry : nameAndPhone.entrySet()) {
//            String key = entry.getKey();
//            int value = entry.getValue().size();
//            sort.put(key, value);
//        }
//        List<Map.Entry<String,Integer>> list = new ArrayList<>(sort.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
//            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//        LinkedHashMap<String,Integer> sortmp = new LinkedHashMap<>();
//
//        for(Map.Entry<String,Integer> k : list ) {
//
//            sortmp.put(k.getKey(), k.getValue());
//        }
//        System.out.println(sortmp);
//        HashMap<Set<String>, List<Integer>> finalList = new HashMap<>();
//
//        ArrayList key;
//        for (int i = sortmp.size()-1; i>=0; i--) {
//            key = sortmp.get(i);
//        }
//        for (int i = key.size(); i >=0; i--) {
//            finalList.put(Collections.singleton(key.toString()),nameAndPhone.get(i));
//        }
//
//
//        System.out.println(finalList);
//
//    }


}
