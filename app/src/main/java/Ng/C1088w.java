package Ng;

import id.AbstractC3557B;

/* renamed from: Ng.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12991a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f12992b;

    public C1088w(Object obj, wf.k kVar) {
        this.f12991a = obj;
        this.f12992b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1088w)) {
            return false;
        }
        C1088w c1088w = (C1088w) obj;
        if (AbstractC3557B.K(this.f12991a, c1088w.f12991a) && AbstractC3557B.K(this.f12992b, c1088w.f12992b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f12991a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return this.f12992b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f12991a + ", onCancellation=" + this.f12992b + ')';
    }
}
