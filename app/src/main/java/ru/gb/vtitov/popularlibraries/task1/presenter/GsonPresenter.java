package ru.gb.vtitov.popularlibraries.task1.presenter;

import ru.gb.vtitov.popularlibraries.task1.model.Doomsday;
import ru.gb.vtitov.popularlibraries.task1.model.GsonService;

public class GsonPresenter implements  GsonPresenterInterface {

	private  final GsonViewInterface view;
	private final GsonService service = new GsonService();

	public GsonPresenter(GsonViewInterface view) {
		this.view = view;
	}

	@Override
	public void didStart() {
		view.initViewElements();
	}

	@Override
	public void didTapButotn() {
		Doomsday doomsday = service.getDoomsday();
		view.printDoomsDay(doomsday.timeOfYear, String.valueOf(doomsday.year));

	}
}
