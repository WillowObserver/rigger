package wang.lei.rigger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/index")
public class IndexController {

	@RequestMapping()
	public String index(Model model){
		model.addAttribute("welcome","你好呀!");
		return "index";
	}



}
