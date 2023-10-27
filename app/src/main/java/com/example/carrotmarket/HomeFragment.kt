package com.example.carrotmarket

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carrotmarket.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    val product_list = ArrayList<Product>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.ivHomeAlarm.setOnClickListener {
            val intent = Intent(requireContext(), AlarmActivity::class.java)
            startActivity(intent)
        }

        binding.recyclerView.setOnClickListener {
            val intent = Intent(requireContext(), ProductActivity::class.java)
            startActivity(intent)
        }

        initProductList()
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        val productAdapter = ProductAdapter(product_list)
        binding.recyclerView.adapter = productAdapter
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())

        productAdapter.setOnItemClickListener(object : ProductAdapter.OnItemClickListener{
            override fun onItemClick(product: Product) {
                val intent = Intent(requireContext(), ProductActivity::class.java)
                intent.putExtra("product_data", product)
                startActivity(intent)
            }
        })
    }

    private fun initProductList() {
        product_list.add(
            Product(
                R.drawable.btn_minus,
                "곰인형1 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,
                "곰인형2 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,
                "곰인형3 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,
                "곰인형4 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,
                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,

                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,

                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,

                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,

                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )
        product_list.add(
            Product(
                R.drawable.btn_minus,

                "곰인형 팔아요",
                "의정부동",
                "200만원",
                99,
                88
            )
        )

    }

    // Fragment 생명 주기
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        attachProductAdapter()
    }

//    private fun attachProductAdapter() {
//        productAdapter = ProductAdapter(product_list)
//        // TODO: 작성한 어댑터를 binding과 연결하고 layoutManager 등록하기
//
//
//        // TODO : setOnItemClickListener에 제공할 인터페이스를 익명 클래스로 작성하고,  화면 클릭 이벤트 구현하기
////        productAdapter!!.setOnItemClickListener(
////
////        )
//    }







}