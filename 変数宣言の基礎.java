public class Main {
  public static void main(String[] args) {
    int age;
    age = 15;
    System.out.println(age);
  }
}

型：変数に入れることができるデータの種類の事  int...「整数」
  変数の名前
    識別子...名前として使える文字や数字の並びのこと
      通常はアルファベット、数字、＿、ドル記号、などを使用。ひらがな漢字も可能だが非推奨。
    ■ 禁止されている言葉は使えない：予約語。
    ■ すでに使用している変数名の再使用
    ■ 大文字、小文字、全角、半角の違いは区別される
    ■ 小文字で始まるわかりやすい名前をつけることが望ましい。
      ２つ以上の単語は繋げて、2つ目の単語の先頭を大文字。「myAge」
  データ型：扱うことのできるデータの種類
    整数：  byte     小さな整数
           short    小さな整数
           int      普通の整数
           long     大きな整数
    小数：  float    少し曖昧でも良い小数
           double   普通の整数
    真偽値：boolean  true or false
    文字：  char     １つの文字
    文字列：String   文字の並び
