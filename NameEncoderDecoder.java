public class NameEncoderDecoder{

    public String encode(String name){
    return "NOTFORYOU" + name
      .replace("e", "1")
      .replace("u", "2")
      .replace("i", "3")
      .replace("o", "4")
      .replace("a", "5") + "YESNOTFORYOU";
    }  
  
    public String decode(String name){
    return name
      .replace("YESNOTFORYOU", "")
      .replaceFirst("NOTFORYOU", "")
      .replace("1", "e")
      .replace("2", "u")
      .replace("3", "i")
      .replace("4", "o")
      .replace("5", "a");
    }
  
  //Test output
    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
        String encode = names.encode("Crab");
        System.out.println("encode(Crab) = " + encode); //Should be NOTFORYOUCr5bYESNOTFORYOU
     
        String decode = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("decode(NOTFORYOUCr5bYESNOTFORYOU) = " + decode); //Should be Crab
        String decode1 = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("decode(NOTFORYOUNOTFORYOUYESNOTFORYOU) = " + decode1);   //Should be NOTFORYOU
   }
}