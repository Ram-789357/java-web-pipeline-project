FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

# Copy compiled static files from Maven target
COPY target/classes/static/ /usr/share/nginx/html/

EXPOSE 80
