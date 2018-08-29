package service;

import java.util.List;

import entity.User;

public interface UserService {
	/**
	 * ��֤��½��������
	 * @param user
	 * @return
	 */
	public User login(User user);
	/**
	 * ��ѯ�û����Ƿ��ظ�
	 * @param user
	 * @return
	 */
	public User QueryuserCode(String user);
	/**
	 * ����û�
	 */
	public int AddUser(User us);
	/**
	 * �޸�ǰ�鿴id
	 */
	public User QueryId(String id);
	/**
	 * �޸�id
	 */
	public int ModifyUser(User us);
	/***
	 * ɾ��
	 */
	public int DelUser(String[] ida);
	
	
	public int CountFz(String name,int role);
	
	public int Count();
	/**
	 * ģ����ѯԱ���б�
	 * @param userName
	 * @param userRole
	 * @return
	 */
	public List<User> queryByName_UserList(String name,int role,int index,int size);
	
	/**
	 * ����Ա����Ϣ
	 * @return
	 */
	public List<User> queryByUserList(int index,int size);
}
