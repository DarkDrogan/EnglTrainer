import java.util.Random;
/**
 * Created by drogan on 06.12.15.
 */
class Words {
    //сложное образование с "ся" в конце, плюс другое образование прошлого времени
    //String[] wordFight = {"драться", "дерусь", "дерешь", "дрался", "fight", "fought", "fought", "3", "1"};

    //exception
    //String[] be = {"быть", "есть", "есть", "был", "be", "was|were", "been", "4", "1"};

    //слово исключение, продумать насчет третьего лица ибо "has"
    //String[] wordHave = {"иметь", "имею", "име", "имел", "have", "had", "had", "1", "1"};

    // слово исключение, в третьем роде "does"
    //String[] wordDo = {"делать", "делаю", "дела", "делал", "do", "did", "done", "1", "1"};

    //исключение с русским словом
    //String eat = "есть ем ест ел eat ate eaten 3 1";

    //наподобие дерусь
    //String become = "становаиться становлюсь становимся становился become became become 4 1";

    //интересный ньюанс насчет прошедшего времени
    private String swell = "опухать опухаю опуха опух swell swelled swollen 1 1";
    private String drink = "пить пью пь пил aWords drank drunk 1 1";
    private String shoot = "стрелять стреляю стреля стрелял shoot shot shot 1 1";
    private String see = "видеть вижу вид видел see saw seen 2 1";
    private String forget = "забывать забываю забыва забыл forget forgot forgotten 1 1";
    private String creep = "ползать ползу полз ползал creep crept crept 1 1";
    private String weep = "плакать плачу плач плакал weep wept wept 1 1";
    private String hurt = "вредить врежу вред вредил hurt hurt hurt 2 1";
    private String strike = "ударять ударяю ударя ударил strike struck struck 1 1";
    private String freeze = "замораживать замораживаю заморажива заморозил freeze froze frozen 1 1";
    private String aBreak = "разбивать разбиваю разбива разбил break broke broken 1 1";
    private String bind = "связывать связываю связыва связал bind bound bound 1 1";
    private String draw = "рисовать рисую рису рисовал draw drew drawn 1 1";
    private String hide = "прятать прячу пряч прятал hide hid hidden 1 1";
    private String spread = "распространять распространяю распространя распространил spread spread spread 1 1";
    private String steal = "красть краду крад крал steal stole stolen 1 1";
    private String spit = "плевать плюю плю плевал spit spat spat 1 1";
    private String lean = "нагибать нагибаю нагиба нагибал lean leant leant 1 1";
    private String fall = "падать падаю пада падал fall fell fallen 1 1";
    private String write = "писать пишу пиш писал write wrote written 1 1";
    private String ride = "ездить езжу езд ездил ride rode ridden 2 1";
    private String seek = "искать исчу исч искал seek sought sought 1 1";
    private String bite = "кусать кусаю куса кусал bite bit bitten 1 1";
    private String begin = "начинать начинаю начина начинал begin began begun 1 1";
    private String come = "приходить прихожу приход приходил come came come 2 1";
    private String feel = "чувствовать чувствую чувству чувствовал feel felt felt 1 1";
    private String find = "находить нахожу наход находил find found found 2 1";
    private String get = "получать получаю получа получил get got gotten 1 1";
    private String give = "давать даю да давал give gave given 1 1";
    private String hear = "слышать слышу слыш слышал hear heard heard 1 1";
    private String make = "создавать создаю созда создал make made made 1 1";
    private String meet = "встречать встречаю встреча встречал meet met met 1 1";
    private String say = "говорить говорю говор говорил say said said 2 1";
    private String show = "показывать показываю показыва показал show showed shown 1 1";
    private String take = "брать беру бер брал take took taken 1 1";
    private String think = "думать думаю дума думал think thought thought 1 1";
    private String arise = "поднимать поднимаю поднима поднимал arise arose arisen 1 1";
    private String bring = "нести несу нес нес bring brought brought 1 1";
    private String aCatch = "ловить ловлю лов ловил catch caught caught 2 1";
    private String cost = "стоить стою сто стоил cost cost cost 2 1";
    private String dream = "мечтать мечтаю мечта мечтал dream dreamt dreamt 1 1";

    String[] words = {bind, bite, begin, come, cost, dream, feel, find, get, give, hear, make, meet, say, show,
            take, think, arise, bring, aCatch, aBreak, creep, draw, drink, fall, forget, freeze, hide, hurt,
            lean, ride, see, seek, shoot, spit, spread, steal, strike, swell, weep, write};

    String[] word = {"", "", "", "", "", "", "", "1", "1"};

    public String[] getWords(){
        Random rand = new Random();
        String[] e = words[rand.nextInt(words.length)].split(" ");
        return e;
    }
}
