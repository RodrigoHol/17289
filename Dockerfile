FROM alpine
EXPOSE 80
RUN apk add nginx  
COPY ./ordinario-ftw /var/lib/nginx/html 
COPY ./rodrigo.conf /etc/nginx/http.d/default.conf
CMD ["nginx", "-g", "daemon off;"]
