package cf.darkdrogan.apps.englTrainer.Execute;

/**
 * Created by drogan on 05.12.15.
 */
public class Prenoun {

    //создаем массив, который инициализируется местоимениями в конструкторе
    private static String[] prenoun = new String[7];
    private static String[] englPrenoun = new String[7];
    private static String[] pasPrenoun = new String[7];

    //initialize array with prenoun
    static{
        prenoun[0] = "Я";
        prenoun[1] = "Мы";
        prenoun[2] = "Ты";
        prenoun[3] = "Он";
        prenoun[4] = "Она";
        prenoun[5] = "Оно";
        prenoun[6] = "Они";
        pasPrenoun[0] = "Меня";
        pasPrenoun[1] = "Нас";
        pasPrenoun[2] = "Тебя";
        pasPrenoun[3] = "Его";
        pasPrenoun[4] = "Ее";
        pasPrenoun[5] = "Это";
        pasPrenoun[6] = "Их";
        englPrenoun[0] = "I";
        englPrenoun[1] = "We";
        englPrenoun[2] = "You";
        englPrenoun[3] = "He";
        englPrenoun[4] = "She";
        englPrenoun[5] = "It";
        englPrenoun[6] = "They";
    }

    //получаем нужную форму местоимения
    public static String getRusPrenoun(int numberPrenoun)
    {
        return prenoun[numberPrenoun];
    }

    public static String getRusPasPrenoun(int numberPasPrenoun)
    {
        return pasPrenoun[numberPasPrenoun];
    }

    public static String getEnglPrenoun(int numberPrenoun)
    {
        return englPrenoun[numberPrenoun];
    }
}
