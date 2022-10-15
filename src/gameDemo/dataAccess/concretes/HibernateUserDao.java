package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.UserDao;
import gameDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: " + user.getUserName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi: " + user.getUserName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi: " + user.getUserName());
		
	}


}
