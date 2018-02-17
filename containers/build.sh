#! /bin/sh

docker build -t francescou/dashboard:1.7 dashboard/
docker build -t francescou/humidity:1.0 humidity/
docker build -t francescou/temperature:1.1 temperature/
docker build -t francescou/thermostat:1.3 thermostat/
