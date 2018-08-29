package service;

import java.util.List;

import entity.User;

public interface UserService {
	/**
	 * 验证登陆名和密码
	 * @param user
	 * @return
	 */
	public User login(User user);
	/**
	 * 查询用户名是否重复
	 * @param user
	 * @return
	 */
	public User QueryuserCode(String user);
	/**
	 * 添加用户
	 */
	public int AddUser(User us);
	/**
	 * 修改前查看id
	 */
	public User QueryId(String id);
	/**
	 * 修改id
	 */
	public int ModifyUser(User us);
	/***
	 * 删除
	 */
	public int DelUser(String[] ida);
	
	
	public int CountFz(String name,int role);
	
	public int Count();
	/**
	 * 模糊查询员工列表
	 * @param userName
	 * @param userRole
	 * @return
	 */
	public List<User> queryByName_UserList(String name,int role,int index,int size);
	
	/**
	 * 所有员工信息
	 * @return
	 */
	public List<User> queryByUserList(int index,int size);
}
