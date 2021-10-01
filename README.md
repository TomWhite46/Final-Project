# Final-Project
<h2>Contents</h2>
<ol>
<li>Planning</li>
<li>Project Management</li>
<li>Version Control</li>
<li>AWS Architecture</li>
<li>Data Set</li>
<li>Backend</li>
<li>Backend Testing</li>
<li>Frontend</li>
<li>DevOps</li>
<li>Project Summary</li>
</ol>
<h2>1) Planning</h2>
<p>The scenario we chose for this project was scenario 1, with the chance of potentially extending to include scenario 3 if there was time.</p>
<p>The first thing we did for our project was to create a list of features based on the brief for the scenario that we have chosen. From this we then organised these features based on MoSCoW methodologies (as shown below). We placed the features which we thought were necessary for the minimum viable product in the ‘Must Have’ column. Then the remaining features were placed under the three remaining columns based on how difficult and time consuming they would be when compared to how much of a positive impact they would have on the end product.</p>

![Moscow](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/MoSCoW%20prioritisation.png)

![MoSCoW2](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/MoSCow%20prioritisation2.png)

The next bit of planning we undertook was to create a couple of wireframe diagrams to figure out what we wanted our front-end application to look like, and to figure out which components we would need to create and which requests we would need to create for the backend.
This is the initial wireframe diagram that we created.

![Wireframe](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/otherinitialwireframe.png)

We then worked as a team to try to update this wireframe diagram, and designed a new diagram which we believe is more user friendly than the original diagram and has the data in displayed in a more intuitive layout for the user. 

![WireframeFinal](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/WireframeFinal.png)

<h2>2) Project Management</h2>
<p>In order to manage our project, we used Jira Software to create an Agile Scrum Board which is based online. We used this to create tasks based on the features we created based on the brief. We created 4 main Epics (Version Control, Backend, Frontend and DevOps) which the majority of our tasks fell under. We also created user stories based on what we thought the user would want from the application.</p>
<p>Each of the tasks that we created were given a story point estimate which we used to help us judge how much work they would require, so that we could judge how much we had remaining to do on the project to meet the minimum viable product. We also used the prioritisation arrows for these tasks, which were given different priority levels based on the MoSCoW prioritisation list. Also we tried to make sure that when one task was allocated to a specific person, such as creating the Jenkins Pipeline, that it would be allocated to that specific person, so we could keep a track of how many story points each person needed to complete for the sprints and make sure that the work was spread evenly across the team.</p>
<p>We split our stories and tasks up into two sprints, one for the first week and one for the second week. We also assigned tasks to specific members of the team, which allowed us to easily see which parts of the project were being worked on by a specific person.</p>

<h3>Jira Board for Sprint 1</h3> 

![Sprint1](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/example%20of%20sprint%201.png)

<h3>Jira Board for Sprint 2</h3>

![Sprint1](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/Sprint2Readme.png)
 
<p>After we had created our Jira board, we created a risk assessment matrix based on the risks we have identified for the project which would negatively impact the project. This is something which we continuously looked at throughout the project and have amended throughout the project based on any new risks which have become apparent. Within these risk assessments we identified the risk, its likelihood, who it responsible for the risks, and the control measures we have put in place to help mitigate those risks.</p>

<h3>Risk Assessment for 1st Sprint</h3>

![RiskAssessment](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/RiskAssessment1.png)

<h3>2nd Risk Assessment (End of 1st Sprint/Start of 2nd)</h3>

![RiskAssessment](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/RiskAssessment2.png)

<h2>3) Version Control</h2>
<p>For our version control, we used GitHub. By using this, it allowed us to create a private repository with each of us as collaborators, which meant that each of us could push up or pull down each other’s work and make changes where needed. This helped to make the project much more collaborative.</p>
<p>We had the main branch, alongside a dev branch. From the dev branch we had a dev-backend and a dev-frontend branch allowing for members on our team to work in whichever area they needed. We also created another branch off dev-backend while we tried to sort out a lot of the backend as we were having some issues initially. By using this as our version control, it has allowed us to make sure we were all working from the same up-to-date versions of our files and that we always had that online back-up in case we had any issues locally.</p>
<p>Another advantage of using this as our version control, was that if there was a branch merge that needed to happen or was ready to happen, every member of the team is then added as a reviewer to make sure that everyone is happy with this decision. This adds to its usefulness when working as part of a team.</p>

