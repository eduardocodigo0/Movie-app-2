package com.eduardocodigo0.mobile.movieapp2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eduardocodigo0.mobile.movieapp2.R
import com.eduardocodigo0.mobile.movieapp2.databinding.FragmentBestMoviesBinding
import com.eduardocodigo0.mobile.movieapp2.databinding.FragmentSplashScreenBinding


class BestMoviesFragment : Fragment() {

    private var _binding: FragmentBestMoviesBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBestMoviesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}