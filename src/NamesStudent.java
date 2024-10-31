import java.util.LinkedHashSet;
public class NamesStudent {
    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<String>();

        names.add("Марія");
        names.add("Юлія");
        names.add("Анастасія");
        names.add("Марія");
        names.add("Вікторія");

        boolean isAnastasiaPresent = names.contains("Анастасія");

        System.out.println("Унікальні імена:"+names);

        System.out.println("Кількість унікальних імен:"+names.size());

        System.out.print(isAnastasiaPresent);
    }

}
