package com.as.directories;

/**
 * Created by Andrey Slesarchuk on 10/26/2020.
 */
public class ConvertSize {

  public String getSize(Long sizeBytes) {
    String cntSize;

    long sizeKb = sizeBytes / 1024;
    long sizeMb = sizeKb / 1024;
    long sizeGb = sizeMb / 1024;

    if (sizeGb > 0) {
      cntSize = sizeGb + " GB";
    }
    else
      if (sizeMb > 0) {
        cntSize = sizeMb + " MB";
      }
      else {
        cntSize = sizeKb + " KB";
      }
    return cntSize;
  }

}
