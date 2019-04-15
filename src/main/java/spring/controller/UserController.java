package spring.controller;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ardikars.common.logging.Logger;

import spring.bean.User;

@Controller
public class UserController {
	//静态List集合用来代替数据库保存注册的信息
	private static List<User> userList;
	
	//UserController的构造器，用来初始化List<User>集合。
	
    public UserController() {
    	super();
    	userList =new ArrayList<User>();
    }
	//静态的日志类LogFactory
    private static final Log logger =LogFactory.getLog(UserController.class);
    
		@RequestMapping(value = "/register",method = RequestMethod.GET)
		public String registerForm() {
			logger.info("register的get方法被调用。。。");
			return "registerForm.jsp";
		}

		//用户注册
		@RequestMapping(value = "/register",method=RequestMethod.POST)
		public String register(@RequestParam("loginname") String loginname,@RequestParam("password") String password
				,@RequestParam("username") String username) {
			logger.info("register的POST方法别调用。。。");
			//创建User对象
			User user=new User();
			user.setLoginname(loginname);
			user.setPassword(password);
			user.setUsername(username);
			//模拟数据库储存user信息
			userList.add(user);
			logger.info("注册信息"+user.toString());
			//跳转到登录页面
			return "loginForm.jsp";
		} 
		
		//用户登录
		@RequestMapping("/login")
		public String login(@RequestParam("loginname") String loginname,@RequestParam("password") String password,
				Model model) {
			logger.info("登录名："+loginname+"密码："+password);
			//到集合中查找是否存在该用户，用来模拟数据库验证
			
			for(User user:userList) {
				if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)) {
					model.addAttribute("user", user);
					return "welcome.jsp";
				}
			}
			return "loginForm.jsp";
		}


}
