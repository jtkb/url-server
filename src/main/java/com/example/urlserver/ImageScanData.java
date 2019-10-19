package com.example.urlserver;

import lombok.Value;

import java.util.List;
import java.util.Map;

@Value
public class ImageScanData
{
    private Map<Integer, List<ImageURL>> urls;
}
