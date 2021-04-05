
/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club
{
    //variables
    private String clubName ;
    private String clubAddress ;
    private String clubChairPerson;
    private String clubSecretary;
    private String clubEmail;

    //constructors
    public Club(String clubName,String clubAddress,String clubChairPerson,String clubSecretary,String clubEmail){
        if(clubName.length() < 40){

            this.clubName = clubName;
        }else{
            this.clubName = clubName.substring(0,40);
        }

        if(clubAddress.length() < 60){
            this.clubAddress = clubAddress;

        }else{
            this.clubAddress = clubAddress.substring(0,60);

        }
        this.clubChairPerson = clubChairPerson;
        this.clubSecretary = clubSecretary;
        if(!(clubEmail.contains("@") && clubEmail.contains(".")))
        {
            this.clubEmail = "invalid email format";

        }else{
            this.clubEmail = clubEmail; 
        }

    }
    //methods
    //getters
    public String getclubName (){
        return clubName;
    }

    public String getclubAddress (){
        return clubAddress;
    }

    public String getclubChairPerson (){
        return clubChairPerson;
    }

    public String getclubSecretary (){
        return clubSecretary;
    }

    public String getclubEmail (){

        return clubEmail;
    }

    //setters
    public void setclubName (String clubName){
        this.clubName = clubName;
    }

    public void setclubAddress (String clubAddress){
        this.clubAddress =clubAddress ;
    }

    public void setclubChairPerson (String clubChairPerson){
        this.clubChairPerson =clubChairPerson ;
    }

    public void setclubSecretary (String clubSecretary){
        this.clubSecretary = clubSecretary;
    }

    public void setclubEmail (String clubEmail){
        this.clubEmail = clubEmail;
    }

    public String toString()
    {
        return "\n Player Details: " + "\n Name: " + clubName  
        + "\n Address " + clubAddress + 
        "\n ChairPerson: " + clubChairPerson
        + "\n secretary : " + clubSecretary
        + "\n Club Email: " + clubEmail  
        + 
        "\n";
    }

}
