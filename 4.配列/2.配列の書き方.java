[配列の作成]
1.配列変数の宣言
  [例]：int型の配列変数の宣言の場合
  int[] scores;

  要素の型[] 配列変数名



2.要素の作成と代入
  [例]：int型の要素を5個作り、配列変数scoresに代入する場合
  scores = new int[5];

  ※ new はnew演算子と呼ばれ、指定された型の要素を[]の中で指定された数だけ作る

  [例1]：実際に書いてみます。
  public class Main{
    public static void main(String[] args) {
      int[] scores;
      scores = new int[5];
    }
  }

  [例2]：1と2を同時に行うコード
  public class Main{
    public static void main(String[] args) {
      int[] scores = new int[5];
    }
  }

  [例３]：配列の長さを調べる
  public class Main{
    public static void main(String[] args) {
      int [] scores = new int[5];
      int num = scores.length;
      System.out.println("要素の数：" + num);
    }
  }
  [配列の要素数の取得]：配列変数名.length



  [配列の利用方法]
  [例]
  public class Main{
    public static void main(String[] args) {
      int[] scores;
      scores = new int[5];
      scores[1] = 30;・・・要素の２番目に３０を代入している。
      System.out.println(scores[1]);
    }
  }


  [配列の初期化]
  変数の値を取り出す前に、必ず値を代入して初期化しないといけない。
  初期化していない変数を利用するとエラーが起こる

  [例]
  public class Main{
    public static void main(String[]args) {
      int X;
      System.out.println(x);・・・初期化されていないからエラーです。
    }
  }

  [例２]：配列の場合は自動で初期化される。
  public class Main{
    public static void main(String[] args) {
      int[] scores = new int[5];
      System.out.println(scores[0]);・・・0が出力される。
    }
  }



  [省略記法]
  1.要素の数[] 配列変数名 = new 要素の型[] {値1, 値2, 値3,...};
  2.要素の型[] 配列変数名 = {値1, 値2, 値3,...};

  [例]
  int [] scores1 = new int[] {20, 30, 40,...};
  int [] scores2 = {20, 30, 40,...};