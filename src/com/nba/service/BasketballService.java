package com.nba.service;

import java.util.List;

import com.nba.pojo.Basketball;

public interface BasketballService {
	
	public List<Basketball> list();
	public void add(Basketball p);
	public Basketball get(int id);
	public void update(Basketball p);
	public void delete(Basketball p);
}
