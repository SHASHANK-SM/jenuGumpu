package com.example.jenugumpu.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jenugumpu.models.BusinessEntry

@Database(entities = [BusinessEntry::class], version = 1)
abstract class JenuGumpuDatabase : RoomDatabase() {

    abstract fun businessDao(): BusinessDao

    companion object {
        @Volatile
        private var instance: JenuGumpuDatabase? = null

        fun getDatabase(context: Context): JenuGumpuDatabase {
            return instance ?: synchronized(this) {
                val created = Room.databaseBuilder(
                    context.applicationContext,
                    JenuGumpuDatabase::class.java,
                    "jenugumpu_db"
                ).build()
                instance = created
                created
            }
        }
    }
}
