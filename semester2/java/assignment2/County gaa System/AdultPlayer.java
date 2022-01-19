
/**
 * Write a description of class AdultPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdultPlayer extends Member
{
    private String phone;
    private String email;
    
    public AdultPlayer(String name,String address, String gender, String phone,String email){
        super(name,address,gender);
        this.phone = phone;
        this.email = email;
    }
    
    public String getphone(){
        return phone;
    }
    public String getemail(){
        return email;
    }
    
    public void setphone(String phone){
        this.phone = phone;
    }
     public double calcMembership(){
        return 100.00;
    }
     public void setemail(String email){
        this.email = email;
    }
    public String toString(){
        return "Adult player details: "+ "\n"+"name: "+getname()+ "\n"+"address: "+getaddress()+ "\n"+"gender: "+getgender()+ "\n"+" phone number: "+phone+ "\n"+" email: "+ email+"\n "+ "membership " + calcMembership()+"\n"+" -------------------------";
        
    }
   
}
