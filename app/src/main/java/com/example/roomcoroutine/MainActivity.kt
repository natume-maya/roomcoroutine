package com.example.roomcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.room.Room
import com.example.roomcoroutine.db.AppDatabase
import com.example.roomcoroutine.repository.PrefectureRepository
import com.example.roomcoroutine.viewmodel.PrefectureViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: PrefectureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(this, AppDatabase::class.java, "worktest").build()
        val dao = db.prefectureDao()
        val repository = PrefectureRepository(dao)
        viewModel = PrefectureViewModel(repository)

        // TODO:RecyclerViewのアダプターなど

        //TODO:viewModel.insert(parseの処理のメソッド)

        viewModel.prefectureList.observe(this, Observer {
            //TODO:RecyclerViewに表示（setItemなどの処理）
        })
    }

//    private fun parse(): List<Prefecture> {
//        val inputStream = this.assets.open("prefecture.json")
//        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
//        var json: String? = ""
//        var str = bufferedReader.readLine()
//        while (str != null) {
//            json += str
//            str = bufferedReader.readLine()
//        }
//        val jsonData = Json.parse<PrefectureParse>(PrefectureParseModel.serializer(), json)
//        return jsonData.map {
//
//        }
//    }
}