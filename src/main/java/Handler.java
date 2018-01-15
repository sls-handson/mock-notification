

import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

	private static final Logger LOG = Logger.getLogger(Handler.class);

	@Override
	public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
		BasicConfigurator.configure();

		LOG.info("received: " + input);

		return input;
	}
}
