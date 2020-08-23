package com.example.quanlychamcong.database.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.quanlychamcong.database.Entity.NhanVienEntity;
import com.example.quanlychamcong.database.Entity.VieclamEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Dao
public interface RequestDataNhanVien {
    @Query("SELECT * FROM nhanvien")
    Flowable<List<NhanVienEntity>> getListNhanVien();

    @Query("SELECT * FROM nhanvien WHERE idphongbanNhanvien=:idphongbanNhanvien")
    Flowable<List<NhanVienEntity>> timNhanvienTheoPhongban(long idphongbanNhanvien);

    @Insert
    Maybe<Long> insertMSNVNhanVien (NhanVienEntity nhanVienEntity);
    @Insert
    Maybe<String> insertHotenNhanVien (NhanVienEntity nhanVienEntity);

    @Delete
    Completable deleteNhanvien (NhanVienEntity nhanVienEntity);
    @Update
    Completable updateNhanVien (NhanVienEntity nhanVienEntity);



}
