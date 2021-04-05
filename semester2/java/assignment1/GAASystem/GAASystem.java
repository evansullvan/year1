
/**
 * Write a description of class GAASystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GAASystem
{
    //creating a new player and club arraylist
    private PlayerList playerlist1 = new PlayerList();
    private ClubList clubList1 = new ClubList();
    //creating a new gaa system
    public GAASystem(){

    }
    //main method from which the system runs
    public static void main(String[]args){
        GAASystem gs1 = new GAASystem();

        gs1.run();
    }
    //system menu
    public int mainMenu()
    {
        System.out.println("\n GAA Menu");
        System.out.println("\n ______________________");

        System.out.println("   1. Add a GAA club to the system");
        System.out.println("   2. list all clubs");
        System.out.println("   3. remove a club (by index)");
        System.out.println("\n------------------");
        System.out.println("   4. Add a player to the system");
        System.out.println("   5. list all players");
        System.out.println("   6. list all players by sport");
        System.out.println("   7. list all players by club");
        System.out.println("   8. remove a player (by index)");
        System.out.println("\n  -------------------");
        System.out.println("   0. Quit");
        System.out.println();
        System.out.print("Enter choice [0-8]: ");

        // get choice
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        return choice;

    }
    //system menu backend
    public void run(){
        int option = mainMenu();
        while(option !=0)
        {
            switch (option)
            {
                case 1: 
                createClub();
                break;

                case 2:
                String club = clubList1.listClub();
                System.out.println(club);
                break;

                case 3: 
                removeAClub();
                break;

                case 4:
                createPlayer();
                break;

                case 5: 
                String players = playerlist1.listOfplayer();
                System.out.println(players);
                break;

                case 6: 
                listAllPlayerBySport();

                break;

                case 7: 
                listAllPlayerByClub();
                break;

                case 8: 
                removePlayer();
                break;

                default : 
                System.out.println("Invalid option selected");
            }
            System.out.println();
            option = mainMenu();
        }

    }
    //creates player using input from user
    public void createPlayer(){
        String FirstName;
        String Surname;
        String address;
        String mobile;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        String sport;
        String club;
        int currentYear;
        int old;

       

        
       
        System.out.println("enter player first name");
        FirstName = EasyScanner.nextString();

        System.out.println("enter player second name");
        Surname = EasyScanner.nextString();

        System.out.println("enter player address");
        address = EasyScanner.nextString();

        System.out.println("enter player mobile");
        mobile = EasyScanner.nextString();

        System.out.println("enter player Day of birth");
        dayOfBirth = EasyScanner.nextInt();
        while(!(dayOfBirth <= 31)){
            System.out.println("day value is over 31!");
            System.out.println("enter player Day of birth");
            dayOfBirth = EasyScanner.nextInt();
        }

        System.out.println("enter player month of birth");
        monthOfBirth = EasyScanner.nextInt();
        while(!(monthOfBirth <= 12)){
            System.out.println("month value is over 12!");
            System.out.println("enter player month of birth");
            monthOfBirth = EasyScanner.nextInt();
        }

        System.out.println("current year is 2021");
        currentYear = 2021;

        System.out.println("enter player year of birth");
        yearOfBirth = EasyScanner.nextInt();

        old = currentYear - yearOfBirth;
        while(old <= 4){
            System.out.println("child must be over the age of 4");
            System.out.println("enter year again");
            yearOfBirth = EasyScanner.nextInt();
            old = currentYear - yearOfBirth;
        }
        System.out.println("player is "+ old + " years old");

        System.out.println("enter players choice of sport");
        sport = EasyScanner.nextString();

        System.out.println("enter players club");
        club = EasyScanner.nextString();
        //creates new player using the user given variables
        Player player1 = new Player(FirstName, Surname,address,mobile, dayOfBirth, monthOfBirth, yearOfBirth, sport, club);
        playerlist1.addplayer(player1);
        System.out.println("--------------------------");

   
    }
    //removes player
    public void removePlayer(){
        System.out.println("Player list: " + "\n" + playerlist1.listOfplayer());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Player you wish to delete from the system:  ");
        int index = EasyScanner.nextInt();
        playerlist1.removeplayer(index);
        System.out.println("Player Removed from System");      

    }
    //creates a club using user given vaiables
    public void createClub(){
        String clubName ;
        String clubAddress ;
        String clubChairPerson;
        String clubSecretary;
        String clubEmail;

        System.out.println("enter Club name");
        clubName = EasyScanner.nextString();

        System.out.println("enter club address");
        clubAddress = EasyScanner.nextString();

        System.out.println("enter club chair person");
        clubChairPerson = EasyScanner.nextString();

        System.out.println("enter club secretary");
        clubSecretary = EasyScanner.nextString();

        System.out.println("enter club email");
        clubEmail = EasyScanner.nextString();
        //creates club using the variables
        Club club1 = new Club(clubName,clubAddress,clubChairPerson,clubSecretary,clubEmail);
        clubList1.addClub(club1);
        System.out.println("___________________________");

    }
    //removes a club
    public void removeAClub(){
        System.out.println("Club list: "+"\n" + clubList1.listClub());
        System.out.println("enter the index of the club you want to delete");
        System.out.println("--------------------");
        int select = EasyScanner.nextInt();
        clubList1.removeClub(select);
        System.out.println("club removed from the system");

    }
    //lists all clubs in the club arraylist
    public void listAllClubs(){
        clubList1.listClub();
    }
    //list all players in the player arraylist by sport 
    public void listAllPlayerBySport()
    {
        System.out.println("enter player sport: ");
        String sportIn = EasyScanner.nextString();
        System.out.println(playerlist1.listPlayersBySpecificSport(sportIn));

    }
    //list all players in the player arraylist by club
    public void listAllPlayerByClub(){
        System.out.println("enter player club");
        String clubIn = EasyScanner.nextString();
        System.out.println(playerlist1.listPlayersBySpecificClub(clubIn));
    }

}
