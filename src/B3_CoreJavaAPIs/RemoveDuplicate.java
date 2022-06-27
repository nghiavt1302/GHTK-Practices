package B3_CoreJavaAPIs;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first list, items divided by <space>: ");
        String input1 = sc.nextLine();
        System.out.println("Input second list, items divided by <space>: ");
        String input2 = sc.nextLine();

        List<Integer> list1 = inputList(input1);
        List<Integer> list2 = inputList(input2);

        //Add ca 2 danh sach vao set, set se tu dong loai bo cac gia tri trung nhau
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.addAll(list2);

        // Chuyen set ve list de sort
        List<Integer> result = new ArrayList<>();
        result.addAll(set1);

        // Sort
        System.out.println("List after removing duplicate items: " + result);
        result.sort(((o1, o2) -> o1 - o2));
        System.out.println("Result sorted by ascending order: " + result);
        result.sort(((o1, o2) -> o2 - o1));
        System.out.println("Result sorted by descending order: " + result);
    }

    // Ham nhap 2 danh sach dau vao
    public static List<Integer> inputList(String input){
        String[] items = input.split(" ");
        List<Integer> listItems = new ArrayList<>();
        for(String s : items){
            listItems.add(Integer.parseInt(s));
        }
        return listItems;
    }
}
