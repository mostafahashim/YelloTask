package yello.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import yello.data.model.AddressModel
import yello.data.model.CompanyModel
import yello.data.model.GeoModel

class Converters {
    @TypeConverter
    fun addressModelToJson(value: AddressModel?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToAddressModel(value: String) = Gson().fromJson(value, AddressModel::class.java)

    @TypeConverter
    fun companyModelToJson(value: CompanyModel?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToCompanyModel(value: String) = Gson().fromJson(value, CompanyModel::class.java)

    @TypeConverter
    fun geoModelToJson(value: GeoModel?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToGeoModel(value: String) = Gson().fromJson(value, GeoModel::class.java)

}