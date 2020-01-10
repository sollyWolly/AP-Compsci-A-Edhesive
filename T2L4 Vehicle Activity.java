public class Vehicle{
  
  private int location;
  private String moonlight = "";
  
  public Vehicle(){
    location = 0;
  }
  public Vehicle(int loc){
    if(loc >= -20 && loc <= 20){
      location = loc;
    }
  }
  public void forward(){
    if(location < 20){
      location += 1;
    }
  }
  public void backward(){
    if(location > -20){
      location -= 1;
    }
  }
  public int getLocation(){
    return location;
  }
  public String toString(){
    for(int i = 0; i < location + 20; i++){
      moonlight += " ";
    }
    moonlight += "@";
    return moonlight;
  }
}
