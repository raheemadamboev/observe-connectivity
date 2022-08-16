package xyz.teamgravity.observeconnectivity.injection.provide

import android.app.Application
import android.net.ConnectivityManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.teamgravity.observeconnectivity.core.util.connectivity.ConnectivityObserverImp
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideConnectivityManager(application: Application): ConnectivityManager =
        application.getSystemService(ConnectivityManager::class.java)

    @Provides
    @Singleton
    fun provideConnectivityObserverImp(connectivityManager: ConnectivityManager): ConnectivityObserverImp =
        ConnectivityObserverImp(connectivityManager)
}