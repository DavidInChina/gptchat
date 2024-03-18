package androidx.appcompat.view;

import android.content.Context;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements d5.g {

    /* renamed from: a  reason: collision with root package name */
    public Context f24351a;

    @Override // d5.g
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Context context = this.f24351a;
        boolean z10 = true;
        if (context.getResources().getConfiguration().keyboard == 1) {
            z10 = false;
        }
        arrayList.add(new d5.f("mobile_sdk__keyboard", Boolean.valueOf(z10)));
        arrayList.add(new d5.f("mobile_sdk__adb_enabled", Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0))));
        return arrayList;
    }
}
