package com.nguyenhoangthanhan.jokeesingleservingapp.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.nguyenhoangthanhan.jokeesingleservingapp.database.JokeStoriesDatabase
import com.nguyenhoangthanhan.jokeesingleservingapp.models.entities.JokeStory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar
import java.util.Date

class JokeViewModel(application: Application) : AndroidViewModel(application){

    private val TAG = "JokeViewModel_TAG"

    private val jokeStoriesDao = JokeStoriesDatabase.getInstance(application.applicationContext).jokeStoriesDao()

    val jokesToday: LiveData<List<JokeStory>> = jokeStoriesDao.getAllJokesToday()

    init {
        viewModelScope.launch {
            insertAllInitialJokes(initJokes())
            checkStatusToday()
        }
    }

    private suspend fun insertAllInitialJokes(jokes: List<JokeStory>){
        withContext(Dispatchers.IO){
            jokeStoriesDao.insertAllIfNotExist(jokes)
        }
    }

    private fun initJokes(): List<JokeStory>{
        return (mutableListOf<JokeStory>()).also {
            it.add(
                JokeStory(
                    jokeStoryId = 1,
                    jokeContent = "A child asked his father, \"How were people born?\" So his father said, \"Adam and Eve made babies, then their babies became adults and made babies, and so on.\"\n" +
                            "\n" +
                            "The child then went to his mother, asked her the same question and she told him, \"We were monkeys then we evolved to become like we are now.\"\n" +
                            "\n" +
                            "The child ran back to his father and said, \"You lied to me!\" His father replied, \"No, your mom was talking about her side of the family.\"",
                    jokeReviewed = false,
                    jokeTime = Calendar.getInstance().time
                )
            )
            it.add(
                JokeStory(
                    jokeStoryId = 2,
                    jokeContent = "Teacher: \"Kids,what does the chicken give you?\" Student: \"Meat!\" Teacher: \"Very good! Now what does the pig give you?\" Student: \"Bacon!\" Teacher: \"Great! And what does the fat cow give you?\" Student: \"Homework!\"",
                    jokeReviewed = false,
                    jokeTime = Calendar.getInstance().time
                )
            )
            it.add(
                JokeStory(
                    jokeStoryId = 3,
                    jokeContent = "The teacher asked Jimmy, \"Why is your cat at school today Jimmy?\" Jimmy replied crying, \"Because I heard my daddy tell my mommy, 'I am going to eat that pussy once Jimmy leaves for school today!'\"",
                    jokeReviewed = false,
                    jokeTime = Calendar.getInstance().time
                )
            )
            it.add(
                JokeStory(
                    jokeStoryId = 4,
                    jokeContent = "A housewife, an accountant and a lawyer were asked \"How much is 2+2?\" The housewife replies: \"Four!\". The accountant says: \"I think it's either 3 or 4. Let me run those figures through my spreadsheet one more time.\" The lawyer pulls the drapes, dims the lights and asks in a hushed voice, \"How much do you want it to be?\"",
                    jokeReviewed = false,
                    jokeTime = Calendar.getInstance().time
                )
            )
        }
    }

    suspend fun saveJokeStatus(currentJoke: JokeStory?) {
        viewModelScope.launch(Dispatchers.IO) {
            currentJoke?.let {
                it.jokeReviewed = true
                jokeStoriesDao.updateJoke(it)
            }
        }
    }

    private suspend fun checkStatusToday(){
        withContext(Dispatchers.IO) {
            val saveDate: Date? = jokeStoriesDao.getLastDate()
            Log.d(TAG, "saveDate = $saveDate")
            saveDate?.let {
                Log.d(TAG, "saveDate.day = " + saveDate.day)
                Log.d(TAG, "Calendar.getInstance().time.day = " + Calendar.getInstance().time.day)
                if (saveDate.day != Calendar.getInstance().time.day){
                    jokeStoriesDao.refreshJokes(initJokes())
                }
            }
        }
    }

    suspend fun refreshJokes(){
        viewModelScope.launch(Dispatchers.IO) {
            jokeStoriesDao.refreshJokes(initJokes())
        }
    }

    class Factory(val app: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(JokeViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return JokeViewModel(app) as T
            }
            throw IllegalArgumentException("Unable to construct ViewModel")
        }
    }
}