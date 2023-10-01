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


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onStart() {
        super.onStart()

        binding.homeProduct1.setOnClickListener {
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