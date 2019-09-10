package edu.udacity.java.nano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;

/**
 * @author Nishant
 *
 */
@SpringBootApplication
@RestController
public class WebSocketChatApplication { 
	public static void main(String[] args) {
		SpringApplication.run(WebSocketChatApplication.class, args);
	}

	/**
	 * Login Page
	 */
	@GetMapping("/")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	/**
	 * Chatroom Page
	 */
	@GetMapping("/index")
	public ModelAndView index(String userName, HttpServletRequest request) throws UnknownHostException {
		ModelAndView chatModelAndView = new ModelAndView("chat");
		chatModelAndView.addObject("userName", userName);
		return chatModelAndView;
	}
}
