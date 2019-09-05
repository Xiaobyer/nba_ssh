package com.nba.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nba.dao.BasketballDAO;
import com.nba.pojo.Basketball;

public class BasketballDAOImpl extends HibernateTemplate implements BasketballDAO{
	
	public List<Basketball> list() {
		return find("from Basketball");
	}

	@Override
	public void add(Basketball p) {
		save(p);
	}

	@Override
	public Basketball get(int id) {
		return (Basketball)get(Basketball.class,id);
	}

	@Override
	public void update(Basketball p) {
		super.update(p);
		
	}

	@Override
	public void delete(Basketball p) {
		super.delete(p);
	}
	
}
