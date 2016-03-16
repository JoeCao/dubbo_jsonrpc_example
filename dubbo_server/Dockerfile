FROM java:8
MAINTAINER Joe Cao <caozupeng@139.com>
ENV REFRESHED_AT 2016-3-14
RUN apt-get -yqq update
RUN apt-get -yqq install net-tools
RUN mkdir -p /opt/app
ADD target/JsonRpcDemo-1.0-SNAPSHOT-assembly.tar.gz /opt/app
COPY dubbo.properties /opt/app/JsonRpcDemo-1.0-SNAPSHOT/conf/
WORKDIR /opt/app/JsonRpcDemo-1.0-SNAPSHOT/bin
VOLUME /opt/app/JsonRpcDemo-1.0-SNAPSHOT/logs
EXPOSE 10881 38081
ENTRYPOINT ["/opt/app/JsonRpcDemo-1.0-SNAPSHOT/bin/start.sh"]
