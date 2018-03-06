package com.akshay.learning.examples.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody, RestController}

@RestController
@RequestMapping(Array("/api"))
class SampleRest @Autowired()(){
  @RequestMapping(value = Array("/hello"), method = Array(RequestMethod.GET))
  @ResponseBody
  def hello() = "Hello World"
}
