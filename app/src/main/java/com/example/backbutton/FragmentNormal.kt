package com.example.backbutton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.example.backbutton.databinding.FragmentNormalBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentNormal : Fragment() {
    lateinit var animation: Animation
    lateinit var binding: FragmentNormalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       this.binding = DataBindingUtil.inflate(inflater,R.layout.fragment_normal,container,false)
        animation = AnimationUtils.loadAnimation(context,R.anim.rotate)
        binding.fragmentImgId.startAnimation(animation)



        return this.binding.root
    }

}
