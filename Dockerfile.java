# SPDX-License-Identifier: GPL-2.0

ARG BASE
FROM $BASE

# build-args
ARG BASE
ARG RUN_CMD
ARG BUILD_REPO
ARG BUILD_TIME

COPY --chmod=0555 src/test/$RUN_CMD.sh /test.sh

ENTRYPOINT [ "java" ]

LABEL org.opencontainers.image.base.digest=""
LABEL org.opencontainers.image.base.name="${BASE}"
LABEL org.opencontainers.image.created="${BUILD_TIME}"
LABEL org.opencontainers.image.description="Java JRE Container"
LABEL org.opencontainers.image.title="${RUN_CMD}"
LABEL org.opencontainers.image.url="${BUILD_REPO}"
