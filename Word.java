import java.util.Random;

public class Word {

    //List of possible words
    public static Random rand = new Random();

    private static String[] wordList = {"able", "about", "account", "across", "addition", "adjustment", "advertisement","after","again","against",
    "agreement","almost","among","amount","amusement","angle","angry","animal","answer","apparatus","apple","approval","argument","attack",
    "attempt","attention","attraction","authority","automatic","awake","balance","basin","basket","beautiful","because","before","behaviour",
    "belief","between","bitter","boiling","bottle","brain","brake","branch","brass","bread","breath","brick","bridge","bright","broken",
    "brother","brown","brush","bucket","building","business","butter","button","camera","canvas","carriage","cause","certain","chain","chalk",
    "chance","change","cheap","cheese","chemical","chest","chief","church","circle","clean","clear","clock","cloth","cloud","collar","colour",
    "comfort","committee","common","company","comparison","competition","complete","complex","condition","connection","conscious","control",
    "copper","cotton","cough","country","cover","crack","credit","crime","cruel","crush","current","curtain","curve","cushion","damage","danger",
    "daughter","death","decision","degree","delicate","dependent","design","desire","destruction","detail","development","different","digestion",
    "direction","dirty","discovery","discussion","disease","disgust","distance","distribution","division","drain","drawer","dress","drink",
    "driving","early","earth","education","effect","elastic","electric","engine","enough","equal","error","event","every","example","exchange",
    "existence","expansion","experience","expert","family","father","feather","feeble","feeling","female","fertile","fiction","field","fight",
    "finger","flight","floor","flower","foolish","forward","frequent","friend","future","garden","general","government","hammer","hanging","happy",
    "harbour","harmony","healthy","hearing","history","hollow","hospital","humour","important","impulse","increase","industry","insect",
    "instrument","insurance","interest","invention","island","jelly","jewel","journey","judge","kettle","knife","knowledge","language","laugh",
    "learning","leather","letter","library","liquid","little","living","machine","manager","market","married","match","material","measure",
    "medical","meeting","memory","metal","middle","military","minute","mixed","money","monkey","month","morning","mother","motion","mountain",
    "mouth","muscle","music","narrow","nation","natural","necessary","needle","nerve","night","noise","normal","north","number","observation",
    "offer","office","operation","opinion","opposite","orange","order","organization","ornament","other","paint","paper","parallel","parcel",
    "paste","payment","peace","pencil","person","physical","picture","please","pleasure","plough","pocket","point","poison","polish","political",
    "porter","position","possible","potato","powder","power","present","prison","probable","process","produce","profit","property","prose",
    "protest","punishment","purpose","quality","question","quick","quiet","quite","reaction","reading","ready","reason","receipt","record",
    "regret","regular","relation","religion","representative","request","respect","responsible","reward","rhythm","rough","round","scale",
    "school","science","scissors","second","secret","secretary","selection","separate","serious","servant","shade","shake","shame","sharp","shelf",
    "silver","simple","sister","small","smash","smile","smoke","smooth","snake","sneeze","society","sound","south","space","spade","special",
    "sponge","spoon","spring","square","stage","stamp","start","statement","station","steam","steel","stick","sticky","stiff","still","stitch",
    "stocking","stomach","store","story","straight","strange","street","stretch","strong","structure","substance","sudden","sugar","suggestion",
    "summer","support","surprise","sweet","system","table","teaching","tendency","theory","there","thick","thing","thought","thread","throat",
    "through","thorough","thumb","thunder","ticket","tight","together","tomorrow","tongue","touch","trade","train","transport","trick","trouble",
    "trousers","twist","umbrella","under","value","vessel","violent","voice", "waiting", "weather", "weight", "whistle", "window", "winter", 
    "woman", "wound", "writing", "wrong", "yellow", "yesterday"};

    public static String currentWord;

    public Word(){
        currentWord = getRandomWord();
        System.out.println(currentWord);
        System.out.println(isLetterInWord('e'));
        System.out.println(isRightWord("system"));
    }

    public static String getRandomWord(){
        String word = wordList[rand.nextInt(wordList.length)];
        return word;
    }

    public static boolean isLetterInWord(char letter){
        boolean answer = currentWord.contains("" + letter + "");
        return answer;
    }

    public static boolean isRightWord(String word){
        boolean answer = currentWord.equals(word);
        return answer;
    }
    

}