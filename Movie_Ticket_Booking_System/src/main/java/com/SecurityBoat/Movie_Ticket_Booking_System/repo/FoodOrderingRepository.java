package com.SecurityBoat.Movie_Ticket_Booking_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.FoodOrder;

public interface FoodOrderingRepository  extends JpaRepository<FoodOrder, Long >{

}