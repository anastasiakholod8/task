import java.util.HashSet;
public class Main {
    public static void main(String[] args) {


    HashSet<String> names = new HashSet<String>();

    names.add("Марія");
    names.add("Юлія");
    names.add("Анастасія");
    names.add("Марія");
    names.add("Вікторія");

    System.out.println("Унікальні імена:"+names);

    System.out.println("Кількість унікальних імен:"+names.size());
  }

}
