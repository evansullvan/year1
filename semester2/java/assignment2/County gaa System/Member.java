
/**
 * Abstract class Member - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Member implements iGAAMember
{
    private String name;
    private String address;
    private String gender;
    
    
    public Member(String name,String address,String gender){
        this.name = name;
        this.address = address;
        this.gender = gender;
        
    }
    
    public String getname(){
        return name;
    }
    
    public String  getaddress(){
        return address;
    }
    
    public String getgender(){
        return gender;
    }
    
    public void setname(String name){
        this.name = name;
    }
     public void setaddress(String address){
        this.address = address;
    }
     public void setgender(String gender){
        this.gender = gender;
    }
    
    public String toString(){
        return "name;  " + name +"\n+" +"address: "+address+ "\n" + "gender: " + gender + "\n";
    }
    
  
}
