# 使用官方的Java运行时作为基础镜像
FROM openjdk:11-jre-slim

# 将目标文件（如你的jar包）添加到镜像中
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 设置容器中的时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 运行应用
ENTRYPOINT ["java","-jar","/app.jar"]
