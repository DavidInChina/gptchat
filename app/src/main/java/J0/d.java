package J0;

import android.view.ViewStructure;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }
}
