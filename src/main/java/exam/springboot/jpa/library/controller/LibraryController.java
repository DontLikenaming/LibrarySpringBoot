package exam.springboot.jpa.library.controller;

import exam.springboot.jpa.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class LibraryController {
    @Autowired private LibraryService libsrv;

    @GetMapping(value = "/")
    public String list(){
        return "forward:/list";
    }

    @GetMapping(value = "/list")
    public ModelAndView list2(Integer page){
        int cntpg = libsrv.countBoard();
        if((page==null)||(page<=0)){page = 1;}
        else if((page>cntpg)){page = cntpg;}

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/list");
        mv.addObject("lblist", libsrv.readBoard(page));
        mv.addObject("page", page);
        mv.addObject("stpg", (page-1)/25*25+1);
        mv.addObject("cntpg", cntpg);

        return mv;
    }
}
