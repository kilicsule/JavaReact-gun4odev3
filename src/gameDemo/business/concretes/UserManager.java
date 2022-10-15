 package gameDemo.business.concretes;

import gameDemo.business.abstracts.UserService;
import gameDemo.core.abstracts.UserCheckService;
import gameDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " kayıt başarılı. ");
		}
		else
		{
			System.out.println(user.getFirstName() + " kayıt başarısız oldu.");
		}
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getUserName());
	}
}
