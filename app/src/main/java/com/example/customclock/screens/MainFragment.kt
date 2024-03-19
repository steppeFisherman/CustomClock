package com.example.customclock.screens

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customclock.BaseFragment
import com.example.customclock.databinding.FragmentMainBinding
import com.example.customclock.model.Template

class MainFragment : BaseFragment<FragmentMainBinding>() {
    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentMainBinding =
        FragmentMainBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = if (Build.VERSION.SDK_INT >= 33) {
            arguments?.getParcelable(TemplateFragment.TEMPLATE, Template::class.java)
        } else @Suppress("DEPRECATION") {
            arguments?.getParcelable(TemplateFragment.TEMPLATE)
        }

        if (args != null) {
            binding.clockView.apply {
                baseColor = args.baseColor
                textColor = args.textColor
                frameColor = args.frameColor
                dotsColor = args.dotsColor
                hourHandColor = args.hourHandColor
                minuteHandColor = args.minuteHandColor
                secondHandColor = args.secondHandColor
            }
        }
    }
}