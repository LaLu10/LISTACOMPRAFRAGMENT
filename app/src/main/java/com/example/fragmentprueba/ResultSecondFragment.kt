package com.example.fragmentprueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentprueba.databinding.FragmentResultSecondBinding
import com.example.fragmentprueba.databinding.FragmentSecondBinding


class ResultSecondFragment : Fragment() {
    private var _binding: FragmentResultSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFragmentResultListener("paquete1"){paquete, datos ->
            val claves =  datos.keySet()
            var total = 0.0
            var lista = "LISTA\n\n"
            for (clave in claves) {
                lista += clave + "\t" + datos.getDouble(clave) + "\n"
                total += datos.getDouble(clave)
            }
            lista += "\n\nTOTAL: $total €"
            binding.tvTotal.text = lista
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

}
