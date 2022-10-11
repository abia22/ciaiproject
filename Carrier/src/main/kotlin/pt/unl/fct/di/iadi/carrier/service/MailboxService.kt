package pt.unl.fct.di.iadi.carrier.service

import org.springframework.stereotype.Service
import pt.unl.fct.di.iadi.carrier.presentation.mailbox.MailboxCreateDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageCreateDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO

@Service
class MailboxService {
    fun createMailbox(mailbox: MailboxCreateDTO) {
        TODO("Not yet implemented")
    }

    fun deleteMailbox(id: Long) {
        TODO("Not yet implemented")
    }

    fun getAll(id: Long): Collection<MessageListDTO> {
        TODO("Not yet implemented")
    }

    fun addOneMessage(id: Long, value: MessageCreateDTO) {
        TODO("Not yet implemented")
    }
}