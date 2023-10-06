package com.iyr.kuit_4thweek

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.iyr.kuit_4thweek.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private val wordList: ArrayList<MyWord> = arrayListOf()

    // 어댑터에 넣는 데이터와 타입이 동일해야 함(ArrayList)
    private var wordAdapter: WordAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // 첫번째로 할 일은 데이터 만들기

        initWords()
        initRecyclerView()
        // wordAdapter 클래스 이용할 차례
    }

    private fun initRecyclerView() {
        wordAdapter = WordAdapter(wordList)
        binding.recyclerView.adapter = wordAdapter
        // 리사이클러뷰의 자체 어댑터를 내가 만든 어댑터와 연결시킴
        binding.recyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        wordAdapter!!.setOnItemClickListener(object : WordAdapter.OnItemClickListener {
            // 널처리 해줌
            override fun onItemClick(myWord: MyWord) {
                Toast.makeText(applicationContext, myWord.text, Toast.LENGTH_SHORT).show()
                    // myWord가 String이라서 그대로 넣을 수 있음
                val intent = Intent(applicationContext, WordActivity::class.java)
                intent.putExtra("key", myWord) // 인텐트에 추가정보 담아 보냄
                startActivity(intent)
            }

        })

    }

    private fun initWords() {
        wordList.addAll( // arrayList와 같은 컬렉션 형태의 자료를 넣어주는 함수
            arrayListOf(
                MyWord("apple", "사과"),
                MyWord("banana", "바나나"),
                MyWord("car", "자동차"),
                MyWord("apple", "사과"),
                MyWord("banana", "바나나"),
                MyWord("car", "자동차"),
                MyWord("apple", "사과"),
                MyWord("banana", "바나나"),
                MyWord("car", "자동차"),
                MyWord("apple", "사과"),
                MyWord("banana", "바나나"),
                MyWord("car", "자동차")
            )
        )
    }
}
