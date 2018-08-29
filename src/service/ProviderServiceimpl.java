package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProMapper;
import entity.User;
@Service("providerService")
public class ProviderServiceimpl implements ProviderService{
	
	@Autowired
	private ProMapper proMapper;
	@Override
	public List<User> queryByUserList(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return proMapper.queryByUserList( pageNo, pageSize);
	}

	@Override
	public int countFz(String name, Integer userRole) {
		// TODO Auto-generated method stub
		return proMapper.countFz(name, userRole);
	}

	@Override
	public List<User> queryByName(String name, Integer userRole, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return proMapper.queryByName(name, userRole, pageNo, pageSize);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return proMapper.count();
	}

	@Override
	public int countFz(String proCode, String proName) {
		// TODO Auto-generated method stub
		return 0;
	}


}
