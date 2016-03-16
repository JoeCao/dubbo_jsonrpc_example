FROM ubuntu:14.04
MAINTAINER Joe Cao <caozupeng@139.com>
ENV REFRESHED_AT 2016-02-25

#RUN sed -i "s/archive\.ubuntu\.com/mirrors\.163\.com/g" /etc/apt/sources.list
RUN apt-get -yqq update
RUN apt-get -yqq install unzip
RUN mkdir -p /var/lib/tomcat7/webapps/governance/


COPY dubbo-admin-2.5.4-qianmi-1-RELEASE.war /var/lib/tomcat7/webapps/governance.war
WORKDIR /var/lib/tomcat7/webapps/
RUN unzip governance.war -d governance/
ADD dubbo.properties governance/WEB-INF/
VOLUME ["/var/lib/tomcat7/webapps/"]