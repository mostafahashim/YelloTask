package yello.data.model

import java.io.Serializable

data class AddressModel(
    var street: String?,
    var suite: String?,
    var city: String?,
    var zipcode: String?,
    var geo: GeoModel?,
) : Serializable