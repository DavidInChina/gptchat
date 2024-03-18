package jf;

import id.AbstractC3557B;

/* renamed from: jf.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3968r implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f36170Y;

    public /* synthetic */ C3968r(int i10) {
        this.f36170Y = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3557B.e0(this.f36170Y ^ Integer.MIN_VALUE, ((C3968r) obj).f36170Y ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3968r)) {
            return false;
        }
        if (this.f36170Y != ((C3968r) obj).f36170Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f36170Y;
    }

    public final String toString() {
        return String.valueOf(this.f36170Y & 4294967295L);
    }
}
