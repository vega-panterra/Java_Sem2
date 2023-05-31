package Sem2;

// 3) Дана json-строка (можно сохранить в файл и читать из файла)
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.File;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        parseStringTxt();
    }

    public static void parseStringTxt() {
        String filename = "D:\\Java\\Sem2\\src\\main\\java\\Sem2\\json.txt";
        File file = new File(filename);
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : a) {
                stringBuilder.append(c);
            }
            String line = stringBuilder.toString();
            line = line.replace("фамилия", "Студент(ка)");
            line = line.replace("оценка", "получил(а)");
            line = line.replace("предмет", "по предмету");
            line = line.replace("\"", "");
            line = line.replace(":", " ");
            line = line.replace(",", " ");
            System.out.println(line);
        } catch (Exception e) {
            System.out.println("Ошибка" + e);
        }
    }
}