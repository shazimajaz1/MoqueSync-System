
package com.practice.worddefadmin.get_help;

public class GMailSendMail {
    /*
        @var1: to Address
        @var2: from Address
        @var3: subject text
        @var4: message text
     */
    private String toAddress;
    private String fromAddress;
    private String subjectText;
    private String messageText;

    /*
        Constructor 1: Default Constructor:
        User must set all other fields manually to be able to send the email
     */
    public GMailSendMail(){

    }

    /*
        Constructor 2: All the parameters are provided
        @param: toAddress: String
        @param: fromAddress: String
        @param: subjectText: String
        @param: messageText: String
     */
    public GMailSendMail(String toAddress, String fromAddress, String subjectText, String messageText){
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
        this.subjectText = subjectText;
        this.messageText = messageText;
    }

    /*
        Setters Methods:
     */
    public void setToAddress(String toAddress){
        this.toAddress = toAddress;
    }
    public void setFromAddress(String fromAddress){
        this.fromAddress = fromAddress;
    }
    public void setSubjectText(String subjectText){
        this.subjectText = subjectText;
    }
    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    /*
        This method sends the email once called.
        Before calling this method, it is necessary to ensure
        the user have specified all the fields. The email will not be sent
        without all those fields.
     */
    public void send(){

    }

    /*
        This method sets up a MimeMessage. The GMail Server only allows the messages of Type
        Mime to be sent.
     */
}
