package CoffeeAndIce.springboot_guice.server.controller;

import javax.servlet.annotation.WebFilter;

import com.google.inject.servlet.GuiceFilter;

@WebFilter
public class SpringAwareGuiceFilter extends GuiceFilter {
	
}
