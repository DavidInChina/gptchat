package jf;

import id.AbstractC3557B;

/* renamed from: jf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3966p implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final byte f36168Y;

    public /* synthetic */ C3966p(byte b10) {
        this.f36168Y = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC3557B.e0(this.f36168Y & 255, ((C3966p) obj).f36168Y & 255);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3966p)) {
            return false;
        }
        if (this.f36168Y != ((C3966p) obj).f36168Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f36168Y;
    }

    public final String toString() {
        return String.valueOf(this.f36168Y & 255);
    }
}
