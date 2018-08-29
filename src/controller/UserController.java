package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entity.User;
import service.RoleService;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	private Logger logger=Logger.getLogger(UserController.class);
	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	
	@RequestMapping(value="/login")
	public String login(){
		logger.debug("UserController welcome SMBMS=====================");
		return "userlist";
	}
	
	/**\
	 * 登陆获取是否登陆
	 * @param user
	 * @param resque
	 * @return
	 */
	@RequestMapping(value="/doLogin")
	public String doLogin(User user,HttpSession resque){
		User users=userService.login(user);
		if(users!=null){
			resque.setAttribute("userSession", users);
			return main();
		}else{
			return "login";
		}
	}
	/**
	 * 登陆后跳转的第一个页面
	 * @return
	 */
	@RequestMapping(value="/main")
	public String main(){
		return "frame";
	}
	
}
