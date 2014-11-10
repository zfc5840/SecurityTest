package org.courses.soft.dao;

import java.util.List;

import org.courses.soft.domain.Contact;

public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}