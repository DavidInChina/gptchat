package ji;

import android.gov.nist.core.Separators;
import fi.C3100a;
import id.AbstractC3557B;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* renamed from: ji.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4125N extends AbstractC4141p {

    /* renamed from: e  reason: collision with root package name */
    public static final C4113B f36691e = C3100a.f(Separators.SLASH, false);

    /* renamed from: b  reason: collision with root package name */
    public final C4113B f36692b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4141p f36693c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f36694d;

    static {
        String str = C4113B.f36660Z;
    }

    public C4125N(C4113B c4113b, AbstractC4141p abstractC4141p, LinkedHashMap linkedHashMap) {
        this.f36692b = c4113b;
        this.f36693c = abstractC4141p;
        this.f36694d = linkedHashMap;
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I a(C4113B c4113b) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // ji.AbstractC4141p
    public final void b(C4113B c4113b, C4113B c4113b2) {
        AbstractC3557B.c0("source", c4113b);
        AbstractC3557B.c0("target", c4113b2);
        throw new IOException("zip file systems are read-only");
    }

    @Override // ji.AbstractC4141p
    public final void c(C4113B c4113b) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // ji.AbstractC4141p
    public final void d(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        throw new IOException("zip file systems are read-only");
    }

    @Override // ji.AbstractC4141p
    public final List g(C4113B c4113b) {
        AbstractC3557B.c0("dir", c4113b);
        C4113B c4113b2 = f36691e;
        c4113b2.getClass();
        ki.f fVar = (ki.f) this.f36694d.get(ki.c.b(c4113b2, c4113b, true));
        if (fVar != null) {
            return kf.t.K2(fVar.f37614h);
        }
        throw new IOException("not a directory: " + c4113b);
    }

    @Override // ji.AbstractC4141p
    public final C4140o i(C4113B c4113b) {
        Long l10;
        C4140o c4140o;
        Throwable th2;
        AbstractC3557B.c0("path", c4113b);
        C4113B c4113b2 = f36691e;
        c4113b2.getClass();
        ki.f fVar = (ki.f) this.f36694d.get(ki.c.b(c4113b2, c4113b, true));
        Throwable th3 = null;
        if (fVar == null) {
            return null;
        }
        boolean z10 = fVar.f37608b;
        boolean z11 = !z10;
        if (z10) {
            l10 = null;
        } else {
            l10 = Long.valueOf(fVar.f37610d);
        }
        C4140o c4140o2 = new C4140o(z11, z10, null, l10, null, fVar.f37612f, null);
        long j6 = fVar.f37613g;
        if (j6 == -1) {
            return c4140o2;
        }
        w j10 = this.f36693c.j(this.f36692b);
        try {
            C4116E J10 = R4.b.J(j10.i(j6));
            c4140o = L4.a.L0(J10, c4140o2);
            AbstractC3557B.Z(c4140o);
            try {
                J10.close();
                th2 = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            if (j10 != null) {
                try {
                    j10.close();
                } catch (Throwable th6) {
                    P4.a.m(th5, th6);
                }
            }
            c4140o = null;
            th3 = th5;
        }
        if (th2 == null) {
            AbstractC3557B.Z(c4140o);
            try {
                j10.close();
            } catch (Throwable th7) {
                th3 = th7;
            }
            if (th3 == null) {
                AbstractC3557B.Z(c4140o);
                return c4140o;
            }
            throw th3;
        }
        throw th2;
    }

    @Override // ji.AbstractC4141p
    public final w j(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I k(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        throw new IOException("zip file systems are read-only");
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4122K l(C4113B c4113b) {
        Throwable th2;
        C4116E c4116e;
        AbstractC3557B.c0("file", c4113b);
        C4113B c4113b2 = f36691e;
        c4113b2.getClass();
        ki.f fVar = (ki.f) this.f36694d.get(ki.c.b(c4113b2, c4113b, true));
        if (fVar != null) {
            w j6 = this.f36693c.j(this.f36692b);
            try {
                c4116e = R4.b.J(j6.i(fVar.f37613g));
                try {
                    j6.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (j6 != null) {
                    try {
                        j6.close();
                    } catch (Throwable th5) {
                        P4.a.m(th4, th5);
                    }
                }
                th2 = th4;
                c4116e = null;
            }
            if (th2 == null) {
                AbstractC3557B.Z(c4116e);
                L4.a.L0(c4116e, null);
                int i10 = fVar.f37611e;
                long j10 = fVar.f37610d;
                if (i10 == 0) {
                    return new ki.d(c4116e, j10, true);
                }
                return new ki.d(new v(new ki.d(c4116e, fVar.f37609c, true), new Inflater(true)), j10, false);
            }
            throw th2;
        }
        throw new FileNotFoundException("no such file: " + c4113b);
    }
}
