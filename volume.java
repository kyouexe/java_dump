class volume {
 public static void main(String[] args) {
  double pi = 3.14;
  double radius = 6378;
  double volume = 4*pi*radius*radius*radius/3;
  double volumeInMiles = volume*1.6*1.6*1.6;
  System.out.println("The volume of earth in cubic kilometers is " +volume+ " and cubic miles is " +volumeInMiles);
 }
}