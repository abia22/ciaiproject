package pt.unl.fct.di.iadi.carrier.presentation.truck

import org.springframework.web.bind.annotation.RestController

@RestController
class TruckController: TruckAPI {

    override fun getAll(): Collection<TruckListDTO> {
        TODO("Not yet implemented")
    }

}