![GitReview](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/GitReviewers.png)

![ReviewApproved](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/GitChangesApproved.png)

<h2>4) AWS Architecture</h2>
<p>AWS offers a broad set of global cloud based products such as: compute, storage, databases, analytics, networking, mobile, developer tools management tools, loT, security and enterprise applications. It also offers:</p>
<ul>
<li>Pay as you go pricing (Multiple options, with ‘Free-Tiers’ available in some areas of AWS)</li>
<li>Instant availability (Available in seconds, can access from anywhere/anytime)</li>
<li>Scalability (Can always scale a project up or down dependent on what’s required)</li>
<li>Data security (Full control over access to any of your instances)</li>
</ul>
<p> We created a VPC with a CIDR range of 172.10.0.0/16. We then created two subnets, one subnet with a CIDR range of 172.10.1.0/24, this EC2 contains the three EC2 instances which were used for hosting the CI server and Docker. Then the other subnet was used for our RDS database so that it was kept within a different subnet from the EC2 instances. </>
 
<h4>RDS database</h4>
<p>Advantages of AWS RDS:</p>
<ul>
<li>When you buy a server, you get CPU, memory, storage, and IOPS, all bundled together. With Amazon RDS, these are split apart so that you can scale them independently. If you need more CPU, less IOPS, or more storage, you can easily allocate them.</li>
<li>Amazon RDS manages backups, software patching, automatic failure detection, and recovery.</li>
<li>Compatible with MySQL.</li>
 
 <li>Amazon RDS are a Platform as a Service, so they allow you to initially chose the hardware and software, but then AWS manage and maintain the operating system, the virtualiation and the hardware for that database. So it mitigates a lot of the risks which might be involved with having data in one location.</li>
<li>In addition to the security in your database package, you can help control who can access your RDS databases by using AWS Identity and Access Management (IAM) to define users and permissions. You can also help protect your databases by putting them in a virtual private cloud (VPC)</li>
</ul>
<h4>EC2</h4>
<p>For this project, we have used four t2.Medium EC2 instances for this project, which all run Ubuntu 18.04. AAWS maintain the hardware and virtualisation of these EC2 instances, and only require the user to maintain and choose the operating system which is used on the instances. This means that because of the resources available to AWS that they have a high availability in case there is a malfunction which means the hardware for one of the instances isn’t working. The first instance is for the RDS database and is the most secure of all of them to prevent unauthorised access. We also then have a manager node and two worker nodes for the swarm that we wanted to deploy the application to.</p>
<h4>Security Groups</h4>
<p>The security groups in AWS allow for us to lock down our infrastructure to only allow the traffic we want to let in. For example, the RDS has a security group that only allows connections from each member of the team from their own IP addresses and from IPs within the VPC that the application is using. This helps to keep that data as secure as possible which is exactly what you want when using data of this nature.  Each of the subnets we created had a different security group attached which has specific inbound rules set up to allow the flow of traffic through whilst also ensuring that they remain as secure as possible. For example ports for SSH (22), HTTP(80), the frontend port (3000) and Eclipse (8081) were all narrowed down to only allow inbound traffic to the specific IP addresses of the team members. </p>
Here is an diagram of our AWS architecture.

![AWSArchitecture](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/AWSarchitecture.png)

<h2>5) Data Set</h2>
<p>For our RDS database, we used created MySQL database for the tables as we have relational data and that works as a relational database. 
From the tables which were given, these were the tables we decided to add to the RDS:</p>

![ERDDiagram](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/ERD%20diagram%20for%20database%20tables.png)

