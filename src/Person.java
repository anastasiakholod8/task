import java.util.HashMap;
public class Person {
    public static void main(String[] args) {
        HashMap<String,Integer> person = new HashMap<String,Integer>();

        person.put("Анна",2345);
        person.put("Роман",3789);
        person.put("Вікторія",1067);
        person.put("Софія",7856);

     for(String key:person.keySet())
     {
         Integer value=person.get(key);
         System.out.println(key + "-" +value);
     }

        String searchName = "Анна";
        if (person.containsKey(searchName)) {
            System.out.println("Номер телефону для " + searchName + ": " + person.get(searchName));
        } else {
            System.out.println("Запис для імені \"" + searchName + "\" не знайдено.");
        }


        person.remove("Роман");

        System.out.println("\nСписок після видалення запису для 'Роман':");
        for (String key : person.keySet()) {
            Integer value = person.get(key);
            System.out.println(key + " - " + value);
        }


    }
}