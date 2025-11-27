# OnlineVoteSystem_DynamicWeb_v2
Dynamic Web Project ready for Eclipse (Tomcat 9 + JDK 17)

## Setup
1. Import into Eclipse: File -> Import -> Existing Projects into Workspace -> select this folder.
2. Add MySQL Connector: download mysql-connector-java-X.X.X.jar and place it in `WebContent/WEB-INF/lib` OR add it to project Build Path.
3. Run SQL script: `sql/db.sql` to create database & table.
4. Update DB credentials in `src/util/DBConnection.java`.
5. Run on Tomcat 9: Right-click project -> Run As -> Run on Server (if Run on Server missing, ensure project has Dynamic Web Module facet).

## Files included
- src/ (Java packages)
- WebContent/ (JSPs, CSS, WEB-INF)
- sql/db.sql (create database & table)
- .project and .classpath for Eclipse
