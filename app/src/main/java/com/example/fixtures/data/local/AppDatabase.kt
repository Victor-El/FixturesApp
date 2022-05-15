package com.example.fixtures.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fixtures.DB_NAME
import com.example.fixtures.data.local.entities.MatchEntity

@Database(entities = [MatchEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun fixturesDao(): FixturesDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return if (instance == null) {
                instance = Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME).build()
                instance!!
            } else instance!!
        }
    }
}