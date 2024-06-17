package com.SecurityBoat.Movie_Ticket_Booking_System.controller;

import java.util.List;

import javax.swing.text.PasswordView;

import org.apache.catalina.connector.Response;
import org.aspectj.apache.bcel.generic.RET;
import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.Booking;
import com.SecurityBoat.Movie_Ticket_Booking_System.dto.FoodOrder;
import com.SecurityBoat.Movie_Ticket_Booking_System.dto.Movie;
import com.SecurityBoat.Movie_Ticket_Booking_System.dto.User;
import com.SecurityBoat.Movie_Ticket_Booking_System.repo.UserRepo;
import com.SecurityBoat.Movie_Ticket_Booking_System.service.UserService;

@RestController
@RequestMapping("/user")
public class User_MainController {

	@Autowired

	private UserService userService;

	@Autowired
	private Booking bookingService;

	@Autowired

	private FoodOrder foodService;

	@Autowired

	private AdminService adminService;

	@Autowired
	private JavaMailSender mailsender;

	@Autowired

	private BCrytPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@PostMapping("/register ")

	public String registerUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		userService.save(user);
		return "user is registered successfully";

	}

	@PostMapping("/login")

	public String loginUser(@RequestBody User user) {

		User presentUser = userService.findByEmail(user.getEmail());
		if (presentUser == null && passwordEncoder.matches(user.getPassword().equals(user.getPassword())))
			;

		{

			return "login succesfull";
		}

		return "invalid credentials";

	}

	// display avaliable movies
	
	
	@GetMapping ("/movies")
	
	public List<Movie> getAvaliableMovies()
	{
		
		return bookingService.getAllMovie();
	}
	
	
	//select and book Seats
	
	@PostMapping("/book")
	
	public String bookTickets(@RequestBody Booking booking)
	{
		
		if(booking.isSeatsAvaliable(booking.getId(),booking.getSeats()))
		{
			
			bookingService.bookSeats(booking);
			
			sendConfirmationEmail(booking);
			
			return "Booking successfull";
			
		}
		
		return "selected seats are not avaliable";
	}

	
	
	//orderFood
	
	@PostMapping("/food")
	
	public String orderFood(@RequestBody FoodOrder foodorder)
	{
		
		foodService.orderFood(foodorder);
		
		return "food ordered succesfully";
		
	}
	
	
	@PostMapping("/admin/addfood")
	
	public String addFoodItem(@RequestBody FoodItem fooditem)

	{
		adminService.addFoodItem(fooditem);
		
		return "food item added succesfully";
		
	}
	
	
	//booking confirmation email 
	
	private void sendConfirmationMail(Booking booking)
	{
		
		
		SimpleMailMessage message= new SimpleMailMessage();
		
		mesaage.setTo(userService.findByEmail(booking.getUserId().getEmail()));
		message.setSubject("booking Confirmation");
		message.setText("your booking for +booking.getMovieId()+"is confirmed. seats:"+booking .getSeats()");
		
		mailSender.send(message);
	}

}
