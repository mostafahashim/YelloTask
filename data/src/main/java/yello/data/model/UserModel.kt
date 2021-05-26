package yello.data.model

import java.io.Serializable

class UserModel : Serializable {
    lateinit var id: String
    lateinit var name: String
    lateinit var username: String
    lateinit var email: String
    lateinit var address: AddressModel
    lateinit var phone: String
    lateinit var website: String
    lateinit var company: CompanyModel
    var holderType = ""
}