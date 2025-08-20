class divide{
 public static void main(String[] args) {
  int pens = 14 , students = 3;
  int penPerStudent = pens/students;
  int remainingPen = pens%students;
  System.out.println("The Pen Per Student is " +penPerStudent+ " and the remaining pen not distributed is " +remainingPen);
 }
}