<p>From these tables that were added to the RDS, the only ones that weren’t used for this build are the ‘cell_tower’ table and the ‘passport’ table. With the tables we have included, it does mean we can achieve the MVP for scenario 1 by including what we believe to be the most important information about a person.</p>
<p>This is because the ‘cell_tower’ table provides longitude and latitude locations rather than addresses so without the use of a map, the data isn’t all that relevant to the scenario we chose. If we were to expand to scenario 2 however, this data would then become more useful, and as it’s already loaded into the database, we would be able to use that data straight away. </p>
<p>The ‘passport’ table wasn’t used in the end as the crucial information we wanted to include, we could get from elsewhere so there was no need to use that table to gain that information.</p>
<p>Due to the sensitive nature of the data which we were provided, we created a log for the data (as shown below). In this log we have commented on where the data has been transferred from, where it is transferred to(and why who), and then the reason the data has been moved. This was an online document which is able to be edited by all members of the team.</p>
 
![MovementOfDataLog](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/Movement%20of%20data%20log.PNG)

<h2>6) Backend</h2>
<p>For the backend of this project, we made a Spring-Boot Maven app using Java as the coding language, and Eclipse as our IDE.</p>
<p>Java as a language is a general purpose, class-based, object orientated programming language. Compared to other languages, such as C#, Java was designed to be simpler and easier to use. This means it’s also easier for us to write, compile, debug and learn than other languages. It’s also a highly compatible language and can work with most devices easier than some languages.</p>
<p>By making this a Spring-Boot Maven project, it meant that a lot of the prerequisites and dependencies we would need as part of the project, we pre-installed and ready to use. With it being a Spring-Boot application too, it meant that the project doesn’t just run through all the code then shut down. It allows you to keep the application running on a live server on whatever port you decide depending on the application-properties files. The only things that can cause it to shutdown are either a manual termination of the app, or an error in the code. By using Spring Boot were able to connect the database, the backend and the frontend effectively within one application, as we were able to connect to the databases, as well as create the HTTP requests for the frontend.</p>
<p>Whilst using J-Unit for the tests however, it does then only run through the tests then shutdown but that is by design.</p>
<h2>7) Backend Testing</h2>
<p>For both the integration tests and the unit tests we used J-Unit as this allowed us to run through the tests individually and resolve any errors that were produced.</p>
<p>For our testing database, we used a H2 database, as it doesn’t persist data. For the integration tests, we created a schema.sql to create and drop the tables between each test, and we created a data.sql file to insert specific data into the table so that we knew exactly what the database would contain at the beginning of each test.</p>
<p>This wasn’t done for the unit tests as we created instances of objects to add to the tables in the temporary H2 database on each run of the test. This meant that the expected data would always be the same for each test. This was done using Mockito as we could then ‘mock’ certain objects when annotated that would only be available for the duration of the test and could be created on each run of the test.</p>
Example of the H2 database. We also used this database in the initial stage of building our backend application to ensure that we had set up the relationships between the database correctly using the annotations on Eclipse.

![H2Database](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/example%20of%20h2%20database.png)

Example of number of tests for the overall backend application (both Integration and Unit tests), and the coverage percentage for the application.

![TotalNumberOfTests](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/TotalTest.PNG)

![TotalTestCoverage](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/TotalTestCoverage.PNG)

<h2>8) Front End</h2>
<h4>React</h4>
<p>The use of react for building the frontend allows us to build a single-page application without the need to constantly re-render the page. React will allow you to swap in and out any components you have created depending on what you want to display. This also means the page is much faster to load as it only has to load what’s required each time rather than the whole page in one go. By using React for our frontend application we were also able to create components which split up the web page into different sections according to their functionality. This allows us to call these components multiple times if we needed to without creating new objects each time. It also means that it will only make requests to the database through the backend when it’s actually needed rather than all that data being rendered upon loading the page.</p>
<p>Also by using React we were able to create a .jsx file, which allows us to use a combination of JavaScript and HTML to create our web page. We then used CSS throughout the webpage to help style the document and ensure that the user interface was able to be easily read and navigated by the user..</p>
<h2>9) DevOps</h2>
<p>The plan for deployment on the DevOps side was to use Docker swarm. This method of deployment is extremely scalable, allowing it to scale up or down dependent on load. We can create multiple replicas of our services across multiple EC2s which allows us to spread any traffic across these instances. This also means that if one of the instances were to fail and go down it would still maintain high availability with others taking on the load until you can spin up new instance, which prevents any sort of downtime. We created three EC2 instances to ensure that the application would be highly available, we had one manager EC2 and two worker EC2's which between them deployed 3 replicas for the backend, frontend and NGINX containers.</p>

