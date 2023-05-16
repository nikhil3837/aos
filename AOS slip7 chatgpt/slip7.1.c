//Slip7.2.a


#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    int fd;
    off_t offset;
    ssize_t num_written;

    // Open or create a file
    fd = open("file_with_hole.txt", O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (fd == -1) {
        perror("open");
        exit(EXIT_FAILURE);
    }

    // Write data to the beginning of the file
    const char* data1 = "This is the first part of the file.\n";
    num_written = write(fd, data1, strlen(data1));
    if (num_written == -1) {
        perror("write");
        exit(EXIT_FAILURE);
    }

    // Seek to the offset where the hole should be created
    offset = lseek(fd, 1024 * 1024, SEEK_CUR);
    if (offset == -1) {
        perror("lseek");
        exit(EXIT_FAILURE);
    }

    // Write data to the file after the hole
    const char* data2 = "This is the second part of the file.\n";
    num_written = write(fd, data2, strlen(data2));
    if (num_written == -1) {
        perror("write");
        exit(EXIT_FAILURE);
    }

    // Close the file
    if (close(fd) == -1) {
        perror("close");
        exit(EXIT_FAILURE);
    }

    printf("File with hole created successfully.\n");

    return 0;
}



O/P=== File with hole created successfully.

