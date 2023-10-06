package com.example.carrotmarket

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carrotmarket.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    //기능추가
//    binding.recyclerView.setOnClickListener {
//        val intent = Intent(requireContext(), ProductActivity::class.java)
//        startActivity(intent)
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val product_list = ArrayList<Product>()

        product_list.add(
            Product(
                R.drawable.bear,
                "귀여운 곰",
                "bear1",
                "5만원",
                99,
                99
            )
        )
        product_list.add(
            Product(
                "맛있는 당근",
                "carrot1",
                "3만원",
                9,
                9
            )
        )

        product_list.add(
            Product(
                "맛있는 당근",
                "carrot1",
                "3만원",
                9,
                9
            )
        )


        return binding.root
    }




    override fun onStart() {
        super.onStart()

        binding.recyclerView.setOnClickListener {
            activity?.let{
                val intent = Intent(context, ProductActivity::class.java)
                startActivity(intent)
            }
        }


        binding.alarmIcon.setOnClickListener {
            activity?.let{
                val intent = Intent(context, AlarmActivity::class.java)
                startActivity(intent)
            }
        }

        val floatingActionButton: FloatingActionButton

        var fab = binding.fab
        fab.setOnClickListener {
            val intent =
                Intent(activity, PostActivity::class.java) //fragment라서 activity intent와는 다른 방식
            startActivity(intent)
        }
    }





}