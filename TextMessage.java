public class TextMessage {

    public String textModified = " ";


    TextMessage(){

        //конструктор по умолчанию
    }

    public TextMessage (String intString1){

        this.textModified = intString1;
        String tempString = textModified.replace("fuck", "f**k");
        String tempString3 = tempString.replace("bullshit", "b*****t");
        System.out.println(tempString3);

    }


}