![DockerSwarm](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/dockerswarm.png)

<h4>Jenkins</h4>
</p>The use of Jenkins, allows us to create a CI Pipeline which will build, test, push and deploy the application to the swarm. We have added the repository for the project to the configuration of the CI Pipeline allowing for polling and with the use of a webhook as a build trigger, it means that as soon as any changes are pushed to the GitHub repo, this will cause Jenkins to go through each stage of the process automatically without any manual input.</p>
<p>Before the webhook though, we added Private SSH key as a credential and set up polling for every 5 minutes until webhook could be created by Tom. We then put Public SSH key into Steph’s GitHub account so that Jenkins can be authenticated to the private repository.</p>

![JenkinsPipeline](https://github.com/TomWhite46/Final-Project/blob/main/ReadMe%20pictures/JenkinsPipeline.png)

Here is an example of our Jenkins Pipeline completing the build, push and deploy stages from the Jenkinsfile.
<h4>NGINX</h4>
<p>NGINX is a high performance web server that can be used as a reverse proxy and load balancer among other things. In our case, we have used NGINX as a web server and reverse proxy. This allows us to connect to the application on port 80 as this is the standard HTTP port, rather than the React port or the backend port. The use of a reverse proxy helps to direct the traffic within our private network as the users should not be able to directly access anywhere in that network other than that NGINX server.</p>
<h2>10) Project Summary</h2>
<h4>What went well?</h4>
<ul>
<li>Reaching MVP within the timeframe.</li>
<li>Managed to get through most of the project without too many major issues.</li>
<li>Worked well collaboratively in all areas of the project allowing us to split the work evenly.</li>
<li>The use of Jira helped to keep on top of tasks and ensure that the requirements for the MVP was met.</li>
</ul>
<h4>What didn’t go so well?</h4>
<li>We initially struggled with handling requests to the database but we managed to get around these issues and come to a solution.</li>
<li>Data type issues within the data set caused us some problems as we had to reload the data into the RDS a couple of times.</li>
<li>We would have liked a higher level of coverage for our backend testing, as it is currently only at 52% which isn't as high as we would like it to be.</li>
<h4>What could we have done differently?</h4>
<ul>
<li>Create the larger RDS instance from the start to avoid having to recreate and reload a lot of that data in again. (The initial RDS we created was too small for the data we wanted to use)</li>
</ul>
<h4>What have we learned?</h4>
<ul>
<li>As this is our first real project with more than 2 people, we have learnt how to manage what each member of the team should be doing each day and splitting off into sub-teams to work on each element.</li>
<li>This is also the first project where we were able to start completely from scratch as with previous projects we had a lot of previous practice projects that we could use to put elements together quite quickly. So it was a good but more challenging experience to be able to build this one from the ground up.</li>
</ul>
<h4>What would we do if we had more time?</h4>
<ul>
<li>NGINX could be used as a load balancer at a later date if we need it to.</li>
<li>Expansion to include the other scenarios.</li>
<li>Utilise Bootstrap alongside React to help to style the web page</li>
<li>Tabs at the top of the application to separate search types.</li>
<li>Have Google maps overlay showing transaction locations. (Using the Google Maps API would also help with the expansion to include the other 2 scenarios)</li> 
<li>Have Jenkins create artifacts from the CI pipeline of the test results when the Maven application is run</li>
</ul>
