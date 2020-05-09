package _05_vault;

public class Vault {
int secretcode=1234;
public static void main(String[] args) {
	Vault vault=new Vault();
}
public boolean tryCode(int number) {
	if(number==secretcode) {
		return true;
	}
	return false;
}
}
