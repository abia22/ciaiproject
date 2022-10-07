package pt.unl.fct.di.iadi.carrier.presentation.hub

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Hub worker registered in the system")

data class HubDTO(
    val code: Long,
    val name: String,
    val address: String,
    val description: String,
    val packages: List<Long>
)

data class listHubDTO(val code:Long,val name:String)



