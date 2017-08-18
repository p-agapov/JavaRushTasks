package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader result = null;
        try {
            switch (imageType) {
                case BMP:
                    result = new BmpReader();
                    break;
                case JPG:
                    result = new JpgReader();
                    break;
                case PNG:
                    result = new PngReader();
                    break;
            }
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Unknown file format.");
        }

        return result;
    }
}

