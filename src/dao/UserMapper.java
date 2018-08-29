package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;

public interface UserMapper {
	public User login(User user);//��֤��½��������
	public List<User> QueryAll(User us);//��ѯ�û��б�
	public User QueryuserCode(String Code);//��ѯ�û����Ƿ��ظ�
	public int AddUser(User us);//����û�
	public User QueryId(String id);//��ѯid
	public int ModifyUser(User us);
	public int DelUser(String[] arr);//ɾ��
	public int DelUser(String array);
	
	public List<User> queryByUserList(@Param("index")int pageNo,@Param("pageSize")int pageSize);
	
	public int countFz(@Param("name")String name,@Param("role")Integer userRole);
	
	public List<User> queryByName(@Param("name")String name,@Param("role")Integer userRole
			,@Param("index")int pageNo,@Param("pageSize")int pageSize);
	
	public int count();
}
