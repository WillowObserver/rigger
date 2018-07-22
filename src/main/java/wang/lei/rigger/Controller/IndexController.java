package wang.lei.rigger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/index")
public class IndexController {

	@RequestMapping()
	public String index(Model model){
		model.addAttribute("welcome","是谁住在深海大菠萝里");
		return "index";
	}



}
