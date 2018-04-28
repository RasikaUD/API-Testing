package apitesting;

import java.io.IOException;
import java.io.File;
import org.codehaus.jackson.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import org.testng.annotations.Test;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JacksonAPITest {
	
	@Test
	public void testAPIAttributes() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		User user = objectMapper.readValue(new File(System.getProperty("user.dir")+"//testdata/JSONExample.json"),User.class);
		assert user.getAge().equals(27):"User age is wrong";
		assert user.getSpouse().equals("Nancy"):"User age is wrong";
	}

}
