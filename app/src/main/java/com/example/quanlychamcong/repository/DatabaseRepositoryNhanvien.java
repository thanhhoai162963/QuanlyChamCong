package com.example.quanlychamcong.repository;

import android.content.Context;

import com.example.quanlychamcong.database.Dao.RequestDataNhanVien;
import com.example.quanlychamcong.database.DatabaseRoom;
import com.example.quanlychamcong.database.Entity.NhanVienEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

public class DatabaseRepositoryNhanvien {
    public static DatabaseRepositoryNhanvien databaseRepositoryNhanvien = null;

    public RequestDataNhanVien requestDataNhanVien;


    public DatabaseRepositoryNhanvien(Context context) {
        this.requestDataNhanVien = DatabaseRoom.getInstance(context).requestDataNhanVien();
    }
    public static DatabaseRepositoryNhanvien getInstance(Context context){
        if (databaseRepositoryNhanvien == null){
            databaseRepositoryNhanvien = new DatabaseRepositoryNhanvien(context);
        }
        return  databaseRepositoryNhanvien;
    }
    public Flowable<List<NhanVienEntity>> getListData(){
        return requestDataNhanVien.getListNhanVien();
    }
    public Maybe<String> Insertdata(NhanVienEntity nhanVienEntity){
        return requestDataNhanVien.insertHotenNhanVien(nhanVienEntity);
    }
    public Completable Deletedata(NhanVienEntity nhanVienEntity){
        return requestDataNhanVien.deleteNhanvien(nhanVienEntity);
    }
    public Completable UpdateData(NhanVienEntity nhanVienEntity){
        return requestDataNhanVien.updateNhanVien(nhanVienEntity);

    }
}
