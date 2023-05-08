package com.spring.cloud.divyesh.sample;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.cloud.divyesh.sample.model.SampleRequest;
import com.spring.cloud.divyesh.sample.model.SampleResponse;
import com.spring.cloud.divyesh.sample.service.SampleService;

@Component
public class SampleFunction implements Function<SampleRequest, SampleResponse> {

	@Autowired
    private SampleService sampleService;
    
    @Override
    public SampleResponse apply(SampleRequest sampleRequest) {
    	SampleResponse sampleResponse = new SampleResponse();
    	sampleResponse.setOutput(sampleService.appendMessage(sampleRequest.getInput()));
        return sampleResponse;
    }
}
