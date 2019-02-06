package edu.cnm.deepdive;

public abstract class Canis {
  

    
  
  

  public static final int NUMBER_OF_LEGS = 4;
  
  protected final int[] data ;
  
  public Canis() {
    
    System.out.println("Canis::new");
    
    data = new int[] {1,2,3};
  }
  public abstract void vocalize( );
  
  public abstract void hunt();

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "I am a " + this.getClass().getSimpleName();
  }
  
  
  

public static void about() {
  
  System.out.println("Canis is genus of canidae");
  
}
}