package com.example.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationtest.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //Отримуємо повідомлення з Fragment 1
        binding.messageFrag2.text = arguments?.getString("key1")

        //По кліку на кнопку переміуємось на Fragment 1
        binding.btnBackFrag2.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }


        binding.btnNextFrag2.setOnClickListener {

            // Передаємо повідомлення на Fragment 2
            var bundle = Bundle()
            bundle.putString("key2", "Hello fragment3 i am fragment 2")

            //По кліку на кнопку переміуємось на Fragment 1
            (activity as MainActivity).navController
                .navigate(R.id.action_secondFragment_to_thirdFragment, bundle)
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}