FROM openjdk:11-jre-slim
MAINTAINER jff.org
COPY target/wet-food-cat-shop-product-0.0.1-SNAPSHOT.jar wet-food-cat-shop-product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/wet-food-cat-shop-product-0.0.1-SNAPSHOT.jar"]