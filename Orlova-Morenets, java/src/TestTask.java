import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class TestTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nЗадание №1");
        int number = Integer.parseInt(bufferedReader.readLine());

        if (number > 7) {
            System.out.println("Привет");
        }

        System.out.println("\nЗадание №2");
        String name = bufferedReader.readLine();
        String nameVyacheslav = "Вячеслав";

        if (name.equalsIgnoreCase(nameVyacheslav)) {
            System.out.println("Привет, " + nameVyacheslav);
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("\nЗадание №3");
        String line = bufferedReader.readLine();
        String[] nextSplit = line.split(", ");
        ArrayList<Integer> list = new ArrayList<>(Integer.parseInt(bufferedReader.readLine()));

        for (String num: nextSplit){
            list.add(Integer.parseInt(num));
        }

        for (int num: list){
            if (num % 3 == 0 && num != 0){
                System.out.println(num);
            }
        }

        System.out.println("\nЗадание №4");
        System.out.println("Нет, правильная последовательность: [((())()(()))]");
    }
}
