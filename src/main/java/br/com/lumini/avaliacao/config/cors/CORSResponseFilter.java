package br.com.lumini.avaliacao.config.cors;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSResponseFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();

		headers.add("Access-Control-Allow-Origin", "http://localhost:4200");
		headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia, token");
		headers.add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		headers.add("Access-Control-Allow-Credentials", "true");
	}

}