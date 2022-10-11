package pt.unl.fct.di.iadi.carrier.presentation.truck

import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.iadi.carrier.service.TruckService

@RestController
class TruckController(val trucks: TruckService): TruckAPI {

    override fun getAll(): Collection<TruckListDTO> = trucks.getAll()

}
