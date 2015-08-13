package com.joanzapata.pdfview.listener;

import android.graphics.PointF;

/**
 * Created by willb on 13/8/2558.
 */
public interface OnZoomListener {
    void onZoom(float dzoom, PointF pivot);
}
