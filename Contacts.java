

public class Contacts {

    private int contactID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneHome;
    private String phoneWork;
    private String phoneCell;

    public Contacts(int contactID, String firstName, String lastName, String emailAddress, String phoneHome, String phoneWork, String phoneCell) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneHome = phoneHome;
        this.phoneWork = phoneWork;
        this.phoneCell = phoneCell;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
    }

    public String getPhoneCell() {
        return phoneCell;
    }

    public void setPhoneCell(String phoneCell) {
        this.phoneCell = phoneCell;
    }

    public void printAll(){
        System.out.println(contactID + "\n" + firstName + " " + lastName +
                "\nemail: " + emailAddress +"\nHome Phone: " + phoneHome + "\nWork Phone: " +
                phoneWork + "\nCell Phone: " + phoneCell);
    }
}