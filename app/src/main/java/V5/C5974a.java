package v5;

import Wh.AbstractC1657b;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.AbstractC4194d;
import o5.EnumC4919c;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* renamed from: v5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5974a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47242a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f47243b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f47244c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47245d;

    /* renamed from: e  reason: collision with root package name */
    public final int f47246e;

    /* renamed from: f  reason: collision with root package name */
    public final Proxy f47247f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC1657b f47248g;

    /* renamed from: h  reason: collision with root package name */
    public final EnumC4919c f47249h;

    /* renamed from: i  reason: collision with root package name */
    public final int f47250i;

    public C5974a(boolean z10, boolean z11, Map map, int i10, int i11, Proxy proxy, AbstractC1657b abstractC1657b, EnumC4919c enumC4919c, int i12) {
        AbstractC2469q0.q("batchSize", i10);
        AbstractC2469q0.q("uploadFrequency", i11);
        AbstractC3557B.c0("site", enumC4919c);
        AbstractC2469q0.q("batchProcessingLevel", i12);
        this.f47242a = z10;
        this.f47243b = z11;
        this.f47244c = map;
        this.f47245d = i10;
        this.f47246e = i11;
        this.f47247f = proxy;
        this.f47248g = abstractC1657b;
        this.f47249h = enumC4919c;
        this.f47250i = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    public static C5974a a(C5974a c5974a, boolean z10, LinkedHashMap linkedHashMap, int i10, int i11, int i12) {
        boolean z11 = c5974a.f47242a;
        if ((i12 & 2) != 0) {
            z10 = c5974a.f47243b;
        }
        boolean z12 = z10;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i12 & 4) != 0) {
            linkedHashMap2 = c5974a.f47244c;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        if ((i12 & 8) != 0) {
            i10 = c5974a.f47245d;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = c5974a.f47246e;
        }
        int i14 = i11;
        Proxy proxy = c5974a.f47247f;
        AbstractC1657b abstractC1657b = c5974a.f47248g;
        c5974a.getClass();
        EnumC4919c enumC4919c = c5974a.f47249h;
        int i15 = c5974a.f47250i;
        c5974a.getClass();
        c5974a.getClass();
        AbstractC3557B.c0("firstPartyHostsWithHeaderTypes", linkedHashMap3);
        AbstractC2469q0.q("batchSize", i13);
        AbstractC2469q0.q("uploadFrequency", i14);
        AbstractC3557B.c0("proxyAuth", abstractC1657b);
        AbstractC3557B.c0("site", enumC4919c);
        AbstractC2469q0.q("batchProcessingLevel", i15);
        return new C5974a(z11, z12, linkedHashMap3, i13, i14, proxy, abstractC1657b, enumC4919c, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5974a)) {
            return false;
        }
        C5974a c5974a = (C5974a) obj;
        if (this.f47242a == c5974a.f47242a && this.f47243b == c5974a.f47243b && AbstractC3557B.K(this.f47244c, c5974a.f47244c) && this.f47245d == c5974a.f47245d && this.f47246e == c5974a.f47246e && AbstractC3557B.K(this.f47247f, c5974a.f47247f) && AbstractC3557B.K(this.f47248g, c5974a.f47248g) && AbstractC3557B.K(null, null) && this.f47249h == c5974a.f47249h && this.f47250i == c5974a.f47250i && AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1;
        boolean z10 = this.f47242a;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i12 * 31;
        boolean z11 = this.f47243b;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        int d10 = AbstractC6708l.d(this.f47246e, AbstractC6708l.d(this.f47245d, AbstractC6463a.f(this.f47244c, (i14 + i11) * 31, 31), 31), 31);
        Proxy proxy = this.f47247f;
        if (proxy == null) {
            i10 = 0;
        } else {
            i10 = proxy.hashCode();
        }
        int hashCode = this.f47248g.hashCode();
        return AbstractC6708l.d(this.f47250i, (this.f47249h.hashCode() + ((hashCode + ((d10 + i10) * 31)) * 961)) * 31, 31);
    }

    public final String toString() {
        return "Core(needsClearTextHttp=" + this.f47242a + ", enableDeveloperModeWhenDebuggable=" + this.f47243b + ", firstPartyHostsWithHeaderTypes=" + this.f47244c + ", batchSize=" + AbstractC4194d.M(this.f47245d) + ", uploadFrequency=" + AbstractC4194d.N(this.f47246e) + ", proxy=" + this.f47247f + ", proxyAuth=" + this.f47248g + ", encryption=null, site=" + this.f47249h + ", batchProcessingLevel=" + AbstractC4194d.L(this.f47250i) + ", persistenceStrategyFactory=null)";
    }
}
