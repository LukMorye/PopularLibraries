package ru.gb.vtitov.popularlibraries.dagger.app;


import javax.inject.Singleton;

import dagger.Component;
import ru.gb.vtitov.popularlibraries.dagger.Red;
import ru.gb.vtitov.popularlibraries.dagger.White;

@Singleton
@Component(modules = {AppModule.class})

public interface AppComponent {
	void inject(White white);
	void inject(Red red);


}
