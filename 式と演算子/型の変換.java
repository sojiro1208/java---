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
  3.演算時の自動型変換