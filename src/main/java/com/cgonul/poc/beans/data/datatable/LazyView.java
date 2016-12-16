package com.cgonul.poc.beans.data.datatable;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Component("dtLazyView")
@Scope("view")
public class LazyView {
    private LazyDataModel<Car> lazyModel;

    private Car selectedCar;

    @Autowired
    private CarService service;

    @PostConstruct
    public void init() {
        lazyModel = new LazyCarDataModel(service.createCars(200));
    }

    public LazyDataModel<Car> getLazyModel() {
        return lazyModel;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void editRow(Car carToBeEdited){
        carToBeEdited.setBrand("Edited");
    }
}
