
/**
 * Write a description of class Coach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coach extends Member
{
    private String dateOfGardaClearance;
    
    public Coach(String name,String address, String gender, String dateOfGardaClearance){
        super(name,address,gender);
        this.dateOfGardaClearance = dateOfGardaClearance;
    }
    
    public String getdateOfGardaClearance(){
        return dateOfGardaClearance;
    }
    public double calcMembership(){
        return 50.00;
        
    }
    public void setdateOfGardaClearance(String dateOfGardaClearance){
        this.dateOfGardaClearance = dateOfGardaClearance;
    }
    public String toString(){
        return  "Coach details: "+ "\n"+"name: "+getname()+ "\n"+"address: "+getaddress()+ "\n"+"gender: "+getgender()+ "\n"+"data Of Garda Clearance: "+dateOfGardaClearance +"\n "+ "membership " + calcMembership()+"\n"+" -------------------------";
        
    }
    
    
}
