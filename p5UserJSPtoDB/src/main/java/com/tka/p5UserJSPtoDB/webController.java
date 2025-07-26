package com.tka.p5UserJSPtoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller						// .html file content
public class webController {

	@Autowired
	webService webSrvc;
	
	@GetMapping("/")
	public String getIndexPage() {
		return "welcome";		// .jsp file
	}
	
	@GetMapping("/get-registerPage")
	public String getRegisterPage(Model model) {
		String allUserDetails = getAllUser(model);
		return "allUserDetails";
	}
//	@PostMapping("/insert-user")
//	public String insertUser(@ModelAttribute User user) {
//		System.out.println("User obj > " + user);
//		
//		webSrvc.insertUser(user);
//		
//		return "acknowledge";
//	}
//	
	@GetMapping("/get-user")
	public String getAllUser(Model model) {
		// get all User data from d/b
		 List<User> userList = webSrvc.getAllUser();
		model.addAttribute("userList", userList);
		return "allUserDetails";	// path :static / home.html
	}

	@PostMapping("/insert-user")
	public String insertUser(@ModelAttribute User user, Model model) {
		System.out.println("in the way..." + user);
		// get all User data from d/b
		String msg = webSrvc.insertUser(user);
		System.err.println(msg);
		model.addAttribute("insertMsg", msg);
		String allUserDetails = getAllUser(model);
		return "allUserDetails";	// path :static / home.html
	}
	
	@PostMapping("/update-user")
	public String updateUser(@ModelAttribute User user, Model model) {
		System.out.println("in the way..." + user);
		// get all User data from d/b
		String msg = webSrvc.updateUser(user);
		System.err.println(msg);
		model.addAttribute("updateMsg", msg);
		String allUserDetails = getAllUser(model);
		return "allUserDetails";	// path :static / home.html
	}
	
	@PostMapping("/delete-user")
	public String deleteUser(@ModelAttribute User user, Model model) {
		System.out.println("into way..." + user);
		// get all User data from d/b
		String msg = webSrvc.deleteUser(user);
		System.err.println(msg);
		model.addAttribute("deleteMsg", msg);
		String allUserDetails = getAllUser(model);
		return "allUserDetails";	// path :static / home.html
	}
		
	@GetMapping("/check-user")
	public String getUser(Model model) {
		// get User data from database
		User user = new User();
		user.setUserName("Roy");
		user.setPassword("124");
		String msg = "User MSG Controller";
		model.addAttribute("pgm", msg);
		model.addAttribute("userObj", user);
		// send {user} from javaController to jsp
		return "userDetails";		// path :static / home.html
	}
	
}
