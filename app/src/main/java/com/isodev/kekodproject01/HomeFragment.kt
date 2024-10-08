package com.isodev.kekodproject01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.isodev.kekodproject01.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swEgo.isChecked = true
        setAllOtherSwitchesEnabled(false)
        binding.bottomNav.visibility = View.INVISIBLE
        binding.swEgo.setOnCheckedChangeListener { _, isChecked ->
            setAllOtherSwitchesEnabled(!isChecked)
            resetAllOtherSwitches()
            if (!isChecked){
                binding.bottomNav.visibility = View.VISIBLE
            }else{
                binding.bottomNav.visibility = View.INVISIBLE
            }
        }
        val navController = findNavController()
        binding.bottomNav.setupWithNavController(navController)

        binding.bottomNav.menu.add(0, R.id.homeFragment, 0, getString(R.string.home))
            .setIcon(R.drawable.baseline_home_24)

        setupSwitch(
            binding.sw1,
            R.id.switchFragment1,
            R.string.switch_1,
            R.drawable.baseline_fort_24
        )
        setupSwitch(
            binding.sw2,
            R.id.switchFragment2,
            R.string.switch_2,
            R.drawable.baseline_male_24
        )
        setupSwitch(
            binding.sw3,
            R.id.switchFragment3,
            R.string.switch_3,
            R.drawable.baseline_rocket_24
        )
        setupSwitch(
            binding.sw4,
            R.id.switchFragment4,
            R.string.switch_4,
            R.drawable.baseline_nightlight_24
        )
        setupSwitch(
            binding.sw5,
            R.id.switchFragment5,
            R.string.switch_5,
            R.drawable.baseline_scuba_diving_24
        )
    }

    private fun setAllOtherSwitchesEnabled(enabled: Boolean) {
        binding.sw1.isEnabled = enabled
        binding.sw2.isEnabled = enabled
        binding.sw3.isEnabled = enabled
        binding.sw4.isEnabled = enabled
        binding.sw5.isEnabled = enabled
    }

    private fun resetAllOtherSwitches() {
        binding.sw1.isChecked = false
        binding.sw2.isChecked = false
        binding.sw3.isChecked = false
        binding.sw4.isChecked = false
        binding.sw5.isChecked = false
    }
    private fun setupSwitch(
        switch: CompoundButton,
        fragmentId: Int,
        titleResId: Int,
        iconResId: Int
    ) {
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                if (binding.bottomNav.menu.size() < 5) {
                    binding.bottomNav.menu.add(1, fragmentId, 1, getString(titleResId)).setIcon(iconResId)
                } else {
                    Toast.makeText(
                        binding.root.context,
                        getString(R.string.toast_message),
                        Toast.LENGTH_SHORT
                    ).show()
                    switch.isChecked = false
                }
            } else {
                binding.bottomNav.menu.removeItem(fragmentId)
            }
        }
    }
}