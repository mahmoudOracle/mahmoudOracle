package view.beans;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class Login {
    private String outPut;
    private String fname;
    private String lname;
    private int mobileNo;
    private String email;
    private Date dob;
    private String securityQuestion;
    private String questionAnswer;
    private String city;
    private String gender;
    private String pass;
    private String confirmPass;
    private String user;
    private RichInputText passField;

    public Login() {
    }
    public String do_Login() {
        
        setOutPut("Buttong Clicked");
        return null;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }

    public String getOutPut() {
        return outPut;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void checkPassword(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
    }

    public void validatePasswordConfirmPass(FacesContext facesContext, UIComponent uIComponent, Object object) {
        String cofPass1 = object.toString();
       // RichInputText passInput = (RichInputText) uIComponent.getAttributes().get("passwordField");
    //RichInputText passInput = (RichInputText) uIComponent.getAttributes().get("pas1");
        RichInputText passInput = (RichInputText) uIComponent.findComponent("it7");
        String p = (String) passInput.getValue();
        String p6 = (String) passInput.getSubmittedValue();
        String p7 = (String) passInput.getSubmittedValue();
        
        String xl = (String) passField.getValue();
        String Mm = (String) passField.getSubmittedValue();
        String v = (String) passField.getLocalValue();

System.out.println("Value Of xl    "+xl +"   Value Of Mm               "+   Mm +"Value Of V is "+ v);
        System.out.println("String Value of Pass Field Password  FOr Find Component SSSSSS      " + p  + " MM     " + p6 +" XX      " + p7 );
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        RichInputText passInput1 = (RichInputText) uIComponent.findComponent("p1");
        String p1 = (String) passInput.getValue();
        System.out.println("String Value of Pass Field Password  FOr Find Component      " + p1);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");


        RichInputText passInput2 = (RichInputText) uIComponent.findComponent("p2");
        String p2 = (String) passInput.getValue();
        System.out.println("String Value of Pass Field Password  FOr Find Component      " + p2);

        RichInputText passInput3 = (RichInputText) uIComponent.findComponent("p3");
        String p3 = (String) passInput.getValue();
        System.out.println("String Value of Pass Field Password  FOr Find Component      " + p3);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");


        RichInputText passInput4 = (RichInputText) uIComponent.findComponent("p4");
        String p4 = (String) passInput.getValue();
        System.out.println("String Value of Pass Field Password  FOr Find Component      " + p4);
        
        


        //        String p = (String) passInput.getSubmittedValue();
        
        String ppFiel = (String) passField.getLocalValue();

        System.out.println("String Value of Local Value of the binding of the input        " + ppFiel);


        String passField1 = pass;

       System.out.println("String Value of Pass Field Password        " + passField1);

   

        System.out.println("getPass     " + cofPass1);
       
       
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");


      //  System.out.println("getPass to String" + getPass().toString());


       
        
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

      //  System.out.println("getConfirmPass to String" + getConfirmPass().toString());

      //  System.out.println("getConfirmPass" + getConfirmPass());

       // System.out.println("String Value of Confirm Pass Field"+cofPass);
        
        
          
          //  if (!cofPass1.equals(passField1)) {
           //   FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match!", "Passwords do not match!");
           //   throw new ValidatorException(message);
          //  }
    }

    public void setPassField(RichInputText passField) {
        this.passField = passField;
    }

    public RichInputText getPassField() {
        return passField;
    }

}
