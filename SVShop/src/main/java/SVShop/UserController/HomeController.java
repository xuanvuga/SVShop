package SVShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SVShop.Dao.HomeDao;

@Controller
public class HomeController {
//	@Autowired
//	HomeDao homeDao;
	
	@RequestMapping(value={"/","/trang-chu"},method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
//		mv.addObject("slides",homeDao.GetDataSlide());
		return mv;
	}
	
	@RequestMapping(value="/san-pham")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}

}
