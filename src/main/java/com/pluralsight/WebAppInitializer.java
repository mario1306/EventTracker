package com.pluralsight;

//public class WebAppInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		WebApplicationContext context = getContext();
//		servletContext.addListener(new ContextLoaderListener(context));
//		ServletRegistration.Dynamic dispatcher = 
//				servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("*.html");
//	}
//
//	private AnnotationConfigWebApplicationContext getContext() {
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//		context.setConfigLocation("com.pluralsight.WebConfig");
//		//context.register(com.pluralsight.WebConfig.class);
//		//context.refresh();
//		return context;
//	}
//
//}
