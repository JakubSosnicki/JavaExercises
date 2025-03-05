import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts; //arrayList z Contact
    //konstruktor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        /**
         * metoda szukająca po klasie Contact
         */
        for(Contact i : myContacts)
            if (Objects.equals(i.getName(), contact.getName())) {
                return myContacts.indexOf(i);
            }
        return -1;
    }

    private int findContact(String name){
        /**
         * metoda szukająca po nazwie i zwracająca index kontaktu z tą nazwą
         */
        for(Contact i : myContacts)
            if (Objects.equals(i.getName(), name)) {
                return myContacts.indexOf(i);
            }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        /**
         * metoda dodająca nowy kontakt jeżeli nie istnieje taki sam
         */
        //szukanie kontaktu
        int position = findContact(contact);
        if(position >= 0){
            System.out.println("Taki kontakt: " + contact.getName() + " już istnieje");
            return false;
        }
        System.out.println("Tworze nowy kontakt: " + contact.getName());
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact){
        /**
         * metoda usuwająca nowy kontakt jeżeli taki istnieje
         */
        //szukanie kontaktu
        int position = findContact(contact);
        if(position >= 0){
            System.out.println("Usuwam kontakt: " + contact.getName());
            myContacts.remove(contact);
            return true;
        }
        System.out.println("Taki kontakt: " + contact.getName() + " nie istnieje w twoich kontaktach");
        return false;
    }

    public Contact queryContact(String searchName){
        int position = findContact(searchName);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        /**
         * metoda zmieniająca istniejacy kontakt
         */
        //szukanie kontaktu w istniejącej liście
        int position = findContact(oldContact);
        if(position >= 0){
            for(Contact i : myContacts) {
                if(Objects.equals(i.getName(), oldContact.getName())){
                    myContacts.set(myContacts.indexOf(i),newContact);
                }
            }
            return true;
        }
        return false;
    }

    public void printContacts() {
        /**
         * metoda wypisująca liste kontaktów w podanym formacie:
         * Contact List:
         * 1. Bob -> 31415926
         * 2. Alice -> 16180339
         */
        System.out.println("Contact List: ");
        for(int i = 0 ; i < myContacts.size() ; i++){
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }




}
