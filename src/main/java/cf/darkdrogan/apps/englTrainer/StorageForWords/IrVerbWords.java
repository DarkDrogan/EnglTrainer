package cf.darkdrogan.apps.englTrainer.StorageForWords;

import java.util.Random;
/**
 * Created by drogan on 06.12.15.
 */
public class IrVerbWords implements Words {

//Array of the irregular verbs, may be changed to SQL or XML||JSon list for parsing
    /*
    * private String VERB = "rusInfinitive iDo rootDo rootDid firstVerb secondVerb typeWord RegularOrIrregular rusFormOf-be-verb+ed";
    */
    //a
    private String arise = "поднимать поднимаю поднима поднимал arise arose arisen 1 1 поднят";
    private String awake = "просыпаться просыпаюсь просыпае проснулся awake awoke awoke 4 1 проснулся(страдательное)";//

    //b
    //exception
    //String[] be = {"быть", "есть", "есть", "был", "be", "was|were", "been", "4", "1"};
    // наподобие дерусь
    private String bear = "рождать рожаю рожа рожал bear bore born 1 1 рожден";
    private String aBear = "носить ношу нос носил bear bore borne 2 1 поношен";
    private String beat = "бить бью бь бил beat beat beaten 1 1 побит";
    private String become = "становиться становлюсь станови становил become became become 4 1 стал";
    private String bend = "гнуть гну гн гнул bend bent bent 3 1 погнут";
    private String begin = "начинать начинаю начина начинал begin began begun 1 1 начат";
    private String bind = "связывать связываю связыва связал bind bound bound 1 1 связан";
    private String bite = "кусать кусаю куса кусал bite bit bitten 1 1 укушен";
    private String blow = "дуть дую ду дул blow blew blown 1 1 надут";
    private String bleed = "кровоточить кровоточу кровоточ кровоточил bleed bled bled 2 1 кровоточен(кровоточить)";//я люблю русский язык
    private String aBreak = "разбивать разбиваю разбива разбил break broke broken 1 1 разбит";
    private String breed = "выводить вывожу вывод вывел breed bred bred 2 1 выведен";
    private String bring = "нести несу нес нес bring brought brought 1 1 отнесен";
    private String broadcast = "(по_радио)передавать передаю переда передал broadcast broadcast broadcast 1 1 передан";
    private String build = "строить строю стро строил build built built 1 1 построен";
    private String burn = "жечь жгу жг сжог burn burnt burnt 3 1 сожжен";
    private String burst = "разрываться разрываю разрыва разрывал burst burst burst 1 1 разорван";
    private String buy = "покупать покупаю покупа купил buy bought bought 1 1 куплен";

    //c
    private String cast = "кидать кидаю кида кидал cast cast cast 1 1 брошен(кидать)";
    private String aCatch = "ловить ловлю лов ловил catch caught caught 2 1 пойман";
    private String choose = "выбирать выбираю выбира выбирал choose chose chosen 1 1 выбран";
    private String cling = "прилипать прилипаю прилипа прилипал cling clung clung 1 1 прилеплен";
    private String come = "приходить прихожу приход приходил come came come 2 1 пройден";
    private String cost = "стоить стою сто стоил cost cost cost 2 1 оценен";
    private String creep = "ползать ползу полз ползал creep crept crept 1 1 дотащен(ползти)";//!

    //d
    private String aDo = "делать делаю дела делал do did done 1 1 сделан";
    private String deal = "торговать торгую торгу торговал deal dealt dealt 1 1 (торговать)заключен";
    private String dig = "копать копаю копа копал dig dug dug 1 1 откопан";
    private String draw = "рисовать рисую рису рисовал draw drew drawn 1 1 нарисован";
    private String dream = "мечтать мечтаю мечта мечтал dream dreamt dreamt 1 1 выдуман(";//!
    private String drink = "пить пью пь пил drink drank drunk 1 1 пьян";//!
    private String drive = "вести веду вед вел drive drove driven 3 1 проведен";
    private String dwell = "обитать обитаю обита обитал dwell dwelt dwelt 1 1 (страдательное)обитать";

