package com.example.quanlychamcong.repository;

import android.content.Context;

import com.example.quanlychamcong.database.Dao.RequestDataNhanVien;
import com.example.quanlychamcong.database.Dao.RequestDataPhongBan;
import com.example.quanlychamcong.database.DatabaseRoom;
import com.example.quanlychamcong.database.Entity.NhanVienEntity;
import com.example.quanlychamcong.database.Entity.PhongBanEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

public class DatabaseRepositoryPhongBan {
    public static DatabaseRepositoryPhongBan databaseRepositoryPhongBan = null;

    public RequestDataPhongBan requestDataPhongBan;


    public DatabaseRepositoryPhongBan(Context context) {
        this.requestDataPhongBan = DatabaseRoom.getInstance(context).requestDataPhongBan();
    }
    public static DatabaseRepositoryPhongBan getInstance(Context context){
        if (databaseRepositoryPhongBan == null){
            databaseRepositoryPhongBan = new DatabaseRepositoryPhongBan(context);
        }
        return  databaseRepositoryPhongBan;
    }

    public Maybe<String> Insertdata(PhongBanEntity phongBanEntity){
        return requestDataPhongBan.insertTenPhongban(phongBanEntity);
    }
    public Completable Deletedata(PhongBanEntity phongBanEntity){
        return requestDataPhongBan.deletePhongban(phongBanEntity);
    }
    public Completable UpdateData(PhongBanEntity phongBanEntity){
        return requestDataPhongBan.updatePhongban(phongBanEntity);

    }
}
