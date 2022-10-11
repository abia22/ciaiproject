package pt.unl.fct.di.iadi.carrier.presentation.mailbox

import pt.unl.fct.di.iadi.carrier.presentation.message.MessageCreateDTO
import pt.unl.fct.di.iadi.carrier.presentation.message.MessageListDTO
import pt.unl.fct.di.iadi.carrier.service.MailboxService

class MailboxController(val mailboxes: MailboxService): MailboxAPI {
    override fun createMailbox(mailbox: MailboxCreateDTO) = mailboxes.createMailbox(mailbox)

    override fun deleteMailbox(id: Long) = mailboxes.deleteMailbox(id)

    override fun getAll(id: Long): Collection<MessageListDTO> = mailboxes.getAll(id)

    override fun addOneMessage(id: Long, value: MessageCreateDTO) = mailboxes.addOneMessage(id, value)
}