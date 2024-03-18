package a7;

import K4.J;
import Z.C1724m0;
import Z.o1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import o1.AbstractC4887b;
import o1.AbstractC4888c;
import o1.AbstractC4889d;
import o1.AbstractC4892g;
import p1.AbstractC5042g;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f23916a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f23917b;

    /* renamed from: c  reason: collision with root package name */
    public final Activity f23918c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f23919d = AbstractC4828h.Z(a(), o1.f22665a);

    /* renamed from: e  reason: collision with root package name */
    public J f23920e;

    public g(String str, Context context, Activity activity) {
        AbstractC3557B.c0("permission", str);
        this.f23916a = str;
        this.f23917b = context;
        this.f23918c = activity;
    }

    public final l a() {
        boolean z10;
        Context context = this.f23917b;
        AbstractC3557B.c0("<this>", context);
        String str = this.f23916a;
        AbstractC3557B.c0("permission", str);
        if (AbstractC5042g.a(context, str) == 0) {
            return k.f23923a;
        }
        Activity activity = this.f23918c;
        AbstractC3557B.c0("<this>", activity);
        AbstractC3557B.c0("permission", str);
        int i10 = AbstractC4892g.f40451b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            z10 = false;
        } else if (i11 >= 32) {
            z10 = AbstractC4889d.a(activity, str);
        } else if (i11 == 31) {
            z10 = AbstractC4888c.b(activity, str);
        } else {
            z10 = AbstractC4887b.c(activity, str);
        }
        return new j(z10);
    }

    public final l b() {
        return (l) this.f23919d.getValue();
    }

    public final void c() {
        this.f23919d.setValue(a());
    }
}
