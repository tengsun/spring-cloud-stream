package st.demo;

import java.util.logging.Logger;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class DemoSinkReceiver {

	private Logger logger = Logger.getLogger(DemoSinkReceiver.class.getName());
	
	@StreamListener(Sink.INPUT)
	public void receive(Object payload) {
		logger.info("Received from stream: " + payload);
	}
	
}
