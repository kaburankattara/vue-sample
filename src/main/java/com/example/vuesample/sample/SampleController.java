package com.example.vuesample.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class SampleController {

  @GetMapping
  public String index() {
    return "sample/index";
  }

}
