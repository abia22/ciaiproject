package pt.unl.fct.di.iadi.carrier.presentation.mailbox

import pt.unl.fct.di.iadi.carrier.presentation.message.MessageCreateDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO

class MailboxController: MailboxAPI {
    override fun createMailbox(mailbox: MailboxCreateDTO) {
        TODO("Not yet implemented")
    }

    override fun deleteMailbox(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getAll(id: Long): Collection<MessageListDTO> {
        TODO("Not yet implemented")
    }

    override fun addOneMessage(id: Long, value: MessageCreateDTO) {
        TODO("Not yet implemented")
    }
}