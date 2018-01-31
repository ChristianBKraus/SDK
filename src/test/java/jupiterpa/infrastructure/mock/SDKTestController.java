//package jupiterpa.infrastructure.mock;
//
//import org.springframework.context.annotation.Profile;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//
//@RequestMapping(path = SDKTestController.PATH)
//@RestController
//@Api(value="template", description="A template service")
//@Profile("SDK-Test")
//public class SDKTestController {
//    public static final String PATH ="/";
//    
//    public SDKTestEntity entity = new SDKTestEntity("Test");
//    
//    @GetMapping("")
//    @ApiOperation(value = "Get Entity", response = SDKTestEntity.class)
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Successfully retrieved Entity")
//    })
//    public SDKTestEntity get() { 
//    	return entity;
//    }
//    
//    @PostMapping("")
//    @ApiOperation(value = "Store an Entity")
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Updated Successfully")
//    })
//    public void update(@RequestBody SDKTestEntity entity) {
//    	this.entity = entity; 
//    }
//
//}
