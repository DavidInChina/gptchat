package Pe;

import U3.l;
import We.C1650a;
import We.E;
import Xe.C1683e;
import Xe.m;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13967a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13968b;

    /* renamed from: c  reason: collision with root package name */
    public final l f13969c;

    /* renamed from: d  reason: collision with root package name */
    public final C1683e f13970d;

    /* renamed from: e  reason: collision with root package name */
    public final m f13971e;

    /* renamed from: f  reason: collision with root package name */
    public final C1650a f13972f;

    /* renamed from: g  reason: collision with root package name */
    public final E f13973g;

    public /* synthetic */ e() {
        this(false, false, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13967a == eVar.f13967a && this.f13968b == eVar.f13968b && AbstractC3557B.K(this.f13969c, eVar.f13969c) && AbstractC3557B.K(this.f13970d, eVar.f13970d) && AbstractC3557B.K(this.f13971e, eVar.f13971e) && AbstractC3557B.K(this.f13972f, eVar.f13972f) && AbstractC3557B.K(this.f13973g, eVar.f13973g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 1;
        boolean z10 = this.f13967a;
        if (z10) {
            z10 = true;
        }
        int i15 = z10 ? 1 : 0;
        int i16 = z10 ? 1 : 0;
        int i17 = i15 * 31;
        boolean z11 = this.f13968b;
        if (!z11) {
            i14 = z11 ? 1 : 0;
        }
        int i18 = (i17 + i14) * 31;
        int i19 = 0;
        l lVar = this.f13969c;
        if (lVar == null) {
            i10 = 0;
        } else {
            i10 = lVar.hashCode();
        }
        int i20 = (i18 + i10) * 31;
        C1683e c1683e = this.f13970d;
        if (c1683e == null) {
            i11 = 0;
        } else {
            i11 = c1683e.hashCode();
        }
        int i21 = (i20 + i11) * 31;
        m mVar = this.f13971e;
        if (mVar == null) {
            i12 = 0;
        } else {
            i12 = mVar.hashCode();
        }
        int i22 = (i21 + i12) * 31;
        C1650a c1650a = this.f13972f;
        if (c1650a == null) {
            i13 = 0;
        } else {
            i13 = c1650a.hashCode();
        }
        int i23 = (i22 + i13) * 31;
        E e10 = this.f13973g;
        if (e10 != null) {
            i19 = e10.hashCode();
        }
        return i23 + i19;
    }

    public final String toString() {
        return "RoomOptions(adaptiveStream=" + this.f13967a + ", dynacast=" + this.f13968b + ", e2eeOptions=" + this.f13969c + ", audioTrackCaptureDefaults=" + this.f13970d + ", videoTrackCaptureDefaults=" + this.f13971e + ", audioTrackPublishDefaults=" + this.f13972f + ", videoTrackPublishDefaults=" + this.f13973g + ')';
    }

    public e(boolean z10, boolean z11, l lVar, C1683e c1683e, m mVar, C1650a c1650a, E e10) {
        this.f13967a = z10;
        this.f13968b = z11;
        this.f13969c = lVar;
        this.f13970d = c1683e;
        this.f13971e = mVar;
        this.f13972f = c1650a;
        this.f13973g = e10;
    }
}
