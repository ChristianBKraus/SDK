//package jupiterpa.infrastructure.mock;
//
//import java.net.URI;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Marker;
//import org.slf4j.MarkerFactory;
//import org.springframework.context.annotation.Profile;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//
//import jupiterpa.infrastructure.client.ClientBase;
//
//@Component
//@Profile("SDK-Test")
//public class SDKTestClient extends ClientBase<SDKTestEntity> {
//	private static final Marker TECHNICAL = MarkerFactory.getMarker("TECHNICAL");
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@HystrixCommand(fallbackMethod = "defaultSet")
//	public void set(SDKTestEntity entity) {
//		put("clientName", "/", entity);
//	}
//
//	public void defaultSet(SDKTestEntity entity) {
//		logger.warn(TECHNICAL, "SET for client failed");
//	}
//
//	@Override
//	protected ResponseEntity<SDKTestEntity> _exchange(URI uri, HttpEntity<String> request,
//			Class<SDKTestEntity> classType) {
//		return template.exchange(uri, HttpMethod.GET, request, classType);
//	}
//
//	@Override
//	protected void _put(URI uri, HttpEntity<SDKTestEntity> request) {
//		template.put(uri, request);
//	}
//
//	@Override
//	protected SDKTestEntity _postForObject(URI uri, HttpEntity<SDKTestEntity> request, Class<SDKTestEntity> classType) {
//		return (SDKTestEntity) template.postForObject(uri, request, classType);
//	}
//
//}
