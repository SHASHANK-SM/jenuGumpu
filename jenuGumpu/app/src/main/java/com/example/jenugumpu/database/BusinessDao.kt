package com.example.jenugumpu.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.jenugumpu.models.BusinessEntry

@Dao
interface BusinessDao {

    @Insert
    suspend fun insert(entry: BusinessEntry)

    @Query("SELECT * FROM business_entries ORDER BY id DESC")
    suspend fun getAll(): List<BusinessEntry>
}
