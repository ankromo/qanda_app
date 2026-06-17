package in.tech_camp.qanda_app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.tech_camp.qanda_app.entity.QuestionEntity;
import in.tech_camp.qanda_app.form.QuestionForm;
import in.tech_camp.qanda_app.repository.QuestionRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class QuestionController {
  private final QuestionRepository questionRepository;

  @GetMapping("/")
  public String showIndex(Model model){
    List<QuestionEntity> questions = questionRepository.findAll();
    model.addAttribute("questions",questions);
    return "index";
  }

  @GetMapping("/users/new")
  public String showNewQuestion(Model model){
    model.addAttribute("questionForm",new QuestionForm());

    return "/users/new";
  }
  
}
