package androidx.glance.appwidget.action;

import Gi.e;
import android.app.Activity;
import android.os.Bundle;
import com.pairip.licensecheck3.LicenseClientV3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        super.onCreate(bundle);
        e.E(this, getIntent());
    }
}
