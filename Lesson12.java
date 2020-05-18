Создать программу, которая позволяет пользователю вводить месяц и число его рождения, используя enum. Взамен выдает его знак зодиака (и гороскоп для особо продвинутых). 
Создать такое количество классов и методов, которое необходимо для корректной работы программы. (важно: в феврале дней не больше 29 и т.д.)
Применить логические и статические блоки инициализации, создать хотя бы один внутренний класс.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the month of your birth:");
        int userInput = scanner1.nextInt();
        Month m = Month.getMonthByOrdinal(userInput);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of your birth:");
        int userInput1 = scanner.nextInt();
        Day d = Day.getDayByOrdinal(userInput1);
        if (userInput1 > 31) {
            System.out.println("You entered incorrect day. Please, will enter day 1 to 31");
        }
        if (userInput > 12) {
            System.out.println("You entered incorrect month. Please, will enter month 1 to 12");
        }
        Horoscope horoscope = new Horoscope();
        horoscope.getZodiacSign(d, m);
    }
}
public class Horoscope {
    Day day;
    Month month;
    Zodiac zodiac;
    int year;
    public Horoscope(Day day, Month month, Zodiac zodiac, int year) {
        this.day = day;
        this.month = month;
        this.zodiac = zodiac;
        this.year = year;
    }
    public Horoscope() {
    }
    public void getZodiacSign(Day d, Month m) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the year of your birthday:");
        year = scanner3.nextInt();

        switch (m) {
            case JANUARY:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY) {
                    out.println("Your zodiac sign is " + " " + CAPRICORN + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The measured master planner of the horoscope family, Capricorn energy teaches us\n" +
                            " the power of structure and long-term goals.");

                } else if (d == Day.TWENTY_ONE || d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + AQUARIUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The mad scientist and humanitarian of the horoscope wheel, futuristic Aquarius \n" +
                            "energy helps us" +
                            " innovate and unite for social justice.");
                    break;
                }
            case FEBRUARY:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN) {
                    out.println("Your zodiac sign is " + " " + AQUARIUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The mad scientist and humanitarian of the horoscope wheel, futuristic Aquarius\n" +
                            " energy helps us" +
                            " innovate and unite for social justice.");

                } else if (year % 4 == 0) {
                    if (d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE || d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                            || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE) {
                        out.println("Your zodiac sign is " + " " + PISCES + "." + " " + "Characteristic of the sign:\n" +
                                " " + "The dreamer and healer of the horoscope family, Pisces energy awakens compassion,\n" +
                                " imagination and artistry, uniting us as one.");
                    } else if (d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE || d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                            || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT) {
                        out.println("Your zodiac sign is " + " " + PISCES + "." + " " + "Characteristic of the sign:\n" +
                                " " + "The dreamer and healer of the horoscope family, Pisces energy awakens compassion,\n" +
                                " imagination and artistry, uniting us as one.");
                    }
                }
                break;
            case MARCH:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY) {
                    out.println("Your zodiac sign is " + " " + PISCES + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The dreamer and healer of the horoscope family, Pisces energy awakens compassion,\n" +
                            " imagination and artistry, uniting us as one.");
                } else if (d == Day.TWENTY_ONE || d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + ARIES + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The pioneer and trailblazer of the horoscope wheel, Aries energy helps us\n" +
                            " initiate, fight for our beliefs and fearlessly put ourselves out there.");
                }
                break;
            case APRIL:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY) {
                    out.println("Your zodiac sign is " + " " + ARIES + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The pioneer and trailblazer of the horoscope wheel, Aries energy helps us\n" +
                            " initiate, fight for our beliefs and fearlessly put ourselves out there.");
                } else if (d == Day.TWENTY_ONE || d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY) {
                    out.println("Your zodiac sign is " + " " + TAURUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The persistent provider of the horoscope family, Taurus energy helps us seek security,\n" +
                            " enjoy earthly pleasures and get the job done.");
                }
                break;

            case MAY:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY ||
                        day == Day.TWENTY_ONE) {
                    out.println("Your zodiac sign is " + " " + TAURUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The persistent provider of the horoscope family, Taurus energy helps us seek security,\n" +
                            " enjoy earthly pleasures and get the job done.");
                } else if (d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + GEMINI + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The most versatile and vibrant horoscope sign, Gemini energy helps us communicate, \n" +
                            "collaborate and fly our freak flags at full mast.");
                }
                break;
            case JUNE:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE) {
                    out.println("Your zodiac sign is " + " " + GEMINI + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The most versatile and vibrant horoscope sign, Gemini energy helps us communicate,\n " +
                            "collaborate and fly our freak flags at full mast.");
                } else if (d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY) {
                    out.println("Your zodiac sign is " + " " + CANCER + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The natural nurturer of the horoscope wheel, Cancer energy helps us connect with\n" +
                            " our feelings, plant deep roots and feather our family nests.");
                }
                break;
            case JULY:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE) {
                    out.println("Your zodiac sign is " + " " + CANCER + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The natural nurturer of the horoscope wheel, Cancer energy helps us connect with\n" +
                            " our feelings, plant deep roots and feather our family nests.");
                } else if (d == Day.TWENTY_TWO || d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + LEO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The drama queen and regal ruler of the horoscope clan, Leo energy helps us shine,\n" +
                            " express ourselves boldly and wear our hearts on our sleeves.");
                }
                break;
            case AUGUST:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE
                        || d == Day.TWENTY_TWO) {
                    out.println("Your zodiac sign is " + " " + LEO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The drama queen and regal ruler of the horoscope clan, Leo energy helps us shine,\n" +
                            " express ourselves boldly and wear our hearts on our sleeves.");
                } else if (d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + VIRGO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The masterful helper of the horoscope wheel, Virgo energy teaches us to serve, do\n" +
                            " impeccable work and prioritize wellbeing—of ourselves, our loved ones and the planet.");
                }
                break;
            case SEPTEMBER:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE
                        || d == Day.TWENTY_TWO) {
                    out.println("Your zodiac sign is " + " " + VIRGO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The masterful helper of the horoscope wheel, Virgo energy teaches us to serve, do impeccable\n" +
                            " work and prioritize wellbeing—of ourselves, our loved ones and the planet.");
                } else if (d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY) {
                    out.println("Your zodiac sign is " + " " + LIBRA + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The balanced beautifier of the horoscope family, Libra energy inspires us to\n" +
                            " seek peace, harmony and cooperation—and to do it with style and grace.");
                }
                break;
            case OCTOBER:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE
                        || d == Day.TWENTY_TWO) {
                    out.println("Your zodiac sign is " + " " + LIBRA + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The balanced beautifier of the horoscope family, Libra energy inspires us to\n" +
                            " seek peace, harmony and cooperation—and to do it with style and grace.");
                } else if (d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + SCORPIO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The most intense and focused of the horoscope signs, Scorpio energy helps us dive deep,\n " +
                            "merge our superpowers and form bonds that are built to last.");
                }
                break;
            case NOVEMBER:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE
                        || d == Day.TWENTY_TWO) {
                    out.println("Your zodiac sign is " + " " + SCORPIO + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The most intense and focused of the horoscope signs, Scorpio energy helps us dive deep,\n " +
                            "merge our superpowers and form bonds that are built to last.");
                } else if (d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + SAGGITTERIUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The worldly adventurer of the horoscope wheel, Sagittarius energy inspires \n" +
                            "us to dream big, chase the impossible and take fearless risks.");
                }
                break;
            case DECEMBER:
                if (d == Day.ONE || d == Day.TWO || d == Day.THREE || d == Day.FOUR || d == Day.FIVE || d == Day.SIX
                        || d == Day.SEVEN || d == Day.EIGHT || d == Day.NINE || d == Day.TEN || d == Day.ELEVEN
                        || d == Day.TWELVE || d == Day.THIRTEEN || d == Day.FOURTEEN || d == Day.SIXTEEN
                        || d == Day.SEVENTEEN || d == Day.EIGHTEEN || d == Day.NINETEEN || d == Day.TWENTY || d == Day.TWENTY_ONE
                        || d == Day.TWENTY_TWO) {
                    out.println("Your zodiac sign is " + " " + SAGGITTERIUS + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The worldly adventurer of the horoscope wheel, Sagittarius energy inspires \n" +
                            "us to dream big, chase the impossible and take fearless risks.");
                } else if (d == Day.TWENTY_THREE || d == Day.TWENTY_FOUR || d == Day.TWENTY_FIVE
                        || d == Day.TWENTY_SIX || d == Day.TWENTY_SEVEN || d == Day.TWENTY_EIGHT || d == Day.TWENTY_NINE || d == Day.THIRTY
                        || d == Day.THIRTY_ONE) {
                    out.println("Your zodiac sign is " + " " + CAPRICORN + "." + " " + "Characteristic of the sign:\n" +
                            " " + "The measured master planner of the horoscope family, Capricorn energy teaches us the power \n" +
                            "of structure and long-term goals.");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + m);
        }
    }
}


