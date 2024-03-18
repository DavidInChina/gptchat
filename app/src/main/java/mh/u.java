package mh;

import id.AbstractC3557B;
import q0.C5252d;
import q0.C5254f;

/* loaded from: classes2.dex */
public final class u implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final u f39508a = new Object();

    @Override // mh.v
    public final long a(long j6) {
        return C5254f.f43638c;
    }

    @Override // mh.v
    public final C5252d b(long j6, Z0.l lVar) {
        AbstractC3557B.c0("direction", lVar);
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return true;
    }

    public final int hashCode() {
        return -664876665;
    }

    public final String toString() {
        return "Unspecified";
    }
}
