package yello.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import yello.data.model.UserModel

@Database(entities = [UserModel::class], version = 1,exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userModelDAO(): UserModelDAO
}