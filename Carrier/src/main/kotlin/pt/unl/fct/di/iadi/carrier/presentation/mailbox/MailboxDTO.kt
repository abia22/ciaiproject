package pt.unl.fct.di.iadi.carrier.presentation.mailbox

import io.swagger.v3.oas.annotations.media.Schema


@Schema(description = "A mailbox in the system")
data class MessageDTO(
    val id:Long,
    @field:Schema(example = "a@a.org")
    val address:String,
    val owner:String,
    val messageIdList: List<Long>)

data class MailboxCreateDTO(val owner:String, val address:String)

