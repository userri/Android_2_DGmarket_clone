package com.iyr.kuit_3rdweek

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iyr.kuit_3rdweek.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("kuit-practice", "secondFragment onCreate")
    }
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        binding.tvSecond.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.fre_right,ThirdFragment()).commit()
        }

        return binding.root

        Log.d("kuit-practice", "Second Fragment onCreate")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("kuit-practice", "Second Fragment onCreateView")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("kuit-practice", "Second Fragment onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("kuit-practice", "Second Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("kuit-practice", "Second Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("kuit-practice", "Second Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("kuit-practice", "Second Fragment onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("kuit-practice", "Second Fragment onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("kuit-practice", "Second Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("kuit-practice", "Second Fragment onDestroy")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("kuit-practice", "Second Fragment onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("kuit-practice", "Second Fragment onDetach")
    }


}