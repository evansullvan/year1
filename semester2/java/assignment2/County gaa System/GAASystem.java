
/**
 * Write a description of class GAASystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GAASystem
{

    private MemberList members = new MemberList();

    public GAASystem(){

    }

    public static void main(String []args){
        GAASystem gs1 = new GAASystem();

        gs1.run();
    }

    public int MainMenu(){
        System.out.println("      GAA System menu");
        System.out.println("  ***************");
        System.out.println("  1) Load all Memebers from a file");
        System.out.println("  _____________________________");
        System.out.println("  2) Register a new Member");
        System.out.println("  3) List all Members");
        System.out.println("  4) Delete a member");
        System.out.println("  ______________________________");
        System.out.println("  5) Search ");
        System.out.println("  6) Update member");
        System.out.println("  7) List different types of members");
        System.out.println("  _______________________________");
        System.out.println("  8) Save members to file");
        System.out.println("  _______________________________");
        System.out.println("  0) Exit");
        System.out.println("");

        int choice = EasyScanner.nextInt();
        return choice;
    }

    public void run(){
        int option = MainMenu();

        while(option != 100 ){
            switch(option){
                case 1: 
                try{
                    members.load();
                }
                catch (Exception e)
                { 
                    System.out.println("Error reading from file: " + e);
                }
                break;

                case 2: 
                addmember();
                break;

                case 3: 
                System.out.println(members.listMembers());
                break;

                case 4: 
                removeMembers();
                break;

                case 5: 
                search();
                break;

                case 6: 
                update();
                break;

                case 7: 
                listSpecific();
                break;

                case 8: 
                try{
                    members.save();
                    System.out.println("successfully saved members");
                }
                catch (Exception e){
                    System.out.println("Error writing to file: " + e);
                }
                break;
                case 0:
                sure();
                break;

                default:System.out.println("error.. number selected does not exist");

            }
            option = MainMenu();
        }
    }

    public void sure(){
        int choice2;
        System.out.println("Are you sure you saved the files?");
        System.out.println("1) No");
        System.out.println("2) Yes");
        choice2 = EasyScanner.nextInt();

        if(choice2 == 1){
            System.out.println("Save the files");
            MainMenu();

        }
        else if(choice2 == 2){
            System.out.println("Are you SURE YOUR SURE??!!");
            System.out.println("1) No");
            System.out.println("2) Yes");
            int choice4 = EasyScanner.nextInt();
            if(choice4 == 2){
                System.out.println("ok");
                System. exit(0);
            }else if(choice4 == 1){
                System.out.println("Your lucky I asked you twice...");
                MainMenu();
            }

        }
    }

    public void addmember(){
        int choice1;

        System.out.println("what kind of member do you want to add?");
        System.out.println("press (1) for a coach");
        System.out.println("press (2) for a player over 18");
        System.out.println("press (3) for a player under 18");
        System.out.println("Enter choice [1-3]: ");
        choice1 = EasyScanner.nextInt();

        System.out.println("enter the members details here: ");
        System.out.println("     name:");
        String name = EasyScanner.nextString();
        System.out.println("     address:");
        String address = EasyScanner.nextString();
        System.out.println("     gender:");
        String gender = EasyScanner.nextString();

        if(choice1 == 1){
            String dateOfGardaClearance;
            System.out.println("enter coaches date of garda clearence: ");
            dateOfGardaClearance = EasyScanner.nextString();

            Coach c1 = new Coach(name,address,gender ,dateOfGardaClearance);
            members.addMember(c1);
            System.out.println("coach added");
        }else if(choice1 == 2){

            System.out.println("enter email: ");
            String email = EasyScanner.nextString();
            System.out.println("enter phone: ");
            String phone = EasyScanner.nextString();

            AdultPlayer ad1 = new AdultPlayer( name, address, gender , phone, email);
            members.addMember(ad1);
            System.out.println("Adult player added");
        }else if(choice1 == 3){
            System.out.println("enter guardians name: ");
            String nextOfKinName = EasyScanner.nextString();
            System.out.println("enter guardians phone number: ");
            String nextOfKinPhone = EasyScanner.nextString();

            YouthPlayer y1 = new YouthPlayer(name,address,gender,nextOfKinName,nextOfKinPhone);
            members.addMember(y1);
            System.out.println("child player added");
        }

    } 

    public void removeMembers(){
        System.out.println("members list : " + "\n" + members.listMembers());

        System.out.println("enter the index of the member you want to delete");
        int index = EasyScanner.nextInt();

        members.deleteMember(index);
        System.out.println("Member Deleted...");
    }

    public void searchMemberByName(){
        System.out.println("enter the name of the member");
        String name = EasyScanner.nextString();
        System.out.println(members.searchMembersbyName(name));
    }

    public void searchMemberByGender(){
        System.out.println("enter the Gender of the member");
        String gender = EasyScanner.nextString();
        System.out.println(members.searchMembersbyGender(gender));
    }

    public void search(){
        System.out.println("What would you like to search?");
        System.out.println(" 1) Name:");
        System.out.println(" 2) Gender:");
        int choice5 = EasyScanner.nextInt();

        if(choice5 == 1){
            searchMemberByName();

        }
        else if(choice5 == 2){
            searchMemberByGender();
        }
    }

    public void update(){
        System.out.println("who do you want to update");
        System.out.println("1) Coach");
        System.out.println("2) Player over 18");
        System.out.println("3) Player under 18");

        int choice5 = EasyScanner.nextInt();
        if(choice5 == 1){
            System.out.println(members.listCoach());
            System.out.println("Enter the index of person you want to edit");
            int index = EasyScanner.nextInt();

            Coach c1 =(Coach)members.getMember(index);
            System.out.println("\tWhich of the following do you wish to edit:");
            System.out.println("\t1. Coach name");
            System.out.println("\t2. coach address");
            System.out.println("\t3. Coach gender");
            System.out.println("\t4. Coaches date of clearence");
            System.out.println("\t0. Exit");
            int option = EasyScanner.nextInt();
            while(option != 0){
                switch(option){
                    case 1:
                    System.out.println("edit coaches name");
                    String coachname = EasyScanner.nextString();
                    c1.setname(coachname);
                    break;
                    case 2:
                    System.out.println("edit coaches address");
                    String coachaddress = EasyScanner.nextString();
                    c1.setaddress(coachaddress);
                    break;
                    case 3:
                    System.out.println("edit coaches gender");
                    String coachgender = EasyScanner.nextString();
                    c1.setgender(coachgender);
                    break;
                    case 4:
                    System.out.println("edit coaches date of garda clearance");
                    String coachdate = EasyScanner.nextString();
                    c1.setdateOfGardaClearance(coachdate);
                    break;
                    default: System.out.println("incorrect input");

                }
                System.out.println("\tWhich of the following do you wish to edit:");
                System.out.println("\t1. Coach name");
                System.out.println("\t2. coach address");
                System.out.println("\t3. Coach gender");
                System.out.println("\t4. Coaches date of clearence");
                System.out.println("\t0. Exit");
                option = EasyScanner.nextInt();

            }
            System.out.println("coach updated");

        }else if(choice5 == 2){
            System.out.println(members.listAdult());
            System.out.println("Enter the index of person you want to edit: ");
            int index = EasyScanner.nextInt();//it has a +1 becuse when i click 0 it thinks it means 1

            AdultPlayer a1 =(AdultPlayer)members.getMember(index);
            System.out.println("\tWhich of the following do you wish to edit:");
            System.out.println("\t1. Adult name");
            System.out.println("\t2. Adult address");
            System.out.println("\t3. Adult gender");
            System.out.println("\t4. Adult Phone");
            System.out.println("\t5. Adult email");
            System.out.println("\t0. Exit");
            int option = EasyScanner.nextInt();
            while(option != 0){
                switch(option){
                    case 1:
                    System.out.println("edit Adult name");
                    String adultname = EasyScanner.nextString();
                    a1.setname(adultname);
                    break;
                    case 2:
                    System.out.println("edit Adult address");
                    String adultaddress = EasyScanner.nextString();
                    a1.setaddress(adultaddress);
                    break;
                    case 3:
                    System.out.println("edit Adult gender");
                    String adultgender = EasyScanner.nextString();
                    a1.setgender(adultgender);
                    break;
                    case 4:
                    System.out.println("edit Adult Phone");
                    String adultphone = EasyScanner.nextString();
                    a1.setphone(adultphone);
                    break;
                    case 5:
                    System.out.println("edit Adult Email");
                    String adultemail = EasyScanner.nextString();
                    a1.setemail(adultemail);
                    break;
                    default: System.out.println("incorrect input");

                }
                System.out.println("\tWhich of the following do you wish to edit:");
                System.out.println("\t1. Adult name");
                System.out.println("\t2. Adult address");
                System.out.println("\t3. Adult gender");
                System.out.println("\t4. Adult Phone");
                System.out.println("\t5. Adult email");
                System.out.println("\t0. Exit");
                option = EasyScanner.nextInt();

            }
            System.out.println("adult updated");

        }else if(choice5 == 3){
            System.out.println(members.listYouth());
            System.out.println("Enter the index of person you want to edit");
            int index = EasyScanner.nextInt(); 

            YouthPlayer y1 = (YouthPlayer)members.getMember(index);
            System.out.println("\tWhich of the following do you wish to edit:");
            System.out.println("\t1. youth name");
            System.out.println("\t2. youth address");
            System.out.println("\t3. youth gender");
            System.out.println("\t4. youth next of kin phone");
            System.out.println("\t5. youth next of kin email");
            System.out.println("\t0. Exit");
            int option = EasyScanner.nextInt();
            while(option != 0){
                switch(option){
                    case 1:
                    System.out.println("edit youth name");
                    String coachname = EasyScanner.nextString();
                    break;
                    case 2:
                    System.out.println("edit youth address");
                    String coachaddress = EasyScanner.nextString();
                    break;
                    case 3:
                    System.out.println("edit youth gender");
                    String coachgender = EasyScanner.nextString();
                    break;
                    case 4:
                    System.out.println("edit youth next of kin name");
                    String kinname = EasyScanner.nextString();
                    break;
                    case 5:
                    System.out.println("edit youth next of kin phone");
                    String kinphone = EasyScanner.nextString();
                    break;
                    default: System.out.println("incorrect input");

                }
                System.out.println("\tWhich of the following do you wish to edit:");
                System.out.println("\t1. youth name");
                System.out.println("\t2. youth address");
                System.out.println("\t3. youth gender");
                System.out.println("\t4. youth next of kin phone");
                System.out.println("\t5. youth next of kin email");
                System.out.println("\t0. Exit");
                option = EasyScanner.nextInt();

            }
            System.out.println("youth updated");
        }
    }

    public void listSpecific(){
        System.out.println("who do you want to list");
        System.out.println("1) Coach");
        System.out.println("2) Player over 18");
        System.out.println("3) Player under 18");

        int choice6 = EasyScanner.nextInt();

        if(choice6 == 1){
            System.out.println(members.listCoach());

        }else if(choice6 == 2){
            System.out.println(members.listAdult());

        }else if(choice6 == 3){
            System.out.println(members.listYouth());

        }

    }
}

