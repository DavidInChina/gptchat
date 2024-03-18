package pg;

import Bg.A;
import id.AbstractC3557B;

/* renamed from: pg.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5179p extends AbstractC5181r {

    /* renamed from: a  reason: collision with root package name */
    public final A f43156a;

    public C5179p(A a5) {
        this.f43156a = a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5179p) && AbstractC3557B.K(this.f43156a, ((C5179p) obj).f43156a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43156a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f43156a + ')';
    }
}
