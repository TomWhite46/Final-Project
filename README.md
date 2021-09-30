# Final-Project
<h2>Contents</h2>
<ol>
<li>Planning</li>
<li>Project Management</li>
<li>Version Control</li>
<li>AWS Architecture</li>
<li>Databases</li>
<li>Backend</li>
<li>Backend Testing</li>
<li>Frontend</li>
<li>DevOps</li>
<li>Project Summary</li>
</ol>


<h2>1) Planning</h2>
<p>The scenario we chose for this project was scenario 1, with the chance of potentially extending to include scenario 3 if there was time.</p>

<p>The first thing we did for our project was to create a list of features based on the brief for the scenario that we have chosen. From this we then organised these features based on MoSCoW methodologies (as shown below). We placed the features which we thought were necessary for the minimum viable product in the ‘Must Have’ column. Then the remaining features were placed under the three remaining columns based on how difficult and time consuming they would be when compared to how much of a positive impact they would have on the end product.</p>

![Moscow](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/MoSCoW%20prioritisation.png)

![MoSCoW2](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/MoSCow%20prioritisation2.png)

The next bit of planning we undertook was to create a couple of wireframe diagrams to figure out what we wanted our front-end application to look like, and to figure out which components we would need to create and which requests we would need to create for the backend.

![Wireframe](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/otherinitialwireframe.png)
 
![WireframeFinal](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/WireframeFinal.png)
 
<p>After we had created our Jira board, we created a risk assessment matrix based on the risks we have identified for the project which would negatively impact the project. This is something which we continuously looked at throughout the project and have amended throughout the project based on any new risks which have become apparent.</p>

<h3>Risk Assessment for 1st Sprint</h3>

![RiskAssessment](https://github.com/TomWhite46/Final-Project/blob/579e01b40ee0f1d23f74ab5467784cd04ace0c69/ReadMe%20pictures/RiskAssessment1.png)



<h3>2nd Risk Assessment (End of 1st Sprint/Start of 2nd)</h3>

![RiskAssessment](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/RiskAssessment2.png)


<h2>2) Project Management</h2>
<p>In order to manage our project, we used Jira Software to create an Agile Scrum Board which is based online. We used this to create tasks based on the features we created based on the brief. We created 4 main Epics (Version Control, Backend, Frontend and DevOps) which the majority of our tasks fell under. We also created user stories based on what we thought the user would want from the application.</p>
<p>Each of the tasks that we created were given a story point estimate which we used to help us judge how much work we had remaining on the project. We also used the prioritisation arrows for these tasks, which were given different priority levels based on the MoSCoW prioritisation list.</p>
<p>We split our stories and tasks up into two sprints, one for the first week and one for the second week. We also assigned tasks to specific members of the team, which allowed us to easily see which parts of the project were being worked on by a specific person.</p>
<h3>Jira Board for Sprint 1</h3> 

![Sprint1](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/example%20of%20sprint%201.png)

<h3>Jira Board for Sprint 2</h3>

![Sprint1](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/Sprint2Readme.png)

<h2>3) Version Control</h2>
<p>For our version control, we used GitHub. By using this, it allowed us to create a private repository with each of us as collaborators, which meant that each of us could push up or pull down each other’s work and make changes where needed. This helped to make the project much more collaborative.</p>
<p>We had the main branch, alongside a dev branch. From the dev branch we had a dev-backend and a dev-frontend branch allowing for members on our team to work in whichever area they needed. We also created another branch off dev-backend while we tried to sort out a lot of the backend as we were having some issues initially. By using this as our version control, it has allowed us to make sure we were all working from the same up-to-date versions of our files and that we always had that online back-up in case we had any issues locally.</p>
<p>Another advantage of using this as our version control, was that if there was a branch merge that needed to happen or was ready to happen, every member of the team is then added as a reviewer to make sure that everyone is happy with this decision. This adds to its usefulness when working as part of a team.</p>

![GitReview](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/GitReviewers.png)

![ReviewApproved](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/GitChangesApproved.png)


<h2>4) AWS Architecture</h2>
<p>AWS offers a broad set of global cloud based products such as: compute, storage, databases, analytics, networking, mobile, developer tools management tools, loT, security and enterprise applications. It also offers:</p>
<ul>
<li>Pay as you go pricing (Multiple options, with ‘Free-Tiers’ available in some areas of AWS)</li>
<li>Instant availability (Available in seconds, can access from anywhere/anytime)</li>
<li>Scalability (Can always scale a project up or down dependent on what’s required)</li>
<li>Data security (Full control over access to any of your instances)</li>
</ul>
<h4>RDS database</h4>
<p>Advantages of AWS RDS:</p>
<ul>
<li>When you buy a server, you get CPU, memory, storage, and IOPS, all bundled together. With Amazon RDS, these are split apart so that you can scale them independently. If you need more CPU, less IOPS, or more storage, you can easily allocate them.</li>

<li>Amazon RDS manages backups, software patching, automatic failure detection, and recovery.</li>

<li>Compatible with MySQL (which is the database service we are most familiar with).</li>

<li>In addition to the security in your database package, you can help control who can access your RDS databases by using AWS Identity and Access Management (IAM) to define users and permissions. You can also help protect your databases by putting them in a virtual private cloud (VPC)</li>
</ul>
<h4>EC2</h4>
<p>For this project, we have used 3 EC2 instances. The first instance is for the RDS database and is the most secure of all of them to prevent unauthorised access. We also then have a manager node and worker node for the swarm that we wanted to deploy the application to.</p>
<h4>Security Groups</h4>
<p>The security groups in AWS allow for us to lock down our infrastructure to only allow the traffic we want to let in. For example, the RDS has a security group that only allows connections from each member of the team from their own IP addresses and from IPs within the VPC that the application is using. This helps to keep that data as secure as possible which is exactly what you want when using data of this nature.</p>

