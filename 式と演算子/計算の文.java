public class Main{
  public static void main (String[] age) {
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);
  }
}

式の構成要素：全ての式はこの2つで成り立つ。
  オペラント：「a」「b」「５」など
    リテラル：ソースコードに記述されている具体的な値。データ型を持っている。
    整数： 
    byte     小さな整数
    short    小さな整数
    int      普通の整数
    long     大きな整数
    基本的には「int」で問題なし。

    小数：  
    float    少し曖昧でも良い小数
    double   普通の整数

    真偽値：boolean  true or false
    文字：  char     １つの文字
      全角半角問わず１文字代入できる('●')
    文字列：String   文字の並び
      文字列を代入("●")

  演算子：「＋」「ー」など