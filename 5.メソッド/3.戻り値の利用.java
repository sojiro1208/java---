[戻り値とは]
  呼び出されたメソッドから、呼び出したメソッドへ返した値のこと

  [値の戻し方]
    public static 戻り値の型 メソッド名(引数リスト) {
      メソッドが実行された時に動く処理
      return 戻り値;
  }

  [解説]
  return：returnの後ろに書かれた値を呼び出し元に戻す
    「return 変数名;」や「return "hello"」も可能です。
  
  戻り値の型：戻り値に合わせて記述する[int][String]
    void：何もない場合に書く

[戻り値を受け取る]
  型 変数名 = メソッド名(引数リスト);


  [例]
  public class Main {
    public static int add(int x, int y) {
      int ans = x + y;
      return ans;
    }
    public static void main(String[] args);
    int ans = add(100, 10);
    System.out.println("100 + 10 =" + ans);
  }

  [よくある間違い]
  ・add(100,10) = int ans;
  ・add(100, 10);



[戻り値をそのまま使う]
  [例]
  public class Main{
    public static int add(int x, int y) {}
  }