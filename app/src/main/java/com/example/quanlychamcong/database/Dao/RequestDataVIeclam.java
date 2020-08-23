package com.example.quanlychamcong.database.Dao;

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

public interface RequestDataVIeclam {
    @Query("SELECT * FROM vieclam WHERE MSNVvieclam=:MSNVvieclam")
    Flowable<List<VieclamEntity>> VieclamChoNhanvien(long MSNVvieclam);

    @Insert
    Maybe<Long> insertVieclam (VieclamEntity vieclamEntity);
    @Insert
    Maybe<String> insertTenVieclam (VieclamEntity vieclamEntity);
    @Delete
    Completable deleteVieclam(VieclamEntity vieclamEntity);
    @Update
    Completable updateVieclam (VieclamEntity vieclamEntity);

}
