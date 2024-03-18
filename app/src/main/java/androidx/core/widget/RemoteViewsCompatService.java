package androidx.core.widget;

import H1.r;
import android.content.Intent;
import android.widget.RemoteViewsService;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0007"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "P5/c", "H1/q", "H1/r", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra != -1) {
            int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
            if (intExtra2 != -1) {
                return new r(this, intExtra, intExtra2);
            }
            throw new IllegalStateException("No view id was present in the intent".toString());
        }
        throw new IllegalStateException("No app widget id was present in the intent".toString());
    }
}
