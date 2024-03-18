package ki;

import Lg.n;
import Uf.A;
import android.gov.nist.core.Separators;
import fi.C3100a;
import id.AbstractC3557B;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jf.C3959i;
import jf.C3963m;
import ji.AbstractC4120I;
import ji.AbstractC4122K;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.C4140o;
import ji.w;
import ji.x;
import kf.s;
import kf.t;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class e extends AbstractC4141p {

    /* renamed from: e  reason: collision with root package name */
    public static final C4113B f37603e = C3100a.f(Separators.SLASH, false);

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f37604b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4141p f37605c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f37606d = R4.b.D1(new A(23, this));

    static {
        String str = C4113B.f36660Z;
    }

    public e(ClassLoader classLoader) {
        x xVar = AbstractC4141p.f36737a;
        AbstractC3557B.c0("systemFileSystem", xVar);
        this.f37604b = classLoader;
        this.f37605c = xVar;
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I a(C4113B c4113b) {
        throw new IOException(this + " is read-only");
    }

    @Override // ji.AbstractC4141p
    public final void b(C4113B c4113b, C4113B c4113b2) {
        AbstractC3557B.c0("source", c4113b);
        AbstractC3557B.c0("target", c4113b2);
        throw new IOException(this + " is read-only");
    }

    @Override // ji.AbstractC4141p
    public final void c(C4113B c4113b) {
        throw new IOException(this + " is read-only");
    }

    @Override // ji.AbstractC4141p
    public final void d(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        throw new IOException(this + " is read-only");
    }

    @Override // ji.AbstractC4141p
    public final List g(C4113B c4113b) {
        AbstractC3557B.c0("dir", c4113b);
        C4113B c4113b2 = f37603e;
        c4113b2.getClass();
        String r10 = c.b(c4113b2, c4113b, true).c(c4113b2).f36661Y.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (C3959i c3959i : (List) this.f37606d.getValue()) {
            AbstractC4141p abstractC4141p = (AbstractC4141p) c3959i.f36155Y;
            C4113B c4113b3 = (C4113B) c3959i.f36156Z;
            try {
                List g10 = abstractC4141p.g(c4113b3.d(r10));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g10) {
                    if (C3100a.d((C4113B) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C4113B c4113b4 = (C4113B) it.next();
                    AbstractC3557B.c0("<this>", c4113b4);
                    arrayList2.add(c4113b2.d(n.z2(n.v2(c4113b3.f36661Y.r(), c4113b4.f36661Y.r()), '\\', '/')));
                }
                s.N1(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return t.K2(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c4113b);
    }

    @Override // ji.AbstractC4141p
    public final C4140o i(C4113B c4113b) {
        AbstractC3557B.c0("path", c4113b);
        if (!C3100a.d(c4113b)) {
            return null;
        }
        C4113B c4113b2 = f37603e;
        c4113b2.getClass();
        String r10 = c.b(c4113b2, c4113b, true).c(c4113b2).f36661Y.r();
        for (C3959i c3959i : (List) this.f37606d.getValue()) {
            C4140o i10 = ((AbstractC4141p) c3959i.f36155Y).i(((C4113B) c3959i.f36156Z).d(r10));
            if (i10 != null) {
                return i10;
            }
        }
        return null;
    }

    @Override // ji.AbstractC4141p
    public final w j(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        if (C3100a.d(c4113b)) {
            C4113B c4113b2 = f37603e;
            c4113b2.getClass();
            String r10 = c.b(c4113b2, c4113b, true).c(c4113b2).f36661Y.r();
            for (C3959i c3959i : (List) this.f37606d.getValue()) {
                try {
                    return ((AbstractC4141p) c3959i.f36155Y).j(((C4113B) c3959i.f36156Z).d(r10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + c4113b);
        }
        throw new FileNotFoundException("file not found: " + c4113b);
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4120I k(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        throw new IOException(this + " is read-only");
    }

    @Override // ji.AbstractC4141p
    public final AbstractC4122K l(C4113B c4113b) {
        AbstractC3557B.c0("file", c4113b);
        if (C3100a.d(c4113b)) {
            C4113B c4113b2 = f37603e;
            c4113b2.getClass();
            InputStream resourceAsStream = this.f37604b.getResourceAsStream(c.b(c4113b2, c4113b, false).c(c4113b2).f36661Y.r());
            if (resourceAsStream != null) {
                return R4.b.Z1(resourceAsStream);
            }
            throw new FileNotFoundException("file not found: " + c4113b);
        }
        throw new FileNotFoundException("file not found: " + c4113b);
    }
}
