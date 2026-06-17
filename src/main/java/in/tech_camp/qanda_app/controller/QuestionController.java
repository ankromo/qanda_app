package in.tech_camp.qanda_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

  @GetMapping("/")
  public String show(){
    return "index";
  }
  
}
