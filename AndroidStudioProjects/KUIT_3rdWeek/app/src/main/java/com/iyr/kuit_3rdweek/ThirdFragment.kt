package com.iyr.kuit_3rdweek

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iyr.kuit_3rdweek.databinding.FragmentSecondBinding
import com.iyr.kuit_3rdweek.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("kuit-practice", "thirdFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)

        binding.tvThird.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.fre_right,SecondFragment()).commit()
        }

        return binding.root
        Log.d("kuit-practice", "Third Fragment onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("kuit-practice", "Third Fragment onCreateView")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("kuit-practice", "Third Fragment onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("kuit-practice", "Third Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("kuit-practice", "Third Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("kuit-practice", "Third Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("kuit-practice", "Third Fragment onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("kuit-practice", "Third Fragment onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("kuit-practice", "Third Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("kuit-practice", "Third Fragment onDestroy")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("kuit-practice", "Third Fragment onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("kuit-practice", "Third Fragment onDetach")
    }

}