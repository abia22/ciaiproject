package pt.unl.fct.di.iadi.carrier.presentation.truck

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "A truck sent registered in the system")
data class TruckDTO(
    val id:Long,
    val packages: List<Long>
)

data class TruckListDTO(val id:Long)
