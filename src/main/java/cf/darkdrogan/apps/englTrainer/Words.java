package cf.darkdrogan.apps.englTrainer;

import java.util.Random;
/**
 * Created by drogan on 06.12.15.
 */
class Words {

//Array of the irregular verbs, may be changed to SQL or XML||JSon list for parsing
    //a
    private String arise = "поднимать поднимаю поднима поднимал arise arose arisen 1 1 поднят";

    //b
    //exception
    //String[] be = {"быть", "есть", "есть", "был", "be", "was|were", "been", "4", "1"};
    // наподобие дерусь
    //String become = "становаиться становлюсь становимся становился become became become 4 1";
    private String begin = "начинать начинаю начина начинал begin began begun 1 1 начат";
    private String bind = "связывать связываю связыва связал bind bound bound 1 1 связан";
    private String bite = "кусать кусаю куса кусал bite bit bitten 1 1 укушен";
    private String aBreak = "разбивать разбиваю разбива разбил break broke broken 1 1 разбит";
    private String bring = "нести несу нес нес bring brought brought 1 1 отнесен";

    //c
    private String aCatch = "ловить ловлю лов ловил catch caught caught 2 1 пойман";
    private String come = "приходить прихожу приход приходил come came come 2 1 пройден";
    private String cost = "стоить стою сто стоил cost cost cost 2 1 оценен";
    private String creep = "ползать ползу полз ползал creep crept crept 1 1 приползен(";//!

    //d
    // слово исключение, в третьем роде "does"
    //String[] wordDo = {"делать", "делаю", "дела", "делал", "do", "did", "done", "1", "1"};
    private String draw = "рисовать рисую рису рисовал draw drew drawn 1 1 нарисован";
    private String dream = "мечтать мечтаю мечта мечтал dream dreamt dreamt 1 1 выдуман(";//!
    private String drink = "пить пью пь пил drink drank drunk 1 1 пьян";//!

    //e
    //исключение с русским словом
    //String eat = "есть ем ест ел eat ate eaten 3 1";

    //f
    private String fall = "падать падаю пада упал fall fell fallen 1 1 пал(";//!
    private String feel = "чувствовать чувствую чувству чувствовал feel felt felt 1 1 почувствован(";//!
    private String find = "находить нахожу наход находил find found found 2 1 найден";
    //сложное образование с "ся" в конце, плюс другое образование прошлого времени
    //String[] wordFight = {"драться", "дерусь", "дерешь", "дрался", "fight", "fought", "fought", "3", "1"};
    private String forget = "забывать забываю забыва забыл forget forgot forgotten 1 1 забыт";
    private String freeze = "замораживать замораживаю заморажива заморозил freeze froze frozen 1 1 заморожен";

    //g
    private String get = "получать получаю получа получил get got gotten 1 1 получен";
    private String give = "давать даю да давал give gave given 1 1 отдан";

    //h
    //слово исключение, продумать насчет третьего лица ибо "has"
    //String[] aHave = {"иметь", "имею", "име", "имел", "have", "had", "had", "1", "1"};
    private String hear = "слышать слышу слыш слышал hear heard heard 1 1 услышан";
    private String hide = "прятать прячу пряч прятал hide hid hidden 1 1 спрятан";
    private String hurt = "вредить врежу вред вредил hurt hurt hurt 2 1 поврежден";

    //i

    //j

    //k

    //l
    private String lean = "нагибать нагибаю нагиба нагибал lean leant leant 1 1 нагнут";

    //m
    private String make = "создавать создаю созда создал make made made 1 1 создан";
    private String meet = "встречать встречаю встреча встречал meet met met 1 1 встречен";

    //n

    //o

    //p

    //q

    //r
    private String ride = "ездить езжу езд ездил ride rode ridden 2 1 объезжен(";//!

    //s
    private String say = "говорить говорю говор говорил say said said 2 1 сказан";
    private String see = "видеть вижу вид видел see saw seen 2 1 увиден";
    private String seek = "искать исчу исч искал seek sought sought 1 1 отыскан(найден)(";//!
    private String shoot = "стрелять стреляю стреля стрелял shoot shot shot 1 1 стрелян(";//!
    private String show = "показывать показываю показыва показал show showed shown 1 1 показан";
    private String spit = "плевать плюю плю плевал spit spat spat 1 1 оплеван";
    private String spread = "распространять распространяю распространя распространил spread spread spread 1 1 распространен";
    private String steal = "красть краду крад крал steal stole stolen 1 1 украден";
    private String strike = "ударять ударяю ударя ударил strike struck struck 1 1 ударен";
    private String swell = "опухать опухаю опуха опух swell swelled swollen 1 1 опух(";//!

    //t
    private String take = "брать беру бер брал take took taken 1 1 взят";
    private String think = "думать думаю дума думал think thought thought 1 1 обдуман(";//

    //w
    private String weep = "плакать плачу плач плакал weep wept wept 1 1 оплакан(";//!
    private String write = "писать пишу пиш писал write wrote written 1 1 написан";

    //загоняет все переменные в массив, для удобства взятия рандомной строки.
    private String[] words = {arise, bind, bite, begin, aBreak, bring, aCatch, come, creep, cost, draw, drink, dream,
            feel, find, fall, forget, freeze, get, give, hear, hide, hurt, make, meet, show, take, think,
            lean, ride, say, see, seek, shoot, spit, spread, steal, strike, swell, weep, write};

    private String[] word = {"", "", "", "", "", "", "", "1", "1"};

    //this getter take random word from array and split string on array for trainer and other rules of the trainer
    public String[] getWords(){
        Random rand = new Random();
        String[] e = words[rand.nextInt(words.length)].split(" ");
        return e;
    }

    //new features for take concrete word - soon I'll take getter all irVerbs with number of string for concreteGetter
    public String[] getWords(int i){
        String[] e = words[i].split(" ");
        return e;
    }
}