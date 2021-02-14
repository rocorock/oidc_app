package rocorock.oidc_app.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    @RequestMapping("/home")
    public String home(Model model){
        return "home";
    }

    @RequestMapping("/menu")
    public String menu(Model model){
        return "menu";
    }

    @RequestMapping("/access")
    public String access(Model model){
        return "access";
    }

    @RequestMapping("/recruit")
    public String recruit(Model model){
        return "recruit";
    }

    @RequestMapping("/manual")
    public String manual(Model model){
        return "manual";
    }

    @RequestMapping("/mypage")
    public String mypage(Model model){
        return "mypage";
    }
}