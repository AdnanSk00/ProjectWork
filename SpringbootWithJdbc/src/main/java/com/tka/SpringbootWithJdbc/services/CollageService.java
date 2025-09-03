package com.tka.SpringbootWithJdbc.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tka.SpringbootWithJdbc.dao.CollageDao;
import com.tka.SpringbootWithJdbc.entity.Collage;
@Component
public class CollageService {
	@Autowired
	CollageDao dao;
	public Collage getCollage(int id) throws  Exception
	{
		return dao.getCollage(id);
	}
	
	public void addCollage(Collage collage) throws  Exception
	{
		if(dao.	addCollage(collage) >0)
		{
			System.out.println("data inserted successfullly");
		}else
		{System.out.println("data insertion failed");
			
		}
	}
	
	public List<Collage> getclglist() throws Exception
	{
		return dao.getclglist();
	}
	public void addclglist(List<Collage> ls) throws Exception
	{
		if(dao.addclglist(ls)>0)
		{
			//int rowcount=dao.addclglist(ls);
			//System.out.println(rowcount+" rows inserted successfully ");
		}
	}
	
	public void deleteclg(int id) throws SQLException, Exception
	{
	
		dao.deleteclg(id);
	}
}
