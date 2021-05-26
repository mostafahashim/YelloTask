package yello.emitter.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class UserModel : BaseObservable(), Serializable {
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