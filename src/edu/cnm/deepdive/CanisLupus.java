package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupus extends Canis {

  public CanisLupus() {
    
    System.out.println("CanisLupus::new");
    System.out.println(Arrays.toString);
  }
  @Override
  public void vocalize() {
   System.out.println("Howl !");

  }

  @Override
  public void hunt() {
    // TODO Auto-generated method stub
    System.out.println("Hunt prey in packs");

  }

  
  public static void about() {
    
    System.out.println("Canis Lupus is genus of canidae");
}
}