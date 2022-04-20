public class FindTheSlope {
  public static String slope(int[] points) {
      return (points[0] == points[2]) ? "undefined" : "" + (points[1]-points[3])/(points[0]-points[2]);
  }
  
  public static void main(String[] args) {
          System.out.println(slope(new int[]{-10,6,-10,3}));
      }   
}
