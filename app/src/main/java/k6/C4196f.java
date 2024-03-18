package k6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import p6.C5093a;
import y.AbstractC6463a;
import y6.j;
import z.AbstractC6708l;

/* renamed from: k6.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4196f {

    /* renamed from: a  reason: collision with root package name */
    public final String f37108a;

    /* renamed from: b  reason: collision with root package name */
    public final float f37109b;

    /* renamed from: c  reason: collision with root package name */
    public final float f37110c;

    /* renamed from: d  reason: collision with root package name */
    public final float f37111d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f37112e;

    /* renamed from: f  reason: collision with root package name */
    public final List f37113f;

    /* renamed from: g  reason: collision with root package name */
    public final y6.f f37114g;

    /* renamed from: h  reason: collision with root package name */
    public final j f37115h;

    /* renamed from: i  reason: collision with root package name */
    public final y6.i f37116i;

    /* renamed from: j  reason: collision with root package name */
    public final U5.a f37117j;

    /* renamed from: k  reason: collision with root package name */
    public final U5.a f37118k;

    /* renamed from: l  reason: collision with root package name */
    public final U5.a f37119l;

    /* renamed from: m  reason: collision with root package name */
    public final U5.a f37120m;

    /* renamed from: n  reason: collision with root package name */
    public final U5.a f37121n;

    /* renamed from: o  reason: collision with root package name */
    public final U5.a f37122o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f37123p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f37124q;

    /* renamed from: r  reason: collision with root package name */
    public final int f37125r;

    /* renamed from: s  reason: collision with root package name */
    public final i6.h f37126s;

    /* renamed from: t  reason: collision with root package name */
    public final Map f37127t;

    public C4196f(String str, float f6, float f10, float f11, boolean z10, List list, y6.f fVar, j jVar, y6.i iVar, U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, boolean z11, boolean z12, int i10, i6.h hVar, Map map) {
        AbstractC2469q0.q("vitalsMonitorUpdateFrequency", i10);
        this.f37108a = str;
        this.f37109b = f6;
        this.f37110c = f10;
        this.f37111d = f11;
        this.f37112e = z10;
        this.f37113f = list;
        this.f37114g = fVar;
        this.f37115h = jVar;
        this.f37116i = iVar;
        this.f37117j = aVar;
        this.f37118k = aVar2;
        this.f37119l = aVar3;
        this.f37120m = aVar4;
        this.f37121n = aVar5;
        this.f37122o = aVar6;
        this.f37123p = z11;
        this.f37124q = z12;
        this.f37125r = i10;
        this.f37126s = hVar;
        this.f37127t = map;
    }

    public static C4196f a(C4196f c4196f, float f6, float f10, List list, y6.f fVar, y6.d dVar, C5093a c5093a, boolean z10, int i10) {
        float f11;
        float f12;
        List list2;
        y6.f fVar2;
        j jVar;
        y6.i iVar;
        boolean z11;
        String str = c4196f.f37108a;
        if ((i10 & 2) != 0) {
            f11 = c4196f.f37109b;
        } else {
            f11 = f6;
        }
        float f13 = c4196f.f37110c;
        if ((i10 & 8) != 0) {
            f12 = c4196f.f37111d;
        } else {
            f12 = f10;
        }
        boolean z12 = c4196f.f37112e;
        if ((i10 & 32) != 0) {
            list2 = c4196f.f37113f;
        } else {
            list2 = list;
        }
        if ((i10 & 64) != 0) {
            fVar2 = c4196f.f37114g;
        } else {
            fVar2 = fVar;
        }
        if ((i10 & 128) != 0) {
            jVar = c4196f.f37115h;
        } else {
            jVar = dVar;
        }
        if ((i10 & 256) != 0) {
            iVar = c4196f.f37116i;
        } else {
            iVar = c5093a;
        }
        U5.a aVar = c4196f.f37117j;
        U5.a aVar2 = c4196f.f37118k;
        U5.a aVar3 = c4196f.f37119l;
        U5.a aVar4 = c4196f.f37120m;
        U5.a aVar5 = c4196f.f37121n;
        y6.i iVar2 = iVar;
        U5.a aVar6 = c4196f.f37122o;
        j jVar2 = jVar;
        boolean z13 = c4196f.f37123p;
        if ((i10 & 65536) != 0) {
            z11 = c4196f.f37124q;
        } else {
            z11 = z10;
        }
        int i11 = c4196f.f37125r;
        i6.h hVar = c4196f.f37126s;
        Map map = c4196f.f37127t;
        c4196f.getClass();
        AbstractC3557B.c0("touchTargetExtraAttributesProviders", list2);
        AbstractC3557B.c0("interactionPredicate", fVar2);
        AbstractC3557B.c0("viewEventMapper", aVar);
        AbstractC3557B.c0("errorEventMapper", aVar2);
        AbstractC3557B.c0("resourceEventMapper", aVar3);
        AbstractC3557B.c0("actionEventMapper", aVar4);
        AbstractC3557B.c0("longTaskEventMapper", aVar5);
        AbstractC3557B.c0("telemetryConfigurationMapper", aVar6);
        AbstractC2469q0.q("vitalsMonitorUpdateFrequency", i11);
        AbstractC3557B.c0("sessionListener", hVar);
        AbstractC3557B.c0("additionalConfig", map);
        return new C4196f(str, f11, f13, f12, z12, list2, fVar2, jVar2, iVar2, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, z13, z11, i11, hVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4196f)) {
            return false;
        }
        C4196f c4196f = (C4196f) obj;
        if (AbstractC3557B.K(this.f37108a, c4196f.f37108a) && Float.compare(this.f37109b, c4196f.f37109b) == 0 && Float.compare(this.f37110c, c4196f.f37110c) == 0 && Float.compare(this.f37111d, c4196f.f37111d) == 0 && this.f37112e == c4196f.f37112e && AbstractC3557B.K(this.f37113f, c4196f.f37113f) && AbstractC3557B.K(this.f37114g, c4196f.f37114g) && AbstractC3557B.K(this.f37115h, c4196f.f37115h) && AbstractC3557B.K(this.f37116i, c4196f.f37116i) && AbstractC3557B.K(this.f37117j, c4196f.f37117j) && AbstractC3557B.K(this.f37118k, c4196f.f37118k) && AbstractC3557B.K(this.f37119l, c4196f.f37119l) && AbstractC3557B.K(this.f37120m, c4196f.f37120m) && AbstractC3557B.K(this.f37121n, c4196f.f37121n) && AbstractC3557B.K(this.f37122o, c4196f.f37122o) && this.f37123p == c4196f.f37123p && this.f37124q == c4196f.f37124q && this.f37125r == c4196f.f37125r && AbstractC3557B.K(this.f37126s, c4196f.f37126s) && AbstractC3557B.K(this.f37127t, c4196f.f37127t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f37108a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int e10 = AbstractC6463a.e(this.f37111d, AbstractC6463a.e(this.f37110c, AbstractC6463a.e(this.f37109b, i10 * 31, 31), 31), 31);
        int i13 = 1;
        boolean z10 = this.f37112e;
        if (z10) {
            z10 = true;
        }
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        this.f37114g.getClass();
        int hashCode = (this.f37113f.hashCode() + ((e10 + i14) * 31)) * 961;
        j jVar = this.f37115h;
        if (jVar == null) {
            i11 = 0;
        } else {
            i11 = jVar.hashCode();
        }
        int i16 = (hashCode + i11) * 31;
        y6.i iVar = this.f37116i;
        if (iVar != null) {
            i12 = iVar.hashCode();
        }
        int hashCode2 = this.f37117j.hashCode();
        int hashCode3 = this.f37118k.hashCode();
        int hashCode4 = this.f37119l.hashCode();
        int hashCode5 = this.f37120m.hashCode();
        int hashCode6 = (this.f37122o.hashCode() + ((this.f37121n.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i16 + i12) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z11 = this.f37123p;
        if (z11) {
            z11 = true;
        }
        int i17 = z11 ? 1 : 0;
        int i18 = z11 ? 1 : 0;
        int i19 = (hashCode6 + i17) * 31;
        boolean z12 = this.f37124q;
        if (!z12) {
            i13 = z12 ? 1 : 0;
        }
        return this.f37127t.hashCode() + ((this.f37126s.hashCode() + AbstractC6708l.d(this.f37125r, (i19 + i13) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Configuration(customEndpointUrl=" + this.f37108a + ", sampleRate=" + this.f37109b + ", telemetrySampleRate=" + this.f37110c + ", telemetryConfigurationSampleRate=" + this.f37111d + ", userActionTracking=" + this.f37112e + ", touchTargetExtraAttributesProviders=" + this.f37113f + ", interactionPredicate=" + this.f37114g + ", viewTrackingStrategy=" + this.f37115h + ", longTaskTrackingStrategy=" + this.f37116i + ", viewEventMapper=" + this.f37117j + ", errorEventMapper=" + this.f37118k + ", resourceEventMapper=" + this.f37119l + ", actionEventMapper=" + this.f37120m + ", longTaskEventMapper=" + this.f37121n + ", telemetryConfigurationMapper=" + this.f37122o + ", backgroundEventTracking=" + this.f37123p + ", trackFrustrations=" + this.f37124q + ", vitalsMonitorUpdateFrequency=" + AbstractC2469q0.B(this.f37125r) + ", sessionListener=" + this.f37126s + ", additionalConfig=" + this.f37127t + Separators.RPAREN;
    }
}
