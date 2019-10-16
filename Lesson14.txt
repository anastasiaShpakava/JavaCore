public class Main {
  
Во всех задачах использовать стримы.

1. Напишите программу, читающую из консоли текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.

Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".

Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите слова в нижнем регистре.

Если в тексте меньше 10 уникальных слов, то выводите сколько есть.

Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
---------------------------------------------------------------------------------------

2. Есть набор данных в формате id-name, сохраненный в Map. Необходимо отсортировать их этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13. Среди отсортированных значений отобрать только те, которые имеют нечетное количество букв в имени, после чего вернуть список List имен, записанных буквами задом наперед.

--------------------------------------------------------------------------------------
3. Есть LinkedList, которые хранит в себе объекты Worker как минимум с двумя полями. Необходимо исключить из списка тех работников, возраст которых младше 15-ти лет, а также тех, кто имеет судимость или штраф за парковку (это должны быть поля класса). После чего записать список в Map,  ключом будет являться возраст, умноженный на рандомное простое! число в диапазоне от 3 до 107 включая обе границы.


  public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter words:");
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordsByNumber = new HashMap<>();
        String word = scanner.next().toLowerCase();
        if (wordsByNumber.containsKey(word)) {
            wordsByNumber.put(word, wordsByNumber.get(word) + 1);
        } else {
            wordsByNumber.put(word, 1);
        }
        Map<Integer, List<String>> numberByWords = new HashMap<>();
        for (Map.Entry<String, Integer> entry : wordsByNumber.entrySet()) {
            word = entry.getKey();
            Integer number = entry.getValue();
            if (!numberByWords.containsKey(number)) {
                numberByWords.put(number, new ArrayList<>());
            }
            numberByWords.get(number).add(word);
        }
        List<String> allWords = new ArrayList<>();
        numberByWords.keySet().stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(key -> {
                    List<String> words = numberByWords.get(key);
                    words.stream().sorted().forEach(value -> {
                        if (allWords.size() >= 10) {
                            return;
                        }
                        allWords.add(value);
                    });
                });
        allWords.stream().forEach(System.out::println);
    }
}
///////////
public class Main {

    public static void main(String[] args) {


        LinkedList<Worker> list = new LinkedList<>();
        list.add(new Worker("Alex", "Perry", 18, true, true));
        list.add(new Worker("Sam", "Brown", 66, true, false));
        list.add(new Worker("Kate", "Smith", 54, false, true));
        list.add(new Worker("Bill", "Jackson", 32, true, false));
        Stream stream = list.stream().filter(worker -> worker.getAge() > 15).filter(worker -> worker.previousConviction())
                .filter(worker -> worker.parkingTicket()).map(worker -> "key " +
                        worker.getAge() * (int) (3 + Math.random() * (108 - 3)) + " " + "," + "name is " + worker.getName() + "," +
                        " " + "surname is " + " " + worker.getSurname() + "," + " " + "age is " + worker.getAge() + " " + "," +
                        "was a prison? it is  " + worker.previousConviction() + "," + " " + "has parking ticket? it is " +
                        worker.parkingTicket() + ".");

        stream.forEach((worker) -> System.out.println(worker));

    }
}
public class Worker {

    private String name;
    private String surname;
    private int age;
    private boolean previousConviction;
    private boolean parkingTicket;

    public Worker(String name, String surname, int age, boolean previousConviction, boolean parkingTicket) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.previousConviction = previousConviction;
        this.parkingTicket = parkingTicket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean previousConviction() {
        return previousConviction;
    }

    public boolean parkingTicket() {
        return parkingTicket;
    }
}
////////////
public class Main {

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(128, "Kate");
        people.put(2, "Ali");
        people.put(3, "Mary");
        people.put(5, "David");
        people.put(1, "Ben");
        people.put(60, "Monica");
        people.put(7, "Leo");
        people.put(8, "Tom");
        people.put(9, "Billi");
        people.put(13, "Jerry");
        System.out.println(people);
        ArrayList<String> people1 = new ArrayList<>();

        Stream<String> stream = people1.stream();
        people.entrySet().stream().filter(x ->
                x.getKey() == 1 || x.getKey() == 2 || x.getKey() == 5
                        || x.getKey() == 8 || x.getKey() == 9 || x.getKey() == 13).filter((x) -> x.getValue().length() % 2 != 0)
                .forEach(x -> System.out.println(x));

        StringBuffer list = new StringBuffer();
        for (String s : people1) {
            list.append(s);
            list.append(" ");
        }
        String str = list.toString();
        System.out.println(str);
        list.reverse();
        System.out.println(list);
    }
}

