package com.example.navigationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationtest.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnNextFrag1.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }

    companion object {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}