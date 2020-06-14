
public class Teaparty {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	if (isWoman==true) {
        		return "Hello Ms."+name;  
        	}
        	if (isKnighted==true) {
        		return "Hello Sir."+name;
        	}
        	return "Hello "+ name;
        }
}