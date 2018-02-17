FROM node:7-alpine
WORKDIR /app/
RUN npm install express
COPY app.js .
EXPOSE 3000
CMD ["node", "/app/app.js"]
