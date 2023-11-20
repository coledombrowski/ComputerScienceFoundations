#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>

int main() 
{
    // Open file for writing (create if it doesn't exist)
    int fd = open("file.txt", O_WRONLY | O_CREAT, 0644);
    if (fd == -1) {
        // Handle error
        return -1;
    }

    // Write data to the file
    const char *buffer = "Hello, File I/O!";
    ssize_t bytes_written = write(fd, buffer, strlen(buffer));
    if (bytes_written == -1) {
        // Handle error
        close(fd);
        return -1;
    }

    // Close the file descriptor
    close(fd);

    return 0;
}
