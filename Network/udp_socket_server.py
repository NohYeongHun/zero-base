import socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server_socket.bind(('127.0.0.1', 9999))
data, addr = server_socket.recvfrom(1024)
print(data.decode(), addr)
server_socket.close()