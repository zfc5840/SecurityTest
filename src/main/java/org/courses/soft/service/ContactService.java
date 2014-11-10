package org.courses.soft.service;

import java.util.List;

import org.courses.soft.domain.Contact;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}