import socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
dest, data = ('127.0.0.1', 9999), 'Hello I am Client'
client_socket.sendto(data.encode(), dest)
client_socket.close()