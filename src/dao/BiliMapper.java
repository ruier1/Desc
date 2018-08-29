package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Bill;
import entity.Page;
import entity.Provider;

public interface BiliMapper {
	public List<Bill> QueryBill(@Param("queryProductName")String queryProductName,
			   @Param("queryProviderId")String queryProviderId,
			   @Param("queryIsPayment")String queryIsPayment,
			   @Param("from")Integer currentPageNo,
			   @Param("pageSize")Integer pageSize);
	//��ѯ���й�Ӧ��
	public List<Provider> QueryProvider();
}
