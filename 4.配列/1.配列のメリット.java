[例]
public class Main{
  public static void main(String[] args) {
    int sansu = 20;
    int kokugo = 30;
    int rika = 40;
    int eigo = 50;
    int syakai = 80;


    int sum = sansu + kokugo + rika + syakai + eigo;


    int avg = sum / 5;
    System.out.println("合計店:" + sum);
    System.out.println("平均点" + avg);
  }
}


[このコードの不便な2点]
  ・テストの科目が増えるたびに追加すること
  ・まとめて処理ができない：点数が良い順に並べるなどの処理がまとめてできない。

[配列]
  同種類の複数データを並び順で格納するデータ構造。
  配列の各要素には同一種類のデータしか格納できない
  
[要素]
  複数のデータの一つのこと
