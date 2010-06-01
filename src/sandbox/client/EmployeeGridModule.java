package sandbox.client;


import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.types.GroupStartOpen;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.layout.VLayout;


public class EmployeeGridModule implements EntryPoint {

	public void onModuleLoad() {

		VLayout layout = new VLayout(15);

		EmployeeDS dataSource = EmployeeDS.getInstance();

		final ListGrid countryGrid = new ListGrid();
		countryGrid.setCanEdit(true);

		countryGrid.setWidth(522);
		countryGrid.setHeight(224);
		countryGrid.setShowAllRecords(true);
		countryGrid.setCellHeight(22);

		countryGrid.setGroupStartOpen(GroupStartOpen.ALL);
		countryGrid.setGroupByField("title");
		countryGrid.setDataSource(dataSource);

		ListGridField fname = new ListGridField("fname");
		ListGridField lname = new ListGridField("lname");
		ListGridField title = new ListGridField("title");
		ListGridField salary = new ListGridField("salary");
		countryGrid.setFields(fname, lname, title, salary);

		countryGrid.setAutoFetchData(true);
		layout.addMember(countryGrid);
		layout.draw();
	}

}
