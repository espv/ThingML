#!/bin/bash

rm cliStdo.log &> /dev/null

timeout -s SIGINT 5 ./PublishUnpublish/PublishUnpublish > cliStdo.log 2> cliStdr.log&

sleep 5

#printf "Cli stdo:\n\n"
cat cliStdo.log
#printf "\nCli stdr:\n\n"
>&2 cat cliStdr.log