#!/bin/sh
hostname="$(hostname| cut -d' ' -f 1)"

echo "$hostname"
echo 'car starting...'

export LANG=zh_CN.UTF-8
export instanceId=$hostname
java -Dfile.encoding=UTF8 -jar /home/listen/Apps/car-0.0.1-SNAPSHOT.jar