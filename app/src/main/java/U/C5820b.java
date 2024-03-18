package u;

import U3.i;
import U3.l;
import android.content.Intent;
import android.os.Bundle;
import y1.AbstractC6495e;

/* renamed from: u.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5820b {

    /* renamed from: c  reason: collision with root package name */
    public Bundle f46322c;

    /* renamed from: a  reason: collision with root package name */
    public final Intent f46320a = new Intent("android.intent.action.VIEW");

    /* renamed from: b  reason: collision with root package name */
    public final i f46321b = new i(2);

    /* renamed from: d  reason: collision with root package name */
    public final int f46323d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f46324e = true;

    public final l a() {
        Intent intent = this.f46320a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            AbstractC6495e.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f46324e);
        intent.putExtras(this.f46321b.o().m());
        Bundle bundle2 = this.f46322c;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f46323d);
        return new l(intent, 1, null);
    }
}
