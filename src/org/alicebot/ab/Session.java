package org.alicebot.ab;

/**
 * Created by grmrgecko on 12/5/14.
 */
public class Session {
    public String name = MagicStrings.default_Customer_id;
    public History<History> thatHistory= new History<History>("that");
    public History<String> requestHistory=new History<String>("request");
    public History<String> responseHistory=new History<String>("response");
    public History<String> inputHistory=new History<String>("input");

    public Session(String customer) {
        name = customer;
        History<String> contextThatHistory = new History<String>();
        contextThatHistory.add(MagicStrings.default_that);
        thatHistory.add(contextThatHistory);
    }
}
