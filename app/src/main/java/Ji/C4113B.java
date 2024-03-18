package ji;

import android.gov.nist.core.Separators;
import fi.C3100a;
import id.AbstractC3557B;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* renamed from: ji.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4113B implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public static final String f36660Z;

    /* renamed from: Y  reason: collision with root package name */
    public final C4138m f36661Y;

    static {
        String str = File.separator;
        AbstractC3557B.b0("separator", str);
        f36660Z = str;
    }

    public C4113B(C4138m c4138m) {
        AbstractC3557B.c0("bytes", c4138m);
        this.f36661Y = c4138m;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a5 = ki.c.a(this);
        C4138m c4138m = this.f36661Y;
        if (a5 == -1) {
            a5 = 0;
        } else if (a5 < c4138m.d() && c4138m.i(a5) == 92) {
            a5++;
        }
        int d10 = c4138m.d();
        int i10 = a5;
        while (a5 < d10) {
            if (c4138m.i(a5) == 47 || c4138m.i(a5) == 92) {
                arrayList.add(c4138m.n(i10, a5));
                i10 = a5 + 1;
            }
            a5++;
        }
        if (i10 < c4138m.d()) {
            arrayList.add(c4138m.n(i10, c4138m.d()));
        }
        return arrayList;
    }

    public final C4113B b() {
        C4138m c4138m = ki.c.f37598d;
        C4138m c4138m2 = this.f36661Y;
        if (AbstractC3557B.K(c4138m2, c4138m)) {
            return null;
        }
        C4138m c4138m3 = ki.c.f37595a;
        if (AbstractC3557B.K(c4138m2, c4138m3)) {
            return null;
        }
        C4138m c4138m4 = ki.c.f37596b;
        if (AbstractC3557B.K(c4138m2, c4138m4)) {
            return null;
        }
        C4138m c4138m5 = ki.c.f37599e;
        c4138m2.getClass();
        AbstractC3557B.c0("suffix", c4138m5);
        int d10 = c4138m2.d();
        byte[] bArr = c4138m5.f36723Y;
        if (c4138m2.m(d10 - bArr.length, c4138m5, bArr.length) && (c4138m2.d() == 2 || c4138m2.m(c4138m2.d() - 3, c4138m3, 1) || c4138m2.m(c4138m2.d() - 3, c4138m4, 1))) {
            return null;
        }
        int k10 = C4138m.k(c4138m2, c4138m3);
        if (k10 == -1) {
            k10 = C4138m.k(c4138m2, c4138m4);
        }
        if (k10 == 2 && g() != null) {
            if (c4138m2.d() == 3) {
                return null;
            }
            return new C4113B(C4138m.o(c4138m2, 0, 3, 1));
        }
        if (k10 == 1) {
            AbstractC3557B.c0("prefix", c4138m4);
            if (c4138m2.m(0, c4138m4, c4138m4.d())) {
                return null;
            }
        }
        if (k10 == -1 && g() != null) {
            if (c4138m2.d() == 2) {
                return null;
            }
            return new C4113B(C4138m.o(c4138m2, 0, 2, 1));
        } else if (k10 == -1) {
            return new C4113B(c4138m);
        } else {
            if (k10 == 0) {
                return new C4113B(C4138m.o(c4138m2, 0, 1, 1));
            }
            return new C4113B(C4138m.o(c4138m2, 0, k10, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ji.j] */
    public final C4113B c(C4113B c4113b) {
        C4113B c4113b2;
        AbstractC3557B.c0("other", c4113b);
        int a5 = ki.c.a(this);
        C4138m c4138m = this.f36661Y;
        C4113B c4113b3 = null;
        if (a5 == -1) {
            c4113b2 = null;
        } else {
            c4113b2 = new C4113B(c4138m.n(0, a5));
        }
        int a10 = ki.c.a(c4113b);
        C4138m c4138m2 = c4113b.f36661Y;
        if (a10 != -1) {
            c4113b3 = new C4113B(c4138m2.n(0, a10));
        }
        if (AbstractC3557B.K(c4113b2, c4113b3)) {
            ArrayList a11 = a();
            ArrayList a12 = c4113b.a();
            int min = Math.min(a11.size(), a12.size());
            int i10 = 0;
            while (i10 < min && AbstractC3557B.K(a11.get(i10), a12.get(i10))) {
                i10++;
            }
            if (i10 == min && c4138m.d() == c4138m2.d()) {
                return C3100a.f(Separators.DOT, false);
            }
            if (a12.subList(i10, a12.size()).indexOf(ki.c.f37599e) == -1) {
                ?? obj = new Object();
                C4138m c10 = ki.c.c(c4113b);
                if (c10 == null && (c10 = ki.c.c(this)) == null) {
                    c10 = ki.c.f(f36660Z);
                }
                int size = a12.size();
                for (int i11 = i10; i11 < size; i11++) {
                    obj.f0(ki.c.f37599e);
                    obj.f0(c10);
                }
                int size2 = a11.size();
                while (i10 < size2) {
                    obj.f0((C4138m) a11.get(i10));
                    obj.f0(c10);
                    i10++;
                }
                return ki.c.d(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + c4113b).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + c4113b).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4113B c4113b = (C4113B) obj;
        AbstractC3557B.c0("other", c4113b);
        return this.f36661Y.compareTo(c4113b.f36661Y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ji.j] */
    public final C4113B d(String str) {
        AbstractC3557B.c0("child", str);
        ?? obj = new Object();
        obj.S0(str);
        return ki.c.b(this, ki.c.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f36661Y.r());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4113B) && AbstractC3557B.K(((C4113B) obj).f36661Y, this.f36661Y)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f36661Y.r(), new String[0]);
        AbstractC3557B.b0("get(...)", path);
        return path;
    }

    public final Character g() {
        C4138m c4138m = ki.c.f37595a;
        C4138m c4138m2 = this.f36661Y;
        if (C4138m.g(c4138m2, c4138m) != -1 || c4138m2.d() < 2 || c4138m2.i(1) != 58) {
            return null;
        }
        char i10 = (char) c4138m2.i(0);
        if (('a' > i10 || i10 >= '{') && ('A' > i10 || i10 >= '[')) {
            return null;
        }
        return Character.valueOf(i10);
    }

    public final int hashCode() {
        return this.f36661Y.hashCode();
    }

    public final String toString() {
        return this.f36661Y.r();
    }
}
