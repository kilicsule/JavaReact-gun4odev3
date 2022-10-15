package gameDemo.business.abstracts;

import gameDemo.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(User user);
}
