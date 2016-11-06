package com.app.eventsapp.core.di.components;

import com.app.eventsapp.MainActivity;
import com.app.eventsapp.core.di.modules.MainActivityModule;
import com.app.eventsapp.core.di.scopes.ActivityScope;

import dagger.Component;

/**
 * Created by Grigory Kalyashov on 30.10.2016.
 */
@ActivityScope
@Component(
        dependencies = EventsAppComponent.class,
        modules = MainActivityModule.class
)
public interface MainActivityComponent
{
    void inject(MainActivity activity);
}