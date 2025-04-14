import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> combinedList = new ArrayList<>(TheList.separateNumbers());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        AtomicInteger count = new AtomicInteger(1);
        combinedList.forEach( s -> {
            if(count.get() % 2 == 0){
                list2.add(Integer.valueOf(s.strip()));
            }
            else{
                list1.add(Integer.valueOf(s.strip()));
            }
            count.getAndIncrement();
        });

        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());

        System.out.println(list1);
        System.out.println(list2);

        int sum = 0;

        for (int i = 0; i< list1.size(); i++){
            if (compareNumbers(list1.get(i), list2.get(i))) {
                sum += list1.get(i) - list2.get(i);
            }
            else {
                sum += list2.get(i) - list1.get(i);
            }
        }
        System.out.println(sum);
    }

    public static boolean compareNumbers(int num1, int num2){
        // true = num 1 bigger, false = num 2 bigger
        return num1 > num2;
    }
}