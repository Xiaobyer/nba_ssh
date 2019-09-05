package com.nba.action;

import java.util.List;

import com.nba.pojo.Basketball;
import com.nba.service.BasketballService;

public class BasketballAction {

	BasketballService basketballService;
	List<Basketball> basketballs;
	Basketball basketball;

	public String list() {
		basketballs = basketballService.list();
		return "listBasketball";
	}
	
	public String add(){
		basketballService.add(basketball);
		return "listBasketballAction";
	}
	public String edit(){
		basketball = basketballService.get(basketball.getId());
		return "editBasketball";
	}
	public String delete(){
		basketballService.delete(basketball);
		return "listBasketballAction";
	}
	public String update(){
		basketballService.update(basketball);
		return "listBasketballAction";
	}

	public BasketballService getBasketballService() {
		return basketballService;
	}

	public void setBasketballService(BasketballService basketballService) {
		this.basketballService = basketballService;
	}

	public List<Basketball> getBasketballs() {
		return basketballs;
	}

	public void setBasketballs(List<Basketball> basketballs) {
		this.basketballs = basketballs;
	}

	public Basketball getBasketball() {
		return basketball;
	}

	public void setBasketball(Basketball basketball) {
		this.basketball = basketball;
	}
	
	
	 

}
