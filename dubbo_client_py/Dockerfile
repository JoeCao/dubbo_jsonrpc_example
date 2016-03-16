FROM python:2.7
MAINTAINER Joe Cao <caozupeng@139.com>
ENV REFRESHED_AT 2016-03-16
RUN mkdir -p /opt/client
COPY ./ /opt/client
RUN cd opt/client && pip install -r requirements.txt
WORKDIR /opt/client/
ENTRYPOINT ["python", "client.py"]

