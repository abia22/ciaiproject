package pt.unl.fct.di.iadi.messages.presentation

import MailboxCreateDTO

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