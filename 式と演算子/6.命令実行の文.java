命令実行の文は、javaが用意している命令を呼び出すための文章。
[呼び出す命令の名前(引数);]

  [例]
  public class Main{
    public static void main (String[] args) {
      String name = "すがわら";
      String message;
      message = name + "さん、こんにちは"；
      System.out.println(message);
    }
  }

  [結果]
  すがわらさん、こんにちは



  [改行せずに画面に文字を入力する]
    System.out.print(画面に表示したい値や式)

  [例]
  public class Main {
    public static void main (String[] args) {
      String name = "すがわら";
      System.out.print("私の名前は");
      System.out.print(name);
      System.out.print("です");
    }
  }

  [結果]
  私の名前はすがわらです

  [解説]
  System.out.printlnとよく似ている命令文。
  表示後に改行しないのが特徴。
  連続して呼び出すと、表示内容が連続して表示される。



  [大きい方の数値を代入する命令]
    int m = math.max(①, ②);
  
  [例]
  public class Main {
    public static void main (string[] args) {
      int a = 5;
      int b = 3;
      int m Math.max(a,b);
      System.out.println("比較実験:" + 
        a + "と" + b + "とで大きい方は" + m );
    }
  }
  
  [結果]
  比較実験：5と３で大きい方は５

  [解説]
  Math.max()は2つの引数を指定して呼び出す命令。
  引数の2つの値の大きい方を変数mに代入する。
  変数名はなんでもよい。



  [文字列の数値の変換する命令]
  int n = Integer.parseInt(①);

  [解説]
  stringに入っている"10"は文字列であり、演算が使えないので、
  文字列"10"を数値10に変換し、演算を行う際に使用する。

  [例]
  public class Main {
    public static void main (string[] args) {
      String age = "31";
      int n = Integer.parseInt(age);
      System.out.println
        ("あなたは来年," + (n + 1) + "際になりますね。");
    }
  }

  [結果]
  あなたは来年、32際になりますね。



  [乱数の生み出して代入する命令]
  int r = new java.util.Random().nextInt(①);

  [解説]
  ①に１以上の整数を入力することにより、0~その数値未満の整数をランダムで表示する。
  10を入力した場合、rには0~9が代入される。

  [例]
  public class Main {
    public static void main(string[] args) {
      int r = new java.util.Random().nextInt(90);
      System.out.println("あなたは多分、" + r + "歳ですよね？");
    }
  }

  [結果]
  あなたは多分,31(0~89のランダムな値)歳ですよね？



  [キーボードから1行の入力を受け取る命令]
    [キーボードから１行の文字列の入力を受け付ける]
    String s = new java.util.Scanner(System.in).nextLine();

    [キーボードから1つの整数の入力を受け付ける]
    int input = new java.util.Scanner(System.in).nextInt();

  [解説]
  これらの文を実行すると、プログラムは一時停止し、キーボードから文字を入力が可能。
  入力し、エンターを押すと、その内容が変数inputに代入される。
  nextLine()は文字列、nextInt()は数値の入力を受け取るために使用される。

  [例]
  public class Main {
    public static void main(string[] args) {
      System.out.println("あなたの名前を入力してください");
      Sting name = new java.util.Scanner(System.in).nextLine();
      System.out.println("あなたの年齢を入力してください");
      int age = new java.util.Scanner(System.in).nextInt();
      System.out.println
        ("ようこそ," + age + "歳の" + name + "さん");
    }
  }

  [結果]
  あなたの名前を入力してください
  すがわら
  あなたの年齢を入力してください
  31
  ようこそ、31歳のすがわらさん。

練習問題
public class Main {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);  「文字列から数値に変換」
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました");
    System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + fortune + "です");
    System.out.println("1:大吉  2:中吉  3:小吉  4:凶");
  }
}