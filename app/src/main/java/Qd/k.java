package Qd;

import com.segment.analytics.kotlin.core.Settings;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public final Object f14621b;

    /* renamed from: c  reason: collision with root package name */
    public final B f14622c;

    /* renamed from: j  reason: collision with root package name */
    public final List f14629j;

    /* renamed from: k  reason: collision with root package name */
    public final Settings f14630k;

    /* renamed from: m  reason: collision with root package name */
    public final String f14632m;

    /* renamed from: n  reason: collision with root package name */
    public final String f14633n;

    /* renamed from: o  reason: collision with root package name */
    public final Wc.d f14634o;

    /* renamed from: a  reason: collision with root package name */
    public final String f14620a = "oai";

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14623d = false;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14624e = true;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14625f = false;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14626g = true;

    /* renamed from: h  reason: collision with root package name */
    public final int f14627h = 20;

    /* renamed from: i  reason: collision with root package name */
    public final int f14628i = 30;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f14631l = false;

    /* renamed from: p  reason: collision with root package name */
    public final wf.k f14635p = null;

    public k(Object obj, String str, String str2) {
        Nd.e eVar = Nd.e.f12794a;
        kf.v vVar = kf.v.f37483Y;
        Settings settings = new Settings();
        Wc.d dVar = new Wc.d(22);
        AbstractC3557B.c0("apiHost", str);
        AbstractC3557B.c0("cdnHost", str2);
        this.f14621b = obj;
        this.f14622c = eVar;
        this.f14629j = vVar;
        this.f14630k = settings;
        this.f14632m = str;
        this.f14633n = str2;
        this.f14634o = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (AbstractC3557B.K(this.f14620a, kVar.f14620a) && AbstractC3557B.K(this.f14621b, kVar.f14621b) && AbstractC3557B.K(this.f14622c, kVar.f14622c) && this.f14623d == kVar.f14623d && this.f14624e == kVar.f14624e && this.f14625f == kVar.f14625f && this.f14626g == kVar.f14626g && this.f14627h == kVar.f14627h && this.f14628i == kVar.f14628i && AbstractC3557B.K(this.f14629j, kVar.f14629j) && AbstractC3557B.K(this.f14630k, kVar.f14630k) && this.f14631l == kVar.f14631l && AbstractC3557B.K(this.f14632m, kVar.f14632m) && AbstractC3557B.K(this.f14633n, kVar.f14633n) && AbstractC3557B.K(this.f14634o, kVar.f14634o) && AbstractC3557B.K(this.f14635p, kVar.f14635p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14620a.hashCode() * 31;
        int i11 = 0;
        Object obj = this.f14621b;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int hashCode2 = (this.f14622c.hashCode() + ((hashCode + i10) * 31)) * 31;
        int i12 = 1;
        boolean z10 = this.f14623d;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (hashCode2 + i13) * 31;
        boolean z11 = this.f14624e;
        if (z11) {
            z11 = true;
        }
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = (i15 + i16) * 31;
        boolean z12 = this.f14625f;
        if (z12) {
            z12 = true;
        }
        int i19 = z12 ? 1 : 0;
        int i20 = z12 ? 1 : 0;
        int i21 = (i18 + i19) * 31;
        boolean z13 = this.f14626g;
        if (z13) {
            z13 = true;
        }
        int i22 = z13 ? 1 : 0;
        int i23 = z13 ? 1 : 0;
        int hashCode3 = (this.f14630k.hashCode() + AbstractC4194d.s(this.f14629j, (((((i21 + i22) * 31) + this.f14627h) * 31) + this.f14628i) * 31, 31)) * 31;
        boolean z14 = this.f14631l;
        if (!z14) {
            i12 = z14 ? 1 : 0;
        }
        int hashCode4 = (this.f14634o.hashCode() + E9.f.v(this.f14633n, E9.f.v(this.f14632m, (hashCode3 + i12) * 31, 31), 31)) * 31;
        wf.k kVar = this.f14635p;
        if (kVar != null) {
            i11 = kVar.hashCode();
        }
        return hashCode4 + i11;
    }

    public final String toString() {
        return "Configuration(writeKey=" + this.f14620a + ", application=" + this.f14621b + ", storageProvider=" + this.f14622c + ", collectDeviceId=" + this.f14623d + ", trackApplicationLifecycleEvents=" + this.f14624e + ", useLifecycleObserver=" + this.f14625f + ", trackDeepLinks=" + this.f14626g + ", flushAt=" + this.f14627h + ", flushInterval=" + this.f14628i + ", flushPolicies=" + this.f14629j + ", defaultSettings=" + this.f14630k + ", autoAddSegmentDestination=" + this.f14631l + ", apiHost=" + this.f14632m + ", cdnHost=" + this.f14633n + ", requestFactory=" + this.f14634o + ", errorHandler=" + this.f14635p + ')';
    }
}
