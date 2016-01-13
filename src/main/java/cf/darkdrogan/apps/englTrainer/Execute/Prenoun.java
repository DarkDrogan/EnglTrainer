package cf.darkdrogan.apps.englTrainer.Execute;

import java.util.ArrayList;

/**
 * Prenoun class.
 */
public final class Prenoun {
    /**
     * If this class is only a utility class,
     * you should make the class final and define a private constructor.
     */
    private Prenoun() {
    }

    //создаем массив, который инициализируется местоимениями в конструкторе
    // Notice: javadoc the variables:
    /**
     * No magic numbers.
     */
    private final static int size = 7;
    /**
     * ??
     */
    private static ArrayList<String> prenoun = new ArrayList<String>(size);
    /**
     * ??
     */
    private static String[] englPrenoun = new String[size];
    /**
     * ??
     */
    private static String[] pasPrenoun = new String[size];

    // initialize array with prenoun
    // bad block. should be ArrayList imho.
    // sample below

    static {

        prenoun.add("Я");
        prenoun.add("Мы");
        prenoun.add("Ты");
        prenoun.add("Он");
        prenoun.add("Она");
        prenoun.add("Оно");
        prenoun.add("Они");
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

    /**
     * Resturns right form of prenoun.
     * @param numberPrenoun prenoun number
     * @return Prenoun form
     */
    public static String getRusPrenoun(final int numberPrenoun) {
        return prenoun.get(numberPrenoun);
    }

    /**
     * What does it do?
     * @param numberPasPrenoun ??
     * @return ??
     */
    public static String getRusPasPrenoun(final int numberPasPrenoun) {
        return pasPrenoun[numberPasPrenoun];
    }

    /**
     * What does it do?
     * @param numberPrenoun ??
     * @return ??
     */
    public static String getEnglPrenoun(final int numberPrenoun) {
        return englPrenoun[numberPrenoun];
    }
}
