#!/bin/bash

docker-compose down --remove-orphans --volumes

DB_DIR=$HOME/aksKeycloak_S_P_M_Service/db

if [ -d "${DB_DIR}" ]; then
  sudo rm -rf "${DB_DIR}"
  echo "${DB_DIR}' supprimé !"
else
  echo "${DB_DIR}' non trouvé !"
fi
