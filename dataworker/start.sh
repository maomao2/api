#!/bin/sh

rm -f tpid

nohup java -jar dataworker-1.0.0.jar > /dev/null 2>&1 &

echo $! > tpid

echo Start Success!