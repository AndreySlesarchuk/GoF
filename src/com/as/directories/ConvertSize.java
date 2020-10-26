package com.as.directories;

public class ConvertSize {

  public ConvertSize() {
  }

  public String getSize(Long size_bytes) {
    String cnt_size;

    double size_kb = size_bytes / 1024;
    double size_mb = size_kb / 1024;
    double size_gb = size_mb / 1024;

    if (size_gb > 0) {
      cnt_size = size_gb + " GB";
    }
    else
      if (size_mb > 0) {
        cnt_size = size_mb + " MB";
      }
      else {
        cnt_size = size_kb + " KB";
      }
    return cnt_size;
  }

}