public enum Day {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE,THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN,
    SEVENTEEN, EIGHTEEN, NINETEEN,TWENTY, TWENTY_ONE, TWENTY_TWO, TWENTY_THREE, TWENTY_FOUR, TWENTY_FIVE, TWENTY_SIX,
    TWENTY_SEVEN, TWENTY_EIGHT, TWENTY_NINE, THIRTY, THIRTY_ONE;

    public static Day getDayByOrdinal (int ordinal){
        for (Day d : Day.values()){
            if(d.ordinal()==ordinal){
                return d;
            }
        }
        return null;
    }


}
public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    public static Month getMonthByOrdinal (int ordinal){
        for (Month m : Month.values()){
            if(m.ordinal()==ordinal){
                return m;
            }
        }
        return null;
    }

}
public enum Zodiac {
    ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGGITTERIUS, CAPRICORN, AQUARIUS, PISCES;

    public static Zodiac getZodiacByOrdinal (int ordinal){
        for (Zodiac z : Zodiac.values()){
            if(z.ordinal()==ordinal){
                return z;
            }
        }
        return null;
    }
}

//////////////////

public class Main {

    public static void main(String[] args) {

        String query ="https://airbrake.io/blog/http-errors/301-moved-permanently";
        HttpURLConnection connection = null;
        try
        {
connection = (HttpURLConnection) new URL(query).openConnection();
connection.setRequestMethod("GET");
connection.setUseCaches(false);
connection.setConnectTimeout(10000);
connection.setReadTimeout(10000);
connection.connect();

StringBuilder sb = new StringBuilder();
if(HttpURLConnection.HTTP_OK== connection.getResponseCode()){
   BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
   String line;
   while ((line=in.readLine())!=null){
       sb.append(line);
       sb.append("\n");
   }
    System.out.println(sb.toString());
}else {
    System.out.println("fail: " + connection.getResponseCode()+","+connection.getResponseMessage());
}
        } catch(Throwable cause){
            cause.printStackTrace();
        }finally {
            if (connection!=null){
                connection.disconnect();
            }
        }
    }
}
