# Pulls the official node base image
FROM node:14.4.0

# Sets our working directory
WORKDIR /app

# Installs app dependencies
COPY package.json ./
RUN npm install

# Adds our app
COPY . ./

# Starts the app
CMD ["npm", "start"]
