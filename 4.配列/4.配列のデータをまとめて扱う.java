[配列とfor文]
[例]
public class Main{
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 80};
    for (int i = 0; i < scores.length; i++){
      System.out.println(scores[i]);
    }
  }
}
こう言う書き方もできるんですね。



  [ループによる全要素の利用]
  上の例で紹介した、「配列の最初から最後までのぜ尿素を順にアクセスする」
  [例]
  for (int i = 0; i < 配列変数名.length; i++) {
    配列変数名[i]を使った処理
  }

  [ループによる集計]
    [例]
    public class Main{
      public static void main(String[] args) {
        int[] scores = {20, 30, 40, 50, 80};
        int sum = 0;・・・・・・・・・・・・・・・・・・・・[変数結果の入れるための初期化]
        for (int i = 0; i < scores.length; i++) {
          sum += scores[i];・・・・・・・・・・・・・・・・[１科目ずつ変数sumに合算する]
        }
        int avg = sum / scores.length;
        System.out.println("合計点：" + sum);
        System.out.println("平均点：" + avg);
      }
    }

    [例2]カウント集計
    public class Main{
      public static void main(String[]args) {
        int[] scores = {20, 30, 40, 50, 80};
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
          if (scores[i] >= 50) {
            count++;
          }
        }
        System.out.println("50点以上の科目の数は：" + count);
      }
    }

  

  [添字に対応した情報の利用]
    [例]：DNAの記号をランダムに表示する
    public class Main{
      public static void main(String[] args) {
        int[] seq = new int[10];

        //塩基配列をランダムに生成
        for (int i = 0; i < seq.length; i++) {
          seq[i] = new java.util.Random().nextInt(4);
        }

        //生成した塩基配列の記号を表示
        for (int i = 0; i < seq.length; i++) {
          switch(seq[i]) {
            case0:
              System.out.println("A ");
              break;
            case1:
              System.out.println("T ");
              break;
            case2:
              System.out.println("G ");
              break;
            case3:
              System.out.println("C ");
              break;
          }
        }
      }
    }

    これでもいいが、わかりにくいので、switch構文に配列を組み込む！
    char[] base = {'A', 'T', 'G', 'C'};
    System.out.println(base[seq[i]] + " ");

    [解説]
    base[seq[i]]：配列baseの[]の中にseq[i]が指定されているだけ。

    int baseType = seq[i];             //i番目の数値を取得
    char baseChar = base[baseType];    //数値に対応する記号を取得
    System.out.print(baseChar + " ");  //記号を画面に表示



    [拡張for文]：配列の要素を1つずつ取り出すループを簡単に書くためのfor文があります。
    「for (要素の型 任意の変数名 : 配列変数名) {...}」

    [従来のfor文]
    public class Main{
      public static void main(String[] args) {
        int[] scores = {20, 30, 40, 50, 80};
        for (int i = 0; i < scores.length; i ++) {
          System.out.println(scores[i]);
        }
      }
    }

    [拡張for文]
    public class Main{
      public static void main(String[]args) {
        int[] scores = {20, 30, 40, 50, 80};
        for(int value : scores) {
          System.out.println(value);
        }
      }
    }

    拡張for文では、ループ変数や配列の添え字が必要ない！