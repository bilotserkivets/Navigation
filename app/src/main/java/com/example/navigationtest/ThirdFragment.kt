package com.example.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationtest.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //Отримуємо повідомлення з Fragment 2
        binding.messageFrag3.text = arguments?.getString("key2")

        //По кліку на кнопку переміуємось на Fragment 2
        binding.btnBackFrag3.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = ThirdFragment()
    }
}