
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    //variables
    private String FirstName;
    private String Surname;
    private String address;
    private String mobile;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String sport;
    private String club;

    //constructor
    public Player(String FirstName,String Surname,String address,String mobile,int dayOfBirth,int monthOfBirth,int yearOfBirth,String sport,String club){

        if(FirstName.length() <=40){
            this.FirstName = FirstName;
        }else{
            this.FirstName = FirstName.substring(0,40);
        }

        if(Surname.length() <=40){
            this.Surname = Surname;
        }else{
            this.Surname = Surname.substring(0,40);
        }
        this.address = address;
        this.mobile =mobile ;
        if(dayOfBirth >0 && dayOfBirth <=31)
        {
            this.dayOfBirth = dayOfBirth;
        }

        if(monthOfBirth > 0 && monthOfBirth <=12)
        {
            this.monthOfBirth = monthOfBirth;
        }

        this.yearOfBirth = yearOfBirth;
        this.sport = sport;
        this.club = club;

    }

    //methods
    //getters
    public String getFirstName (){
        return FirstName;
    }

    public String getSurname (){
        return Surname;
    }

    public String getaddress (){
        return address;
    }

    public String getmobile (){
        return mobile;
    }

    public int getdayOfBirth (){
        return dayOfBirth;
    }

    public int getmonthOfBirth ( ){
        return monthOfBirth;
    }

    public int getyearOfBirth (){
        return yearOfBirth;
    }

    public String getsport ( ){
        return sport;
    }

    public String getclub (){
        return club;
    }

    //setters
    public void setFirstName (String FirstName){
         if(FirstName.length() <=40){
            this.FirstName = FirstName;
        }else{
            this.FirstName = FirstName.substring(0,40);
        }
    }

    public void setSurname (String Surname){
       if(Surname.length() <=40){
            this.Surname = Surname;
        }else{
            this.Surname = Surname.substring(0,40);
        }
    }

    public void setaddress (String address){
        this.address = address;
    }

    public void setmobile (String mobile){
        this.mobile =mobile ;
    }

    public void setdayOfBirth (int dayOfBirth){
        if(dayOfBirth >0 && dayOfBirth <=31)
        {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public void setmonthOfBirth (int monthOfBirth){
        if(monthOfBirth > 0 && monthOfBirth <=12)
        {
            this.monthOfBirth = monthOfBirth;
        }
    }

    public void setyearOfBirth (int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public void setsport (String sport){
        this.sport = sport;
    }

    public void setclub (String club){
        this.club = club;
    }

    public String toString()
    {
        return "Player Details: " + " Name: " + FirstName +" "+Surname 
        + "\n Address " + address + 
        "\n Mobile: " + mobile 
        + "\n birthday : " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth
        + "\n Sport: " + sport  
        + "\n Club: " + club +
        "\n";
    }
}
