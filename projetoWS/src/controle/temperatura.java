package controle;

import javax.jws.WebMethod;
import javax.jws.WebService;
	
	@WebService
	public interface temperatura {
		
		@WebMethod
		public float celparaFah(float temp);
		
		@WebMethod
		public float fahparaCel(float temp);

}
