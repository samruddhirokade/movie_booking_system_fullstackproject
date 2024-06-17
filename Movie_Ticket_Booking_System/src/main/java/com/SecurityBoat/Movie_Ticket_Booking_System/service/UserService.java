package com.SecurityBoat.Movie_Ticket_Booking_System.service;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecurityBoat.Movie_Ticket_Booking_System.dao.UserDAO;


@Service
public class UserService
{
	
	@Autowired
	private UserDAO userdao;
	
	
	public void  saveUser (User user)
	{
		 userdao.save(user);
		
	}
	
	public User findByEmail(String email)
	{
		
		return userdao.findByEmail(email);
	}

	
	
	
	
	
	
	

}
