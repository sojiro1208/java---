ブロック：複数の文をひとまとまりとして扱うためのもの
  ルール１：波カッコの省略
    通常{}で囲まれた部分をいうが、一文のみであれば省略できる。
    [例]
    public class Main{
      public static void main(string[] args) {
        boolean tenki = true;
        if (tenki == true) {  「ifの内容が２行なので、省略不可」
          System.out.println("洗濯します");
          System.out.println("散歩します");
        } else                「elseの内容が１行なので、省略可」
          System.out.println("DVDを見る");
      }
    }

    ※実際の開発現場では、ミス防止のため推奨されていない

  ルール２：ブロック内で宣言した変数の寿命
    ブロック内で宣言した変数はブロック終了後に消滅し、ブロック外での変数の使用はできない。
    スコープ： 変数が使用できる範囲

    [例]
    int a;    「変数aのスコープ(上から下まで）」
    while (条件式) {
      int b;  「変数bのスコープ」
    }