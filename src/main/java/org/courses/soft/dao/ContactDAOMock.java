/**
 * 
 */
package org.courses.soft.dao;

import java.util.List;

import org.courses.soft.domain.Contact;

/**
 * @author GAL version 29.05.2012
 */
public class ContactDAOMock implements ContactDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.courses.soft.dao.ContactDAO#addContact(org.courses.soft.domain.Contact
	 * )
	 */
	public void addContact(Contact contact) {
		System.out.println("Add");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.courses.soft.dao.ContactDAO#listContact()
	 */
	public List<Contact> listContact() {
		System.out.println("List");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.courses.soft.dao.ContactDAO#removeContact(java.lang.Integer)
	 */
	public void removeContact(Integer id) {
		System.out.println("remove");

	}

}