    //e
    //исключение с русским словом - надо думать !!!
    //private String eat = "есть ем ед ел eat ate eaten /*may be 5*/ 1 1 съеден";

    //f
    private String fall = "падать падаю пада упал fall fell fallen 1 1 пал(";//!
    private String feed = "кормить кормлю корм кормил feed fed fed 2 1 накормлен";
    private String feel = "чувствовать чувствую чувству чувствовал feel felt felt 1 1 почувствован(";//!
    private String find = "находить нахожу наход находил find found found 2 1 найден";
    private String fight = "драться дерусь дерe драл fight fought fought 4 1 побит";
    private String flee = "спасаться спасаюсь спасае спасал flee fled fled 4 1 спасен";
    private String fling = "кидать кидаю кида кидал fling flung flung 1 1 кинут";
    private String fly = "летать лечу лет летел fly flew flown 2 1 лечен(летать)";//бяка! в страдательном
    private String forbit = "запрещать запрещаю запреща запрещал forbit forbade forbidden 1 1 запрещен";
    private String forget = "забывать забываю забыва забыл forget forgot forgotten 1 1 забыт";
    private String forgive = "прощать прощаю проща простил forgive forgave forgiven 1 1 прощен";
    private String freeze = "замораживать замораживаю заморажива заморозил freeze froze frozen 1 1 заморожен";

    //g
    private String get = "получать получаю получа получил get got gotten 1 1 получен";
    private String give = "давать даю да давал give gave given 1 1 отдан";
    private String go = "идти иду ид ходил go went gone 3 1 пройден";
    private String grind = "молот перемалываю перемалыва перемолол grind ground ground 1 1 перемолен";
    private String grow = "расти расту раст grow grew grown 3 1выращен";

    //h
    //слово исключение, продумать насчет третьего лица ибо "has"
    //String[] aHave = {"иметь", "имею", "име", "имел", "have", "had", "had", "1", "1"};
    private String hang = "вешать вешаю вешаю веша вешал hang hung hund 1 1 повешен";
    private String hear = "слышать слышу слыш слышал hear heard heard 1 1 услышан";
    private String hide = "прятать прячу пряч прятал hide hid hidden 1 1 спрятан";
    private String hit = "ударять ударяю ударя ударил hit hit hit 1 1 ударен";
    private String hold = "держать держу держ держал hold heald heald 2 1 удержан";
    private String hurt = "вредить врежу вред вредил hurt hurt hurt 2 1 поврежден";

    //i

    //j

    //k
    private String keep = "хранить храню хран хранил keep kept kept 2 1 сохранен";
    //private String kneel = "становиться на колени"; - надо думать
    private String know = "знать знаю зна знал know knew known 1 1 известен(знать)";

    //l
    private String lay = "класть кладу клад клал lay laid laid 1 1 (класть)положен";
    private String lead = "вести веду вед вел lead led led 3 1 проведен";
    private String lean = "нагибать нагибаю нагиба нагибал lean leant leant 1 1 нагнут";
    private String leap = "прыгать прыгаю прыга прыгнул leap leapt leapt 1 1 (прыгать)подброшен";
    private String learn = "учить учу уч учил learn learnt learnt 2 1 выучен";
    private String leave = "покидать покидаю покида покинул leave left left 1 1 покинут";
    private String lend = "одолжить одалживаю одалжива одолжил lend lent lent 1 1 одолжен";
    private String let = "позволять позволяю позволя ползволял let let let 1 1 позволен";
    private String lie = "лежать лежу леж лежал lie lay lain 2 1 положен(лежать)";
    private String light = "зажигать зажигаю зажига зажигал light lit lit 1 1 зажжен";
    private String lose = "терять теряю теря потерял lose lost lost 1 1 потерян";

