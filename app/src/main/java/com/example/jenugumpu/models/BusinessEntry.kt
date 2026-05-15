package com.example.jenugumpu.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "business_entries")
data class BusinessEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val amount: Double,
    val note: String
)
