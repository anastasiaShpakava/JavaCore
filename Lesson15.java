
Общее задание:
1.      Найти в сети «Войну и мир» Толстого, скачать (руками))
2.      Прочитать его из файла (используя на выбор один из классов для чтения байтовой информации, а потом один из классов для чтения текстовой информации).
3.      Проанализировать его и записать в другой файл следующие результаты:
- самое часто встречающееся слово
- самое редко встречающееся слово
- самое длинное слово
- все годы (типа 1812, 1800 и т.д.), которые встречаются в романе, избегая повторений




public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("E:\\Война и мир.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.toLowerCase().split(" ");
                for (String word : words) {
                    if (wordCountMap.containsKey(word) && word.length() > 3) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String mostRepeatedWord = null;
        String leastRepeatedWord = null;
        String theLongestWord = null;
        int countMost = 0;
        int countLeast = 0;
        String maxlethWord = "";
        Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > countMost) {
                mostRepeatedWord = entry.getKey();
                countMost = entry.getValue();
            }
            if (entry.getValue() < countMost) {
                leastRepeatedWord = entry.getKey();
                countLeast = entry.getValue();
            }
            if (entry.getKey().length() > maxlethWord.length()) {
                maxlethWord = entry.getKey().replaceAll("\\w+", "");
            }
        }
        ArrayList<String> wordCountMap1 = new ArrayList<>();
        Stream<String> stream = wordCountMap1.stream();
        wordCountMap.entrySet().stream().filter(x -> x.getKey().length() == 4 && x.getKey().startsWith("18"))
                .forEach(x -> System.out.println("All years in text and their number of repetitions in the text: " + x));

        System.out.println("The most repeated word in text is : " + mostRepeatedWord);
        System.out.println("Number of repetitions is  : " + countMost);
        System.out.println("The least repeated word in text is : " + leastRepeatedWord);
        System.out.println("Number of repetitions is  : " + countLeast);
        System.out.println("The longest word in text is : " + maxlethWord);

        try (FileWriter fileWriter = new FileWriter("E:\\dates.txt")) {
            fileWriter.write("The most repeated word in text is : " + mostRepeatedWord);
            fileWriter.write("Number of repetitions is  : " + countMost);
            fileWriter.write("The least repeated word in text is : " + leastRepeatedWord);
            fileWriter.write("Number of repetitions is  : " + countLeast);
            fileWriter.write("The longest word in text is : " + maxlethWord);
            fileWriter.write("All years in text and their number of repetitions in the text:  " + wordCountMap1);
            fileWriter.flush();
            FileReader fileReader = new FileReader("E:\\dates.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
