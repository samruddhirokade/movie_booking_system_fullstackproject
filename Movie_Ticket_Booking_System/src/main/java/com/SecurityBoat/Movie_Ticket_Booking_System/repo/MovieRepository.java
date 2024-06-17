package com.SecurityBoat.Movie_Ticket_Booking_System.repo;

import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer>{

}
