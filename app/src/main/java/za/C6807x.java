package za;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import java.util.Map;
import y.AbstractC6463a;

/* renamed from: za.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6807x {

    /* renamed from: a  reason: collision with root package name */
    public final T0.z f51804a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f51805b;

    /* renamed from: c  reason: collision with root package name */
    public final C2334C f51806c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f51807d;

    /* renamed from: e  reason: collision with root package name */
    public final C6784a f51808e;

    public C6807x(T0.z zVar, Map map, C2334C c2334c, boolean z10, C6784a c6784a) {
        AbstractC3557B.c0("input", zVar);
        AbstractC3557B.c0("attachments", map);
        this.f51804a = zVar;
        this.f51805b = map;
        this.f51806c = c2334c;
        this.f51807d = z10;
        this.f51808e = c6784a;
    }

    public static C6807x a(C6807x c6807x, T0.z zVar, Map map, C2334C c2334c, boolean z10, C6784a c6784a, int i10) {
        if ((i10 & 1) != 0) {
            zVar = c6807x.f51804a;
        }
        T0.z zVar2 = zVar;
        if ((i10 & 2) != 0) {
            map = c6807x.f51805b;
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            c2334c = c6807x.f51806c;
        }
        C2334C c2334c2 = c2334c;
        if ((i10 & 8) != 0) {
            z10 = c6807x.f51807d;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            c6784a = c6807x.f51808e;
        }
        c6807x.getClass();
        AbstractC3557B.c0("input", zVar2);
        AbstractC3557B.c0("attachments", map2);
        return new C6807x(zVar2, map2, c2334c2, z11, c6784a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6807x)) {
            return false;
        }
        C6807x c6807x = (C6807x) obj;
        if (AbstractC3557B.K(this.f51804a, c6807x.f51804a) && AbstractC3557B.K(this.f51805b, c6807x.f51805b) && AbstractC3557B.K(this.f51806c, c6807x.f51806c) && this.f51807d == c6807x.f51807d && AbstractC3557B.K(this.f51808e, c6807x.f51808e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6463a.f(this.f51805b, this.f51804a.hashCode() * 31, 31);
        int i12 = 0;
        C2334C c2334c = this.f51806c;
        if (c2334c == null) {
            i10 = 0;
        } else {
            i10 = c2334c.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        if (this.f51807d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = (i13 + i11) * 31;
        C6784a c6784a = this.f51808e;
        if (c6784a != null) {
            i12 = c6784a.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "InputState(input=" + this.f51804a + ", attachments=" + this.f51805b + ", mentionedGizmo=" + this.f51806c + ", imageHasBeenDrawn=" + this.f51807d + ", drawnImageAttachment=" + this.f51808e + Separators.RPAREN;
    }

    public /* synthetic */ C6807x(C2334C c2334c, int i10) {
        this(new T0.z("", 0L, 6), kf.w.f37484Y, (i10 & 4) != 0 ? null : c2334c, false, null);
    }
}
