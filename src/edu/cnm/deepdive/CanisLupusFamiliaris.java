package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {
  
public CanisLupusFamiliaris() {
    
    System.out.println("CanisLupusFamiliaris::new");
    
    data[2] = 5;
  }

  @Override
  public void vocalize() {
    System.out.println("Bark !");

  }

  @Override
  public void hunt() {
    // TODO Auto-generated method stub

  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString( )+ " I am as good boy";
    
  }

  
 public static void about() {
    
    System.out.println("Canis Lupus Familiaris is genus of canidae");
}
}
