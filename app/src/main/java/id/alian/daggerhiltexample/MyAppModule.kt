package id.alian.daggerhiltexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

// digunakan untuk container untuk dependency yang akan di butuhkan aplikasi
@Module
// jadi ini untuk memberitahu hilt untuk digunakan selama aplikasi berjalan
@InstallIn(SingletonComponent::class)
object MyAppModule {

    @Singleton
    @Provides
    @Named("HelloWorld")
    fun provideHelloWorld() = "Hello World"

    @Singleton
    @Provides
    @Named("TestString")
    fun provideTestString() = "This is string we will inject"
}
