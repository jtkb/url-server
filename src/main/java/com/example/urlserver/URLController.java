package com.example.urlserver;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class URLController
{
    @GetMapping("/api")
    public ImageScanData getURL()
    {
        return new ImageScanData(getScanData());
    }

    private Map<Integer, List<ImageURL>> getScanData()
    {
        final List<ImageURL> list1 = Arrays.asList(new ImageURL(1, "http://1", "ImageOne"),
                new ImageURL(2, "http://2", "ImageTwo"),
                new ImageURL(3, "http://3", "ImageThree"));
        final List<ImageURL> list2 = Arrays.asList(new ImageURL(4, "http://4", "Imagefour"),
                new ImageURL(5, "http://5", "ImageFive"),
                new ImageURL(6, "http://6", "imageSix"),
                new ImageURL(7, "http://7", "imageSeven"));
        final List<ImageURL> list3 = Arrays.asList(new ImageURL(8, "http://6", "ImageEight"),
                new ImageURL(9, "http://9", "ImageNine"),
                new ImageURL(10, "http://10", "ImageTen"));

        final Map<Integer, List<ImageURL>> scanMap = new HashMap<>(3);
        scanMap.put(0, list1);
        scanMap.put(1, list2);
        scanMap.put(2, list3);

        return scanMap;
    }
}
