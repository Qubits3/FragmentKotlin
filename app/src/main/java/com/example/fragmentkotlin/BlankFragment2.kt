package com.example.fragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentkotlin.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {

    private lateinit var binding: FragmentBlank2Binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentBlank2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }
}