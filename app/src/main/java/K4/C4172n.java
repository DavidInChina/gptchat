package k4;

import Wh.F;
import id.AbstractC3557B;

/* renamed from: k4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4172n extends AbstractC4163e {

    /* renamed from: a  reason: collision with root package name */
    public final F f37030a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37031b;

    /* renamed from: c  reason: collision with root package name */
    public final h4.f f37032c;

    public C4172n(F f6, String str, h4.f fVar) {
        this.f37030a = f6;
        this.f37031b = str;
        this.f37032c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4172n) {
            C4172n c4172n = (C4172n) obj;
            if (AbstractC3557B.K(this.f37030a, c4172n.f37030a) && AbstractC3557B.K(this.f37031b, c4172n.f37031b) && this.f37032c == c4172n.f37032c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f37030a.hashCode() * 31;
        String str = this.f37031b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f37032c.hashCode() + ((hashCode + i10) * 31);
    }
}
