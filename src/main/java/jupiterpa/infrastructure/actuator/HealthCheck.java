package jupiterpa.infrastructure.actuator;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import static org.springframework.boot.actuate.health.Health.*;

@Component
public class HealthCheck implements HealthIndicator, InterfaceHealth {
    private static final Marker TECHNICAL = MarkerFactory.getMarker("TECHNICAL");
	private static final Logger logger = LoggerFactory.getLogger(new HealthCheck().getClass());
	
	Map<String,HealthInfo> health = new HashMap<String,HealthInfo>();
  
    @Override
    public Health health() {
    	boolean h = true;
    	if (health.size() == 0) {
    		return Health.down().withDetail("service", "down").build();
    		
    	} else {
    		for( HealthInfo info: health.values()) {
    			if (info.error == true)
    				h = false;
    		}
    		Builder b; 
    		if (h == true) {
    			b = Health.up();
    		} else {
    			b = Health.down();
    		}
    		for ( HealthInfo info: health.values()) {
    			b = b.withDetail(info.name, info.message);
    		}
    		return b.build();
    	}
    } 
	@Override
	public void setHealth(HealthInfo info) {
		logger.info(TECHNICAL, "Health of {} set to {}",info.getName(), info.getMessage());
		health.put(info.getName(),info);
	}
}