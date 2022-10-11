package pt.unl.fct.di.iadi.carrier.service

import org.springframework.stereotype.Service
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO
import java.util.*

@Service
class MessageService {

    fun getAll(): Collection<MessageListDTO> {
        TODO("Not yet implemented")
    }

    fun getOne(id: Long): Optional<MessageDTO> {
        TODO("Not yet implemented")
    }

}