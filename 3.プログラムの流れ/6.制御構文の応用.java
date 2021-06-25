[制御構文のネスト]
  ネスト...分岐の中に分岐、繰り返しの中に分岐などの「多重構造」 入れ子とも言う

  [例]
  public class Main{
    public static void main(string[] args) {
      for (int i = 1; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          System.out.println(i * j);//掛け算の結果を出力
          System.out.println(" ");  //空白を出力
        }
        System.out.println("");     //改行を出力
      }
    }
  }

  [結果]
  1 2 3 4 5 6 7 8 9 10
  2 4 6 8 10 12 14 16 18 20 
  ...

  [解説]
  iが１ ✖︎ jが１〜９までの計算を行う
  iが２ ✖︎ jが１〜９までの計算を行う
  ...



  [繰り返しの中断]
    break文：breakを囲んでいる最も内側の繰り返しブロックが即座に中断される。while,for 文などで使用される
    [例]
    for (int i = 1; i < 10; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }
    ３周目で繰り返しが終了する

    continue文：今の周回を中断して、同じ繰り返しの次の集会に進む場合に利用する
    [例]
    for (int i = 1; i < 10; i++) {
      if (i == 3) {
      continue;
      }
      System.out.println(i);
    }
    ３周目のみ中断し、４周目から通常通り繰り返し処理をする



  [無限ループ]
  強制停止されない限り、永久に繰り返しを続ける制御構造

    [作成方法]
    1.while (true) {...処理内容...}
    2.for (;;) {...処理内容...} 

