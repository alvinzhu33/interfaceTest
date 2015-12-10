import java.util.ArrayList;
public class Driver{
    public static char letter(){
	return (char)('A'+(int)(Math.random()*26));
    }

    /*//UNCOMMENT THIS WHEN YOU DO Area
      public static Area makeRandomAreaShape(){
      String name = ""+letter()+"-2d";
      double value =Math.round(Math.random()*10.0);
      if(Math.random() < 0.5){
      return new Circle(value,name);
      }else{
      double value2 =Math.round(Math.random()*10.0);
      return new Rectangle(value,value2,name);
      }
      }
      /*

      /* //UNCOMMENT THIS WHEN YOU DO Volume
      public static Volume makeRandomVolumeShape(){
      String name = ""+letter()+"-3d";
      double value = Math.round(Math.random()*10.0);
      double choice = Math.random();
      if(choice < 0.33){
      return new Sphere(value,name);
      }else{
      double value2 = Math.round(Math.random()*10.0);
      if(choice < 0.66){
      return new Cylinder(value,value2,name);
      }else{
      double value3 = Math.round(Math.random()*10.0);
      return new Prism(value,value2,value3,name);
      }
      }
      }
    */

    public static void main(String[]args){
	Circle c1 = new Circle(5, "five");
	System.out.println(c1.getArea());

	Rectangle r1 = new Rectangle(10,5, "10 by 5");
	System.out.println(r1.getArea());

	Prism p1 = new Prism(13, 11, 5, "13x11x5");
	System.out.println(p1.getVolume());

	Cylinder cy1= new Cylinder(8,7,"8 by 7");
	System.out.println(cy1.getVolume());
	/*//UNCOMMENT THIS WHEN YOU DO AREA
	  Area[] twos = new Area[5];
	  for(int i = 0; i < twos.length; i++){
	  twos[i]=makeRandomAreaShape();
	  }
	  System.out.println("Area tests:");
	  for(Area a : twos){
	  System.out.println(a);
	  System.out.println(a.getArea());
	  }
	*/

	/*//UNCOMMENT THIS WHEN YOU DO VOLUME
	  Volume[] threes = new Volume[6];
	  for(int i = 0; i < threes.length; i++){
	  threes[i]=makeRandomVolumeShape();
	  }
	  System.out.println("\nVolume tests:");
	  for(Volume v : threes){
	  System.out.println(v);
	  System.out.println(v.getVolume());
	  }
	*/
    }
}