    //m
    private String make = "создавать создаю созда создал make made made 1 1 создан";
    private String mean = "значить значу знач значил mean meant meant 2 1 означал";
    private String meet = "встречать встречаю встреча встречал meet met met 1 1 встречен";

    //n

    //o

    //p
    private String pay = "платить плачу плат платил pay paid paid 2 1 оплачен";
    private String put = "ложить ложу лож ложил put put put 2 1 положен";

    //q

    //r
    private String read = "читать читаю чита читал read read read 1 1 прочитан";
    private String ride = "ездить езжу езд ездил ride rode ridden 2 1 объезжен(";//!
    private String ring = "звонить звоню звон звонил ring rang rung 2 1 звенел";
    private String rise = "подниматься поднимаюсь поднимае поднял rise rose risen 4 1 поднят";
    private String run = "бежать бегу беж бежал run ran run 2 1 (бежать)пройден";

    //s
    private String say = "говорить говорю говор говорил say said said 2 1 сказан";
    private String saw = "пилить пилю пил пилил saw sawed sawn 1 1 распилен";
    private String see = "видеть вижу вид видел see saw seen 2 1 увиден";
    private String seek = "искать исчу исч искал seek sought sought 1 1 найден(искать)";//!
    private String sell = "продавать продаю прода продал pay sold sold 1 1 продан";
    private String send = "посылать посылаю посыла послал send sent sent 1 1 послан";
    private String set = "помещать помещаю помеща помещал set set set 1 1 помещен";
    private String shake = "трясти трясу тряс тряс shake shook shaken 3 1 потрясен";
    private String shed = "проливать проливаю пролива проливал shed shed shed 1 1 пролит";
    private String shine = "сиять сияю сия сиял shine shone shone 1 1 (сиять)освещен";
    private String shoot = "стрелять стреляю стреля стрелял shoot shot shot 1 1 стрелян(";//!
    private String show = "показывать показываю показыва показал show showed shown 1 1 показан";
    private String shrink = "сморщиваться морщусь морщи морщился shrink shrank shrunk 4 1 сморщен";
    private String shut = "закрывать закрываю закрыва закрывал shut shut shut 1 1 закрыт";
    private String sing = "петь пою по пел sing sang sung 1 1 пропет";
    private String sink = "тонуть тону тон тонул sink sank sunk 3 1 утоплен";
    private String sit = "сидеть сижу сид сидел sit sat sat 2 1 посажен";
    private String sleep = "спать сплю сп спал sleep slept slept 2 1 (спать)проспан";
    private String slide = "скользить скольжу скольз скользил slide slid slid 2 1 проскользил";
    private String smell = "нюхать нюхаю нюха нюхал smell smelt smelt 1 1 пахнет";
    private String sow = "сеять сею се сеял sow sowed sonw 1 1 посеян";
    private String speak = "говорить говорю говор говорил speak spoke spoken 2 1 сказан";
    private String speed = "спешить спешу спеш спешил speed sped sped 2 1 спешен";//в жопу все=(
    //private String spell = "читать или писать по буквам - надо думать";
    private String spend = "тратить трачу трат тратил spend spent spent 2 1 потрачен";

