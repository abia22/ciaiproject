package pt.unl.fct.di.iadi.carrier.presentation.truck

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("trucks")
interface TruckAPI {

    @Operation(summary = "Get all trucks")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found all trucks", content = [
            (Content(mediaType = "application/json", array = (ArraySchema(schema = Schema(implementation = TruckListDTO::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @GetMapping("")
    fun getAll(): Collection<TruckListDTO>

    /*
    @GetMapping("{id}")
    fun getPackages(@PathVariable id: Long)
     */

}
