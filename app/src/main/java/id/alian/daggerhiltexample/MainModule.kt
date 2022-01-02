package id.alian.daggerhiltexample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

// digunakan untuk container untuk dependency yang akan di butuhkan aplikasi
@Module
// jadi ini untuk memberitahu hilt untuk digunakan selama aplikasi berjalan
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("Alian")
    fun provideAlian(
        @ApplicationContext context: Context,
        @Named("HelloWorld") helloWorld: String,
    ) = "$helloWorld - ${context.getString(R.string.string_to_inject)}"
}
