package com.tka.p5UserJSPtoDB;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class webDao {
		
	@Autowired
	SessionFactory sf;
	

	public List<User> getAllUser() {
		Session ssn = sf.openSession();
		Criteria crt = ssn.createCriteria(User.class);
		List<User> userList = crt.list();
		return userList;
	}
	
	public String insertUser(User user) {
		Session ssn = sf.openSession();
		User getUser = ssn.get(User.class, user.userName);
		if(getUser == null) {
			ssn.save(user);
			ssn.beginTransaction().commit();
			return "User inserted successfully...";						
		} else {
			return "User already exist";
		}
	}

	public String updateUser(User user) {
		Session ssn = sf.openSession();
		User getUser = ssn.get(User.class, user.getUserName());
		if(getUser != null) {
			// Update the existing fields with new values
	        getUser.setPassword(user.getPassword());  // Update only the required fields
	        
	        ssn.update(getUser);
			ssn.beginTransaction().commit();
			return "User updated successfully...";			
		} else {
			return "User does not exist";
		}
	}

	public String deleteUser(User user) {
		System.out.println("AA gaya");
		Session ssn = sf.openSession();
		user = ssn.get(User.class, user.userName);
		if(user != null) {
			ssn.delete(user);
			ssn.beginTransaction().commit();;
			return "User deleted successfully...";			
		} else {
			return "User does not exist";
		}
	}

}
