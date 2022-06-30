package com.example.fragmentprueba

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentprueba.databinding.FragmentFirstBinding
import kotlin.random.Random


@Suppress("UNREACHABLE_CODE")
class FirstFragment : Fragment() {
    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private val dados = arrayOf<Int>(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        _binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root

        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.ivDado1.setOnClickListener {
                val dado1 = (1..6).random()
                val dado2 = (1..6).random()
                binding!!.ivDado1.setImageResource(dados[dado1 -1])
                binding!!.ivDado2.setImageResource(dados[dado2 -1])
                binding!!.tvTotal.text = (dado1 + dado2).toString()


            }
            binding.ivDado2.setOnClickListener {
                val dado1 = (1..6).random()
                val dado2 = (1..6).random()
                binding!!.ivDado1.setImageResource(dados[dado1 -1])
                binding!!.ivDado2.setImageResource(dados[dado2 -1])
                binding!!.tvTotal.text = (dado1 + dado2).toString()


            }

        }
    }


