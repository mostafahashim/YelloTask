package yello.emitter.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class CompanyModel : Serializable {
    lateinit var name: String
    lateinit var catchPhrase: String
    lateinit var bs: String
}