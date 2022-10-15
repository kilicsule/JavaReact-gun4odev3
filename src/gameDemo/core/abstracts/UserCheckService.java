package gameDemo.core.abstracts;

import gameDemo.entities.concretes.User;

public interface UserCheckService {

	boolean checkIfRealPerson(User user);
}
