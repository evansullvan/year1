
/**
 * Write a description of class YouthPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class YouthPlayer extends Member
{
   private String nextOfKinName;
    private String nextOfKinPhone;
    
    public YouthPlayer(String name,String address, String gender, String nextOfKinName,String nextOfKinPhone){
        super(name,address,gender);
        this.nextOfKinName = nextOfKinName;
        this.nextOfKinPhone = nextOfKinPhone;
        
    }
    
    public String getnextOfKinName(){
        return nextOfKinName;
    }
    public String getnextOfKinPhone(){
        return nextOfKinPhone;
    }
    
    public void setnextOfKinName(String nextOfKinName){
        this.nextOfKinName = nextOfKinName;
    }
    
     public void setnextOfKinPhone(String nextOfKinPhone){
        this.nextOfKinPhone = nextOfKinPhone;
    }
    public double calcMembership(){
        return 25.00;
    }
    public String toString(){
        return "Youth player details: "+ "\n"+"name: "+getname()+ "\n"+"address: "+getaddress()+ "\n"+"gender: "+getgender()+ "\n"+" next of  kin name: "+nextOfKinName+ "\n"+" next of kin phone number: "+ nextOfKinPhone+"\n "+ "membership " + calcMembership()+"\n"+" -------------------------";
        
    }
    
    
}
