package t4;

import g4.C3189q;
import q4.k;
import q4.q;

/* renamed from: t4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5673a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f45740b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45741c = false;

    public C5673a(int i10) {
        this.f45740b = i10;
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    @Override // t4.e
    public final f a(C3189q c3189q, k kVar) {
        if (!(kVar instanceof q)) {
            return new d(c3189q, kVar);
        }
        if (((q) kVar).f43888c == h4.f.f31879Y) {
            return new d(c3189q, kVar);
        }
        return new C5674b(c3189q, kVar, this.f45740b, this.f45741c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5673a) {
            C5673a c5673a = (C5673a) obj;
            if (this.f45740b == c5673a.f45740b && this.f45741c == c5673a.f45741c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f45740b * 31;
        if (this.f45741c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i11 + i10;
    }
}
