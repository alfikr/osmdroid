package org.andnav.osm.tileprovider.tilesource;

import org.andnav.osm.ResourceProxy.string;
import org.andnav.osm.tileprovider.OpenStreetMapTile;

class XYTileSource extends OnlineTileSourceBase {

	XYTileSource(String aName, string aResourceId, int aZoomMinLevel,
			int aZoomMaxLevel, int aTileSizePixels,
			String aImageFilenameEnding, String... aBaseUrl) {
		super(aName, aResourceId, aZoomMinLevel, aZoomMaxLevel,
				aTileSizePixels, aImageFilenameEnding, aBaseUrl);
	}

	@Override
	public String getTileURLString(final OpenStreetMapTile aTile) {
		return getBaseUrl() + aTile.getZoomLevel() + "/" + aTile.getX() + "/"
				+ aTile.getY() + mImageFilenameEnding;
	}
}