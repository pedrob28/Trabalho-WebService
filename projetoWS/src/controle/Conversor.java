package controle;

import javax.jws.WebService;

@WebService(endpointInterface = "controle.temperatura")

public class Conversor implements temperatura {


	public float celparaFah(float temp) {
		return (float) ((temp * 1.8) + 32);
	}

	

	public float fahparaCel(float temp) {
		return (temp - 32) * 5 / 9;
	}

}
