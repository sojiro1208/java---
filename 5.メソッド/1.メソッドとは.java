メソッドとは：複数の文をまとめ、それを1つの処理として名前をつけたもの。
  [メソッドのメリット]
  ・プログラムの見通しが良くなり、全体を把握しやすい
  ・機能単位に記述するので、修正範囲を限定できる
  ・同じ処理を1つのメソッドに記述することで、作業効率が上がる


[メソッドの定義]
  「メソッドを作成」+「作成したメソッドを使用する」


[メソッドの作成]
  [メソッドの定義]
    public static 戻り値の型 メソッド名(引数リスト) {
      メソッドが呼び出された時の具体的な処理
    }

  [例]
  public class Main {
    public static void hello() {・・・・・・「helloメソッドの定義」
      System.out.println("こんにちわん");
    }
  }

[メソッドの呼び出し]
  メソッド名(引数リスト)

  [例]
  public class Main{
    public static void main (String[] args) {
      System.out.println("メソッドを呼び出します");
      hello();
      System.out.println("メソッドの呼び出しが終わりました");
    }
    public static void hello() {
      System.out.println("こんにちわん");
    }
  }

  [結果]
  メソッドを呼び出します
  こんにちわん
  メソッドの呼び出しが終わりました


[mainメソッドの以外からのメソッドの呼び出し]
  [例]
  public class Main{
    public static void methodA() {
      System.out.println("methodA");
      methodB();・・・・・・・・・・・・・・・・・・・「メソッドBの呼び出し」
    }
    public static void methodB() {
      System.out.println("methodB");
    }
    public static void main(String[] args) {
      methodA();・・・・・・・・・・・・・・・・・・・「メソッドAの呼び出し」
    }
  }

  [解説]
  main() → methodA() → methodB()の順番
  メソッドの順番は関係なく、[main]が初めに読まれる


[メソッドにまつわる2つの立場]
  メソッドを定義する立場と、そのメソッドを呼び出す立場を分けて考える

  「helloメソッドを定義する自分」と「mainメソッドの中でhelloメソッドを呼び出す自分」という感じ


  [例]
  public class Main{
    public static vois main(String[] args) {
      hello();・・・・「挨拶系のメソッドと推測可能」
      saveToFile();・「ファイルに保存するメソッドと推測可能」
      aaa();・・・・・・「推測不可能」
    }
  }
  

  [補足]
  メソッドの構成は、シンプルでも複雑でも、必ず2つの部分から構成されている
  public static void hello() {・・・・・1.重要事項の表明
    System.out.println("こんにちは");・・2.処理内容
  }

  [メソッド定義の１行目は人と人との接点]
  メソッド定義の１行は定義する人と呼び出す人の接点になる重要な情報である。
  故に「わかりやすい名で定義しましょう」