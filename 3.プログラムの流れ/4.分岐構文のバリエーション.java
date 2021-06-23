3種類のif構文
  if-else構文  →(falseの時、さらに別の条件で分岐したい場合)  if-else if-else構文
      ↓(falseの時何もしない場合)
  ifのみの構文

  [if-else基本構文]
  if (age >= 20) {
    canDrink = true;
  } else {
    canDrink = false;
  }

  [ifのみの構文]
  if (age >= 20 ) {
    canDrink = true;
  }

  [if-else if-else構文]
  if (height >= 170 ){
    size = "L";
  } else if {
    size = "M";
  } else if {
    size = "S";
  } else {
    size = "?";
  }
  
  1つのifで3つの分岐が作れる
  ルール１：ifブロックより後ろ && elseブロックより前に記述する
  ルール２：最後のelseは中身が空であれば、elseごと省略可能

  
  switch文による分岐
  [例]
  public class Main{
    public static void main(string[] args) {
      System.out.println("あなたの運勢を占います");
      int fortune = new java.util.Random().nextInt(4) + 1;
      if (fortune == 1) {
        System.out.println("大吉");
      } else if (fortune == 2) {
        System.out.println("中吉");
      } else if (fortune == 3) {
        System.out.println("吉");
      } else {
        System.out.println("凶");
      }
    }
  }

  [switch文で書き換える。。。]
  public class Main {
    public static void main(string() args) {
      System.out.println("あなたの運勢を占います");
      int fortune = new java.util.Random().nextInt(4) + 1;
      switch(fortune) {
        case 1:
          System.out.println("大吉");
          break;
        case 2:
          System.out.println("中吉");
          break;
        case 3:
          System.out.println("吉");
          break;
        default:
          System.out.println("凶");
      }
    }
  }

  [switch文に書き換える条件]
  1.全ての条件式が左辺と右辺が一致するかを比較する式であり、「<」「>」「!=」などが使われていない。
  2.比較する値が整数(byte,short,int 型)、文字列(string 型)、文字(char 型)であり、小数や真偽値ではない。

  [注意点]
  ・switch文の直後は変数名(今回で言うfortune)
  ・caseの横には値を置き、その後ろには「:」を置く。;と間違えるなよ
  ・default:は、条件に合わない時の処理が不要な場合は省略可能。


  
