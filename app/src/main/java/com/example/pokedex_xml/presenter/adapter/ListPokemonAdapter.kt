package com.example.pokedex_xml.presenter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_xml.databinding.FragmentListPokemonBinding
import com.example.pokedex_xml.domain.model.Pokemon

class ListPokemonAdapter(
    private val listPokemon: List<Pokemon>,
    private val clickListener: (position: Int, value: String, view: View) -> Unit
) : RecyclerView.Adapter<ListPokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentListPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = listPokemon.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onItemBind(listPokemon[position])
    }

    inner class ViewHolder(private val binding: FragmentListPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onItemBind(pokemon: Pokemon) {

        }
    }
}

