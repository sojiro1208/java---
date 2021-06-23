制御構文：文を実行させる順番のこと
  順次：単純に次の文を実行する
  分岐：条件によって違う文を実行する。
  繰り返し：条件が満たされるまで、同じ文を繰り返す。

  構造家定理：順次、分岐、繰り返しを組み合わせれば、複雑なプログラムも作れる。

  [分岐について]

  [例]
  public class Main {
    public static void main(string[] args) {
      boolean tenki = true;
      if (tenki == true) {
        System.out.println("洗濯をします");
        System.out.println("散歩をします");
      } else {
        System.out.println("DVDを見ます");
      }
    }
  }

  [結果]
  trueの場合：洗濯します/散歩します
  falseの場合：DVDを見ます



  [繰り返しについて]
  public class Main {
    public static void main(string[] args) {
      boolean doorClose == false;
      while (doorClose == true) {   「ドアが閉まっている場合」
        System.out.println("ノックする");
        System.out,println("1分待つ");
      }
    }
  }

  [結果]
  trueの場合：ノックをする/1分待つ/ノックをする/1分待つの繰り返し。
  falseの場合：何も表示されない

  [whileと言う命令は繰り返し処理を行う]



  [制御構文の構成要素]
  条件式：分岐条件や繰り返しを続ける条件を示した式
  ブロック：分岐や繰り返しで実行する一連の文の集まり

  