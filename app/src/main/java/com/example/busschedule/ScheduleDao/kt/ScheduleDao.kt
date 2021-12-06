package com.example.busschedule.ScheduleDao.kt

import androidx.room.Dao
import androidx.room.Query
import com.example.busschedule.database.Schedule
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao{
    @Query("select * from schedule order by arrival_time asc")
    fun getAll():Flow<List<Schedule>>


    @Query("SELECT * FROM Schedule WHERE stop_name= :stopName ORDER BY arrival_time asc")
    fun getByStopName(stopName:String):Flow<List<Schedule>>
}