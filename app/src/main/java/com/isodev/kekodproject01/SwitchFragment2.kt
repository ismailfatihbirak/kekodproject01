package com.isodev.kekodproject01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isodev.kekodproject01.databinding.FragmentSwitch2Binding

class SwitchFragment2 : Fragment() {
    private lateinit var binding: FragmentSwitch2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSwitch2Binding.inflate(inflater, container, false)


        return binding.root
    }

}