package jf;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final short f36175Y;

    public /* synthetic */ w(short s10) {
        this.f36175Y = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3557B.e0(this.f36175Y & 65535, ((w) obj).f36175Y & 65535);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this.f36175Y != ((w) obj).f36175Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f36175Y;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f36175Y);
    }
}
