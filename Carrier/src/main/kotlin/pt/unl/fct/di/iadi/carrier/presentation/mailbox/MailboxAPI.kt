package pt.unl.fct.di.iadi.carrier.presentation.mailbox

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.*
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageCreateDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO
import java.util.*

@RequestMapping("mailboxes")
interface MailboxAPI {

    @Operation(summary = "Create new mailbox")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Created new mailbox", content = [
            (Content(mediaType = "application/json", array = (ArraySchema(schema = Schema(implementation = MailboxAPI::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @PostMapping("")
    fun createMailbox(@RequestBody mailbox:MailboxCreateDTO)

    @Operation(summary = "Delete mailbox")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Deleted mailbox", content = [(Content())]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @PostMapping("/{id}")
    fun deleteMailbox(@PathVariable id:Long)

    @Operation(summary = "Get all messages")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found all messages", content = [
            (Content(mediaType = "application/json", array = (ArraySchema(schema = Schema(implementation = MessageListDTO::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @GetMapping("/{id}/messages")
    fun getAll(@PathVariable id:Long): Collection<MessageListDTO>


    @Operation(summary = "Add one message")
    @ApiResponses(value = [
        ApiResponse(responseCode = "201", description = "Added the message", content = [Content()]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()])]
    )
    @PostMapping("/{id}/messages")
    fun addOneMessage(@PathVariable id:Long, @RequestBody value: MessageCreateDTO):Unit


}

