package com.akshay.learning.examples

import com.akshay.learning.examples.controllers.SampleRest
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.{SpringApplication, SpringBootConfiguration}
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.ComponentScan


@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Array(classOf[SampleRest]))
class Application

object Application extends App {

  SpringApplication.run(classOf[Application])
}
