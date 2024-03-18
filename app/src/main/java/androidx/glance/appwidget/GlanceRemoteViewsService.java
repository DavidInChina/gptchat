package androidx.glance.appwidget;

import Z1.C1757d0;
import Z1.t0;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "P5/c", "Z1/d0", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class GlanceRemoteViewsService extends RemoteViewsService {

    /* renamed from: Y  reason: collision with root package name */
    public static final t0 f25142Y = new t0(0);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        boolean z10;
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra != -1) {
            int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
            if (intExtra2 != -1) {
                String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
                if (stringExtra != null && stringExtra.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (true ^ z10) {
                    return new C1757d0(this, intExtra, intExtra2, stringExtra);
                }
                throw new IllegalStateException("No size info was present in the intent".toString());
            }
            throw new IllegalStateException("No view id was present in the intent".toString());
        }
        throw new IllegalStateException("No app widget id was present in the intent".toString());
    }
}
