package com.allin.controller;

import com.allin.pojo.test.Stu;
import com.allin.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
public class HelloController {

  @Autowired
  private StuService stuService;

  @GetMapping("stu")
  public Object stu() {
    com.allin.pojo.Stu stu = new com.allin.pojo.Stu();
    stu.setName("shy");
    stu.setAge(18L);


    stuService.save(stu);

    return "ok save stu~";
  }

  @GetMapping("hello")
  public Object hello() {
    Stu stu = new Stu();
    stu.setName("");
    return "hello UserService~";
  }

}
