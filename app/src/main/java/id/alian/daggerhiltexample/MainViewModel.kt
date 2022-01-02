package id.alian.daggerhiltexample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("HelloWorld")
    private val hello: String,
) : ViewModel() {
    fun printHelloWorld() = hello
}