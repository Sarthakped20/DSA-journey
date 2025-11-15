package normalprac;

import java.util.ArrayList;

public class AL1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
//        list.add(100);
//        list.add(45);
//        list.add(875);
//        list.add(6590);
//        list.add(964);
//        System.out.println(list);
//        boolean contains = list.contains(455);
//        System.out.println(contains);
//        int size = list.size();
//        System.out.println(size);
//
//        for(int i =0; i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//
//        }
//        System.out.println();
//        System.out.println("enhanced for loop: ");
////        for every element in list
//        for (Integer element:list) {
//            System.out.print(element+" ");
//        }
//        System.out.println();

//        retrive an element from arraylist

//        int index = 2;
//        if (index < list.size()){
//            int geting = list.get(index);
//            System.out.println("Retrived : "+geting);
//        }
//        int get = list.get(3);
//        System.out.println(get);
        System.out.println(list);
        sort(list);
        System.out.println("Ascending sorted : "+list);
        sortd(list);
        System.out.println("Descending sorted : "+list);
    }

    static void sort (ArrayList<Integer>list){
//        ArrayList<Integer>list = new ArrayList<>();
        list.add(23);
        list.add(67);
        list.add(34);
        list.add(55);
        list.add(33);
        list.add(73);
        list.add(2);

        int index = 0;
        for (int i = 0; i< list.size()-1;i++){
            for (int j =0;j<list.size()-i-1;j++){
                if (list.get(j)> list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }

    }
    static void sortd(ArrayList<Integer>list){
//        list.add(23);
//        list.add(67);
//        list.add(34);
//        list.add(55);
//        list.add(33);
//        list.add(73);
//        list.add(2);
        for (int i = 0; i< list.size()-1;i++){
            for (int j =0;j<list.size()-i-1;j++){
                if (list.get(j)< list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
}
