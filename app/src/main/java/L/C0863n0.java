package L;

import G0.C0571a;
import id.AbstractC3557B;

/* renamed from: L.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0863n0 {

    /* renamed from: g  reason: collision with root package name */
    public static final C0863n0 f10236g = new C0863n0(null, null, 63);

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f10237a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f10238b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f10239c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.k f10240d;

    /* renamed from: e  reason: collision with root package name */
    public final wf.k f10241e;

    /* renamed from: f  reason: collision with root package name */
    public final wf.k f10242f;

    public C0863n0(C0571a c0571a, wf.k kVar, int i10) {
        c0571a = (i10 & 16) != 0 ? null : c0571a;
        kVar = (i10 & 32) != 0 ? null : kVar;
        this.f10237a = null;
        this.f10238b = null;
        this.f10239c = null;
        this.f10240d = null;
        this.f10241e = c0571a;
        this.f10242f = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0863n0)) {
            return false;
        }
        C0863n0 c0863n0 = (C0863n0) obj;
        if (AbstractC3557B.K(this.f10237a, c0863n0.f10237a) && AbstractC3557B.K(this.f10238b, c0863n0.f10238b) && AbstractC3557B.K(this.f10239c, c0863n0.f10239c) && AbstractC3557B.K(this.f10240d, c0863n0.f10240d) && AbstractC3557B.K(this.f10241e, c0863n0.f10241e) && AbstractC3557B.K(this.f10242f, c0863n0.f10242f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        wf.k kVar = this.f10237a;
        if (kVar != null) {
            i10 = kVar.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i10 * 31;
        wf.k kVar2 = this.f10238b;
        if (kVar2 != null) {
            i11 = kVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 31;
        wf.k kVar3 = this.f10239c;
        if (kVar3 != null) {
            i12 = kVar3.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        wf.k kVar4 = this.f10240d;
        if (kVar4 != null) {
            i13 = kVar4.hashCode();
        } else {
            i13 = 0;
        }
        int i19 = (i18 + i13) * 31;
        wf.k kVar5 = this.f10241e;
        if (kVar5 != null) {
            i14 = kVar5.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (i19 + i14) * 31;
        wf.k kVar6 = this.f10242f;
        if (kVar6 != null) {
            i15 = kVar6.hashCode();
        }
        return i20 + i15;
    }
}
