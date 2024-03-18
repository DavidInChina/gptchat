package yh;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.Iterator;
import sh.AbstractC5639k;
import sh.AbstractC5640l;
import sh.AbstractC5641m;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import yh.l1;

/* renamed from: yh.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6635s extends AbstractC5639k implements l1 {

    /* renamed from: Z  reason: collision with root package name */
    public static final boolean f51074Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f51075h0;

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f51076Y;

    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f51075h0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f51075h0 = false;
        } catch (SecurityException unused2) {
            f51075h0 = true;
        }
        try {
            Uh.b bVar = new Uh.b("net.bytebuddy.raw");
            if (f51075h0) {
                obj = AccessController.doPrivileged(bVar);
            } else {
                obj = bVar.run();
            }
            z10 = Boolean.parseBoolean((String) obj);
        } catch (Exception unused3) {
        }
        f51074Z = z10;
    }

    public static boolean j1(l1 l1Var, l1 l1Var2) {
        if (l1Var.equals(l1Var2)) {
            return true;
        }
        if (l1Var2.T0()) {
            if (l1Var.T0()) {
                return j1(l1Var.mo119g(), l1Var2.mo119g());
            }
            if (l1Var.H(Object.class) || l1.f51044g0.contains(l1Var.w0())) {
                return true;
            }
            return false;
        } else if (l1Var.H(Object.class)) {
            return !l1Var2.a1();
        } else {
            l1.a L10 = l1Var2.L();
            if (L10 != null && l1Var.f0(L10.l0())) {
                return true;
            }
            if (l1Var.E0()) {
                for (l1 l1Var3 : l1Var2.o0().Q()) {
                    if (l1Var.f0(l1Var3)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // yh.l1
    public final l1 C0() {
        if (H(Boolean.TYPE)) {
            return C6641v.l1(Boolean.class);
        }
        if (H(Byte.TYPE)) {
            return C6641v.l1(Byte.class);
        }
        if (H(Short.TYPE)) {
            return C6641v.l1(Short.class);
        }
        if (H(Character.TYPE)) {
            return C6641v.l1(Character.class);
        }
        if (H(Integer.TYPE)) {
            return C6641v.l1(Integer.class);
        }
        if (H(Long.TYPE)) {
            return C6641v.l1(Long.class);
        }
        if (H(Float.TYPE)) {
            return C6641v.l1(Float.class);
        }
        if (H(Double.TYPE)) {
            return C6641v.l1(Double.class);
        }
        return this;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return getName().replace('.', '/');
    }

    @Override // yh.AbstractC6632q
    public boolean H(Type type) {
        return equals(EnumC6628o.a(type, X.f50977Y));
    }

    @Override // sh.AbstractC5641m
    public final AbstractC5641m I() {
        AbstractC6242g s02 = s0();
        if (s02 == null) {
            if (h1(8)) {
                return null;
            }
            return W();
        }
        return s02;
    }

    @Override // yh.l1
    public boolean K0(l1 l1Var) {
        return j1(l1Var, this);
    }

    @Override // yh.l1
    public boolean N(l1 l1Var) {
        return v().equals(l1Var.v());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[Catch: GenericSignatureFormatError -> 0x00ac, TryCatch #0 {GenericSignatureFormatError -> 0x00ac, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0017, B:7:0x002c, B:9:0x0032, B:11:0x0044, B:12:0x0047, B:14:0x0050, B:16:0x0056, B:17:0x005c, B:19:0x0069, B:24:0x0077, B:25:0x007f, B:27:0x0085, B:29:0x0095, B:35:0x00a6), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: GenericSignatureFormatError -> 0x00ac, TRY_LEAVE, TryCatch #0 {GenericSignatureFormatError -> 0x00ac, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0017, B:7:0x002c, B:9:0x0032, B:11:0x0044, B:12:0x0047, B:14:0x0050, B:16:0x0056, B:17:0x005c, B:19:0x0069, B:24:0x0077, B:25:0x007f, B:27:0x0085, B:29:0x0095, B:35:0x00a6), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String N0() {
        boolean z10;
        try {
            Ph.b bVar = new Ph.b();
            boolean z11 = false;
            for (l1.a aVar : r0()) {
                bVar.h(aVar.A0());
                for (l1.a aVar2 : aVar.getUpperBounds()) {
                    if (aVar2.l0().E0()) {
                        bVar.k();
                    }
                    aVar2.k(new R0(bVar));
                }
                z11 = true;
            }
            l1.a L10 = L();
            if (L10 == null) {
                L10 = C6633q0.i1(Object.class);
            }
            bVar.r();
            L10.k(new R0(bVar));
            if (!z11 && L10.c().b()) {
                z10 = false;
                for (l1.a aVar3 : o0()) {
                    aVar3.k(new R0(bVar));
                    if (!z10 && aVar3.c().b()) {
                        z10 = false;
                    }
                    z10 = true;
                }
                if (z10) {
                    return null;
                }
                return bVar.f14258Y.toString();
            }
            z10 = true;
            while (r4.hasNext()) {
            }
            if (z10) {
            }
        } catch (GenericSignatureFormatError unused) {
            return null;
        }
    }

    @Override // yh.l1
    public final int S() {
        l1 mo118a;
        if (h1(8) || (mo118a = mo118a()) == null) {
            return 0;
        }
        return mo118a.S() + 1;
    }

    @Override // sh.AbstractC5641m
    public final Object S0(AbstractC5640l abstractC5640l) {
        C6593a1 c6593a1 = (C6593a1) abstractC5640l;
        l1.a aVar = c6593a1.f50989b.f50994Y;
        l1.a aVar2 = c6593a1.f50988a;
        l1.a J02 = aVar.J0(aVar2);
        if (J02 == null) {
            return aVar2.p0();
        }
        return J02;
    }

    @Override // sh.AbstractC5641m
    public final boolean V0() {
        l1 mo118a;
        if (!r0().isEmpty()) {
            return true;
        }
        if (!h1(8) && (mo118a = mo118a()) != null && mo118a.V0()) {
            return true;
        }
        try {
            AbstractC6242g s02 = s0();
            if (s02 != null) {
                if (((AbstractC6236a) s02).V0()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // yh.AbstractC6632q
    public final EnumC6628o c() {
        return EnumC6628o.f51057Y;
    }

    @Override // yh.l1
    public final boolean c0() {
        if (!a1() && !H(String.class) && ((!h0(Enum.class) || H(Enum.class)) && ((!h0(Annotation.class) || H(Annotation.class)) && !H(Class.class) && (!T0() || mo119g().T0() || !mo119g().c0())))) {
            return false;
        }
        return true;
    }

    @Override // yh.l1
    public boolean c1() {
        if (!m() && !K() && mo118a() != null) {
            return true;
        }
        return false;
    }

    public int d1(boolean z10) {
        int i10;
        int i11;
        int u02 = u0();
        int i12 = 0;
        if (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class)) {
            i10 = 131072;
        } else {
            i10 = 0;
        }
        int i13 = u02 | i10;
        if (Y()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i14 = i13 | i11;
        if (z10) {
            i12 = 32;
        }
        int i15 = i14 | i12;
        if (h1(2)) {
            return i15 & (-11);
        }
        if (h1(4)) {
            return (i15 & (-13)) | 1;
        }
        return i15 & (-9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6632q)) {
            return false;
        }
        AbstractC6632q abstractC6632q = (AbstractC6632q) obj;
        if (abstractC6632q.c().b() && getName().equals(abstractC6632q.l0().getName())) {
            return true;
        }
        return false;
    }

    @Override // yh.l1
    public boolean f0(l1 l1Var) {
        return j1(this, l1Var);
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        if (T0()) {
            l1 l1Var = this;
            int i10 = 0;
            do {
                i10++;
                l1Var = l1Var.mo119g();
            } while (l1Var.T0());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l1Var.f1());
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[]");
            }
            return sb2.toString();
        }
        return getName();
    }

    @Override // yh.l1
    public final l1 g0() {
        if (H(Boolean.class)) {
            return C6641v.l1(Boolean.TYPE);
        }
        if (H(Byte.class)) {
            return C6641v.l1(Byte.TYPE);
        }
        if (H(Short.class)) {
            return C6641v.l1(Short.TYPE);
        }
        if (H(Character.class)) {
            return C6641v.l1(Character.TYPE);
        }
        if (H(Integer.class)) {
            return C6641v.l1(Integer.TYPE);
        }
        if (H(Long.class)) {
            return C6641v.l1(Long.TYPE);
        }
        if (H(Float.class)) {
            return C6641v.l1(Float.TYPE);
        }
        if (H(Double.class)) {
            return C6641v.l1(Double.TYPE);
        }
        return this;
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        return getName();
    }

    @Override // yh.l1
    public boolean h0(Class cls) {
        return K0(C6641v.l1(cls));
    }

    public final int hashCode() {
        int i10;
        if (this.f51076Y != 0) {
            i10 = 0;
        } else {
            i10 = getName().hashCode();
        }
        if (i10 == 0) {
            return this.f51076Y;
        }
        this.f51076Y = i10;
        return i10;
    }

    @Override // sh.AbstractC5639k
    public final String i1() {
        return toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6630p(this);
    }

    @Override // yh.l1
    public final boolean j0(l1 l1Var) {
        AbstractC6597c z10 = z();
        AbstractC6597c z11 = l1Var.z();
        if (z10 != null && z11 != null) {
            return z10.equals(z11);
        }
        if (z10 == z11) {
            return true;
        }
        return false;
    }

    public final boolean k1() {
        return o().equals("package-info");
    }

    @Override // sh.AbstractC5632d
    public final boolean m0(l1 l1Var) {
        if (a1()) {
            return true;
        }
        if (T0()) {
            if (mo119g().m0(l1Var)) {
                return true;
            }
        } else if (h1(1) || h1(4) || j0(l1Var)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (a1()) {
            str = "";
        } else {
            if (h1(512)) {
                str2 = "interface";
            } else {
                str2 = "class";
            }
            str = str2.concat(Separators.SP);
        }
        sb2.append(str);
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // yh.AbstractC6632q
    public l1.a w0() {
        return new C6631p0(this);
    }

    @Override // yh.l1
    public boolean x() {
        return equals(v());
    }

    public boolean x0() {
        if (!a1() && !T0() && !b1().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this;
    }
}
