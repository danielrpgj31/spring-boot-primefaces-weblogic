# spring-boot-primefaces-weblogic
A sample starter application with spring boot and Prime Faces for a WebLogic server.
You need to deploy the packaged war to a weblogic server which has a version greater or equal to 12_1_3. 
The application has not been designed like a spring boot, run as java application.



```````````````````Connected to server
[2016-11-27 03:24:48,856] Artifact spring-boot-primefaces-weblogic:war exploded: Artifact is being deployed, please wait...
2016-11-27 03:24:50 JRebel: Directory 'C:\apps\mygithub\spring-boot-primefaces-weblogic\target\classes' will be monitored for changes.
2016-11-27 03:24:50 JRebel: Directory 'C:\apps\mygithub\spring-boot-primefaces-weblogic\src\main\webapp' will be monitored for changes.
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default[2]" is now listening on 192.168.1.29:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <WebLogicServer> <BEA-000331> <Started the WebLogic Server Administration Server "AdminServer" for domain "base_domain" running in development mode.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default[1]" is now listening on 10.254.42.4:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default[3]" is now listening on 127.0.0.1:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default[4]" is now listening on 0:0:0:0:0:0:0:1:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default" is now listening on 192.168.128.243:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <Server> <BEA-002613> <Channel "Default[2]" is now listening on 192.168.1.29:7001 for protocols iiop, t3, ldap, snmp, http.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <WebLogicServer> <BEA-000360> <The server started in RUNNING mode.> 
<27-Nov-2016 03:24:50 o'clock EET> <Notice> <WebLogicServer> <BEA-000365> <Server state changed to RUNNING.> 
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/C:/apps/wls12.2.1.0.0/wls12210/wlserver/modules/org.slf4j.jdk14.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [zip:C:/apps/wls12.2.1.0.0/wls12210/user_projects/domains/base_domain/servers/AdminServer/tmp/_WL_user/spring-boot-primefaces-weblogic_war_exploded/ya6n35/war/WEB-INF/lib/logback-classic-1.1.3.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [ch.qos.logback.classic.util.ContextSelectorStaticBinder]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.2.3.RELEASE)

2016-11-27 03:25:03.034  INFO 5592 --- [ (self-tuning)'] o.s.boot.SpringApplication               : Starting application on cgon-hp with PID 5592 (C:\apps\wls12.2.1.0.0\wls12210\user_projects\domains\base_domain\servers\AdminServer\tmp\_WL_user\spring-boot-primefaces-weblogic_war_exploded\ya6n35\war\WEB-INF\lib\spring-boot-1.2.3.RELEASE.jar started by user in C:\apps\wls12.2.1.0.0\wls12210\user_projects\domains\base_domain)
2016-11-27 03:25:03.096  INFO 5592 --- [ (self-tuning)'] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@5d561cb9: startup date [Sun Nov 27 03:25:03 EET 2016]; root of context hierarchy
2016-11-27 03:25:04.921  INFO 5592 --- [ (self-tuning)'] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'beanNameViewResolver': replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter.class]]
2016-11-27 03:25:05.791  INFO 5592 --- [ (self-tuning)'] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2016-11-27 03:25:05.953  INFO 5592 --- [ (self-tuning)'] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2857 ms
2016-11-27 03:25:07.876  INFO 5592 --- [ (self-tuning)'] o.s.b.c.e.ServletRegistrationBean        : Mapping servlet: 'dispatcherServlet' to [/]
2016-11-27 03:25:07.880  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'errorPageFilter' to: [/*]
2016-11-27 03:25:07.881  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'metricFilter' to: [/*]
2016-11-27 03:25:07.882  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'characterEncodingFilter' to: [/*]
2016-11-27 03:25:07.882  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'webRequestLoggingFilter' to: [/*]
2016-11-27 03:25:07.882  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2016-11-27 03:25:07.882  INFO 5592 --- [ (self-tuning)'] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'applicationContextIdFilter' to: [/*]
2016-11-27 03:25:08.199  INFO 5592 --- [ (self-tuning)'] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@5d561cb9: startup date [Sun Nov 27 03:25:03 EET 2016]; root of context hierarchy
2016-11-27 03:25:08.302  INFO 5592 --- [ (self-tuning)'] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2016-11-27 03:25:08.302  INFO 5592 --- [ (self-tuning)'] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[text/html],custom=[]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest)
2016-11-27 03:25:08.337  INFO 5592 --- [ (self-tuning)'] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2016-11-27 03:25:08.338  INFO 5592 --- [ (self-tuning)'] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2016-11-27 03:25:08.393  INFO 5592 --- [ (self-tuning)'] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2016-11-27 03:25:10.229  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.229  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.229  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.230  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.230  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
2016-11-27 03:25:10.230  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.230  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.231  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health],methods=[],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
2016-11-27 03:25:10.231  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.231  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
2016-11-27 03:25:10.231  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.231  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/shutdown],methods=[POST],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.ShutdownMvcEndpoint.invoke()
2016-11-27 03:25:10.232  INFO 5592 --- [ (self-tuning)'] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2016-11-27 03:25:10.252  INFO 5592 --- [ (self-tuning)'] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2016-11-27 03:25:10.267  INFO 5592 --- [ (self-tuning)'] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2016-11-27 03:25:10.347  INFO 5592 --- [ (self-tuning)'] o.s.boot.SpringApplication               : Started application in 8.948 seconds (JVM running for 66.144)
2016-11-27 03:25:13.024  INFO 5592 --- [ (self-tuning)'] .w.PostConstructApplicationEventListener : Running on PrimeFaces 6.0
[2016-11-27 03:25:13,430] Artifact spring-boot-primefaces-weblogic:war exploded: Artifact is deployed successfully
[2016-11-27 03:25:13,430] Artifact spring-boot-primefaces-weblogic:war exploded: Deploy took 24.574 milliseconds
<27-Nov-2016 03:25:32 o'clock EET> <Warning> <javax.faces> <warning.component.uiviewroot_non_serializable_attribute_viewmap> <Setting non-serializable attribute value into ViewMap: (key: basicsBean, value class: com.cgonul.poc.beans.basics.BasicsBean)> 
```````````````````