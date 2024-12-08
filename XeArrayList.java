import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;
public class XeArrayList {
    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<Float> list2 = new ArrayList<>();

    //     //add element
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     System.out.println(list);


        // //Get element
        // int Getelement = list.get(3);
        // System.out.println(Getelement);


        // //Remove element
        // int Removeelement = list.remove(2);
        // System.out.println(Removeelement);
        // System.out.println(list);


        // //Set element at index
        // int Setelement = list.set(2, 7);
        // System.out.println(Setelement);
        // System.out.println(list);


        // //cotains
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(10));

        // //For calculate size in array list
        // System.out.println(list.size());


        // // print revers ofn arraylists
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();





    //     int max = Integer.MIN_VALUE;
    //     for(int i =0; i<list.size(); i++){
    //         if(max < list.get(i)){
    //             max = list.get(i);
    //         }
    //     }
    //     System.out.println("Max Value is : "+max);
    // }














    //    public static void swap(ArrayList<Integer> list, int ind1, int ind2){
    //     int temp = list.get(ind1);
    //     list.set(ind1, list.get(ind2));
    //     list.set(ind2, temp);
    //    }

    //    public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<Float> list2 = new ArrayList<>();

    //     //add element
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     System.out.println(list);
    //     int ind1 = 2;
    //     int ind2 = 3;
    //     swap(list, ind1, ind2);
    //     System.out.println(list);
    //    }


















    //    public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<Float> list2 = new ArrayList<>();

    //     //add element
    //     list.add(10);
    //     list.add(23);
    //     list.add(3);
    //     list.add(13);
    //     list.add(7);
    //     System.out.println(list);
    //     Collections.sort(list);
    //     System.out.println(list);
    //     Collections.sort(list , Collections.reverseOrder());
    //     System.out.println(list);
    //    }

















    // public static void main(String[] args) {
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(1); list.add(2);
    //     mainList.add(list);

    //     ArrayList<Integer> list2 = new ArrayList<>();
    //     list2.add(3); list2.add(4);
    //     mainList.add(list2);

    //     for(int i = 0; i<mainList.size(); i++){
    //         ArrayList<Integer> currList = mainList.get(i);
    //         for(int j =0; j<currList.size(); j++){
    //             System.out.print(currList.get(i)+ " ");
    //         }
    //         System.out.println();
    //     }

    //     System.out.println(mainList);



    // }























    // public static int storewater(ArrayList<Integer> height){
    //     int maxwater = 0;

    //     for(int i=0; i<height.size(); i++){
    //         for(int j = 0; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currwater = ht * width;
    //             maxwater = Math.max(maxwater, currwater);
    //         }
    //     }
    //     return maxwater;
    // }



    // public static void main(String[] args) {
    //     ArrayList<Integer> height = new ArrayList<>();
    //     height.add(1);
    //     height.add(8);
    //     height.add(4);
    //     height.add(4);
    //     height.add(7);
    //     height.add(5);
    //     height.add(6);
    //     height.add(7);
    //     height.add(6);

    //     System.out.println("Max Store water is : "+storewater(height));
    // }











    public static int storewater(ArrayList<Integer> heigth){
        int maxwater = 0;
        int left = 0;
        int right = heigth.size()-1;

        while (left<right) {
            int ht = Math.min(heigth.get(left), heigth.get(right));
            int width = right-left;
            int currwater = ht*width;
            maxwater = Math.max(maxwater, currwater);
            if(heigth.get(left)< heigth.get(right)){
                left++;
            }
            if(heigth.get(right)>=heigth.get(left)){
                right++;
            }
   
        }

        return maxwater;
    }


  public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(4);
        height.add(4);
        height.add(7);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(6);

        System.out.println("Max Store water is : " + storewater(height));
    }

}
