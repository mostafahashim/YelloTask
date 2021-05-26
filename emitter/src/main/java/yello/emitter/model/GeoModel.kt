package yello.emitter.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class GeoModel : Serializable {
    lateinit var lat: String
    lateinit var lng: String
}