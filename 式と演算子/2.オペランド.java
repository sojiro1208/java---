オペランド：変数や値と言うイメージ
  リテラル：ソースコードに記述されてる具合的な値「5」,「hello world」など
    それぞれのリテラルはデータ型を持っている
       リテラルの種類           表記例      型
  小数点がない数字                30      int
  小数点がない数字で末尾が「L」「l」 30L     long
  小数点付きの数字                30.5    double
  小数点付きの数字で末尾が「F」「f」 30.5F   float
  true または false              true    boolean
  引用符で囲まれた文字             ’火’     char
  二重引用符で囲まれた文字          "java"  String


エスケープシーケンス：¥記号とそれに続く１文字の合計２文字による記述で特殊な１文字を表現する
  ¥"  二重引用符記号（”）
  ¥'  引用符（’）
  ¥¥  円記号（¥）
  ¥n  改行（制御文字）
こんなん必要なくね？
        ↓
public class Main {
  public static void main (String[] args) {
    System.out.println("私の好きな記号は二重引用符(")です");
  }
}
これだとエラーが出るので・・・
        ↓
public class Main{
  public static void main(String[] args){
    System.out.println("私の好きな記号は二重引用符（¥"）です");
  }
}
これでかいけつゾロリ！！

ちなみに・・・
「¥200」と表示する場合は、「¥¥200」と記述




