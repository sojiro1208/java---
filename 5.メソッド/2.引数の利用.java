[引数とは]
呼び出し元から渡す値のこと

[1つの引数を渡す例]
public class Main {
  public static void main(String[]args) {
    System.out.println("メソッドを呼び出します");
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello(String name){
    System.out.println(name + "さん、こんにちは");
  }
}

[結果]
メソッドを呼び出しています
湊さん、こんにちは
朝香さん、こんにちは
菅原さん、こんにちは
メソッドの呼び出しが終わりました



[複数の引数を渡す]

[例]
public class Main{
  public static void main(String[] args) {
    add(100, 20);
    add(200, 50);
  }
  //複数の値を受け取るaddメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}

[解説]
引数が複数ある場合、値をカンマで区切って使用する
このとき、引数を受け取る順番を気をつける！

  [例]
  methodA(100, "abc");

  public static void methodA(String x , int y)
  ※これでは受け取れない。

[引数の渡し方]
  ・何も渡さない場合：メソッド名()
  ・値を一つ渡す場合：メソッド名(値)
  ・値を複数渡す場合：メソッド名(値、値)



[仮引数と実引数]
  仮引数：受け取る値
  実引数：渡す値



[変数のスコープとローカル変数]
  ややこしいから、引数なんて使わなくて良くね？

  [例]
  public class Main{
    public static void main(String[] args) {
      int x = 100;・・・・・「addメソッドで使用するつもり」
      int y = 10;・・・・・・「addメソッドで使用するつもり」
      add();・・・・・・・・・「addメソッドを呼び出す」
    }
    public static void add() {
      int ans = x + y;・・・「ここで使用するつもり(エラーです)」
      System.out.println(x + "+" + y + "=" + ans);
    }
  }

  [解説]
  変数のスコープと同じ使用可能範囲が存在する
  mainメソッド内で宣言した変数x,yはmain変数のブロックの中でしか使用できない

  [ローカル変数]
  main()や、add()といったメソッド内で宣言した変数
  その変数が属するメソッド内だけで有効な存在であり、
  別のメソッドに属する同名のローカル変数とは別物
  「mainメソッドの変数y」と「addメソッドの変数y」は別物です。

  [ローカル変数の独立性]
    異なるメソッドに属するローカル変数は、お互いに独立して無関係である。
    