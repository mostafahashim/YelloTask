package yello.data.model

import java.io.Serializable

class AddressModel : Serializable {
    lateinit var street: String
    lateinit var suite: String
    lateinit var city: String
    lateinit var zipcode: String
    lateinit var geo: GeoModel
}