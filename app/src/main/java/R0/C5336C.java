package r0;

import id.AbstractC3557B;
import q0.C5252d;

/* renamed from: r0.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5336C extends G {

    /* renamed from: k  reason: collision with root package name */
    public final C5252d f44168k;

    public C5336C(C5252d c5252d) {
        this.f44168k = c5252d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5336C)) {
            return false;
        }
        if (AbstractC3557B.K(this.f44168k, ((C5336C) obj).f44168k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44168k.hashCode();
    }
}
