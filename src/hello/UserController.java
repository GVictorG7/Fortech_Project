package hello;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hello.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("user", "command", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("user", user.getUser());
		model.addAttribute("pass", user.getPass());

		try {
			userService.getByUserAndPass(user.getUser(), user.getPass());
			return new ModelAndView("station", "command", new Station());
		} catch (NoResultException e) {
			return new ModelAndView("incorrect");
		}
	}
}
