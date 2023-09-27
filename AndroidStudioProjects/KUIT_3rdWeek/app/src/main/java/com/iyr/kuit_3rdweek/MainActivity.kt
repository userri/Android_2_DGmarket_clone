package com.iyr.kuit_3rdweek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iyr.kuit_3rdweek.databinding.ActivityMainBinding
import com.iyr.kuit_3rdweek.ui.theme.KUIT_3rdWeekTheme

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Fragment 배치 위해선 Fragment 매니저가 필요함
        supportFragmentManager.beginTransaction().replace(R.id.fre_left, FirstFragment()).commit()
        // transaction: 화면전환
        // fre_left라는 아이디를 가진 FrameLayout 영역에 FirstFragment를 넣겠다는 의미
        supportFragmentManager.beginTransaction().replace(R.id.fre_right, SecondFragment()).commit()

    }
}
