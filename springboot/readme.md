spring boot 学习

spring boot 的基础组建应用


代码质量：

image:postgres

image:sunarqube


  docker run --name db -e POSTGRES_USER=sonar -e POSTGRES_PASSWORD=sonar -d postgres
  docker run --name sq --link db -e SONARQUBE_JDBC_URL=jdbc:postgresql://db:5432/sonar -p 9000:9000 -d sonarqube

spring boot :

1: class :
	@SpringBootApplication

2: Test:
	@RunWith(SpringRunner.class)
	@SpringBootTest(classes = HelloWorldApplication.class)
	@AutoConfigureMockMvc

	@RunWith(SpringRunner.class)
	@SpringBootTest

3:application.properties

	server.port=8088
	spring.datasource.url=jdbc:mysql://localhost:3307/db_user?characterEncoding=utf8
	spring.datasource.username=root
	spring.datasource.password=123456
	spring.datasource.driver-class-name=com.mysql.jdbc.Driver

	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=true
