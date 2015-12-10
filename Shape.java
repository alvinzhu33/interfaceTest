public abstract class Shape{

  private String name;

  public Shape(){
    name = "";
  }

  public Shape(String name){
     this.name = name;
  }

  public String getName(){
    return name;
  }

  public abstract String toString();
}