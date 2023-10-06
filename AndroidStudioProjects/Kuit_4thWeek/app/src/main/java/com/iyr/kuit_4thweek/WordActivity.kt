package com.iyr.kuit_4thweek

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
//import androidx.compose.ui.tooling.data.EmptyGroup.data
//import androidx.compose.ui.tooling.data.EmptyGroup.data
//import androidx.compose.ui.tooling.data.EmptyGroup.data
import com.iyr.kuit_4thweek.R
import com.iyr.kuit_4thweek.databinding.ActivityWordBinding
import com.iyr.kuit_4thweek.databinding.ItemWordsBinding

class WordActivity : AppCompatActivity() {
    lateinit var binding: ActivityWordBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("key", MyWord::class.java)
//                ?: "asdf" // 엘비스 연산자(왼쪽이 널이면 오른쪽 데이터 넣는다)
//        if (data == null) {
//            binding.tvWordContent.text = "asdf" // 데이터 널체크 필요함
//        }
        } else {
            intent.getSerializableExtra("key") as MyWord
        } ?: MyWord("temp", "temp") // 데이터 없으면 임시 데이터 넣음


        binding.tvWordContent.text = data?.meaning
    }
}