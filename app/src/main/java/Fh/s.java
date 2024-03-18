package Fh;

import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class s implements t {

    /* renamed from: Y  reason: collision with root package name */
    public final int f5401Y;

    public s(int i10) {
        this.f5401Y = i10;
    }

    @Override // Fh.t
    public final i a(Nh.l lVar, AbstractC6250o abstractC6250o) {
        int size = abstractC6250o.getParameters().size();
        int i10 = this.f5401Y;
        if (i10 < size) {
            return new C0545f(i10, lVar);
        }
        throw new IllegalArgumentException("Method " + abstractC6250o + " has less then " + i10 + " parameters");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        if (this.f5401Y == ((s) obj).f5401Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (s.class.hashCode() * 31) + this.f5401Y;
    }
}
