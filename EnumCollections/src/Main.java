import java.util.*;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY}

    public static void main(String[] args) {

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY,WeekDay.TUESDAY,
                WeekDay.THURSDAY, WeekDay.FRIDAY));

        var annsDaySet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaySet.getClass().getSimpleName());
        annsDaySet.forEach(System.out::println);
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("------------------------");
        allDaysSet.forEach(System.out::println);

        Set<WeekDay> newPersonDay = EnumSet.complementOf(annsDaySet);
        System.out.println("------------------------");

        newPersonDay.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsDaySet);
        System.out.println("------------------------");
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("------------------------");
        businessDays.forEach(System.out::println);

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);

        employeeMap.put(WeekDay.FRIDAY, new String[]{"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay.MONDAY, new String[]{"Mary", "Bob"});
        employeeMap.forEach((key, value) -> System.out.println(key + " : " + Arrays.toString(value)));


    }
}