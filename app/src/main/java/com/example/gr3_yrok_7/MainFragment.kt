package com.example.gr3_yrok_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.gr3_yrok_7.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adaptor: Adaptor
    private  var list = arrayListOf<Madel>()

    companion object{
        const val KEY = "key"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.clear()
        loadDatata()

         adaptor = Adaptor(list, this::onClick)
        binding.resalcler.adapter = adaptor

    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.secondFragment, bundleOf(KEY to list[position]))

    }

    private fun loadDatata() {
        list.add(Madel("Rick Sanchez","Alive", R.drawable._image_))
        list.add(Madel("Morty Smith","Alive", R.drawable.image_1))
        list.add(Madel("Albert Einstein","Dead", R.drawable.img_3))
        list.add(Madel("Jerry Smith","Alive",R.drawable.img_2))
    }



}