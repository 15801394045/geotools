package org.geotools.data.shapefile;

/**
 * UploadShapefileDataStoreFactory
 *
 * @author ily
 * @create 01 02, 2020
 * @since 1.0.0
 */
public class UploadShapefileDataStoreFactory extends ShapefileDataStoreFactory {

    @Override
    public String getDisplayName() {
        return "上传shapefiles并发布";
    }

    @Override
    public String getDescription() {
        return "通过上传shapefiles的zip压缩包进行发布,注意需要上传的shapefiles需要放到zip的跟目录,zip不能存在文件夹.选择要上传的文件并点击上传";
    }
}
