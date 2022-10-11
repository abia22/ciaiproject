package pt.unl.fct.di.iadi.carrier.presentation.packages

import pt.unl.fct.di.iadi.carrier.service.PackageService
import java.util.*

class PackageController(val packages: PackageService): PackageAPI {

    override fun createPackage(package1: PackageCreateDTO) = packages.createPackage(package1)

    override fun deletePackage(id: Long) = packages.deletePackage(id)

    override fun getPackage(id: Long): Optional<PackageDTO> = packages.getPackage(id)

    override fun updatePackage(id: Long) = packages.updatePackage(id)
}