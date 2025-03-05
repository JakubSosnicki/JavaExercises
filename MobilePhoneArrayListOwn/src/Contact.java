public class Contact {
    private String name;
    private String phoneNumber;

    //konstruktor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //pobieracz nazwy
    public String getName() {
        return name;
    }
    //pobieracz numeru telefonu
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //metoda tworząca nowy kontakt
     public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
