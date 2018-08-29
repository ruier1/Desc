package controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.CellEditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.org.apache.regexp.internal.recompile;

import entity.Bill;
import entity.LimitPageList;
import entity.Page;
import entity.Provider;
import util.*;
import entity.User;
import service.BiliService;

@Controller
@RequestMapping("/Bill")
public class BillController2 {
	/**
	 * 引用service层
	 */
	 @Autowired
	  private BiliService biliService;
	 /**
	  * 分页
	  * @param m
	  * @param pageNow
	  * @return
	 * @throws UnsupportedEncodingException 
	  */
//	 @RequestMapping(value="/show")
//	  public String getStuList(Model m,@RequestParam(value="pageNow",required=false) Integer pageNow){
//	   LimitPageList limitPageStuList = biliService.getLimitPageList(pageNow);
//	   Page page = limitPageStuList.getPage();
//	    //强制类型转换
//	   List<Bill> stuList = (List<Bill>) limitPageStuList.getList();
//	     m.addAttribute("page", page);
//	    m.addAttribute("stuList", stuList);
//	     return "student/showInfo";
//	}
	 
	 @RequestMapping(value="/qulists",produces="text/html;charset=utf-8")
	  public String showMyProduct(HttpServletRequest request) throws UnsupportedEncodingException{
		 	User loginUser = (User) request.getSession().getAttribute("userSession");
//		 // 判断SESSION是否失效  
//	        if (loginUser == null || "".equals(loginUser)) {  
//	            return "redirect:/login";  
//	        }
	        // 取得SESSION中的loginUser  
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
