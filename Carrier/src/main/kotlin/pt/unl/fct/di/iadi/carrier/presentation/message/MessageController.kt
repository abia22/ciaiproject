package pt.unl.fct.di.iadi.carrier.presentation.message


import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class MessageController : MessageAPI {

    override fun getAll(): Collection<MessageListDTO> {
        TODO("Not yet implemented")
    }

    override fun getOne(id: Long): Optional<MessageDTO> {
        TODO("Not yet implemented")
    }

    override fun updateOne(id: Long) {
        TODO("Not yet implemented")
    }

    override fun deleteOne(id: Long) {
        TODO("Not yet implemented")
    }

}