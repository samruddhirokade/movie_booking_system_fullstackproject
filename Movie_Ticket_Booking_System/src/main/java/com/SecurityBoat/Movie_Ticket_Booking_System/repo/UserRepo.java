package com.SecurityBoat.Movie_Ticket_Booking_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.User;

public interface UserRepo extends JpaRepository< User ,Long>
{
       User findByEmail(String email);

}
