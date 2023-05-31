package Sem2;

import java.util.LinkedHashMap;
import java.util.Map;

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);

        System.out.println(getRequest(map));
    }

    public static String getRequest(Map<String, String> finalResult) {
        StringBuilder result = new StringBuilder();
        if (finalResult == null || finalResult.isEmpty())
            return result.toString();
        for (Map.Entry<String, String> pair : finalResult.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }

        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}