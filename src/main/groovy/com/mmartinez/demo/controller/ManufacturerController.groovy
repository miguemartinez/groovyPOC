package com.mmartinez.demo.controller

import com.mmartinez.demo.service.ManufacturerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ManufacturerController {

    @Autowired
    ManufacturerService manufacturerService

    @RequestMapping("/" )
    List<String> index(){
        manufacturerService.findAll()*.name
    }
}