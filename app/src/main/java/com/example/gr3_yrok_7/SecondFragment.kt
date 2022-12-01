package com.example.gr3_yrok_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gr3_yrok_7.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding
    lateinit var result: Madel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        result = arguments?.getSerializable(MainFragment.KEY) as Madel
        binding.qtvAliv.text = result.alive
        binding.tvNem.text = result.name
        binding.imgFr.setImageResource(result.image)}

}


