package Bh;

import wh.C6249n;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C6249n f2375a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2376b;

    public r(C6249n c6249n) {
        this.f2375a = c6249n;
        this.f2376b = c6249n.f48564b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof r) || !this.f2375a.f48564b.equals(((r) obj).f2375a.f48564b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2376b;
    }

    public final String toString() {
        return this.f2375a.f48564b.toString();
    }
}
