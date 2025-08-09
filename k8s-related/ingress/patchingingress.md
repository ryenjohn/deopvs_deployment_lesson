## Update nginx configuration for our clusters 

1. Access your dashboard first 
2. Edit the ingress configurations 


```bash 
F0809 07:03:09.996013       8 main.go:64] flags --publish-service and --publish-status-address are mutually exclusive
```

```bash
- '--watch-ingress-without-class=true'
- '--publish-status-address=10.128.0.15,10.140.0.2'
# comment the --public-service part 
```
