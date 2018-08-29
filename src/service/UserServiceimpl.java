package service;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import entity.User;
import util.MyBatisUtil;
@Service("user")
public class UserServiceimpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	/**
	 * 验证登陆名和密码
	 * @param user
	 * @return
	 */
	@Override
	public User login(User user){
		return userMapper.login(user);
	}
	/**
	 *查询用户列表
	 * @param user
	 * @return
	 */
//	public List<User> QueryAll(User us){
//		SqlSession sqlSession = null;
//		List<User> list=new ArrayList<User>();
//		
//		try {
//			
//			sqlSession = MyBatisUtil.createSqlSession();
//			list = sqlSession.getMapper(UserMapper.class).queryByUserList((pager.getCurrentPageNo()-1)*6,6);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally{
//			MyBatisUtil.closeSqlSession(sqlSession);
//		}
//		return list;
//	}
	
	/**
	 * 查询用户名是否重复
	 * @param user
	 * @return
	 */
	@Override
	public User QueryuserCode(String user){
		return userMapper.QueryuserCode(user);
	}
	
	/**
	 * 添加用户
	 */
	@Override
	public int AddUser(User user){
		return userMapper.AddUser(user);
	}
	
	/**
	 * 修改前查看id
	 */
	@Override
	public User QueryId(String id){
		return userMapper.QueryId(id);
	}
	
	/**
	 * 修改id
	 */
	@Override
	public int ModifyUser(User us){
		return userMapper.ModifyUser(us);
		
	}
	/***
	 * 删除
	 */
	@Override
	public int DelUser(String[] ida){
		return userMapper.DelUser(ida);
	}
	@Override
	public int CountFz(String name,int role){
		return userMapper.countFz(name, role);
	}
	
	
	
	
	@Override
	public int Count(){
		return userMapper.count();
	}

	
	/**
	 * 
	 */
	/**
	 * 模糊查询员工列表
	 * @param userName
	 * @param userRole
	 * @return
	 */
	@Override
	public List<User> queryByName_UserList(String name,int role,int index,int size){
		return userMapper.queryByName(name, role, index, size);
	}
	
	/**
	 * 所有员工信息
	 * @return
	 */
	@Override
	public List<User> queryByUserList(int index,int size){
		return userMapper.queryByUserList(index,size);
	}
	
}
