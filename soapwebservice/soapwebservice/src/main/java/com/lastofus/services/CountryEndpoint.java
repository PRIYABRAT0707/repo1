package com.lastofus.services;

import com.lastofus.repository.CountryRepository;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String namespace="http://spring.io/guides/gs-producing-web-service";
    private final CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository Coun){

        this.countryRepository=Coun;
    }

    @ResponsePayload
    @PayloadRoot(namespace = namespace,localPart = "getCountryRequest")
    public GetCountryResponse getCountryResponse(@RequestPayload GetCountryRequest request){
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }


}
