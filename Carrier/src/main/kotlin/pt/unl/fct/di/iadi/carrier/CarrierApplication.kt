package pt.unl.fct.di.iadi.messages

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarrierApplication

fun main(args: Array<String>) {
    runApplication<CarrierApplication>(*args)
}