    private String spill = "проливать проливаю пролива пролил spill spilt spilt 1 1 пролит";
    private String spin = "крутить кручу крут крутил spin span spun 2 1 покручен";
    private String spit = "плевать плюю плю плевал spit spat spat 1 1 оплеван";
    private String split = "раскалывать раскалываю раскалыва раскалывал split split split 1 1 расколот";
    private String spoil = "портить порчу порт портил spoil spoilt spoilt 2 1 испорчен";
    private String spread = "распространять распространяю распространя распространил spread spread spread 1 1 распространен";
    private String spring = "прыгать прыгаю прыга прыгал spring sprang sprung 1 1 подброшен(прыгать)"; //don't like that
    private String stand = "стоять стою сто стоял stand stood stood 2 1 (страдательный)стоять";//
    private String steal = "красть краду крад крал steal stole stolen 1 1 украден";
    private String stick = "приклеивать приклеиваю приклеива приклеил stick stuck stuck 1 1 приклеен";
    private String sting = "жалить жалю жал жалил sting stung stung 2 1 ужален";
    private String strike = "ударять ударяю ударя ударил strike struck struck 1 1 ударен";
    private String strive = "стремить стремлюсь стреми стремил strive strove striven 4 1 устремлен";
    private String swear = "клясться клянусь кляне клял swear swore sworn 4 1 заклят(клясться)";
    private String sweep = "мести мету мет мел sweep swept swept 3 1 подметен";
    private String swell = "опухать опухаю опуха опух swell swelled swollen 1 1 опух(";//!
    private String swim = "плавать плаваю плава плавал swim swam swum 1 1 приплыл(плавать)";//it's holy shit
    private String swing = "качаться качаюсь качае качал swing swung swung 4 1 раскачен";

    //t
    private String take = "брать беру бер брал take took taken 3 1 взят";
    private String tear = "рвать рву рв рвал tear tore torn 3 1 порван";
    private String teach = "учить учу уч учил teach taught taught 2 1 обучен";
    private String tell = "рассказывать рассказываю рассказыва рассказывал tell told told 1 1 рассказан";
    private String think = "думать думаю дума думал think thought thought 1 1 обдуман(";//
    private String aThrow = "бросать бросаю броса бросал throw threw thrown 1 1 брошен";
    private String tread = "ступать ступаю ступа ступал tread trod trodden 1 1 наступлен(ступать)";//убейте меня не больно, этот страдательный залог

    //u
    private String understand = "понимать понимаю понима понял understand understood understood 1 1 понят";
    //w
    private String wake = "будить бужу буд будил wake woke woken 2 1 разбужен";
    private String wear = "носить  ношу нос носил wear wore worn 2 1 поношен";
    private String weep = "плакать плачу плач плакал weep wept wept 1 1 оплакан(";//!
    private String win = "побеждать побеждаю побежда победил win won won 1 1 побежден";
    private String wind = "виться вьюсь вье вился wind wound wound 4 1 обвит";
    private String write = "писать пишу пиш писал write wrote written 1 1 написан";
    //
    //
    //

    //загоняет все переменные в массив, для удобства взятия рандомной строки. 137 глаголов ~_~
    private String[] words = {arise,  spoil, stand, stick, sting, sweep, swing, teach, tell, understand, wake, win, wind,
            bear, aBear, become, bind, bite, begin, blow, aBreak, bring, burst, cast, aCatch,
            choose, come, creep, cost, aDo, draw, dream, drink, drive, fall, feel, find, fight, fly, forbit, forget,
            forgive, freeze, get, give, go, grow, hear, hide, hit, hurt, know, lean, let, lie, make, meet, put, read,
            lay, lead, leap, learn, leave, lend, light, lose, mean, pay, run, sell, send, shine, sit, sleep, slide,
            smell, speed, spend, spill,
            ride, ring, rise, say, saw, see, seek, set, shake, shed, shoot, show, shrink, shut, sing, sink, sow,
            awake, beat, bend, bleed, breed, broadcast, build, burn, buy, cling, deal, dig, dwell, feed, flee,
            fling, grind, hang, hold, keep,
            speak, spit, spin, split, spread, spring, steal, strike, strive, swear, swell, swim, take, tear, think,
            aThrow, tread, wear, weep, write};

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

    //for number of string ~_~
    public static void main(String[] args){
        IrVerbWords v = new IrVerbWords();
        int i = 0;
        for(String e : v.words){
            System.out.println(i++ + " :" + e);
        }
    }
}