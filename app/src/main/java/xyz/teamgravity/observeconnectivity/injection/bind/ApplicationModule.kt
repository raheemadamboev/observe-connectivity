package xyz.teamgravity.observeconnectivity.injection.bind

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.teamgravity.observeconnectivity.core.util.connectivity.ConnectivityObserver
import xyz.teamgravity.observeconnectivity.core.util.connectivity.ConnectivityObserverImp
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun bindConnectivityObserver(connectivityObserverImp: ConnectivityObserverImp): ConnectivityObserver
}