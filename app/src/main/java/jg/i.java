package jg;

import android.gov.nist.core.Separators;
import androidx.datastore.preferences.protobuf.n0;
import fg.C3032C;
import fg.C3033a;
import fg.C3042j;
import fg.C3044l;
import fg.C3056y;
import fg.G;
import fg.Q;
import fg.Z;
import hg.AbstractC3428g;
import hg.C3424c;
import hg.C3430i;
import id.AbstractC3557B;
import ig.C3576b;
import ig.C3577c;
import ig.C3579e;
import ig.j;
import ig.k;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import kf.t;
import l8.AbstractC4344b;
import lg.C4461f;
import lg.C4464i;
import lg.C4470o;
import lg.p;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final C4464i f36194a;

    static {
        C4464i c4464i = new C4464i();
        c4464i.a(k.f33232a);
        c4464i.a(k.f33233b);
        c4464i.a(k.f33234c);
        c4464i.a(k.f33235d);
        c4464i.a(k.f33236e);
        c4464i.a(k.f33237f);
        c4464i.a(k.f33238g);
        c4464i.a(k.f33239h);
        c4464i.a(k.f33240i);
        c4464i.a(k.f33241j);
        c4464i.a(k.f33242k);
        c4464i.a(k.f33243l);
        c4464i.a(k.f33244m);
        c4464i.a(k.f33245n);
        f36194a = c4464i;
    }

    public static e a(C3044l c3044l, AbstractC3428g abstractC3428g, C3430i c3430i) {
        String str;
        String str2;
        AbstractC3557B.c0("proto", c3044l);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        C4470o c4470o = k.f33232a;
        AbstractC3557B.b0("constructorSignature", c4470o);
        C3577c c3577c = (C3577c) A7.b.P0(c3044l, c4470o);
        if (c3577c != null && (c3577c.f33173Z & 1) == 1) {
            str = abstractC3428g.b(c3577c.f33174h0);
        } else {
            str = "<init>";
        }
        if (c3577c != null && (c3577c.f33173Z & 2) == 2) {
            str2 = abstractC3428g.b(c3577c.f33175i0);
        } else {
            List<Z> list = c3044l.f30677j0;
            AbstractC3557B.b0("getValueParameterList(...)", list);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (Z z10 : list) {
                AbstractC3557B.Z(z10);
                String e10 = e(P4.a.O0(z10, c3430i), abstractC3428g);
                if (e10 == null) {
                    return null;
                }
                arrayList.add(e10);
            }
            str2 = t.m2(arrayList, "", Separators.LPAREN, ")V", null, 56);
        }
        return new e(str, str2);
    }

    public static d b(G g10, AbstractC3428g abstractC3428g, C3430i c3430i, boolean z10) {
        C3576b c3576b;
        int i10;
        String str;
        AbstractC3557B.c0("proto", g10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        C4470o c4470o = k.f33235d;
        AbstractC3557B.b0("propertySignature", c4470o);
        C3579e c3579e = (C3579e) A7.b.P0(g10, c4470o);
        if (c3579e == null) {
            return null;
        }
        if ((c3579e.f33187Z & 1) == 1) {
            c3576b = c3579e.f33188h0;
        } else {
            c3576b = null;
        }
        if (c3576b == null && z10) {
            return null;
        }
        if (c3576b != null && (c3576b.f33165Z & 1) == 1) {
            i10 = c3576b.f33166h0;
        } else {
            i10 = g10.f30314k0;
        }
        if (c3576b != null && (c3576b.f33165Z & 2) == 2) {
            str = abstractC3428g.b(c3576b.f33167i0);
        } else {
            str = e(P4.a.E0(g10, c3430i), abstractC3428g);
            if (str == null) {
                return null;
            }
        }
        return new d(abstractC3428g.b(i10), str);
    }

    public static e c(C3056y c3056y, AbstractC3428g abstractC3428g, C3430i c3430i) {
        int i10;
        String str;
        AbstractC3557B.c0("proto", c3056y);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        C4470o c4470o = k.f33233b;
        AbstractC3557B.b0("methodSignature", c4470o);
        C3577c c3577c = (C3577c) A7.b.P0(c3056y, c4470o);
        if (c3577c != null && (c3577c.f33173Z & 1) == 1) {
            i10 = c3577c.f33174h0;
        } else {
            i10 = c3056y.f30771k0;
        }
        if (c3577c != null && (c3577c.f33173Z & 2) == 2) {
            str = abstractC3428g.b(c3577c.f33175i0);
        } else {
            List H02 = AbstractC4344b.H0(P4.a.y0(c3056y, c3430i));
            List<Z> list = c3056y.f30780t0;
            AbstractC3557B.b0("getValueParameterList(...)", list);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (Z z10 : list) {
                AbstractC3557B.Z(z10);
                arrayList.add(P4.a.O0(z10, c3430i));
            }
            ArrayList w22 = t.w2(arrayList, H02);
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(w22, 10));
            Iterator it = w22.iterator();
            while (it.hasNext()) {
                String e10 = e((Q) it.next(), abstractC3428g);
                if (e10 == null) {
                    return null;
                }
                arrayList2.add(e10);
            }
            String e11 = e(P4.a.D0(c3056y, c3430i), abstractC3428g);
            if (e11 == null) {
                return null;
            }
            str = t.m2(arrayList2, "", Separators.LPAREN, Separators.RPAREN, null, 56).concat(e11);
        }
        return new e(abstractC3428g.b(i10), str);
    }

    public static final boolean d(G g10) {
        AbstractC3557B.c0("proto", g10);
        C3424c c3424c = c.f36182a;
        C3424c c3424c2 = c.f36182a;
        Object i10 = g10.i(k.f33236e);
        AbstractC3557B.b0("getExtension(...)", i10);
        return c3424c2.c(((Number) i10).intValue()).booleanValue();
    }

    public static String e(Q q10, AbstractC3428g abstractC3428g) {
        if (q10.o()) {
            return b.b(abstractC3428g.a(q10.f30402n0));
        }
        return null;
    }

    public static final C3959i f(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC3972a.b(strArr));
        h g10 = g(byteArrayInputStream, strArr2);
        C3033a c3033a = C3042j.f30633P0;
        c3033a.getClass();
        C4461f c4461f = new C4461f(byteArrayInputStream);
        p b10 = c3033a.b(c4461f, f36194a);
        try {
            c4461f.a(0);
            if (b10.isInitialized()) {
                return new C3959i(g10, (C3042j) b10);
            }
            lg.t tVar = new lg.t(new n0().getMessage());
            tVar.f38415Y = b10;
            throw tVar;
        } catch (lg.t e10) {
            e10.f38415Y = b10;
            throw e10;
        }
    }

    public static h g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        j jVar = (j) j.f33225m0.a(byteArrayInputStream, f36194a);
        AbstractC3557B.b0("parseDelimitedFrom(...)", jVar);
        return new h(jVar, strArr);
    }

    public static final C3959i h(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC3972a.b(strArr));
        h g10 = g(byteArrayInputStream, strArr2);
        C3033a c3033a = C3032C.f30268q0;
        c3033a.getClass();
        C4461f c4461f = new C4461f(byteArrayInputStream);
        p b10 = c3033a.b(c4461f, f36194a);
        try {
            c4461f.a(0);
            if (b10.isInitialized()) {
                return new C3959i(g10, (C3032C) b10);
            }
            lg.t tVar = new lg.t(new n0().getMessage());
            tVar.f38415Y = b10;
            throw tVar;
        } catch (lg.t e10) {
            e10.f38415Y = b10;
            throw e10;
        }
    }
}
