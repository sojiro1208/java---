public class Main {
  public static void main(String[]args){
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] name = new String[3];
  }
}


public class Main{
  public static void main(String[]args) {
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.lenght; i++) {
      System.out.println(moneyList[i]);
    }
    for (int m : moneyList) {
      System.out.println(m)
    }
  }
}


public class Main{
  public static void main(String[] args) {
    //配列の準備
    int[] numbers = {3,4,9};

    //メッセージの表示
    System.out.println("１桁の数字を入力してください");

    //配列を回しながら判定
    for(int n : numbers) {
      if (n == input) {
        System.out.println("あたり！");
      }
    }
  }
}