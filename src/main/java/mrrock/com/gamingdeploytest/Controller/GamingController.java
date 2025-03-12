package mrrock.com.gamingdeploytest.Controller;

import mrrock.com.gamingdeploytest.Repo.GamingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GamingController {
    @Autowired
   private GamingRepo gamingRepo;


    @GetMapping
    public String homepage(Model model){
        model.addAttribute("gamingListe",gamingRepo.getGamingPcList());
        return "index";
    }



}
