[多次元配列とは？]
  これまでの配列は「１次元配列」
  １次元配列に縦の並びが加わったものが「２次元配列」

  [２次元配列の宣言]
  要素の型[] [] 配列変数名 = new 要素の型[行数][列数];

  [２次元配列の要素の利用]
  配列変数名[行の添え字][列の添え字]

  [例]
  public class Main {
    public static void main(String[] args) {
      int[][] scores = new int [2][3];・・・・・「２行３列の配列」
      scores[0][0] = 40;
      scores[0][1] = 50;
      scores[0][2] = 60;
      scores[1][0] = 70;
      scores[1][1] = 80;
      scores[1][2] = 90;
      System.out.println(scores[1][1]);
    }
  }

  [例２]
  public class Main{
    public static void main(String[] args) {
      int[][] scores = {{40,50,60}, {80, 60,70}};・・・「初期化が可能」
      System.out.println(scores.length);・・・・・・・・・「scoresの要素は2つあるので、2が出力」
      System.out.println(scores[0].length);・・・・・・・「scores[0]の中にある要素は3つなので、３が出力」
    }
  }