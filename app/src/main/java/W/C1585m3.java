package W;

import Ng.AbstractC1070k;
import Ng.C1072l;
import id.AbstractC3557B;

/* renamed from: W.m3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1585m3 {

    /* renamed from: a  reason: collision with root package name */
    public final B3 f20227a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1070k f20228b;

    public C1585m3(B3 b32, C1072l c1072l) {
        this.f20227a = b32;
        this.f20228b = c1072l;
    }

    public final void a() {
        AbstractC1070k abstractC1070k = this.f20228b;
        if (abstractC1070k.a()) {
            abstractC1070k.resumeWith(A3.f18981Y);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1585m3.class != obj.getClass()) {
            return false;
        }
        C1585m3 c1585m3 = (C1585m3) obj;
        if (AbstractC3557B.K(this.f20227a, c1585m3.f20227a) && AbstractC3557B.K(this.f20228b, c1585m3.f20228b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20228b.hashCode() + (this.f20227a.hashCode() * 31);
    }
}
