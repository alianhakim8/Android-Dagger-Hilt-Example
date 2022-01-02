package id.alian.daggerhiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


// setiap ingin meng-inject dependency menggunakan hilt di activity/fragment/view
// selalu gunakan anotasi @AndroidEntryPoint
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("TestString")
    lateinit var helloWorldString: String

    @Inject
    @Named("Alian")
    lateinit var whoIsMe: String

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Main Activity", "test string from main activity : $helloWorldString")
    }
}