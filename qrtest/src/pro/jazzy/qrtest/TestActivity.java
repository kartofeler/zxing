package pro.jazzy.qrtest;

import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.result.ParsedResultType;

public class TestActivity extends CaptureActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(com.google.zxing.client.android.R.layout.test);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        SurfaceView sv = (SurfaceView) findViewById(com.google.zxing.client.android.R.id.preview_view);
        setCustomContainerRect(sv.getMeasuredWidth(), sv.getMeasuredHeight());
        super.surfaceCreated(holder);
    }

    @Override
    protected void onResultDiscovered(String code, BarcodeFormat barcodeFormat, ParsedResultType resultType) {
        Toast.makeText(TestActivity.this, code, Toast.LENGTH_SHORT).show();
    }

}
