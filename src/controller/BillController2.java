package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Bill;
import entity.Page;
import entity.Provider;
import util.*;
import entity.User;
import service.BiliService;

@Controller
public class BillController2 {
	/**
	 * ����service��s
	 */
	 @Autowired
	  private BiliService biliService;
	 /**
	  * ��ҳ
	  * @param m
	  * @param pageNowssss
	  * @return
	 * @throws UnsupportedEncodingException 
	  */
//	 @RequestMapping(value="/show")
//	  public String getStuList(Model m,@RequestParam(value="pageNow",required=false) Integer pageNow){
//	   LimitPageList limitPageStuList = biliService.getLimitPageList(pageNow);
//	   Page page = limitPageStuList.getPage();
//	    //ǿ������ת��
//	   List<Bill> stuList = (List<Bill>) limitPageStuList.getList();
//	     m.addAttribute("page", page);
//	    m.addAttribute("stuList", stuList);
//	     return "student/showInfo";
//	}
	 
	 @RequestMapping(value="/qulists",produces="text/html;charset=utf-8")
	  public String showMyProduct(HttpServletRequest request) {
		 	User loginUser = (User) request.getSession().getAttribute("userSession");
//		 // �ж�SESSION�Ƿ�ʧЧ  
//	        if (loginUser == null || "".equals(loginUser)) {  
//	            return "redirect:/login";  
//	        }
	        // ȡ��SESSION�е�loginUser  
		 	List<Bill> billList = new ArrayList<Bill>();
			String queryProductName = request.getParameter("queryProductName");
			String queryProviderId = request.getParameter("queryProviderId");
			
			String queryIsPayment = request.getParameter("queryIsPayment");
			String pageIndex = request.getParameter("pageIndex");
			Page param = new Page();
		 	billList = biliService.QueryBill(queryProductName,queryProviderId,queryIsPayment,null,null);
		 	param.setTotalCount(billList.size());
			param.setTotalPageCount(billList.size()%10==0?billList.size()/10:billList.size()/10+1);
	        
			
			System.out.println(queryIsPayment+"queryIsPayment,pageIndex="+pageIndex);
	        if(pageIndex!=null){
				param.setPageNow(Integer.valueOf(pageIndex));
			}else{
				param.setPageNow(1);
			}
			billList =biliService.QueryBill(queryProductName,queryProviderId,queryIsPayment,
					(param.getPageNow()-1)*10,10);
			request.setAttribute("totalCount", param.getTotalCount());
			request.setAttribute("currentPageNo", param.getPageNow());
			request.setAttribute("totalPageCount", param.getTotalPageCount());
			request.setAttribute("queryProductName", queryProductName);
			request.setAttribute("queryProviderId", queryProviderId);
			request.setAttribute("queryIsPayment", queryIsPayment);
			List<Provider> providerList = biliService.QueryProvider();
			request.setAttribute("providerList", providerList);
			request.setAttribute("billList", billList);
			return "billlist";
	 }
}
