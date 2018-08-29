package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.RoleMapper;
import dao.UserMapper;
import entity.Role;
import entity.User;
import util.MyBatisUtil;

public class RoleService {
	public List<Role> QueryAll(){
		List<Role> list=new ArrayList<>();
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			list = sqlSession.getMapper(RoleMapper.class).QueryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		return list;
	}
}
