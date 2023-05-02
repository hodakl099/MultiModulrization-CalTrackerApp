package com.example.tracker_data.local.entity

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tracker_data.local.TrackedFoodEntity
import com.example.tracker_data.local.TrackerDao

@Database(
    entities = [TrackedFoodEntity::class],
    version = 1
)
abstract class TrackerDatabase : RoomDatabase() {

    abstract val dao : TrackerDao


}