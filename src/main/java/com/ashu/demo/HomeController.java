package com.ashu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String  showIndex(){


        return "index";


    }

    @GetMapping("/injera")
    public String  showEthiopia(){




        return "injera";

    }  @GetMapping("/golab")
    public String  showIndia(){


        return "golab-jamun";

    }  @GetMapping("/bara")
    public String  showNepal(){


        return "bara";

    }  @GetMapping("/pumkin")
    public String  showTaiwan(){


        return "pumkin-rice-noodles";

    }  @GetMapping("/jerk")
    public String  showJamican(){


        return "jerk-chicken";

    }

    @GetMapping("/crab")
    public String  showAmerica(){


        return "crabbypage";

    }
    @GetMapping("/croque")
    public String  showFrance(){


        return "croque-madame";

    }
    @GetMapping("/gallery")
    public String  showGallery(){


        return "gallery";

    }





}
