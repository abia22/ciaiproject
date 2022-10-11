package pt.unl.fct.di.iadi.carrier.presentation.message


import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.iadi.carrier.service.MessageService
import java.util.*

@RestController
class MessageController(val messages: MessageService) : MessageAPI {

    override fun getAll(): Collection<MessageListDTO> = messages.getAll()

    override fun getOne(id: Long): Optional<MessageDTO> = messages.getOne(id)

    /*override fun updateOne(id: Long) {

    }

    override fun deleteOne(id: Long) {

    }*/

}