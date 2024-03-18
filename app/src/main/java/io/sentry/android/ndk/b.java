package io.sentry.android.ndk;

import Ad.l;
import io.sentry.C3640e;
import io.sentry.EnumC3642e1;
import io.sentry.F0;
import io.sentry.protocol.C;
import io.sentry.r1;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import r.f;

/* loaded from: classes.dex */
public final class b extends F0 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34273a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34274b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.android.ndk.a] */
    public b(r1 r1Var) {
        ?? obj = new Object();
        l.Z0("The SentryOptions object is required.", r1Var);
        this.f34273a = r1Var;
        this.f34274b = obj;
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void a(String str, String str2) {
        try {
            ((NativeScope) this.f34274b).getClass();
            NativeScope.nativeSetTag(str, str2);
        } catch (Throwable th2) {
            this.f34273a.getLogger().b(EnumC3642e1.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.O
    public final void h(C c10) {
        a aVar = this.f34274b;
        try {
            String str = c10.f34471Z;
            String str2 = c10.f34470Y;
            String str3 = c10.f34474j0;
            String str4 = c10.f34472h0;
            ((NativeScope) aVar).getClass();
            NativeScope.nativeSetUser(str, str2, str3, str4);
        } catch (Throwable th2) {
            this.f34273a.getLogger().b(EnumC3642e1.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.F0, io.sentry.O
    public final void i(C3640e c3640e) {
        String str;
        r1 r1Var = this.f34273a;
        try {
            EnumC3642e1 enumC3642e1 = c3640e.f34323k0;
            String str2 = null;
            if (enumC3642e1 != null) {
                str = enumC3642e1.name().toLowerCase(Locale.ROOT);
            } else {
                str = null;
            }
            String K10 = f.K((Date) c3640e.f34318Y.clone());
            Map map = c3640e.f34321i0;
            if (!map.isEmpty()) {
                str2 = r1Var.getSerializer().j(map);
            }
            String str3 = str2;
            a aVar = this.f34274b;
            String str4 = c3640e.f34319Z;
            String str5 = c3640e.f34322j0;
            String str6 = c3640e.f34320h0;
            ((NativeScope) aVar).getClass();
            NativeScope.nativeAddBreadcrumb(str, str4, str5, str6, K10, str3);
        } catch (Throwable th2) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }
}
