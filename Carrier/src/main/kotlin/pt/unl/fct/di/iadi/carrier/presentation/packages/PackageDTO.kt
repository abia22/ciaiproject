package pt.unl.fct.di.iadi.carrier.presentation.packages

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "A Package in the system")
data class PackageDTO(
    val id: Long,
    val description: String,
    val weight: Float,
    val origin: String,
    val destination: String,
    val dimension: DimensionsDTO
)

data class DimensionsDTO(
    val width: Float,
    val height: Float,
    val length: Float)

data class PackageCreateDTO(val description:String, val weight: Float, val origin: String,
                            val destination: String, val dimension: DimensionsDTO)

data class ListPackageDTO(val id: Long,val description:String, val weight: Float, val origin: String,
                          val destination: String, val dimension: DimensionsDTO)




