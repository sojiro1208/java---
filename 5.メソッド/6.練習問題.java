public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "Minato";
    int age = 22;
    double height = 169.9;
    char zodiac = "辰";
    System.out.println("私の名前は" + name + "です");
    System.out.println("歳は" + age + "です");
    System.out.prontln("身長は" + height + "です");
    System.out.println("干支は" + zodiac + "です");
  }
}


public class Main{
  public static void main(String[]args) {
    String title = "お誘い";
    String address = "uso800@xxx.com";
    String text = "今度飲みに行きませんか？";
    email(title, address, text);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}



public class Main{
  public static void main(String[]args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + triangleArea + "平方cm");

    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積" + circleArea + "平方cm");
  }
  public static double calcTriangleArea(double bottom, double height){
    double area = (bottom * height) / 2;
    return area;
  }
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}