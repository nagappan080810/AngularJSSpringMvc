package com.springmvc.tutorial.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

//@Configuration
public class StaticResourcesHandler extends WebMvcConfigurationSupport {
    
//	@Configuration
//	public static class ImagesConfiguration implements ResourceLoaderAware {
//		
//		private ResourceLoader resourceLoader;
//
//		@Bean
//		public SimpleUrlHandlerMapping imagesHandlerMapping() {
//			SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
//			mapping.setOrder(Integer.MIN_VALUE + 1);
//			mapping.setUrlMap(Collections.singletonMap("**/pages/**",
//					imagesRequestHandler()));
//			return mapping;
//		}
//
//		@Bean
//		public ResourceHttpRequestHandler imagesRequestHandler() {
//			ResourceHttpRequestHandler requestHandler = new ResourceHttpRequestHandler();
//			List<Resource> resources = new ArrayList<Resource>();
//			resources.add(this.resourceLoader.getResource("classpath:/static/"));
//			requestHandler
//					.setLocations(resources);
//			return requestHandler;
//		}
//
//		public void setResourceLoader(ResourceLoader resourceLoader) {
//			this.resourceLoader = resourceLoader;
//		}
//
//	}
}