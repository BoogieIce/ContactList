package com.villaverde.contactlist.repositories;


import java.util.ArrayList;
import java.util.List;

import com.villaverde.contactlist.models.Contact;

public class ContactRepository {

    private static List<Contact> contacts;

    static{
        contacts = new ArrayList<>();
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        contacts.add( new Contact(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        contacts.add( new Contact(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        contacts.add( new Contact(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        contacts.add( new Contact(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
    }

    public static List<Contact> getContacts(){
        return contacts;
    }

        public static Contact getConctByid(Integer id){
        for(Contact contact: contacts){
            if(contact.getId().equals(id)){
                return contact;
            }
        }
        return null;
        }
}
