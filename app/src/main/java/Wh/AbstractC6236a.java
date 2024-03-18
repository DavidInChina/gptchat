package wh;

import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import sh.AbstractC5639k;
import sh.AbstractC5640l;
import sh.AbstractC5641m;
import th.AbstractC5802j;
import th.h0;
import uh.AbstractC5929a;
import yh.AbstractC6632q;
import yh.C6593a1;
import yh.EnumC6628o;
import yh.G1;
import yh.H1;
import yh.R0;
import yh.Z0;
import yh.l1;

/* renamed from: wh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6236a extends AbstractC5639k implements AbstractC6250o {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f48530Y;

    @Override // wh.AbstractC6250o
    public boolean F0() {
        if (!W0() && !U()) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5641m
    public final AbstractC5641m I() {
        if (h1(8)) {
            return null;
        }
        return mo118a().l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: GenericSignatureFormatError -> 0x012c, TryCatch #0 {GenericSignatureFormatError -> 0x012c, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0017, B:7:0x002d, B:9:0x0033, B:12:0x003e, B:13:0x0041, B:15:0x004b, B:16:0x0057, B:18:0x005d, B:20:0x0070, B:25:0x007f, B:27:0x0090, B:32:0x009e, B:33:0x00ad, B:35:0x00b1, B:36:0x00be, B:38:0x00c4, B:40:0x00ca, B:44:0x00da, B:46:0x00dd, B:47:0x00e1, B:50:0x00ec, B:51:0x00f0, B:53:0x00f8, B:54:0x00fc, B:56:0x0102, B:58:0x0115, B:64:0x0126), top: B:67:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8 A[Catch: GenericSignatureFormatError -> 0x012c, TryCatch #0 {GenericSignatureFormatError -> 0x012c, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0017, B:7:0x002d, B:9:0x0033, B:12:0x003e, B:13:0x0041, B:15:0x004b, B:16:0x0057, B:18:0x005d, B:20:0x0070, B:25:0x007f, B:27:0x0090, B:32:0x009e, B:33:0x00ad, B:35:0x00b1, B:36:0x00be, B:38:0x00c4, B:40:0x00ca, B:44:0x00da, B:46:0x00dd, B:47:0x00e1, B:50:0x00ec, B:51:0x00f0, B:53:0x00f8, B:54:0x00fc, B:56:0x0102, B:58:0x0115, B:64:0x0126), top: B:67:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126 A[Catch: GenericSignatureFormatError -> 0x012c, TRY_LEAVE, TryCatch #0 {GenericSignatureFormatError -> 0x012c, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0017, B:7:0x002d, B:9:0x0033, B:12:0x003e, B:13:0x0041, B:15:0x004b, B:16:0x0057, B:18:0x005d, B:20:0x0070, B:25:0x007f, B:27:0x0090, B:32:0x009e, B:33:0x00ad, B:35:0x00b1, B:36:0x00be, B:38:0x00c4, B:40:0x00ca, B:44:0x00da, B:46:0x00dd, B:47:0x00e1, B:50:0x00ec, B:51:0x00f0, B:53:0x00f8, B:54:0x00fc, B:56:0x0102, B:58:0x0115, B:64:0x0126), top: B:67:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String N0() {
        boolean z10;
        AbstractC1239q abstractC1239q;
        AbstractC1239q abstractC1239q2;
        boolean z11;
        try {
            Ph.b bVar = new Ph.b();
            boolean z12 = false;
            for (l1.a aVar : r0()) {
                bVar.h(aVar.A0());
                boolean z13 = true;
                for (l1.a aVar2 : aVar.getUpperBounds()) {
                    if (!z13) {
                        bVar.k();
                    }
                    aVar2.k(new R0(bVar));
                    z13 = false;
                }
                z12 = true;
            }
            for (l1.a aVar3 : getParameters().I0()) {
                bVar.l();
                aVar3.k(new R0(bVar));
                if (!z12 && aVar3.c().b()) {
                    z12 = false;
                }
                z12 = true;
            }
            l1.a returnType = getReturnType();
            bVar.m();
            returnType.k(new R0(bVar));
            if (!z12 && returnType.c().b()) {
                z10 = false;
                G1<l1.a> V10 = V();
                AbstractC1230h a5 = AbstractC1235m.a(EnumC6628o.f51057Y);
                abstractC1239q = (AbstractC1239q) V10;
                switch (abstractC1239q.f15001Y) {
                    case 0:
                        ArrayList arrayList = new ArrayList(abstractC1239q.size());
                        Iterator it = abstractC1239q.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null && a5.a(((AbstractC6632q) next).c())) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.size() == abstractC1239q.size()) {
                            abstractC1239q2 = abstractC1239q;
                            break;
                        } else {
                            abstractC1239q2 = abstractC1239q.y(arrayList);
                            break;
                        }
                        break;
                    default:
                        abstractC1239q2 = abstractC1239q;
                        break;
                }
                if (!((G1) abstractC1239q2).isEmpty()) {
                    for (l1.a aVar4 : V10) {
                        bVar.g();
                        aVar4.k(new R0(bVar));
                        if (!z10 && aVar4.c().b()) {
                            z10 = false;
                        }
                        z10 = true;
                    }
                }
                if (z10) {
                    return null;
                }
                return bVar.f14258Y.toString();
            }
            z10 = true;
            G1<l1.a> V102 = V();
            AbstractC1230h a52 = AbstractC1235m.a(EnumC6628o.f51057Y);
            abstractC1239q = (AbstractC1239q) V102;
            switch (abstractC1239q.f15001Y) {
            }
            if (!((G1) abstractC1239q2).isEmpty()) {
            }
            if (z10) {
            }
        } catch (GenericSignatureFormatError unused) {
            return null;
        }
    }

    @Override // sh.AbstractC5641m
    public final Object S0(AbstractC5640l abstractC5640l) {
        AbstractC6242g abstractC6242g = (AbstractC6242g) y();
        C6593a1 c6593a1 = (C6593a1) abstractC5640l;
        return new Z0(c6593a1.f50989b, c6593a1.f50988a);
    }

    @Override // wh.AbstractC6250o
    public boolean U() {
        return "<clinit>".equals(D0());
    }

    @Override // sh.AbstractC5641m
    public final boolean V0() {
        return !r0().isEmpty();
    }

    @Override // wh.AbstractC6250o
    public boolean W0() {
        return "<init>".equals(D0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6250o)) {
            return false;
        }
        AbstractC6250o abstractC6250o = (AbstractC6250o) obj;
        if (D0().equals(abstractC6250o.D0()) && mo118a().equals(abstractC6250o.mo118a()) && getReturnType().l0().equals(abstractC6250o.getReturnType().l0()) && getParameters().I0().Q().equals(abstractC6250o.getParameters().I0().Q())) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        if (F0()) {
            return getName();
        }
        return "";
    }

    @Override // sh.AbstractC5637i.a
    public String getDescriptor() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        for (l1 l1Var : getParameters().I0().Q()) {
            sb2.append(l1Var.getDescriptor());
        }
        sb2.append(')');
        sb2.append(getReturnType().l0().getDescriptor());
        return sb2.toString();
    }

    @Override // sh.AbstractC5637i.b
    public String getName() {
        if (F0()) {
            return D0();
        }
        return mo118a().l0().getName();
    }

    public final int hashCode() {
        int i10;
        if (this.f48530Y != 0) {
            i10 = 0;
        } else {
            int hashCode = D0().hashCode();
            i10 = ((getReturnType().l0().hashCode() + ((hashCode + ((mo118a().hashCode() + 17) * 31)) * 31)) * 31) + getParameters().I0().Q().hashCode();
        }
        if (i10 == 0) {
            return this.f48530Y;
        }
        this.f48530Y = i10;
        return i10;
    }

    @Override // sh.AbstractC5639k
    public final String i1() {
        StringBuilder sb2 = new StringBuilder();
        int u02 = u0() & 1343;
        if (u02 != 0) {
            sb2.append(Modifier.toString(u02));
            sb2.append(' ');
        }
        if (F0()) {
            sb2.append(getReturnType().l0().f1());
            sb2.append(' ');
            sb2.append(mo118a().l0().f1());
            sb2.append('.');
        }
        sb2.append(getName());
        sb2.append("(?)");
        return sb2.toString();
    }

    public final C6246k j1() {
        return new C6246k(D0(), getReturnType().l0(), getParameters().I0().Q());
    }

    public final C6249n k1() {
        return new C6249n(getReturnType().l0(), getParameters().I0().Q());
    }

    public final int l1(boolean z10, xh.e eVar) {
        int i10;
        Set<xh.c> singleton = Collections.singleton(g1().c(eVar));
        int u02 = u0();
        if (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class)) {
            i10 = 131072;
        } else {
            i10 = 0;
        }
        int i11 = u02 | i10;
        if (z10) {
            i11 &= -1281;
        } else if ((i11 & 1280) == 0) {
            i11 |= 1024;
        }
        for (xh.c cVar : singleton) {
            i11 = (i11 & (~cVar.b())) | cVar.a();
        }
        return i11;
    }

    @Override // sh.AbstractC5632d
    public final boolean m0(l1 l1Var) {
        if (o1() || mo118a().l0().m0(l1Var)) {
            if (h1(1) || l1Var.equals(mo118a().l0())) {
                return true;
            }
            if (h1(4) && mo118a().l0().f0(l1Var)) {
                return true;
            }
            if (!h1(2) && l1Var.j0(mo118a().l0())) {
                return true;
            }
            if (h1(2) && l1Var.N(mo118a().l0())) {
                return true;
            }
        }
        return false;
    }

    public final boolean m1(l1 l1Var) {
        if (o1() || mo118a().l0().m0(l1Var)) {
            if (h1(1) || l1Var.equals(mo118a().l0())) {
                return true;
            }
            if (!h1(2) && l1Var.j0(mo118a().l0())) {
                return true;
            }
        }
        if (h1(2) && l1Var.N(mo118a().l0())) {
            return true;
        }
        return false;
    }

    public final boolean n1(h0 h0Var) {
        if (W0() || h1(8) || !getReturnType().l0().c0() || !getParameters().isEmpty()) {
            return false;
        }
        l1 l02 = getReturnType().l0();
        Object b10 = h0Var.b();
        if ((!l02.H(Boolean.TYPE) || !(b10 instanceof Boolean)) && ((!l02.H(Byte.TYPE) || !(b10 instanceof Byte)) && ((!l02.H(Character.TYPE) || !(b10 instanceof Character)) && ((!l02.H(Short.TYPE) || !(b10 instanceof Short)) && ((!l02.H(Integer.TYPE) || !(b10 instanceof Integer)) && ((!l02.H(Long.TYPE) || !(b10 instanceof Long)) && ((!l02.H(Float.TYPE) || !(b10 instanceof Float)) && ((!l02.H(Double.TYPE) || !(b10 instanceof Double)) && ((!l02.H(String.class) || !(b10 instanceof String)) && ((!l02.h0(Enum.class) || !(b10 instanceof AbstractC5929a) || !new AbstractC5929a[]{(AbstractC5929a) b10}[0].b().equals(l02)) && ((!l02.h0(Annotation.class) || !(b10 instanceof AbstractC5802j) || !new AbstractC5802j[]{(AbstractC5802j) b10}[0].d().equals(l02)) && ((!l02.H(Class.class) || !(b10 instanceof l1)) && ((!l02.H(boolean[].class) || !(b10 instanceof boolean[])) && ((!l02.H(byte[].class) || !(b10 instanceof byte[])) && ((!l02.H(char[].class) || !(b10 instanceof char[])) && ((!l02.H(short[].class) || !(b10 instanceof short[])) && ((!l02.H(int[].class) || !(b10 instanceof int[])) && ((!l02.H(long[].class) || !(b10 instanceof long[])) && ((!l02.H(float[].class) || !(b10 instanceof float[])) && ((!l02.H(double[].class) || !(b10 instanceof double[])) && (!l02.H(String[].class) || !(b10 instanceof String[])))))))))))))))))))))) {
            if (l02.h0(Enum[].class) && (b10 instanceof AbstractC5929a[])) {
                l1 mo119g = l02.mo119g();
                for (AbstractC5929a abstractC5929a : (AbstractC5929a[]) b10) {
                    if (abstractC5929a.b().equals(mo119g)) {
                    }
                }
            }
            if (l02.h0(Annotation[].class) && (b10 instanceof AbstractC5802j[])) {
                l1 mo119g2 = l02.mo119g();
                for (AbstractC5802j abstractC5802j : (AbstractC5802j[]) b10) {
                    if (abstractC5802j.d().equals(mo119g2)) {
                    }
                }
            }
            if (!l02.H(Class[].class) || !(b10 instanceof l1[])) {
                return false;
            }
        }
        return true;
    }

    public final boolean o1() {
        if (!W0() && !h1(2) && !h1(8) && !U()) {
            return true;
        }
        return false;
    }

    public final int p() {
        return getParameters().I0().p() + (!h1(8));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int u02 = u0() & 1343;
        if (u02 != 0) {
            sb2.append(Modifier.toString(u02));
            sb2.append(' ');
        }
        if (F0()) {
            sb2.append(getReturnType().l0().f1());
            sb2.append(' ');
            sb2.append(mo118a().l0().f1());
            sb2.append('.');
        }
        sb2.append(getName());
        sb2.append('(');
        boolean z10 = true;
        boolean z11 = true;
        for (l1 l1Var : getParameters().I0().Q()) {
            if (!z11) {
                sb2.append(',');
            } else {
                z11 = false;
            }
            sb2.append(l1Var.f1());
        }
        sb2.append(')');
        H1<l1> Q = V().Q();
        if (!Q.isEmpty()) {
            sb2.append(" throws ");
            for (l1 l1Var2 : Q) {
                if (!z10) {
                    sb2.append(',');
                } else {
                    z10 = false;
                }
                sb2.append(l1Var2.f1());
            }
        }
        return sb2.toString();
    }
}
