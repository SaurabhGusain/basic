package basic;
public class Numtoword{
    public static void main(String []args){
        String n="9999";
        String ones[]= new String[] {"zero","one","two","three","four","five","six","seven","eight","nine" };
        String teen[]=new String[] {"ten","eleven","tewlfh","thirteen","fourteen","fivteen","sixteen","seventeen","eightteen","nineteen"};
        String[] ty = new String[] {"",  "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",  "Ninety "}; 

        String word="";
        int len=n.length();
        char ch[]=n.toCharArray();
        if(len==4){
            word=ones[ch[0]-'0']+" Thousand ";
        }
        if(len>=3&& ch[1]!='0'){
             word=word+ones[ch[1]-'0']+" Hundred ";
        }
        if(len>=2){
            if(ch[2]=='1'){
                word=word+teen[ch[3]-'0'];
            }
            else{
                word=word+ty[ch[2]-'0'];
            }  
        }
        if(len>=1 && ch[3]!='0'){
            word=word+ones[ch[3]-'0'];
        }

        System.out.print(word);

    }
}