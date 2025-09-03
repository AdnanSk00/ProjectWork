package com.tka.SpringbootWithJdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tka.SpringbootWithJdbc.entity.Collage;
@Component
public class CollageDao 
{
	private static final String URL="jdbc:mysql://localhost:3307/clgmanagrement";
	private static final String uname="root";
	private static final String passswd="root";
	private PreparedStatement pstmt=null;
	Connection con=null;
	
	Connection getdbconnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(URL, uname, passswd);
		return con;
	}
	
	public Collage getCollage(int id) throws  Exception
	{
		String sql="select * from collage where clg_id=?";
		pstmt=getdbconnection().prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		Collage collage=null;
		while(rs.next())
		{
			int idd=rs.getInt(1);
			String name=rs.getString(2);
			String city=rs.getString(3);
			collage=new Collage(idd, name, city);
			
		}
		return collage;
	}
	public int addCollage(Collage collage) throws  Exception
	{
		int rowcount=0;
		String sql="insert into collage values(?,?,?)";
		pstmt=getdbconnection().prepareStatement(sql);
		pstmt.setInt(1, collage.getClgId());
		pstmt.setString(2, collage.getClg_name());
		pstmt.setString(3, collage.getCity());
		rowcount=pstmt.executeUpdate();
		return  rowcount;
		
		
	}
	public List<Collage> getclglist() throws Exception{
		String sql="select * from collage";
		pstmt=getdbconnection().prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		List<Collage> ls=new ArrayList<Collage>();
		while(rs.next())
		{
			int idd=rs.getInt(1);
			String name=rs.getString(2);
			String city=rs.getString(3);
		ls.add(new  Collage(idd, name, city));
			
		}
		return ls;
	}
	
	public int addclglist(List<Collage> ls) throws Exception{
		int rowcount=0;
	String sql="insert into collage values(?,?,?)";
		pstmt=getdbconnection().prepareStatement(sql);
		
		for (Collage collage : ls) {
			pstmt.setInt(1, collage.getClgId());
			pstmt.setString(2, collage.getClg_name());
			pstmt.setString(3, collage.getCity());
			pstmt.executeUpdate();
			rowcount++;
		}
		
		return  rowcount;
	}
	

	public void deleteclg(int id) throws SQLException, Exception
	{
		String sql="delete from collage where clg_id=?";
		pstmt=getdbconnection().prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
	
}
