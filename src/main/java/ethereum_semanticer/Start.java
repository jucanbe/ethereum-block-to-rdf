package ethereum_semanticer;

import java.io.IOException;
import java.math.BigInteger;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class Start {

	public static Web3jConnector web3j = new Web3jConnector();
	
	public static void main(String[]args) {
		Ethereum_Retriever eth_retr = new Ethereum_Retriever();
		web3j.setConnection(Web3j.build(new HttpService(args[0].toString())));
		try {

			System.out.println(eth_retr.BlockhainExtractor(BigInteger.valueOf(Long.parseLong(args[1].toString()))));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
