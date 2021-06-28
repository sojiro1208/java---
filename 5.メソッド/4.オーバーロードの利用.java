[類似する複数のメソッドを定義する]
  似たような処理だからメソッドに同じ名前をつけてはいけない。
  エラーになる。

  [オーバーロード/多重定義]
  例外的に同じ名前のメソッドを定義する

  [例]
  public class Main {
    //1爪のaddメソッド
    public static int add(int x, int y){
      return x + y;
    }
    //2つ目のメソッド
    public static int add(double x, double y){
      return x + y;
    }
    //3つ目のメソッド
    public static int add(String x, String y){
      return x + y;
    }
    public static void main(String[]args) {
      System.out.println(add(10, 20));
      System.out.println(add(3.5, 2.7));
      System.out.println(add("Hello", "World"));
    }
  }

  [結果]
  30
  6.2
  HelloWorld

  [解説]
  仮引数が異なれば、同じ名前のメソッドを複数定義することが許される


  [例２]個数が異なる場合もオーバーロード可能です
  public class Main{
    public static int add(int x, int y) {
      return x + y;
    }
    public static int add(int x, int y, int z) {
      return x + y + z;
    }
    public static void main(String[]args) {
      System.out.println("10+20=" + add(10,20));
      System.out.println("10+20+30=" + add(10, 20, 30));
    }
  }

  [結果]
  10+20=30
  10+20+30=60

  [オーバーロード]
  仮引数の個数/型が異なれば、同じ名前のメソッドを複数定義できる。
  引数は同じで、戻り値の型だけが異なる場合は定義できない

  ★メソッドのシグネチャ★
  public static int add(int x, int y){
  add(int x, int y)の部分を「シグネチャ」と呼ぶ