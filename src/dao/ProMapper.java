package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;

public interface ProMapper {

public List<User> queryByUserList(@Param("index")int pageNo,@Param("pageSize")int pageSize);
	
	public int countFz(@Param("proCode")String name,@Param("proName")Integer userRole);
	
	public List<User> queryByName(@Param("proCode")String name,@Param("proName")Integer userRole
			,@Param("index")int pageNo,@Param("pageSize")int pageSize);
	public int count();
}
