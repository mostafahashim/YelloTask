package yello.data.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import yello.data.model.AddressModel;
import yello.data.model.CompanyModel;
import yello.data.model.UserModel;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserModelDAO_Impl implements UserModelDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserModel> __insertionAdapterOfUserModel;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<UserModel> __insertionAdapterOfUserModel_1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserModelDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserModel = new EntityInsertionAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserModel` (`id`,`name`,`username`,`email`,`address`,`phone`,`website`,`company`,`holderType`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsername());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        final String _tmp;
        _tmp = __converters.addressModelToJson(value.getAddress());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPhone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhone());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWebsite());
        }
        final String _tmp_1;
        _tmp_1 = __converters.companyModelToJson(value.getCompany());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        if (value.getHolderType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getHolderType());
        }
      }
    };
    this.__insertionAdapterOfUserModel_1 = new EntityInsertionAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserModel` (`id`,`name`,`username`,`email`,`address`,`phone`,`website`,`company`,`holderType`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsername());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        final String _tmp;
        _tmp = __converters.addressModelToJson(value.getAddress());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPhone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhone());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWebsite());
        }
        final String _tmp_1;
        _tmp_1 = __converters.companyModelToJson(value.getCompany());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        if (value.getHolderType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getHolderType());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserModel";
        return _query;
      }
    };
  }

  @Override
  public Completable insertAll(final UserModel... userModels) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserModel.insert(userModels);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertUserModel(final UserModel nurseryModel) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserModel_1.insert(nurseryModel);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable deleteAll() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    });
  }

  @Override
  public Flowable<List<UserModel>> getUserModels() {
    final String _sql = "SELECT * FROM UserModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"UserModel"}, new Callable<List<UserModel>>() {
      @Override
      public List<UserModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
          final int _cursorIndexOfHolderType = CursorUtil.getColumnIndexOrThrow(_cursor, "holderType");
          final List<UserModel> _result = new ArrayList<UserModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserModel _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final AddressModel _tmpAddress;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAddress);
            }
            _tmpAddress = __converters.jsonToAddressModel(_tmp);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpWebsite;
            if (_cursor.isNull(_cursorIndexOfWebsite)) {
              _tmpWebsite = null;
            } else {
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
            }
            final CompanyModel _tmpCompany;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCompany)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCompany);
            }
            _tmpCompany = __converters.jsonToCompanyModel(_tmp_1);
            final String _tmpHolderType;
            if (_cursor.isNull(_cursorIndexOfHolderType)) {
              _tmpHolderType = null;
            } else {
              _tmpHolderType = _cursor.getString(_cursorIndexOfHolderType);
            }
            _item = new UserModel(_tmpId,_tmpName,_tmpUsername,_tmpEmail,_tmpAddress,_tmpPhone,_tmpWebsite,_tmpCompany,_tmpHolderType);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
