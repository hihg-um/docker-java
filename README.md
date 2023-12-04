# Docker / Java

Author: Sven-Thorsten Dietrich <sxd1425@miami.edu>

This code is made available under the GPL-2.0 license.
Please see the LICENSE file for details.

This container packages Java and can be used as base
for containers running Java code.

To run a JAR located in the local directory on your system,
execute the following command:

docker run -it -v "/local/path/to/jar:"/app":shared,ro,z \
	hihg-um/${USER}/java /app/
