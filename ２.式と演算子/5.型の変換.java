３種類の型変換
  1.代入時の自動型変換
    ある型で宣言された変数にはその型の値しか代入できない
    (int...int型の整数、String...String型の文字列など)
    小さな型の値を大きな型の変数に代入する場合に限って、値が自動的に箱の型に変換される。

    [例]
    public class main {
      public static void main (String[] args) {
        float f = 3;   (float型の変数にint型を代入)
        double d = f;  (double型の変数にfloat型を代入)
        System.out.println(f);
        System.out.println(d);
      }
    }
    [結果]
    3.0
    3.0

    [解説]
    リテラルの３(int型)は3.0F(float型)に自動的に変換されて変数fに代入されている。
    同様に、float型の変数fがdouble型に変換されてから変数dに代入されている。
    このように、代入しようとする値の型より、代入先の型が意味的（キャパ）に大きい場合、自動的に型が変換される。

    [キャパについて]
    double型(浮動小数点型) > float型(浮動小数点型) > long型(整数型) > int型(整数型) > short型(整数型) > byte型(整数型)

    ※大きな型の値を小さな型の変数に入れることはできません泣
    [例]
    public class Main {
      public static void main (String[] args) {
        int i = 3.2;   (小数点以下はどうなるの？)
      }
    }
    値の型：double > 変数の型：int
    なので「エラーが起きます」

    ※byte、short の変数に数値リテラルを代入できないと困るため、
    「byte b = 3;」のように、byte型やshort型の変数に対して、
    実害がない範囲でint型リテラルに代入することだけは例外として認められている。

    ※char型は文字を扱うが、算術演算、型変換も可能。
    しかし、数値としてcharを利用することはほとんどない。


  2.強制的な型変換
  指示をすれば１を強制的に行うことができる。
  public class Main{
    public static void main (string[] args) {
      int age = (int)3.2;  [3.2 をintに型変換して代入せよ！と言う指示]
      System.out.println(age);
    }
  }
  [結果]
  3

  [解説]
  3.2 というdouble型リテラルの前に記述された[int]が
  強制的な型変換を支持する「キャスト演算子」
  
  キャスト演算子は、元のデータを失ってでも強制的に変換しようとする。
  故に、入りきらないデータは削除されるので、情報の欠損が発生する。

  「余程の理由がない限り、使用は控える」


  3.演算時の自動型変換
  代入だけでなく、算術演算子などにより計算が行われる場合も、左右のオペランドは同一の型が原則。
  int型同士なら結果もint型、double同士ならdouble型になる。

  異なる型同士の計算は、「意味合い的に大きな型に統一されてから演算」が行われる。
  [例]
  public class Main{
    public static void main(string[] args ) {
      double d = 8.5 / 2;   「2(int型)を2.0(double型)に変換」
      long l = 5 + 2L;      「5(int型)を5L(long型)に変換」
      System.out.println(d);
      System.out.println(l);
    }
  }

  [結果]
  4.25
  7

  [例2]
  public class Main {
    public static void main(string[] args) {
      String msg = "私の年齢は" + 23;   「23(int型)が"23"(string型)に変換され、連結する」
      System.out.println(msg);
    }
  }

  [結果]
  私の年齢は23