package com.cgonul.poc.dateinput;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Date;

@Component("dateBean")
@Scope("view")
public class DateBean {
    private Date startDate;
    private Date endDate;

    public void register() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (!startDate.before(endDate)) {
            endDate = null;
            FacesMessage errorMessage = new FacesMessage("End date must be after start date");
            errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, errorMessage);
        }
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
