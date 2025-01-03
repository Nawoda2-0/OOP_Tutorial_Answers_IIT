package week7;


import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {
        int[] array = {4, 6, 8};
        ArrayList<Integer> Alist = new ArrayList<>();
        Alist.add(-1);
        Alist.add(3);
        Alist.add(28);
        Alist.add(17);
        Alist.add(9);
        Alist.add(30);

        loadArray(array);
        for (int value : array){
            System.out.print(value + " ");
        }

        System.out.println("");

        listDemo(Alist);
    }

    public static void loadArray(int[] list){
        for (int i = 1; i< list.length;i++){
            list[i] = list[i] + list[i-1];
        }
    }

    public static void listDemo(ArrayList<Integer> list){
        for (int i =0; i<list.size(); i++){
            int element = list.get(i);
            list.remove(i);
            list.add(0, element+1);
        }
        System.out.println(list);
    }
}
