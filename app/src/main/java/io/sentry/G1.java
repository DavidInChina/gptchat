package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class G1 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final io.sentry.protocol.s f33787Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f33788Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f33789h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f33790i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f33791j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f33792k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f33793l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f33794m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f33795n0;

    /* renamed from: o0  reason: collision with root package name */
    public Map f33796o0;

    public G1(io.sentry.protocol.s sVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f33787Y = sVar;
        this.f33788Z = str;
        this.f33789h0 = str2;
        this.f33790i0 = str3;
        this.f33791j0 = str4;
        this.f33792k0 = str5;
        this.f33793l0 = str6;
        this.f33794m0 = str7;
        this.f33795n0 = str8;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("trace_id");
        c3636c1.v(h10, this.f33787Y);
        c3636c1.n("public_key");
        c3636c1.t(this.f33788Z);
        String str = this.f33789h0;
        if (str != null) {
            c3636c1.n("release");
            c3636c1.t(str);
        }
        String str2 = this.f33790i0;
        if (str2 != null) {
            c3636c1.n("environment");
            c3636c1.t(str2);
        }
        String str3 = this.f33791j0;
        if (str3 != null) {
            c3636c1.n("user_id");
            c3636c1.t(str3);
        }
        String str4 = this.f33792k0;
        if (str4 != null) {
            c3636c1.n("user_segment");
            c3636c1.t(str4);
        }
        String str5 = this.f33793l0;
        if (str5 != null) {
            c3636c1.n("transaction");
            c3636c1.t(str5);
        }
        String str6 = this.f33794m0;
        if (str6 != null) {
            c3636c1.n("sample_rate");
            c3636c1.t(str6);
        }
        String str7 = this.f33795n0;
        if (str7 != null) {
            c3636c1.n("sampled");
            c3636c1.t(str7);
        }
        Map map = this.f33796o0;
        if (map != null) {
            for (String str8 : map.keySet()) {
                AbstractC2469q0.r(this.f33796o0, str8, c3636c1, str8, h10);
            }
        }
        c3636c1.j();
    }
}
