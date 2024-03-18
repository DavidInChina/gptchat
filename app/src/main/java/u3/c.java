package U3;

import Bg.A;
import Bg.D;
import E2.C;
import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import L2.AbstractC0888i;
import L2.C0887h;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.B;
import Mf.EnumC0998g;
import Mf.V;
import Mf.h0;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import a1.C1915c;
import android.animation.Animator;
import android.app.AlertDialog;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import fg.C3036d;
import fg.C3037e;
import fg.C3039g;
import fg.EnumC3035c;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.L0;
import io.sentry.S;
import io.sentry.protocol.x;
import io.sentry.r1;
import io.sentry.s1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.zip.GZIPOutputStream;
import jf.C3959i;
import ji.C4138m;
import kf.AbstractC4268D;
import kf.w;
import kg.C4294f;
import l.AbstractC4308a;
import ng.AbstractC4838e;
import pg.AbstractC5170g;
import pg.C5164a;
import pg.C5165b;
import pg.C5166c;
import pg.C5167d;
import pg.C5168e;
import pg.C5172i;
import pg.C5173j;
import pg.C5174k;
import pg.C5182s;
import pg.C5183t;
import pg.C5185v;
import pg.C5186w;
import pg.C5187x;
import pg.C5188y;
import q.RunnableC5216j;
import qh.AbstractC5327a;
import s2.AbstractC5530A;
import s2.C5531a;
import s2.y;
import s2.z;
import x3.C6270B;
import xg.AbstractC6450e;
import y1.AbstractC6496f;
import y2.X;
import y2.Y;
import y2.Z;
import y2.b0;
import y2.c0;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class c implements C, B2.o, AbstractC0888i, AbstractC6496f, K8.n, AbstractC5327a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17395Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17396Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17397h0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        this(new u(28), 18, new long[10]);
        this.f17395Y = i10;
        if (i10 == 14) {
            this.f17397h0 = new HashMap();
        } else if (i10 != 18) {
        }
    }

    public static void m(c cVar, C3636c1 c3636c1) {
        C8.c.h((long[]) ((u) cVar.f17396Z).f17492Z, (long[]) ((u) c3636c1.f34285Z).f17492Z, (long[]) c3636c1.f34286h0);
        u uVar = (u) c3636c1.f34285Z;
        C8.c.h((long[]) ((u) cVar.f17396Z).f17493h0, (long[]) uVar.f17493h0, (long[]) uVar.f17494i0);
        C8.c.h((long[]) ((u) cVar.f17396Z).f17494i0, (long[]) ((u) c3636c1.f34285Z).f17494i0, (long[]) c3636c1.f34286h0);
        u uVar2 = (u) c3636c1.f34285Z;
        C8.c.h((long[]) cVar.f17397h0, (long[]) uVar2.f17492Z, (long[]) uVar2.f17493h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:19:0x003a, B:20:0x003d, B:21:0x0042, B:23:0x0047, B:24:0x004a, B:27:0x005d), top: B:31:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ji.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c y(String... strArr) {
        String str;
        try {
            C4138m[] c4138mArr = new C4138m[strArr.length];
            ?? obj = new Object();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str2 = strArr[i10];
                String[] strArr2 = H4.a.f7432j0;
                obj.w0(34);
                int length = str2.length();
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    char charAt = str2.charAt(i12);
                    if (charAt < '\u0080') {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i11 < i12) {
                            obj.R0(i11, i12, str2);
                        }
                        obj.S0(str);
                        i11 = i12 + 1;
                    } else {
                        if (charAt == '\u2028') {
                            str = "\\u2028";
                        } else if (charAt == '\u2029') {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                        }
                        obj.S0(str);
                        i11 = i12 + 1;
                    }
                }
                if (i11 < length) {
                    obj.R0(i11, length, str2);
                }
                obj.w0(34);
                obj.readByte();
                c4138mArr[i10] = obj.q(obj.f36721Z);
            }
            return new c((String[]) strArr.clone(), 10, ei.l.j(c4138mArr));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final io.sentry.instrumentation.file.d A() {
        if (((File) this.f17397h0).exists()) {
            ((File) this.f17396Z).delete();
            ((File) this.f17397h0).renameTo((File) this.f17396Z);
        }
        File file = (File) this.f17396Z;
        return N.t(new FileInputStream(file), file);
    }

    public final AbstractC5170g B(A a5, C3036d c3036d, AbstractC3428g abstractC3428g) {
        int i10;
        AbstractC5170g c5168e;
        AbstractC5170g c5183t;
        boolean z10;
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        boolean booleanValue = AbstractC3427f.f32311N.c(c3036d.f30549r0).booleanValue();
        EnumC3035c enumC3035c = c3036d.f30539h0;
        if (enumC3035c == null) {
            i10 = -1;
        } else {
            i10 = AbstractC6450e.f49999a[enumC3035c.ordinal()];
        }
        switch (i10) {
            case 1:
                byte b10 = (byte) c3036d.f30540i0;
                if (booleanValue) {
                    return new C5188y(b10);
                }
                return new C5167d(b10);
            case 2:
                c5168e = new C5168e((char) c3036d.f30540i0);
                break;
            case 3:
                short s10 = (short) c3036d.f30540i0;
                if (booleanValue) {
                    return new C5188y(s10);
                }
                return new C5185v(s10);
            case 4:
                int i11 = (int) c3036d.f30540i0;
                if (booleanValue) {
                    return new C5188y(i11);
                }
                return new C5174k(i11);
            case 5:
                long j6 = c3036d.f30540i0;
                if (booleanValue) {
                    c5183t = new C5188y(j6);
                } else {
                    c5183t = new C5183t(j6);
                }
                return c5183t;
            case 6:
                c5168e = new C5166c(c3036d.f30541j0);
                break;
            case 7:
                c5168e = new C5166c(c3036d.f30542k0);
                break;
            case 8:
                if (c3036d.f30540i0 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c5168e = new C5166c(z10);
                break;
            case 9:
                c5168e = new C5186w(abstractC3428g.b(c3036d.f30543l0));
                break;
            case 10:
                c5168e = new C5182s(R4.b.f1(abstractC3428g, c3036d.f30544m0), c3036d.f30548q0);
                break;
            case 11:
                c5168e = new C5172i(R4.b.f1(abstractC3428g, c3036d.f30544m0), R4.b.o1(abstractC3428g, c3036d.f30545n0));
                break;
            case 12:
                C3039g c3039g = c3036d.f30546o0;
                AbstractC3557B.b0("getAnnotation(...)", c3039g);
                c5168e = new C5164a(k(c3039g, abstractC3428g));
                break;
            case 13:
                List<C3036d> list = c3036d.f30547p0;
                AbstractC3557B.b0("getArrayElementList(...)", list);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (C3036d c3036d2 : list) {
                    D e10 = ((B) this.f17396Z).j().e();
                    AbstractC3557B.b0("getAnyType(...)", e10);
                    AbstractC3557B.Z(c3036d2);
                    arrayList.add(B(e10, c3036d2, abstractC3428g));
                }
                return new C5187x(arrayList, a5);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c3036d.f30539h0 + " (expected " + a5 + ')').toString());
        }
        return c5168e;
    }

    public final Qd.q C(String str) {
        InputStream inputStream;
        String str2 = (String) this.f17396Z;
        ((Wc.d) this.f17397h0).getClass();
        AbstractC3557B.c0("writeKey", str2);
        HttpURLConnection b10 = Wc.d.b("https://" + str + "/projects/" + str2 + "/settings");
        b10.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=utf-8");
        int responseCode = b10.getResponseCode();
        if (responseCode == 200) {
            try {
                inputStream = b10.getInputStream();
            } catch (IOException unused) {
                inputStream = b10.getErrorStream();
            }
            return new Qd.q(b10, inputStream);
        }
        b10.disconnect();
        StringBuilder q10 = android.gov.nist.core.a.q("HTTP ", responseCode, ": ");
        q10.append(b10.getResponseMessage());
        throw new IOException(q10.toString());
    }

    @Override // E2.C
    public final void D(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new X(this, q10, c0484p, c0488u, 2));
        }
    }

    @Override // B2.o
    public final void E(int i10, C0492y c0492y) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Z(this, q10, 0));
        }
    }

    @Override // E2.C
    public final void F(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new X(this, q10, c0484p, c0488u, 1));
        }
    }

    public final C5531a G() {
        if (((File) this.f17396Z).exists()) {
            if (!((File) this.f17397h0).exists()) {
                if (!((File) this.f17396Z).renameTo((File) this.f17397h0)) {
                    s2.p.g("AtomicFile", "Couldn't rename file " + ((File) this.f17396Z) + " to backup file " + ((File) this.f17397h0));
                }
            } else {
                ((File) this.f17396Z).delete();
            }
        }
        try {
            return new C5531a((File) this.f17396Z);
        } catch (FileNotFoundException e10) {
            File parentFile = ((File) this.f17396Z).getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new C5531a((File) this.f17396Z);
                } catch (FileNotFoundException e11) {
                    throw new IOException("Couldn't create " + ((File) this.f17396Z), e11);
                }
            }
            throw new IOException("Couldn't create " + ((File) this.f17396Z), e10);
        }
    }

    public final N7.m H(Object obj) {
        o8.f fVar = (o8.f) this.f17396Z;
        fVar.getClass();
        o8.s sVar = new o8.s(fVar.f40945b, ((o8.u) this.f17397h0).f40984a, ((Long) obj).longValue());
        N7.m mVar = new N7.m();
        mVar.g(sVar);
        return mVar;
    }

    public final Qd.q I(String str) {
        AbstractC3557B.c0("apiHost", str);
        ((Wc.d) this.f17397h0).getClass();
        HttpURLConnection b10 = Wc.d.b("https://" + str + "/b");
        b10.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "text/plain");
        b10.setDoOutput(true);
        b10.setChunkedStreamingMode(0);
        b10.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        return new Qd.q(b10, new GZIPOutputStream(b10.getOutputStream()));
    }

    public final void J() {
        ((v7.o) ((RunnableC5216j) this.f17397h0).f43444h0).getClass();
        throw null;
    }

    @Override // y1.AbstractC6496f
    public final void b() {
        ((G3.s) this.f17396Z).d();
    }

    @Override // L2.AbstractC0888i
    public final C0887h c(L2.r rVar, long j6) {
        C0887h c0887h;
        long o10 = rVar.o();
        int min = (int) Math.min(20000L, rVar.h() - o10);
        ((s2.u) this.f17397h0).C(min);
        rVar.n(((s2.u) this.f17397h0).f45193a, 0, min);
        s2.u uVar = (s2.u) this.f17397h0;
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (uVar.a() >= 4) {
            if (P2.a.d(uVar.f45194b, uVar.f45193a) != 442) {
                uVar.G(1);
            } else {
                uVar.G(4);
                long c10 = p3.y.c(uVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((z) this.f17396Z).b(c10);
                    if (b10 > j6) {
                        if (j10 == -9223372036854775807L) {
                            return new C0887h(b10, -1, o10);
                        }
                        c0887h = new C0887h(-9223372036854775807L, 0, o10 + i11);
                    } else if (100000 + b10 > j6) {
                        c0887h = new C0887h(-9223372036854775807L, 0, o10 + uVar.f45194b);
                    } else {
                        i11 = uVar.f45194b;
                        j10 = b10;
                    }
                    return c0887h;
                }
                int i12 = uVar.f45195c;
                if (uVar.a() < 10) {
                    uVar.F(i12);
                } else {
                    uVar.G(9);
                    int u10 = uVar.u() & 7;
                    if (uVar.a() < u10) {
                        uVar.F(i12);
                    } else {
                        uVar.G(u10);
                        if (uVar.a() < 4) {
                            uVar.F(i12);
                        } else {
                            if (P2.a.d(uVar.f45194b, uVar.f45193a) == 443) {
                                uVar.G(4);
                                int z10 = uVar.z();
                                if (uVar.a() < z10) {
                                    uVar.F(i12);
                                } else {
                                    uVar.G(z10);
                                }
                            }
                            while (true) {
                                if (uVar.a() < 4) {
                                    break;
                                }
                                int d10 = P2.a.d(uVar.f45194b, uVar.f45193a);
                                if (d10 == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                    break;
                                }
                                uVar.G(4);
                                if (uVar.a() < 2) {
                                    uVar.F(i12);
                                    break;
                                }
                                uVar.F(Math.min(uVar.f45195c, uVar.f45194b + uVar.z()));
                            }
                        }
                    }
                }
                i10 = uVar.f45194b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new C0887h(j10, -2, o10 + i10);
        }
        return C0887h.f10602d;
    }

    @Override // B2.o
    public final void d(int i10, C0492y c0492y, int i11) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new s2.l(this, q10, i11, 1));
        }
    }

    @Override // B2.o
    public final void e(int i10, C0492y c0492y) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Z(this, q10, 1));
        }
    }

    @Override // B2.o
    public final void f(int i10, C0492y c0492y, Exception exc) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Q1.n(this, q10, exc, 6));
        }
    }

    @Override // B2.o
    public final void g(int i10, C0492y c0492y) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Z(this, q10, 2));
        }
    }

    @Override // L2.AbstractC0888i
    public final void h() {
        s2.u uVar = (s2.u) this.f17397h0;
        byte[] bArr = AbstractC5530A.f45136f;
        uVar.getClass();
        uVar.D(bArr.length, bArr);
    }

    @Override // K8.n
    public final Object i() {
        throw new RuntimeException((String) this.f17396Z);
    }

    @Override // qh.AbstractC5327a
    public final void j(O4.a aVar, byte[] bArr, R4.a aVar2, Q4.a aVar3, S4.b bVar) {
        try {
            AbstractC2469q0.p(((Method) this.f17396Z).invoke(null, ((Constructor) this.f17397h0).newInstance(new Object[0]), aVar, bArr, aVar2, aVar3, bVar));
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Cannot access an Android dex file translation method", e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Cannot instantiate dex context", e11);
        } catch (InvocationTargetException e12) {
            throw new IllegalStateException("Cannot invoke Android dex file translation method", e12.getTargetException());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [jf.i] */
    public final Nf.d k(C3039g c3039g, AbstractC3428g abstractC3428g) {
        AbstractC3557B.c0("proto", c3039g);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC0997f v02 = R4.b.v0((B) this.f17396Z, R4.b.f1(abstractC3428g, c3039g.f30594h0), (i) this.f17397h0);
        Map map = w.f37484Y;
        if (c3039g.f30595i0.size() != 0 && !Dg.m.f(v02)) {
            int i10 = AbstractC4838e.f40339a;
            if (AbstractC4838e.n(v02, EnumC0998g.f12088j0)) {
                Collection u10 = v02.u();
                AbstractC3557B.b0("getConstructors(...)", u10);
                AbstractC0996e abstractC0996e = (AbstractC0996e) kf.t.C2(u10);
                if (abstractC0996e != null) {
                    List S = ((AbstractC1165x) abstractC0996e).S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    int n02 = P4.a.n0(AbstractC6583a.H1(S, 10));
                    if (n02 < 16) {
                        n02 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                    for (Object obj : S) {
                        linkedHashMap.put(((AbstractC1158p) ((h0) obj)).getName(), obj);
                    }
                    List<C3037e> list = c3039g.f30595i0;
                    AbstractC3557B.b0("getArgumentList(...)", list);
                    ArrayList arrayList = new ArrayList();
                    for (C3037e c3037e : list) {
                        AbstractC3557B.Z(c3037e);
                        h0 h0Var = (h0) linkedHashMap.get(R4.b.o1(abstractC3428g, c3037e.f30568h0));
                        AbstractC5170g abstractC5170g = null;
                        if (h0Var != null) {
                            C4294f o12 = R4.b.o1(abstractC3428g, c3037e.f30568h0);
                            A type = ((Pf.c0) h0Var).getType();
                            AbstractC3557B.b0("getType(...)", type);
                            C3036d c3036d = c3037e.f30569i0;
                            AbstractC3557B.b0("getValue(...)", c3036d);
                            AbstractC5170g B10 = B(type, c3036d, abstractC3428g);
                            if (l(B10, type, c3036d)) {
                                abstractC5170g = B10;
                            }
                            if (abstractC5170g == null) {
                                String str = "Unexpected argument value: actual type " + c3036d.f30539h0 + " != expected type " + type;
                                AbstractC3557B.c0("message", str);
                                abstractC5170g = new C5173j(str);
                            }
                            abstractC5170g = new C3959i(o12, abstractC5170g);
                        }
                        if (abstractC5170g != null) {
                            arrayList.add(abstractC5170g);
                        }
                    }
                    map = AbstractC4268D.k1(arrayList);
                }
            }
        }
        return new Nf.d(v02.n(), map, V.f12075a);
    }

    public final boolean l(AbstractC5170g abstractC5170g, A a5, C3036d c3036d) {
        int i10;
        AbstractC0997f abstractC0997f;
        EnumC3035c enumC3035c = c3036d.f30539h0;
        if (enumC3035c == null) {
            i10 = -1;
        } else {
            i10 = AbstractC6450e.f49999a[enumC3035c.ordinal()];
        }
        if (i10 != 10) {
            if (i10 != 13) {
                return AbstractC3557B.K(abstractC5170g.a((B) this.f17396Z), a5);
            }
            if (abstractC5170g instanceof C5165b) {
                C5165b c5165b = (C5165b) abstractC5170g;
                if (((List) c5165b.f43144a).size() == c3036d.f30547p0.size()) {
                    A f6 = ((B) this.f17396Z).j().f(a5);
                    Collection collection = (Collection) c5165b.f43144a;
                    AbstractC3557B.c0("<this>", collection);
                    Cf.e eVar = new Cf.e(0, collection.size() - 1, 1);
                    if ((eVar instanceof Collection) && ((Collection) eVar).isEmpty()) {
                        return true;
                    }
                    Cf.f it = eVar.iterator();
                    while (it.f3111h0) {
                        int a10 = it.a();
                        C3036d c3036d2 = (C3036d) c3036d.f30547p0.get(a10);
                        AbstractC3557B.b0("getArrayElement(...)", c3036d2);
                        if (!l((AbstractC5170g) ((List) c5165b.f43144a).get(a10), f6, c3036d2)) {
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC5170g).toString());
        }
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof AbstractC0997f) {
            abstractC0997f = (AbstractC0997f) k10;
        } else {
            abstractC0997f = null;
        }
        if (abstractC0997f == null) {
            return true;
        }
        C4294f c4294f = Jf.l.f9117e;
        if (Jf.l.b(abstractC0997f, Jf.p.P)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [io.sentry.protocol.y, java.lang.Object] */
    public final ArrayList n(ArrayList arrayList, Map map, boolean z10) {
        boolean z11;
        Thread currentThread = Thread.currentThread();
        if (!map.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            if (!map.containsKey(currentThread)) {
                map.put(currentThread, currentThread.getStackTrace());
            }
            for (Map.Entry entry : map.entrySet()) {
                Thread thread = (Thread) entry.getKey();
                if ((thread == currentThread && !z10) || (arrayList != null && arrayList.contains(Long.valueOf(thread.getId())))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Thread thread2 = (Thread) entry.getKey();
                ?? obj = new Object();
                obj.f34665h0 = thread2.getName();
                obj.f34664Z = Integer.valueOf(thread2.getPriority());
                obj.f34663Y = Long.valueOf(thread2.getId());
                obj.f34669l0 = Boolean.valueOf(thread2.isDaemon());
                obj.f34666i0 = thread2.getState().name();
                obj.f34667j0 = Boolean.valueOf(z11);
                ArrayList b10 = ((s1) this.f17396Z).b((StackTraceElement[]) entry.getValue(), false);
                if (((r1) this.f17397h0).isAttachStacktrace() && b10 != null && !b10.isEmpty()) {
                    x xVar = new x(b10);
                    xVar.f34661h0 = Boolean.TRUE;
                    obj.f34671n0 = xVar;
                }
                arrayList2.add(obj);
            }
            return arrayList2;
        }
        return null;
    }

    @Override // E2.C
    public final void o(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new X(this, q10, c0484p, c0488u, 0));
        }
    }

    public final ArrayList p(String str) {
        S s10;
        String str2;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.DependencyDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        ((x3.y) this.f17396Z).b();
        Cursor t12 = A7.b.t1((x3.y) this.f17396Z, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final Pair q(int i10, C0492y c0492y) {
        C0492y c0492y2;
        C0492y c0492y3 = null;
        if (c0492y != null) {
            b0 b0Var = (b0) this.f17396Z;
            int i11 = 0;
            while (true) {
                if (i11 < b0Var.f50518c.size()) {
                    if (((C0492y) b0Var.f50518c.get(i11)).f4423d == c0492y.f4423d) {
                        Object obj = b0Var.f50517b;
                        int i12 = y2.h0.f50608s0;
                        c0492y2 = c0492y.a(Pair.create(obj, c0492y.f4420a));
                        break;
                    }
                    i11++;
                } else {
                    c0492y2 = null;
                    break;
                }
            }
            if (c0492y2 == null) {
                return null;
            }
            c0492y3 = c0492y2;
        }
        return Pair.create(Integer.valueOf(i10 + ((b0) this.f17396Z).f50519d), c0492y3);
    }

    public final KeyListener r(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((C1915c) ((S1.b) this.f17397h0).f16066c).l(keyListener);
        }
        return keyListener;
    }

    @Override // B2.o
    public final void s(int i10, C0492y c0492y) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Z(this, q10, 3));
        }
    }

    @Override // E2.C
    public final void t(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u, IOException iOException, boolean z10) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Y(this, q10, c0484p, c0488u, iOException, z10, 0));
        }
    }

    public final String toString() {
        String str;
        switch (this.f17395Y) {
            case 21:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f17396Z);
                sb2.append(' ');
                if (((List) this.f17397h0).isEmpty()) {
                    str = "";
                } else {
                    str = ", ".concat(kf.t.m2((List) this.f17397h0, Separators.COMMA, null, null, null, 62));
                }
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // E2.C
    public final void u(int i10, C0492y c0492y, C0488u c0488u) {
        Pair q10 = q(i10, c0492y);
        if (q10 != null) {
            ((y) ((c0) this.f17397h0).f50531i).c(new Q1.n(this, q10, c0488u, 5));
        }
    }

    public final boolean v(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.DependencyDao");
        } else {
            s10 = null;
        }
        boolean z10 = true;
        C6270B a5 = C6270B.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        ((x3.y) this.f17396Z).b();
        boolean z11 = false;
        Cursor t12 = A7.b.t1((x3.y) this.f17396Z, a5, false);
        try {
            if (t12.moveToFirst()) {
                if (t12.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final Properties w() {
        try {
            File file = new File((String) this.f17396Z);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            bufferedInputStream.close();
            return properties;
        } catch (IOException e10) {
            ((H) this.f17397h0).b(EnumC3642e1.ERROR, e10, "Failed to load Sentry configuration from file: %s", (String) this.f17396Z);
            return null;
        }
    }

    public final void x(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f17396Z).getContext().obtainStyledAttributes(attributeSet, AbstractC4308a.f37672i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((C1915c) ((S1.b) this.f17397h0).f16066c).v(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection z(InputConnection inputConnection, EditorInfo editorInfo) {
        S1.b bVar = (S1.b) this.f17397h0;
        if (inputConnection == null) {
            bVar.getClass();
            return null;
        }
        return ((C1915c) bVar.f16066c).s(inputConnection, editorInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C3636c1 c3636c1) {
        this(18);
        this.f17395Y = 18;
        m(this, c3636c1);
    }

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f17395Y = i10;
        this.f17396Z = obj;
        this.f17397h0 = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f17395Y = i10;
        this.f17397h0 = obj;
        this.f17396Z = obj2;
    }

    public c(RunnableC5216j runnableC5216j, AlertDialog alertDialog) {
        this.f17395Y = 15;
        this.f17397h0 = runnableC5216j;
        this.f17396Z = alertDialog;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z zVar, int i10) {
        this(zVar);
        this.f17395Y = 8;
    }

    public c(String str, Wc.d dVar) {
        this.f17395Y = 20;
        AbstractC3557B.c0("writeKey", str);
        AbstractC3557B.c0("requestFactory", dVar);
        this.f17396Z = str;
        this.f17397h0 = dVar;
    }

    public c(String str, ArrayList arrayList) {
        this.f17395Y = 21;
        AbstractC3557B.c0("name", str);
        this.f17396Z = str;
        this.f17397h0 = arrayList;
    }

    public c(String str, HashMap hashMap) {
        this.f17395Y = 22;
        Ad.l.Z0("url is required", str);
        try {
            this.f17396Z = URI.create(str).toURL();
            this.f17397h0 = hashMap;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    @Override // qh.AbstractC5327a
    public final void a(Q4.a aVar) {
    }

    public c(x3.y yVar) {
        this.f17395Y = 0;
        this.f17396Z = yVar;
        this.f17397h0 = new b(this, yVar, 0);
    }

    public c(s1 s1Var, r1 r1Var) {
        this.f17395Y = 23;
        this.f17396Z = s1Var;
        Ad.l.Z0("The SentryOptions is required", r1Var);
        this.f17397h0 = r1Var;
    }

    public c(B b10, i iVar) {
        this.f17395Y = 26;
        AbstractC3557B.c0("module", b10);
        AbstractC3557B.c0("notFoundClasses", iVar);
        this.f17396Z = b10;
        this.f17397h0 = iVar;
    }

    public c(EditText editText) {
        this.f17395Y = 1;
        this.f17396Z = editText;
        this.f17397h0 = new S1.b(editText);
    }

    public c(File file) {
        this.f17395Y = 5;
        this.f17396Z = file;
        this.f17397h0 = new File(file.getPath() + ".bak");
    }

    public c(z zVar) {
        this.f17395Y = 8;
        this.f17396Z = zVar;
        this.f17397h0 = new s2.u();
    }

    public c(Animation animation) {
        this.f17395Y = 4;
        this.f17396Z = animation;
        this.f17397h0 = null;
    }

    public c(Animator animator) {
        this.f17395Y = 4;
        this.f17396Z = null;
        this.f17397h0 = animator;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f17395Y = 3;
        int size = arrayList.size();
        this.f17396Z = new int[size];
        this.f17397h0 = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f17396Z)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f17397h0)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public c(int i10, int i11) {
        this.f17395Y = 3;
        this.f17396Z = new int[]{i10, i11};
        this.f17397h0 = new float[]{0.0f, 1.0f};
    }

    public c(int i10, int i11, int i12) {
        this.f17395Y = 3;
        this.f17396Z = new int[]{i10, i11, i12};
        this.f17397h0 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(U7.e eVar, U7.e eVar2) {
        this.f17395Y = 16;
        eVar.getClass();
        eVar2.getClass();
        if (0.0f <= 0.0f) {
            this.f17396Z = eVar;
            this.f17397h0 = eVar2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
