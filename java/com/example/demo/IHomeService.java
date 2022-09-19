package com.example.demo;

import java.util.List;
public interface IHomeService 
{
	public abstract Home addHome(Home home) ;
	public abstract Home deleteHome(int tid);
	public abstract Home updateHome(Home home) ;
	public abstract Home UpdateAddNo(Home home);
	public abstract Home UpdateLoc(Home home);
	public abstract Home UpdateStyle(Home home);
	public abstract Home UpdatePaint(Home home);
	public abstract Home UpdateBhk(Home home);
	public abstract Home UpdateFloor(Home home);
	public abstract Home UpdateRent(Home home);


	public abstract List<Home> getByLoc(String name) ;
	public abstract List<Home> getByAddNo(int id) ; 
	public abstract List<Home> displayAll();

}
