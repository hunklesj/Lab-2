class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  
  int total;
  double blue;
  double brown;
  double green;
  double orange;
  double red;
  double yellow;
  
    total = 55 * 10;
    blue = total * .24;
    brown = total * .13;
    green = total * .16;
    orange = total * .2;
    red = total * .13;
    yellow = total * .14;
  
  
    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

  double sum;
    sum = blue + brown + green + orange + red + yellow;

  System.out.println("Sum: " + sum);
  
  if ( blue > brown & green > orange)
     System.out.println("Blue over Brown and Green over Orange");

  if ( brown <= red)
     System.out.println("Brown is less than or equal to Red");
  
if (sum == total)
    System.out.println("Numbers Match");

  }
}