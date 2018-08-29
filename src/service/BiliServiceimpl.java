package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BiliMapper;
import entity.Bill;
import entity.LimitPageList;
import entity.Page;
import entity.Provider;
//import dao.BillMapper;
@Service("biliService")
public class BiliServiceimpl implements BiliService{
	  @Autowired
	  private BiliMapper biliMapper;

	@Override
	public List<Bill> QueryBill(@Param("queryProductName")String queryProductName,
			   @Param("queryProviderId")String queryProviderId,
			   @Param("queryIsPayment")String queryIsPayment,
			   @Param("from")Integer currentPageNo,
			   @Param("pageSize")Integer pageSize) {
		// TODO Auto-generated method stub
		return biliMapper.QueryBill(queryProductName, queryProviderId, queryIsPayment, currentPageNo, pageSize);
	}

	@Override
	public List<Provider> QueryProvider() {
		// TODO Auto-generated method stub
		return biliMapper.QueryProvider();
	}
	

}
