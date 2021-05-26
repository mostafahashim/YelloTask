package yello.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class UserModel(
    @PrimaryKey(autoGenerate = false) var id: String,
    var name: String?,
    var username: String?,
    var email: String?,
    var address: AddressModel?,
    var phone: String?,
    var website: String?,
    var company: CompanyModel?,
    var holderType: String? = ""
) : Serializable