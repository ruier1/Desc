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
	 * ��֤��½��������
	 * @param user
	 * @return
	 */
	@Override
	public User login(User user){
		return userMapper.login(user);
	}
	/**
	 *��ѯ�û��б�
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
	 * ��ѯ�û����Ƿ��ظ�
	 * @param user
	 * @return
	 */
	@Override
	public User QueryuserCode(String user){
		return userMapper.QueryuserCode(user);
	}
	
	/**
	 * ����û�
	 */
	@Override
	public int AddUser(User user){
		return userMapper.AddUser(user);
	}
	
	/**
	 * �޸�ǰ�鿴id
	 */
	@Override
	public User QueryId(String id){
		return userMapper.QueryId(id);
	}
	
	/**
	 * �޸�id
	 */
	@Override
	public int ModifyUser(User us){
		return userMapper.ModifyUser(us);
		
	}
	/***
	 * ɾ��
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
	 * ģ����ѯԱ���б�
	 * @param userName
	 * @param userRole
	 * @return
	 */
	@Override
	public List<User> queryByName_UserList(String name,int role,int index,int size){
		return userMapper.queryByName(name, role, index, size);
	}
	
	/**
	 * ����Ա����Ϣ
	 * @return
	 */
	@Override
	public List<User> queryByUserList(int index,int size){
		return userMapper.queryByUserList(index,size);
	}
	
}
