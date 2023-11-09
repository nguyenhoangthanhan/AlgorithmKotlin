package com.nguyenhoangthanhan.jokeesingleservingapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.nguyenhoangthanhan.jokeesingleservingapp.R
import com.nguyenhoangthanhan.jokeesingleservingapp.databinding.ActivityMainBinding
import com.nguyenhoangthanhan.jokeesingleservingapp.models.entities.JokeStory
import com.nguyenhoangthanhan.jokeesingleservingapp.viewmodels.JokeViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity_TAG"

    private lateinit var binding:ActivityMainBinding

    private var currentJoke:JokeStory? = null

    private val viewModel: JokeViewModel by lazy {
        ViewModelProvider(this, JokeViewModel.Factory(this.application))[JokeViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        initEvents()
    }

    private fun initView() {
        viewModel.jokesToday.observe(this){
            Log.d(TAG, "LiveData callback!")
            if (!it.isNullOrEmpty()){
                currentJoke = it[0]
                binding.tvJokeContent.text = it[0].jokeContent
                binding.btnFunny.visibility = View.VISIBLE
                binding.btnNotFunny.visibility = View.VISIBLE
                binding.btnClearCookies.visibility = View.GONE
            }
            else{
                binding.tvJokeContent.text = getString(R.string.none_joke)
                binding.btnFunny.visibility = View.GONE
                binding.btnNotFunny.visibility = View.GONE
                binding.btnClearCookies.visibility = View.VISIBLE
            }
        }
    }

    private fun initEvents() {
        binding.btnFunny.setOnClickListener {
            reviewCurrentJoke()
        }
        binding.btnNotFunny.setOnClickListener {
            reviewCurrentJoke()
        }
        binding.btnClearCookies.setOnClickListener {
            lifecycleScope.launch {
                viewModel.refreshJokes()
            }
        }
    }

    private fun reviewCurrentJoke(){
        lifecycleScope.launch {
            viewModel.saveJokeStatus(currentJoke)
        }
    }
}