package ki;

import android.gov.nist.core.Separators;
import ei.l;
import id.AbstractC3557B;
import java.util.ArrayList;
import ji.C4113B;
import ji.C4135j;
import ji.C4138m;
import kf.t;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4138m f37595a = l.g(Separators.SLASH);

    /* renamed from: b  reason: collision with root package name */
    public static final C4138m f37596b = l.g("\\");

    /* renamed from: c  reason: collision with root package name */
    public static final C4138m f37597c = l.g("/\\");

    /* renamed from: d  reason: collision with root package name */
    public static final C4138m f37598d = l.g(Separators.DOT);

    /* renamed from: e  reason: collision with root package name */
    public static final C4138m f37599e = l.g("..");

    static {
        C4138m c4138m = C4138m.f36722i0;
    }

    public static final int a(C4113B c4113b) {
        if (c4113b.f36661Y.d() == 0) {
            return -1;
        }
        C4138m c4138m = c4113b.f36661Y;
        if (c4138m.i(0) != 47) {
            if (c4138m.i(0) == 92) {
                if (c4138m.d() > 2 && c4138m.i(1) == 92) {
                    C4138m c4138m2 = f37596b;
                    AbstractC3557B.c0("other", c4138m2);
                    int f6 = c4138m.f(2, c4138m2.f36723Y);
                    if (f6 == -1) {
                        return c4138m.d();
                    }
                    return f6;
                }
            } else if (c4138m.d() <= 2 || c4138m.i(1) != 58 || c4138m.i(2) != 92) {
                return -1;
            } else {
                char i10 = (char) c4138m.i(0);
                if (('a' > i10 || i10 >= '{') && ('A' > i10 || i10 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.j] */
    public static final C4113B b(C4113B c4113b, C4113B c4113b2, boolean z10) {
        AbstractC3557B.c0("<this>", c4113b);
        AbstractC3557B.c0("child", c4113b2);
        if (a(c4113b2) != -1 || c4113b2.g() != null) {
            return c4113b2;
        }
        C4138m c10 = c(c4113b);
        if (c10 == null && (c10 = c(c4113b2)) == null) {
            c10 = f(C4113B.f36660Z);
        }
        ?? obj = new Object();
        obj.f0(c4113b.f36661Y);
        if (obj.f36721Z > 0) {
            obj.f0(c10);
        }
        obj.f0(c4113b2.f36661Y);
        return d(obj, z10);
    }

    public static final C4138m c(C4113B c4113b) {
        C4138m c4138m = c4113b.f36661Y;
        C4138m c4138m2 = f37595a;
        if (C4138m.g(c4138m, c4138m2) == -1) {
            C4138m c4138m3 = f37596b;
            if (C4138m.g(c4113b.f36661Y, c4138m3) == -1) {
                return null;
            }
            return c4138m3;
        }
        return c4138m2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ji.j] */
    public static final C4113B d(C4135j c4135j, boolean z10) {
        C4138m c4138m;
        boolean z11;
        boolean z12;
        C4138m c4138m2;
        C4138m c4138m3;
        C4138m c4138m4;
        char k10;
        ?? obj = new Object();
        C4138m c4138m5 = null;
        int i10 = 0;
        while (true) {
            if (!c4135j.r(0L, f37595a)) {
                c4138m = f37596b;
                if (!c4135j.r(0L, c4138m)) {
                    break;
                }
            }
            byte readByte = c4135j.readByte();
            if (c4138m5 == null) {
                c4138m5 = e(readByte);
            }
            i10++;
        }
        if (i10 >= 2 && AbstractC3557B.K(c4138m5, c4138m)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C4138m c4138m6 = f37597c;
        if (z11) {
            AbstractC3557B.Z(c4138m5);
            obj.f0(c4138m5);
            obj.f0(c4138m5);
        } else if (i10 > 0) {
            AbstractC3557B.Z(c4138m5);
            obj.f0(c4138m5);
        } else {
            long D02 = c4135j.D0(c4138m6);
            if (c4138m5 == null) {
                if (D02 == -1) {
                    c4138m5 = f(C4113B.f36660Z);
                } else {
                    c4138m5 = e(c4135j.k(D02));
                }
            }
            if (!AbstractC3557B.K(c4138m5, c4138m)) {
                c4138m4 = c4138m5;
            } else {
                c4138m4 = c4138m5;
                if (c4135j.f36721Z >= 2 && c4135j.k(1L) == 58 && (('a' <= (k10 = (char) c4135j.k(0L)) && k10 < '{') || ('A' <= k10 && k10 < '['))) {
                    if (D02 == 2) {
                        obj.o(c4135j, 3L);
                    } else {
                        obj.o(c4135j, 2L);
                    }
                }
            }
            c4138m5 = c4138m4;
        }
        if (obj.f36721Z > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean H6 = c4135j.H();
            c4138m2 = f37598d;
            if (H6) {
                break;
            }
            long D03 = c4135j.D0(c4138m6);
            if (D03 == -1) {
                c4138m3 = c4135j.q(c4135j.f36721Z);
            } else {
                c4138m3 = c4135j.q(D03);
                c4135j.readByte();
            }
            C4138m c4138m7 = f37599e;
            if (AbstractC3557B.K(c4138m3, c4138m7)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (z10 && (z12 || (!arrayList.isEmpty() && !AbstractC3557B.K(t.o2(arrayList), c4138m7)))) {
                        if ((!z11 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                            arrayList.remove(AbstractC4344b.u0(arrayList));
                        }
                    } else {
                        arrayList.add(c4138m3);
                    }
                }
            } else if (!AbstractC3557B.K(c4138m3, c4138m2) && !AbstractC3557B.K(c4138m3, C4138m.f36722i0)) {
                arrayList.add(c4138m3);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                obj.f0(c4138m5);
            }
            obj.f0((C4138m) arrayList.get(i11));
        }
        if (obj.f36721Z == 0) {
            obj.f0(c4138m2);
        }
        return new C4113B(obj.q(obj.f36721Z));
    }

    public static final C4138m e(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f37596b;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("not a directory separator: ", b10));
        }
        return f37595a;
    }

    public static final C4138m f(String str) {
        if (AbstractC3557B.K(str, Separators.SLASH)) {
            return f37595a;
        }
        if (AbstractC3557B.K(str, "\\")) {
            return f37596b;
        }
        throw new IllegalArgumentException(R.a.r("not a directory separator: ", str));
    }
}
