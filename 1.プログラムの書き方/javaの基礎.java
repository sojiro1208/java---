手順
1.ソースコードの作成
  ソースコード...人が読める状態のプログラム
  ソースファイル...ソースコードを書き込んだファイル

2.コンパイル...処理の名前
  クラスファイル...拡張子は.classを使用。
  バイトコード...ソースコードの各命令をPCが実行しやすいように変換する。

3.実行
  インタプリタ...バイトコードの変換と実行を行うソフト
  JYM...バイトコードを読み込み、処理を実行させる


例 public class Main(クラス名で初めは大文字) {
    public static void main(String[] args) {  //クラスブロック
      System.out.println("表示したい文字");  //メソッドブロック(ここから下)
    }
  }
ルール
  ・ソースファイル名は「クラス名.java」にすること
  ・クラス名はアルファベット大文字で始める
  ・文の最後には「；」をつけろよな。
  
意識すること
  ・外から内への意識
    ブロックを開けてすぐに閉じる→中身を書く

インテンド...文字下げのこと

おおよそ３種類の文章
  ・変数宣言の文章
  ・計算の文章
  ・命令実行の文章