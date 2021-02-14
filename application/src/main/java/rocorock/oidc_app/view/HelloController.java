package rocorock.oidc_app.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    @RequestMapping("/layout")
    public String hello(Model model){
        model.addAttribute("hello", "Hello World!");
        return "layout/media";
    }
}