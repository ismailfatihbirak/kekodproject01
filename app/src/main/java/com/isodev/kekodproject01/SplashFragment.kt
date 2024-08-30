package com.isodev.kekodproject01

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.isodev.kekodproject01.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView = binding.imageView2
        val fadeIn = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
        imageView.startAnimation(fadeIn)

        Handler(Looper.getMainLooper()).postDelayed({
            val navOptions = NavOptions.Builder()
                .setEnterAnim(R.anim.enter_from_right)
                .setExitAnim(R.anim.exit_to_left)
                .setPopUpTo(R.id.splashFragment, true) // Remove splash from back stack
                .build()

            findNavController().navigate(R.id.action_splashFragment_to_homeFragment, null, navOptions)
        }, fadeIn.duration)
    }
}