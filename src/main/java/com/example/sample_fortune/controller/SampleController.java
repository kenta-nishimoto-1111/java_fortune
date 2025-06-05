package com.example.sample_fortune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ← これも必要
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.sample_fortune.service.SampleService;

@Controller
public class SampleController {
  private final SampleService sampleService;

  public SampleController(SampleService sampleService){
    this.sampleService = sampleService;
  }

  @PostMapping("/result")
  public String sample(@RequestParam String name,
                       @RequestParam int age,
                        Model model) { // ← 引数に Model を追加
    String result = sampleService.getFortune();
    model.addAttribute("result", result);
    model.addAttribute("name", name);
    model.addAttribute("age", age);

    return "sample"; // sample.html を返す
  }

  @GetMapping("/form")
    public String form() {
      return "form";
    }
}
