package controle;

import javax.xml.ws.Endpoint;

public class Publicador {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/conversor", new Conversor());
	}

}