![AWSArchitecture](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/AWSarchitecture.png)

<h2>5) Data Set</h2>
<p>For our RDS database, we used created MySQL database for the tables as we have relational data and that works as a relational database. 
From the tables which were given, these were the tables we decided to add to the RDS:</p>

![ERDDiagram](https://github.com/TomWhite46/Final-Project/blob/dev/ReadMe%20pictures/ERD%20diagram%20for%20database%20tables.png)

<p>From these tables that were added to the RDS, the only ones that weren’t used for this build are the ‘cell_tower’ table and the ‘passport’ table. With the tables we have included, it does mean we can achieve the MVP for scenario 1 by including what we believe to be the most important information about a person.</p>
<p>This is because the ‘cell_tower’ table provides longitude and latitude locations rather than addresses so without the use of a map, the data isn’t all that relevant to the scenario we chose. If we were to expand to scenario 2 however, this data would then become more useful, and as it’s already loaded into the database, we would be able to use that data straight away. </p>
<p>The ‘passport’ table wasn’t used in the end as the crucial information we wanted to include, we could get from elsewhere so there was no need to use that table to gain that information.</p>
<h2>6) Backend</h2>
<p>For the backend of this project, we made a Spring-Boot Maven app using Java as the coding language, and Eclipse as our IDE.</p>
<p>Java as a language is a general purpose, class-based, object orientated programming language. Compared to other languages, such as C#, Java was designed to be simpler and easier to use. This means it’s also easier for us to write, compile, debug and learn than other languages. It’s also a highly compatible language and can work with most devices easier than some languages.</p>
<p>By making this a Spring-Boot Maven project, it meant that a lot of the prerequisites and dependencies we would need as part of the project, we pre-installed and ready to use. With it being a Spring-Boot application too, it meant that the project doesn’t just run through all the code then shut down. It allows you to keep the application running on a live server on whatever port you decide depending on the application-properties files. The only things that can cause it to shutdown are either a manual termination of the app, or an error in the code.</p>
<p>Whilst using J-Unit for the tests however, it does then only run through the tests then shutdown but that is by design.</p>
<h2>7) Backend Testing</h2>
<p>For both the integration tests and the unit tests we used J-Unit as this allowed us to run through the tests individually and resolve any errors that were produced.</p>
<p>For our testing database, we used a H2 database, as it doesn’t persist data. For the integration tests, we created a schema.sql to create and drop the tables between each test, and we created a data.sql file to insert specific data into the table so that we knew exactly what the database would contain at the beginning of each test.</p>
<p>This wasn’t done for the unit tests as we created instances of objects to add to the tables in the temporary H2 database on each run of the test. This meant that the expected data would always be the same for each test. This was done using Mockito as we could then ‘mock’ some objects that would only be available for the duration of the test and could be created on each run of the test.</p>

<h2>8) Front End</h2>
<h4>React</h4>
<p>The use of react for building the frontend allows us to build a single-page application without the need to constantly re-render the page. React will allow you to swap in and out any components you have created depending on what you want to display. This also means the page is much faster to load as it only has to load what’s required each time rather than the whole page in one go.</p>
<p>It also means that it will only make requests to the database through the backend when it’s actually needed rather than all that data being rendered upon loading the page.</p>
<h4>Bootstrap</h4>
<p>Bootstrap allows you to style web pages in a simple but effective way. By assigning your page elements to classes, you can easily just import the styling choices you need from the bootstrap library.</p>
<p>The use of bootstrap makes the web-page for the application look much more professional and clean than using standard CSS styling.</p>

<h2>9) DevOps</h2>
<p>The plan for deployment on the DevOps side was to use Docker swarm. This method of deployment is extremely scalable, allowing it to scale up or down dependent on load. We can create multiple replicas of our services across multiple EC2s which allows us to spread any traffic across these instances. This also means that if one goes down still maintain high availability with others taking on the load until you can spin up new instance, which prevents any sort of downtime.</p>
<h4>Jenkins</h4>
</p>The use of Jenkins, allows us to create a CI Pipeline which will build, test, push and deploy the application to the swarm. We have added the repository for the project to the configuration of the CI Pipeline allowing for polling and with the use of a webhook as a build trigger, it means that as soon as any changes are pushed to the GitHub repo, this will cause Jenkins to go through each stage of the process automatically without any manual input.</p>
<p>Before the webhook though, we added Private SSH key as a credential and set up polling for every 5 minutes until webhook could be created by Tom. We then put Public SSH key into Steph’s GitHub account so that Jenkins can be authenticated to the private repository.</p>
<h4>NGINX</h4>
<p>NGINX is a high performance web server that can be used as a reverse proxy and load balancer among other things. In our case, we have used NGINX as a web server and reverse proxy. This allows us to connect to the application on port 80 as this is the standard HTTP port, rather than the react port or the backend port. The use of a reverse proxy helps to direct the traffic within our private network as the users should not be able to directly access anywhere in that network other than that NGINX server.</p>
<h2>10) Project Summary</h2>
<h4>What went well?</h4> 
<h4>What didn’t go so well?</h4>
<h4>What could we have done differently?</h4>
<h4>What have we learned?</h4>
<h4>What would we do if we had more time?</h4>
-	NGINX could be used as a load balancer at a later date if we need it to.


