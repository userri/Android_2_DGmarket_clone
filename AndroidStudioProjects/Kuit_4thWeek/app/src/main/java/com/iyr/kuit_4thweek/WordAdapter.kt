package com.iyr.kuit_4thweek

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.iyr.kuit_4thweek.databinding.ItemWordsBinding

class WordAdapter(val wordList: ArrayList<MyWord>) :
    RecyclerView.Adapter<WordAdapter.ViewHolder>() {
    // String 타입의 ArrayList인 wordList를 생성자로서 받음
    // RecyclerView 상속받는데, 타입 패러미터로 (만들 예정인)WordAdapter의 ViewHolder를 받음(그 옆에 소괄호 잊지 말것)

    private lateinit var itemClickListener: OnItemClickListener

    interface OnItemClickListener { // 인터페이스 선언, 어댑터에서 선언만 해놓으면 다른데서 구현함

        fun onItemClick(myWord: MyWord)
    }

    // RecyclerView의 Adapter를 상속받음으로써 override 해야하는 3가지 메서드
    inner class ViewHolder(val binding: ItemWordsBinding) : RecyclerView.ViewHolder(binding.root) {
        // onBindViewHolder의 코드 간소화시키기 위해 함수 하나 더 선언
        fun bind(myWord: MyWord) {
            binding.wordTv.text = myWord.text
            // item_words.xml에 있는 텍스트에 접근해서 myWord에 있는 텍스트로 텍스트 변경함
            binding.wordTv.setOnClickListener {
                itemClickListener.onItemClick(myWord)
                // onItemClickListener라는 원래 존재하는 인터페이스를 가져와서 여기서는 itemClickListener라고 이름붙임
                // 그리고 그 아래에 onItemClick이라는 함수를 새로 만들어서 가져다 씀
            }
        }

    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        // 인터페이스를 lateinit var 로 선언했으니 여기서 초기화 해줘야 함
        itemClickListener = onItemClickListener
        // itemClickListener는 private으로 선언되어 있음
        // 외부에서 이 인터페이스를 구현한 것을 다시 여기서 객체화해서(: onItemClickListener)
        // 어댑터에 선언한 itemClickListener라는 변수를 초기화한 다음
        // 받아온 클릭이벤트 정보를 적용하게 됨

    }

    // 그리고 이 뷰 홀더는 RecyclerView를 상속받음
    // 뷰 홀더 객체 생성했고 이는 아이템 뷰 객체를 가지기 위해 아이템 레이아웃을 binding한 것을 생성자로 가짐
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordAdapter.ViewHolder {
        // 뷰 홀더 객체가 생성될 때 하는 작업을 선언
        val binding = ItemWordsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        // 뷰를 객체화 하는 과정
        return ViewHolder(binding) // 뷰 홀더를 반환함
    }

    override fun getItemCount(): Int {
        return wordList.size // 아이템 개수 반환
    }

//    override fun getItemCount(): Int = wordList.size
    // getItemCount 함수는 한줄로 작성해도 무방함

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // 아이템 뷰 관리함. 스크롤할때마다 호출돼서 데이터 교체함
        // 아까 미리 선언해놓은 ViewHolder의 bind 함수를 사용하기 위해 패러미터로 ViewHolder를 받음
        holder.bind(wordList[position])
        // String 값 필요하므로, 어댑터가 받는 ArrayList 형태의 리스트의 데이터를 position으로 받아옴(이는 myWord라는 변수로 받아짐)
    }
}
