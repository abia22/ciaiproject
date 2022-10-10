package pt.unl.fct.di.iadi.carrier.presentation.hub
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO
import  pt.unl.fct.di.iadi.carrier.presentation.packages.ListPackageDTO

@RequestMapping("hubs")
interface HubAPI {
    @Operation(summary = "Get packages from a hub")
    @GetMapping("{code}/packages")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "packages listed successfully", content =[
            (Content(mediaType = "application/json", array =
            ArraySchema(schema = Schema(implementation = ListPackageDTO::class )))
            )] ),
        ApiResponse(responseCode = "404", description = "No packages found", content = [Content()])

    ])
    fun listPackagesInHubs(@PathVariable code:Long)


    @Operation(summary = "Get all the hubs")
    @GetMapping("")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "hubs listed successfully", content =[
            (Content(mediaType = "application/json", array =
            ArraySchema(schema = Schema(implementation = ListHubDTO::class )))
                    )] ),
        ApiResponse(responseCode = "404", description = "No hubs found", content = [Content()])
    ])
    fun listHubs()
}