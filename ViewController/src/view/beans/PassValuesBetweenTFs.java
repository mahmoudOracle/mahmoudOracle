package view.beans;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class PassValuesBetweenTFs {
    private String countryNameVal;
    private RichInputText countryNameBind;

    public PassValuesBetweenTFs() {
    }

    public void setCountryNameVal(String countryNameVal) {
        System.out.println("Set" + countryNameVal);
        System.out.println("to get the bind" + countryNameBind.getValue());
        this.countryNameVal = countryNameVal;
    }

    public String getCountryNameVal() {
        System.out.println(countryNameVal);
        System.out.println("to get the bind from Get" + countryNameBind.getValue());
        return countryNameVal;
    }

    public void setCountryNameBind(RichInputText countryNameBind) {
        this.countryNameBind = countryNameBind;
    }

    public RichInputText getCountryNameBind() {
        return countryNameBind;
    }
}
