package fi;

import id.AbstractC3557B;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ji.C4113B;
import ji.C4131f;
import ji.C4138m;
import org.slf4j.ILoggerFactory;

/* renamed from: fi.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3100a implements Di.b, ILoggerFactory {
    /* JADX WARN: Type inference failed for: r0v3, types: [ji.f, java.lang.Object] */
    public static final void c(C4131f c4131f, long j6, boolean z10) {
        C4131f c4131f2;
        ReentrantLock reentrantLock = C4131f.f36703h;
        if (C4131f.f36707l == null) {
            C4131f.f36707l = new Object();
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        long nanoTime = System.nanoTime();
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 != 0 && z10) {
            c4131f.f36710g = Math.min(j6, c4131f.c() - nanoTime) + nanoTime;
        } else if (i10 != 0) {
            c4131f.f36710g = j6 + nanoTime;
        } else if (z10) {
            c4131f.f36710g = c4131f.c();
        } else {
            throw new AssertionError();
        }
        long j10 = c4131f.f36710g - nanoTime;
        C4131f c4131f3 = C4131f.f36707l;
        AbstractC3557B.Z(c4131f3);
        while (true) {
            c4131f2 = c4131f3.f36709f;
            if (c4131f2 == null || j10 < c4131f2.f36710g - nanoTime) {
                break;
            }
            AbstractC3557B.Z(c4131f2);
            c4131f3 = c4131f2;
        }
        c4131f.f36709f = c4131f2;
        c4131f3.f36709f = c4131f;
        if (c4131f3 == C4131f.f36707l) {
            C4131f.f36704i.signal();
        }
    }

    public static final boolean d(C4113B c4113b) {
        C4113B c4113b2 = ki.e.f37603e;
        c4113b.getClass();
        C4138m c4138m = ki.c.f37595a;
        C4138m c4138m2 = c4113b.f36661Y;
        int k10 = C4138m.k(c4138m2, c4138m);
        if (k10 == -1) {
            k10 = C4138m.k(c4138m2, ki.c.f37596b);
        }
        if (k10 != -1) {
            c4138m2 = C4138m.o(c4138m2, k10 + 1, 0, 2);
        } else if (c4113b.g() != null && c4138m2.d() == 2) {
            c4138m2 = C4138m.f36722i0;
        }
        return !Lg.n.c2(c4138m2.r(), ".class", true);
    }

    public static C4131f e() {
        C4131f c4131f = C4131f.f36707l;
        AbstractC3557B.Z(c4131f);
        C4131f c4131f2 = c4131f.f36709f;
        if (c4131f2 == null) {
            long nanoTime = System.nanoTime();
            C4131f.f36704i.await(C4131f.f36705j, TimeUnit.MILLISECONDS);
            C4131f c4131f3 = C4131f.f36707l;
            AbstractC3557B.Z(c4131f3);
            if (c4131f3.f36709f != null || System.nanoTime() - nanoTime < C4131f.f36706k) {
                return null;
            }
            return C4131f.f36707l;
        }
        long nanoTime2 = c4131f2.f36710g - System.nanoTime();
        if (nanoTime2 > 0) {
            C4131f.f36704i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C4131f c4131f4 = C4131f.f36707l;
        AbstractC3557B.Z(c4131f4);
        c4131f4.f36709f = c4131f2.f36709f;
        c4131f2.f36709f = null;
        c4131f2.f36708e = 2;
        return c4131f2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ji.j] */
    public static C4113B f(String str, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        C4138m c4138m = ki.c.f37595a;
        ?? obj = new Object();
        obj.S0(str);
        return ki.c.d(obj, z10);
    }

    public static C4113B g(File file) {
        String str = C4113B.f36660Z;
        AbstractC3557B.c0("<this>", file);
        String file2 = file.toString();
        AbstractC3557B.b0("toString(...)", file2);
        return f(file2, false);
    }

    @Override // org.slf4j.ILoggerFactory
    public final Ei.a a(String str) {
        return Gi.b.f6508Y;
    }

    @Override // Di.b
    public final Di.a b(int i10, int i11, CharSequence charSequence) {
        int B02;
        int i12 = i10 + 3;
        if (i12 >= charSequence.length() || charSequence.charAt(i10 + 1) != '/' || charSequence.charAt(i10 + 2) != '/') {
            return null;
        }
        int i13 = -1;
        int i14 = -1;
        for (int i15 = i10 - 1; i15 >= i11; i15--) {
            char charAt = charSequence.charAt(i15);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                i13 = i15;
            } else if (charAt >= '0' && charAt <= '9') {
                i14 = i15;
            } else if (charAt != '+' && charAt != '-' && charAt != '.') {
                break;
            }
        }
        if (i13 > 0 && i13 - 1 == i14) {
            i13 = -1;
        }
        if (i13 == -1 || (B02 = R4.b.B0(i12, charSequence)) == -1) {
            return null;
        }
        return new Di.a(Ci.c.f3172Y, i13, B02 + 1);
    }

    public final void h(String str, StringBuilder sb2) {
        if (str.charAt(0) == '\\') {
            sb2.append((CharSequence) str, 1, str.length());
        } else {
            sb2.append(vi.b.a(str));
        }
    }
}
