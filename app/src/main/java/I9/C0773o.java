package I9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* renamed from: I9.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773o implements AbstractC0775p {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f8421a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8422b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8423c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8424d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8425e;

    public C0773o(C2334C c2334c, boolean z10, boolean z11, int i10) {
        this.f8421a = c2334c;
        this.f8422b = z10;
        this.f8423c = z11;
        this.f8424d = i10;
        this.f8425e = c2334c.f26438a + "_" + i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0773o)) {
            return false;
        }
        C0773o c0773o = (C0773o) obj;
        if (AbstractC3557B.K(this.f8421a, c0773o.f8421a) && this.f8422b == c0773o.f8422b && this.f8423c == c0773o.f8423c && this.f8424d == c0773o.f8424d) {
            return true;
        }
        return false;
    }

    @Override // I9.AbstractC0775p
    public final String getId() {
        return this.f8425e;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f8421a.hashCode() * 31;
        int i11 = 1237;
        if (this.f8422b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f8423c) {
            i11 = 1231;
        }
        return ((i12 + i11) * 31) + this.f8424d;
    }

    public final String toString() {
        return "GizmoItem(gizmo=" + this.f8421a + ", isSelected=" + this.f8422b + ", isVisible=" + this.f8423c + ", index=" + this.f8424d + Separators.RPAREN;
    }
}
