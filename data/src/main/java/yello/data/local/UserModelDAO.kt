package yello.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Flowable
import yello.data.model.UserModel

@Dao
interface UserModelDAO {
    @Query("SELECT * FROM UserModel")
    fun getUserModels(): Flowable<List<UserModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg userModels: UserModel): Completable

    @Insert()
    fun insertUserModel(nurseryModel: UserModel): Completable

    @Query("DELETE FROM UserModel")
    fun deleteAll(): Completable
}