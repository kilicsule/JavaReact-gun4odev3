package gameDemo.core.concretes;

import java.rmi.RemoteException;

import gameDemo.core.abstracts.UserCheckService;
import gameDemo.entities.concretes.User;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getDateOfBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result==true) {
			System.out.println(user.getFirstName() + " adlı kulanıcının bilgileri doğrudur.");
		}else {
			System.out.println(user.getFirstName() + " adlı kullanıcının bilgileri yanlıştır.");
		}
		return result;
	}
}
