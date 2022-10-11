package pt.unl.fct.di.iadi.carrier.presentation.hub

import pt.unl.fct.di.iadi.carrier.service.HubService

class HubController(val hubs: HubService): HubAPI {

    override fun listPackagesInHubs(code: Long) = hubs.listPackagesInHubs(code)

    override fun listHubs() = hubs.listHubs()
}