package wang.lei.rigger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/hello")
	public String index(Model model){
		model.addAttribute("welcome","你好呀!");
		return "index";
	}



}
