package com.mmartinez.demo.controller

import com.mmartinez.demo.domain.Vehicle
import com.mmartinez.demo.service.VehicleService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

@RestController
class VehicleController {

    @Resource VehicleService vehicleService

    @RequestMapping("/{manufacturerName}/vehicles")
    List<String> vehiclesByManufacturer(@PathVariable String manufacturerName) {
        vehicleService.findAllByManufacturer(manufacturerName)*.name
    }
}
