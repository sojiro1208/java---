[引数に配列を用いる]
  [例]
  public class Main{
    //int型配列を受け取り、全ての要素を表示するメソッド
    public static void printArray(int[]（引数に配列型を指定） array){
      for (int element : array) {
        System.out.println(element);
      }
    }
    public static void main(String[] args) {
      int[] array = {1, 2, 3};
      printArray(array);  //配列を渡す
    }
  }

[値渡しと参照渡し]
  「値渡し」：値そのものが渡される呼び出し
    上の例では、渡しているものは配列丸ごとではなく、「アドレス情報のみ」
    メソッドを呼び出す時、引数として通常の変数を指定した場合、
    メソッドに渡されるのは変数ではなく、変数に入っている値
    [例]：変数xに100を代入した際、変数x自体が渡されるのではなく、中にある100が渡される。

  [基本型の変数をメソッド呼び出しで渡すと...]
  ・呼び出し元の変数の内容が、呼び出し先の引数にコピーされる
  ・呼び出し先で引数の内容を書き換えても、呼び出し元の変数は変化しない

  [参照渡し]：引数としてアドレスを渡すこと
    呼び出した先で加えた変更が呼び出し元にも影響する

  [配列をメソッド呼び出しで渡すと...]
  ・呼び出し元の配列アドレスが呼び出し先の引数にコピーされる
  ・呼び出し先で配列の実態を書き換えると、呼び出し元にも影響する

  [例]同じ配列を参照していることを確認する
  public class Main{
    //int型配列を受け取り、配列内の要素全てに１を加えるメソッド
    public static void incArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
        array[i]++;
      }
    }
    public static void main(String[] args) {
      int[] array = {1, 2, 3};
      incArray(array);
      for(int i : array) {
        System.out.println(i);
      }
    }
  }



[戻り値に配列を用いる]
  [例]戻り値が配列の場合
  public class Main {
    public static int[] makeArray(int size) {
      int[] newArray = new int[size];
      for (int i = 0; i < newArray.length; i++){
        newArray[i] = i;
      }
      return newArray;
    }
    public static void main(String[] args) {
      int[] array = makeArray(3);
      for(int i = array) {
        System.out.println(i);
      }
    }
  }



[コマンドライン引数]
  mainメソッドは文字列配列を引数として受け取るように定義されている
  public  static void main(String[] args){
  ※通常のメソッドは仮引数に入ってくる値は「呼び出し元のメソッド」が指定した実引数。
  しかし、mainメソッドは違います。

  [コマンドライン引数]
  javaのプログラムを起動する際にさまざまな追加情報を指定して、起動することができ、その追加情報のこと。
    [例]java プログラム名 引数リスト
  プログラム起動時にコマンドライン引数がJVMによって配列に変換され、mainメソッド起動時に渡される