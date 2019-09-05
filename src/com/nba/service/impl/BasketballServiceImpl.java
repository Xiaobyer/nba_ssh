package com.nba.service.impl;

import java.util.List;

import com.nba.dao.BasketballDAO;
import com.nba.pojo.Basketball;
import com.nba.service.BasketballService;

public class BasketballServiceImpl implements BasketballService {

	BasketballDAO basketballDAO;

	public List<Basketball> list() {
		List<Basketball> basketballs= basketballDAO.list();
		if(basketballs.isEmpty()){
			for (int i = 0; i < 5; i++) {
				Basketball p = new Basketball();
				p.setName("basketball " + i);
				basketballDAO.add(p);
				basketballs.add(p);
			}
		}
		return basketballs;
	}

	public BasketballDAO getBasketballDAO() {
		return basketballDAO;
	}

	public void setBasketballDAO(BasketballDAO basketballDAO) {
		this.basketballDAO = basketballDAO;
	}

	@Override
	public void add(Basketball p) {
		basketballDAO.add(p);
		
	}



	@Override
	public void update(Basketball p) {
		basketballDAO.update(p);
	}

	@Override
	public void delete(Basketball p) {
		basketballDAO.delete(p);
	}

	@Override
	public Basketball get(int id) {
		return basketballDAO.get(id);
	}

	
}
