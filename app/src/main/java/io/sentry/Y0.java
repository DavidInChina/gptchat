package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Y0 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f33888Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f33889Z;

    /* renamed from: h0  reason: collision with root package name */
    public final EnumC3639d1 f33890h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f33891i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Callable f33892j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f33893k0;

    /* renamed from: l0  reason: collision with root package name */
    public Map f33894l0;

    public Y0(EnumC3639d1 enumC3639d1, int i10, String str, String str2, String str3) {
        this.f33890h0 = enumC3639d1;
        this.f33888Y = str;
        this.f33891i0 = i10;
        this.f33889Z = str2;
        this.f33892j0 = null;
        this.f33893k0 = str3;
    }

    public final int a() {
        Callable callable = this.f33892j0;
        if (callable != null) {
            try {
                return ((Integer) callable.call()).intValue();
            } catch (Throwable unused) {
                return -1;
            }
        }
        return this.f33891i0;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        String str = this.f33888Y;
        if (str != null) {
            c3636c1.n("content_type");
            c3636c1.t(str);
        }
        String str2 = this.f33889Z;
        if (str2 != null) {
            c3636c1.n("filename");
            c3636c1.t(str2);
        }
        c3636c1.n("type");
        c3636c1.v(h10, this.f33890h0);
        String str3 = this.f33893k0;
        if (str3 != null) {
            c3636c1.n("attachment_type");
            c3636c1.t(str3);
        }
        c3636c1.n("length");
        c3636c1.q(a());
        Map map = this.f33894l0;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC2469q0.r(this.f33894l0, str4, c3636c1, str4, h10);
            }
        }
        c3636c1.j();
    }

    public Y0(EnumC3639d1 enumC3639d1, V0 v02, String str, String str2, String str3) {
        Ad.l.Z0("type is required", enumC3639d1);
        this.f33890h0 = enumC3639d1;
        this.f33888Y = str;
        this.f33891i0 = -1;
        this.f33889Z = str2;
        this.f33892j0 = v02;
        this.f33893k0 = str3;
    }
}
