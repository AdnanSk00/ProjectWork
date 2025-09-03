package com.tka.SpringbootWithJdbc.Controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.SpringbootWithJdbc.entity.Collage;
import com.tka.SpringbootWithJdbc.services.CollageService;

@RestController
@CrossOrigin("http://localhost:3000")
public class CollagEController {
	@Autowired
	CollageService service;
	
	@GetMapping("/viewbyid")
	public Collage getCollage(@RequestParam int id) throws Exception
	{
		return service.getCollage(id);
	}
	@PostMapping("/addclg")
	public void addCollage(@RequestBody Collage collage) throws Exception
	{
		service.addCollage(collage);
	}
	
	@GetMapping("/getlistofclg")
	public List<Collage> getclglist() throws Exception
	{
		return service.getclglist();
	}
	@PostMapping("/addlistclg")
	public void addclglist( @RequestBody List<Collage> ls) throws Exception
	{
		service.addclglist(ls);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteclg(
		@PathVariable	int id) throws SQLException, Exception
	{
		service.deleteclg(id);
	}
}
