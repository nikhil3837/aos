//Slip7.2.b
#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <pwd.h>
#include <grp.h>
#include <time.h>

void print_file_info(const char* filename) {
    struct stat file_stat;
    
    if (stat(filename, &file_stat) == -1) {
        perror("stat");
        exit(EXIT_FAILURE);
    }
    
    // File type
    printf("File type: ");
    if (S_ISREG(file_stat.st_mode))
        printf("Regular file\n");
    else if (S_ISDIR(file_stat.st_mode))
        printf("Directory\n");
    else if (S_ISCHR(file_stat.st_mode))
        printf("Character device\n");
    else if (S_ISBLK(file_stat.st_mode))
        printf("Block device\n");
    else if (S_ISFIFO(file_stat.st_mode))
        printf("FIFO/pipe\n");
    else if (S_ISLNK(file_stat.st_mode))
        printf("Symbolic link\n");
    else if (S_ISSOCK(file_stat.st_mode))
        printf("Socket\n");
    else
        printf("Unknown\n");
    
    // File permissions
    printf("Permissions: ");
    printf((file_stat.st_mode & S_IRUSR) ? "r" : "-");
    printf((file_stat.st_mode & S_IWUSR) ? "w" : "-");
    printf((file_stat.st_mode & S_IXUSR) ? "x" : "-");
    printf((file_stat.st_mode & S_IRGRP) ? "r" : "-");
    printf((file_stat.st_mode & S_IWGRP) ? "w" : "-");
    printf((file_stat.st_mode & S_IXGRP) ? "x" : "-");
    printf((file_stat.st_mode & S_IROTH) ? "r" : "-");
    printf((file_stat.st_mode & S_IWOTH) ? "w" : "-");
    printf((file_stat.st_mode & S_IXOTH) ? "x" : "-");
    printf("\n");
    
    // User and group ID
    struct passwd* user = getpwuid(file_stat.st_uid);
    if (user != NULL) {
        printf("User ID: %s\n", user->pw_name);
    } else {
        printf("User ID: Unknown\n");
    }
    
    struct group* group = getgrgid(file_stat.st_gid);
    if (group != NULL) {
        printf("Group ID: %s\n", group->gr_name);
    } else {
        printf("Group ID: Unknown\n");
    }
    
    // File size
    printf("File size: %ld bytes\n", file_stat.st_size);
    
    // File access and modification times
    printf("Last access time: %s", ctime(&file_stat.st_atime));
    printf("Last modification time: %s", ctime(&file_stat.st_mtime));
}

int main(int argc, char* argv[]) {
    if (argc != 2) {
        printf("Usage: %s <filename>\n", argv[0]);
        return EXIT_FAILURE;
    }
    
    const char* filename = argv[1];
    print_file_info(filename);
    
    return EXIT_SUCCESS;
}
