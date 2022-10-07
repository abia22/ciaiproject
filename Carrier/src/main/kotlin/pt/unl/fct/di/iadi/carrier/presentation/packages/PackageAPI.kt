package pt.unl.fct.di.iadi.carrier.presentation.packages

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.*
import java.util.*



@RequestMapping("packages")
interface PackageAPI {

    @Operation(summary = "Create new Package")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Created new package", content = [
            (Content(mediaType = "application/json", array = (ArraySchema(schema = Schema(implementation = PackageAPI::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @PostMapping("")
    fun createMailbox(@RequestBody package1: PackageCreateDTO)

    @Operation(summary = "Delete Package")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Deleted Package", content = [(Content())]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @PostMapping("/{id}")
    fun deleteMailbox(@PathVariable id:Long)


    @Operation(summary = "Get one Package given an Id")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found the message", content = [
            (Content(mediaType = "application/json", schema = Schema(implementation = PackageDTO::class)))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "404", description = "Did not find the sought message", content = [Content()])]
    )
    @GetMapping("{id}")
    fun getOne(@PathVariable id: Long): Optional<PackageDTO>

    @Operation(summary = "Update one Package")
    @ApiResponses(value = [
        ApiResponse(responseCode = "202", description = "Updated the package", content = [Content()]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "404", description = "Did not find any package", content = [Content()])]
    )
    @PutMapping("{id}")
    fun updateOne(@PathVariable id: Long):Unit
}