package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;

public interface UserMapper {
	public User login(User user);//验证登陆名和密码
	public List<User> QueryAll(User us);//查询用户列表
	public User QueryuserCode(String Code);//查询用户名是否重复
	public int AddUser(User us);//添加用户
	public User QueryId(String id);//查询id
	public int ModifyUser(User us);
	public int DelUser(String[] arr);//删除
	public int DelUser(String array);
	
	public List<User> queryByUserList(@Param("index")int pageNo,@Param("pageSize")int pageSize);
	
	public int countFz(@Param("name")String name,@Param("role")Integer userRole);
	
	public List<User> queryByName(@Param("name")String name,@Param("role")Integer userRole
			,@Param("index")int pageNo,@Param("pageSize")int pageSize);
	
	public int count();
}
