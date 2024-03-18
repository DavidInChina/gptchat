package L;

import id.AbstractC3557B;
import nf.AbstractC4828h;
import q1.AbstractC5260f;

/* renamed from: L.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0865o0 {

    /* renamed from: e  reason: collision with root package name */
    public static final C0865o0 f10254e = new C0865o0(0, 0, 31);

    /* renamed from: a  reason: collision with root package name */
    public final int f10255a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10256b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10257c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10258d;

    public /* synthetic */ C0865o0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, true, 1, (i12 & 8) != 0 ? 1 : i11);
    }

    public static C0865o0 a(int i10, int i11, int i12) {
        C0865o0 c0865o0 = f10254e;
        if ((i12 & 1) != 0) {
            i10 = c0865o0.f10255a;
        }
        if ((i12 & 4) != 0) {
            i11 = c0865o0.f10257c;
        }
        return new C0865o0(i10, c0865o0.f10256b, i11, c0865o0.f10258d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0865o0)) {
            return false;
        }
        C0865o0 c0865o0 = (C0865o0) obj;
        if (!AbstractC4828h.G(this.f10255a, c0865o0.f10255a) || this.f10256b != c0865o0.f10256b || !AbstractC5260f.r(this.f10257c, c0865o0.f10257c) || !T0.n.a(this.f10258d, c0865o0.f10258d)) {
            return false;
        }
        c0865o0.getClass();
        if (AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f10255a * 31;
        if (this.f10256b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return (((((i11 + i10) * 31) + this.f10257c) * 31) + this.f10258d) * 31;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) AbstractC4828h.t0(this.f10255a)) + ", autoCorrect=" + this.f10256b + ", keyboardType=" + ((Object) AbstractC5260f.T(this.f10257c)) + ", imeAction=" + ((Object) T0.n.b(this.f10258d)) + ", platformImeOptions=null)";
    }

    public C0865o0(int i10, boolean z10, int i11, int i12) {
        this.f10255a = i10;
        this.f10256b = z10;
        this.f10257c = i11;
        this.f10258d = i12;
    }
}
