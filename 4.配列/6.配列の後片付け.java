[ガベージコレクション]
  [例]
  public class Main{
    public static void main(String[] args) {
      boolean judge = true;
      if(judge == true) {
        int[] array = {1, 2, 3};
      }
    }
  }

  [解説]
  変数の寿命はブロックまで。つまり、配列変数arrayは即死する。
  しかし、要素{1,2,3}は普通の変数ではないので、ブロックが終わっても生き残る。
  アドレスが即死したため、どの配列変数からも参照できなくなり、文字通りゴミになる。
  これが溜まるとメモリを圧迫するので、後片付けが必要。
  javaには[ガベージコレクション]と言う機能があり、自動的にゴミを探し、片付けてくれる。



[null]
  nullを使用することで、意図的に配列を参照されないようにする

  [例]
  public class Main{
    public static void main(String[] args) {
      int[] array = {1, 2, 3};
      array = null;
      array[0] = 10;
    }
  }

  [解説]
  nullを代入して、参照されないようにする。「参照を切る」

  [nullとは]
  1.int[]型などの参照型に代入すると、その変数は何も参照しなくなる
  2.int型などの基本形変数には代入することができない。



[NullPointerException]
先程の例はコンパイル自体はできるがエラーになる
