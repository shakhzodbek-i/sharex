package com.king.corp.sharex.di.component;

import com.king.corp.sharex.di.PerService;
import com.king.corp.sharex.di.module.ServiceModule;

import dagger.Component;

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

//    void inject(SyncService service);

}
