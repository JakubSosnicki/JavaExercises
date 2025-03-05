public class Main {
    public static void main(String[] args) {
        MobilePhone iphone16 = new MobilePhone("733001477");
        Contact contact1 = new Contact("Jakub" , "696311999");
        iphone16.addNewContact(contact1);
        Contact cont2 = Contact.createContact("Mary", "12321");
        iphone16.printContacts();
    }
}