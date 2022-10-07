package pt.unl.fct.di.iadi.carrier.presentation.hub

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO

@RequestMapping("hubs")
interface HubAPI {
    @Operation(summary = "Get packages from a hub")
    @GetMapping("{code}/packages")
    fun listPackagesInHubs()
}