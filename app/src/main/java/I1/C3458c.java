package i1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import h1.C3302i;
import java.util.HashSet;
import java.util.Iterator;
import z.AbstractC6708l;

/* renamed from: i1.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3458c {

    /* renamed from: b  reason: collision with root package name */
    public final d f32458b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32459c;

    /* renamed from: d  reason: collision with root package name */
    public C3458c f32460d;

    /* renamed from: g  reason: collision with root package name */
    public C3302i f32463g;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f32457a = null;

    /* renamed from: e  reason: collision with root package name */
    public int f32461e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f32462f = -1;

    public C3458c(d dVar, int i10) {
        this.f32458b = dVar;
        this.f32459c = i10;
    }

    public final void a(C3458c c3458c, int i10) {
        b(c3458c, i10, -1, false);
    }

    public final boolean b(C3458c c3458c, int i10, int i11, boolean z10) {
        if (c3458c == null) {
            h();
            return true;
        } else if (!z10 && !g(c3458c)) {
            return false;
        } else {
            this.f32460d = c3458c;
            if (c3458c.f32457a == null) {
                c3458c.f32457a = new HashSet();
            }
            this.f32460d.f32457a.add(this);
            if (i10 > 0) {
                this.f32461e = i10;
            } else {
                this.f32461e = 0;
            }
            this.f32462f = i11;
            return true;
        }
    }

    public final int c() {
        C3458c c3458c;
        if (this.f32458b.f32481V == 8) {
            return 0;
        }
        int i10 = this.f32462f;
        if (i10 > -1 && (c3458c = this.f32460d) != null && c3458c.f32458b.f32481V == 8) {
            return i10;
        }
        return this.f32461e;
    }

    public final C3458c d() {
        int i10 = this.f32459c;
        int f6 = AbstractC6708l.f(i10);
        d dVar = this.f32458b;
        switch (f6) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f32514z;
            case 2:
                return dVar.f32464A;
            case 3:
                return dVar.f32512x;
            case 4:
                return dVar.f32513y;
            default:
                throw new AssertionError(AbstractC2469q0.v(i10));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f32457a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C3458c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f32460d != null) {
            return true;
        }
        return false;
    }

    public final boolean g(C3458c c3458c) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (c3458c == null) {
            return false;
        }
        int i10 = this.f32459c;
        d dVar = c3458c.f32458b;
        int i11 = c3458c.f32459c;
        if (i11 != i10) {
            switch (AbstractC6708l.f(i10)) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i11 != 2 && i11 != 4) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (dVar instanceof h) {
                        if (z10 || i11 == 8) {
                            z12 = true;
                        }
                        return z12;
                    }
                    return z10;
                case 2:
                case 4:
                    if (i11 != 3 && i11 != 5) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (dVar instanceof h) {
                        if (z11 || i11 == 9) {
                            z12 = true;
                        }
                        return z12;
                    }
                    return z11;
                case 6:
                    if (i11 == 6 || i11 == 8 || i11 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(AbstractC2469q0.v(i10));
            }
        } else if (i10 == 6 && (!dVar.f32511w || !this.f32458b.f32511w)) {
            return false;
        } else {
            return true;
        }
    }

    public final void h() {
        HashSet hashSet;
        C3458c c3458c = this.f32460d;
        if (c3458c != null && (hashSet = c3458c.f32457a) != null) {
            hashSet.remove(this);
        }
        this.f32460d = null;
        this.f32461e = 0;
        this.f32462f = -1;
    }

    public final void i() {
        C3302i c3302i = this.f32463g;
        if (c3302i == null) {
            this.f32463g = new C3302i(1);
        } else {
            c3302i.c();
        }
    }

    public final String toString() {
        return this.f32458b.f32482W + ":" + AbstractC2469q0.v(this.f32459c);
    }
}
