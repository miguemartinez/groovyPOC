package com.mmartinez.demo.service

import com.mmartinez.demo.domain.Vehicle
import grails.gorm.services.Where
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service

@CompileStatic
@grails.gorm.services.Service(Vehicle)
@Service

interface VehicleService {

    @Where({ manufacturer.name == manufacturerName })
    List<Vehicle> findAllByManufacturer(String manufacturerName)

}