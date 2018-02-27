package view.beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.validator.ValidatorException;

import javax.servlet.http.*;


import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class EmpData2Bean {
    private String password;
    private String confirmPassword;
    private RichInputText passInputBind;
    private RichInputText confirmPassInputBind;
    private RichInputText passworInputBind;
    private RichInputText confirmMail;
    private RichInputText mailBind;
    private String msg;
    private RichOutputText outBindToSetVal;

    public EmpData2Bean() {
    }//99999999999999999

    public void setPassword(String password) {
        setMsg("Setting Password");
        this.password = password;
    }

    public String getPassword() {
        setMsg("getting Password");
        outBindToSetVal.setValue(msg);
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }


    public void checkPasswordFieldsData(ActionEvent actionEvent) {
        System.out.println(getPassword().toString() + "  <<< Password & Confirm Pass to String Method >>> " +
                           getConfirmPassword().toString());

        System.out.println(getPassword() + "  <<< Password & Confirm Pass get Properties Values >>> " +
                           getConfirmPassword());

        System.out.println(password + "  <<< Password & Confirm Pass Properts Pure>>> " + confirmPassword);
        if (password.equals(confirmPassword) == true) {
            System.out.println("Values are Equal");
        } else {
            System.out.println("Values are NOT Equal");

        }

        // Add event code here...
    }

    public void setPassInputBind(RichInputText passInputBind) {
        this.passInputBind = passInputBind;
    }

    public RichInputText getPassInputBind() {
        return passInputBind;
    }

    public void setConfirmPassInputBind(RichInputText confirmPassInputBind) {
        this.confirmPassInputBind = confirmPassInputBind;
    }

    public RichInputText getConfirmPassInputBind() {
        return confirmPassInputBind;
    }

    public void checkPssFields(ActionEvent actionEvent) {
        System.out.println("Get Value " + getPassInputBind().getValue());
        System.out.println("Get Local Value " + getPassInputBind().getLocalValue());
        System.out.println("Get Submitted Value " + getPassInputBind().getSubmittedValue()); //  null Value

    }

    public void validatPassAndConfirm(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...




    }

    public void validatePasswordAndConirm(FacesContext facesContext, UIComponent uIComponent, Object object) {
        setMsg("Validating Password");

        String confirmPassword = (String) object;
        String m = (String) getPassworInputBind().getValue(); // Input Text Binding
        System.out.println(m + "  <<<   MMMMMMMMMM"); //m+"  <<<   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM>>>>> ));

        if (m.equals(confirmPassword) == true) {
            System.out.println("Values are Equal");
        } else {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match!", "Passwords do not match!");
            throw new ValidatorException(message);
        }
    }


    // Add event code here...

    /*         if (!confirmPassword.equals(password)) {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match!", "Passwords do not match!");
            throw new ValidatorException(message);
        } */


    public void setPassworInputBind(RichInputText passworInputBind) {
        this.passworInputBind = passworInputBind;
    }

    public RichInputText getPassworInputBind() {
        return passworInputBind;
    }

    public void setConfirmMail(RichInputText confirmMail) {
        this.confirmMail = confirmMail;
    }

    public RichInputText getConfirmMail() {
        return confirmMail;
    }

    public void setMailBind(RichInputText mailBind) {
        this.mailBind = mailBind;
    }

    public RichInputText getMailBind() {
        return mailBind;
    }

    public void validateMail(FacesContext facesContext, UIComponent uIComponent, Object object) {
        setMsg("Validating Mail");
        String confirmMail = (String) object;
        // *** Not Working with ui component*******
        String X = (String) getMailBind().getValue(); // Input Text Binding
        //String X = (String) uIComponent.getAttributes().get("m");

        System.out.println(X + "    <<<   XXXXXXXXXXXX"); //m+"  <<<   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM>>>>> ));
        if (X.equals(confirmMail) == true) {
            System.out.println("Values are Equal");
        } else {
            FacesMessage message =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match!", "Passwords do not match!");
            throw new ValidatorException(message);
        }

    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setOutBindToSetVal(RichOutputText outBindToSetVal) {
        this.outBindToSetVal = outBindToSetVal;
    }

    public RichOutputText getOutBindToSetVal() {
        return outBindToSetVal;
    }

    public void settingCookieValue(ActionEvent actionEvent) {
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance()
                                                                         .getExternalContext()
                                                                         .getResponse();
        Cookie cook = new Cookie("pass", getPassword());
        if (confirmPassword.equals(password)) {
            cook.setMaxAge(60*60);
            response.addCookie(cook);
            System.out.println("Passwords are EQULA");

        } else {
            System.out.println("They Are not Equal");
        }
    }
    }
