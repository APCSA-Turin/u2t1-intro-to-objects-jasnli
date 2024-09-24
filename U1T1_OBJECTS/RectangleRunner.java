package U1T1_OBJECTS;

public class RectangleRunner {
   public static void main(String[] args) {

       // creating one instance/object from the Rectangle class
       Rectangle rect1 = new Rectangle(5, 6);
       rect1.printPerimeter();  // calling a method on the object

       // creating ANOTHER instance/object from the Rectangle class
       Rectangle rect2 = new Rectangle(10, 8);
       rect2.printPerimeter();  // calling a method on the object

       // ANOTHER one
       Rectangle rect3 = new Rectangle(7, 5);
       rect3.printPerimeter();
   }
}



