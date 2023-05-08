package com.spring.cloud.divyesh.sample.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.spring.cloud.divyesh.sample.model.SampleRequest;
import com.spring.cloud.divyesh.sample.model.SampleResponse;

public class SampleHandler extends SpringBootRequestHandler<SampleRequest, SampleResponse> {
}
