package com.example.customclock.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.customclock.BaseFragment
import com.example.customclock.R
import com.example.customclock.databinding.FragmentTemplateBinding
import com.example.customclock.model.Template

class TemplateFragment : BaseFragment<FragmentTemplateBinding>() {

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTemplateBinding =
        FragmentTemplateBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.clockView1.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }

        binding.clockView2.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }

        binding.clockView3.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }

        binding.clockView4.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }

        binding.clockView5.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }

        binding.clockView6.apply {
            val template = Template(
                baseColor = this.baseColor,
                textColor = this.textColor,
                frameColor = this.frameColor,
                dotsColor = this.dotsColor,
                hourHandColor = this.hourHandColor,
                minuteHandColor = this.minuteHandColor,
                secondHandColor = this.secondHandColor
            )

            this.setOnClickListener {
                moveToMainFragment(template)
            }
        }
    }

    private fun moveToMainFragment(template: Template) {
        val bundle = bundleOf(TEMPLATE to template)
        findNavController().navigate(R.id.action_templateFragment_to_mainFragment, bundle)
    }

    companion object {
        const val TEMPLATE = "template"
    }
}