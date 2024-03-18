package Hf;

import Bg.j0;
import Bg.p0;
import Gf.A0;
import K4.J;
import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.h0;
import Pf.AbstractC1146d;
import Pf.c0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC4344b;
import lf.C4436a;
import ng.AbstractC4842i;
import of.EnumC5000a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class D implements g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7689a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7690b;

    /* renamed from: c  reason: collision with root package name */
    public final Member f7691c;

    /* renamed from: d  reason: collision with root package name */
    public final io.sentry.android.core.z f7692d;

    /* renamed from: e  reason: collision with root package name */
    public final Cf.g[] f7693e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7694f;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (Jf.l.F(r2) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
        if ((r11 instanceof Hf.f) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02db A[EDGE_INSN: B:161:0x02db->B:139:0x02db ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(g gVar, AbstractC1013w abstractC1013w, boolean z10) {
        Method method;
        io.sentry.android.core.z zVar;
        g gVar2;
        int i10;
        int length;
        int i11;
        Cf.g gVar3;
        Cf.f it;
        int i12;
        int i13;
        Bg.A a5;
        int i14;
        List list;
        int i15;
        int i16;
        Bg.A a10;
        Bg.A a11;
        AbstractC3557B.c0("descriptor", abstractC1013w);
        this.f7689a = z10;
        boolean z11 = false;
        if (gVar instanceof t) {
            AbstractC1146d Z10 = abstractC1013w.Z();
            Z10 = Z10 == null ? abstractC1013w.W() : Z10;
            if (Z10 != null) {
                a11 = Z10.getType();
            } else {
                a11 = null;
            }
            if (a11 != null && AbstractC4842i.g(a11)) {
                ArrayList H6 = r.f.H(J.i(a11));
                AbstractC3557B.Z(H6);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(H6, 10));
                Iterator it2 = H6.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Method) it2.next()).invoke(((t) gVar).f7725f, new Object[0]));
                }
                gVar = new u((Method) ((t) gVar).f7729a, arrayList.toArray(new Object[0]));
            }
        }
        this.f7690b = gVar;
        this.f7691c = gVar.b();
        Bg.A returnType = abstractC1013w.getReturnType();
        AbstractC3557B.Z(returnType);
        if (abstractC1013w.isSuspend()) {
            Bg.D h10 = AbstractC4842i.h(returnType);
            if (h10 != null) {
                a10 = j0.d(returnType).j(h10, p0.f2146h0);
            } else {
                a10 = null;
            }
            if (a10 != null) {
            }
        }
        Class Y7 = r.f.Y(returnType);
        if (Y7 != null) {
            try {
                method = Y7.getDeclaredMethod("box-impl", r.f.F(Y7, abstractC1013w).getReturnType());
                AbstractC3557B.Z(method);
                if (!AbstractC4842i.a(abstractC1013w)) {
                    zVar = new io.sentry.android.core.z(Cf.g.f3113i0, new List[0], method);
                } else {
                    int i17 = -1;
                    if (!(gVar instanceof t) && !(gVar instanceof u)) {
                        if (!(abstractC1013w instanceof AbstractC1002k)) {
                            if (abstractC1013w.W() != null && !(gVar instanceof f)) {
                                AbstractC1003l mo20k = abstractC1013w.mo20k();
                                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                                if (!AbstractC4842i.e(mo20k)) {
                                    i17 = 1;
                                }
                            }
                            i17 = 0;
                        }
                    }
                    if (gVar instanceof u) {
                        i13 = -((u) gVar).f7726f.length;
                    } else {
                        i13 = i17;
                    }
                    e eVar = e.f7714h0;
                    ArrayList arrayList2 = new ArrayList();
                    AbstractC1146d Z11 = abstractC1013w.Z();
                    if (Z11 != null) {
                        a5 = Z11.getType();
                    } else {
                        a5 = null;
                    }
                    if (a5 != null) {
                        arrayList2.add(a5);
                    } else if (abstractC1013w instanceof AbstractC1002k) {
                        AbstractC0997f x10 = ((AbstractC1002k) abstractC1013w).x();
                        AbstractC3557B.b0("getConstructedClass(...)", x10);
                        if (x10.I()) {
                            AbstractC1003l mo20k2 = x10.mo20k();
                            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k2);
                            arrayList2.add(((AbstractC0997f) mo20k2).n());
                        }
                    } else {
                        AbstractC1003l mo20k3 = abstractC1013w.mo20k();
                        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k3);
                        if ((mo20k3 instanceof AbstractC0997f) && ((Boolean) eVar.invoke(mo20k3)).booleanValue()) {
                            arrayList2.add(((AbstractC0997f) mo20k3).n());
                        }
                    }
                    List<h0> S = abstractC1013w.S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    for (h0 h0Var : S) {
                        arrayList2.add(((c0) h0Var).getType());
                    }
                    if (this.f7689a) {
                        Iterator it3 = arrayList2.iterator();
                        int i18 = 0;
                        while (it3.hasNext()) {
                            ArrayList H10 = r.f.H(J.i((Bg.A) it3.next()));
                            if (H10 != null) {
                                i16 = H10.size();
                            } else {
                                i16 = 1;
                            }
                            i18 += i16;
                        }
                        i14 = ((i18 + 31) / 32) + 1;
                    } else {
                        i14 = 0;
                    }
                    int i19 = (abstractC1013w.isSuspend() ? 1 : 0) + i14;
                    Iterator it4 = arrayList2.iterator();
                    int i20 = 0;
                    while (it4.hasNext()) {
                        ArrayList H11 = r.f.H(J.i((Bg.A) it4.next()));
                        if (H11 != null) {
                            i15 = H11.size();
                        } else {
                            i15 = 1;
                        }
                        i20 += i15;
                    }
                    int i21 = i20 + i13 + i19;
                    boolean z12 = this.f7689a;
                    if (AbstractC3557B.h1(this) == i21) {
                        Cf.g D02 = N.D0(Math.max(i17, 0), arrayList2.size() + i17);
                        List[] listArr = new List[i21];
                        for (int i22 = 0; i22 < i21; i22++) {
                            int i23 = D02.f3106Y;
                            if (i22 <= D02.f3107Z && i23 <= i22) {
                                Bg.D i24 = J.i((Bg.A) arrayList2.get(i22 - i17));
                                list = r.f.H(i24);
                                if (list == null) {
                                    Class Y10 = r.f.Y(i24);
                                    if (Y10 != null) {
                                        list = AbstractC4344b.F0(r.f.F(Y10, abstractC1013w));
                                    }
                                }
                                listArr[i22] = list;
                            }
                            list = null;
                            listArr[i22] = list;
                        }
                        zVar = new io.sentry.android.core.z(D02, listArr, method);
                    } else {
                        throw new Lc.l("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC3557B.h1(this) + " != " + i21 + "\nCalling: " + abstractC1013w + "\nParameter types: " + this.f7690b.a() + ")\nDefault: " + z12, 3);
                    }
                }
                this.f7692d = zVar;
                C4436a c4436a = new C4436a();
                gVar2 = this.f7690b;
                if (!(gVar2 instanceof u)) {
                    i10 = ((u) gVar2).f7726f.length;
                } else if (gVar2 instanceof t) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    c4436a.add(N.D0(0, i10));
                }
                List[] listArr2 = (List[]) zVar.f34264Z;
                length = listArr2.length;
                i11 = 0;
                while (i11 < length) {
                    List list2 = listArr2[i11];
                    if (list2 != null) {
                        i12 = list2.size();
                    } else {
                        i12 = 1;
                    }
                    int i25 = i12 + i10;
                    c4436a.add(N.D0(i10, i25));
                    i11++;
                    i10 = i25;
                }
                this.f7693e = (Cf.g[]) AbstractC4344b.Q(c4436a).toArray(new Cf.g[0]);
                gVar3 = (Cf.g) this.f7692d.f34263Y;
                if ((gVar3 instanceof Collection) || !((Collection) gVar3).isEmpty()) {
                    it = gVar3.iterator();
                    while (true) {
                        if (!it.f3111h0) {
                            break;
                        }
                        List list3 = ((List[]) this.f7692d.f34264Z)[it.a()];
                        if (list3 != null && list3.size() > 1) {
                            z11 = true;
                            break;
                        }
                    }
                }
                this.f7694f = z11;
            } catch (NoSuchMethodException unused) {
                throw new Lc.l("No box method found in inline class: " + Y7 + " (calling " + abstractC1013w + ')', 3);
            }
        }
        method = null;
        if (!AbstractC4842i.a(abstractC1013w)) {
        }
        this.f7692d = zVar;
        C4436a c4436a2 = new C4436a();
        gVar2 = this.f7690b;
        if (!(gVar2 instanceof u)) {
        }
        if (i10 > 0) {
        }
        List[] listArr22 = (List[]) zVar.f34264Z;
        length = listArr22.length;
        i11 = 0;
        while (i11 < length) {
        }
        this.f7693e = (Cf.g[]) AbstractC4344b.Q(c4436a2).toArray(new Cf.g[0]);
        gVar3 = (Cf.g) this.f7692d.f34263Y;
        if (gVar3 instanceof Collection) {
        }
        it = gVar3.iterator();
        while (true) {
            if (!it.f3111h0) {
            }
        }
        this.f7694f = z11;
    }

    @Override // Hf.g
    public final List a() {
        return this.f7690b.a();
    }

    @Override // Hf.g
    public final Member b() {
        return this.f7691c;
    }

    @Override // Hf.g
    public final Object call(Object[] objArr) {
        Object invoke;
        Object obj;
        Method method;
        Object obj2;
        AbstractC3557B.c0("args", objArr);
        io.sentry.android.core.z zVar = this.f7692d;
        Cf.g gVar = (Cf.g) zVar.f34263Y;
        List[] listArr = (List[]) zVar.f34264Z;
        Method method2 = (Method) zVar.f34265h0;
        if (!gVar.isEmpty()) {
            boolean z10 = this.f7694f;
            int i10 = gVar.f3107Z;
            int i11 = gVar.f3106Y;
            if (z10) {
                C4436a c4436a = new C4436a(objArr.length);
                for (int i12 = 0; i12 < i11; i12++) {
                    c4436a.add(objArr[i12]);
                }
                if (i11 <= i10) {
                    while (true) {
                        List<Method> list = listArr[i11];
                        Object obj3 = objArr[i11];
                        if (list != null) {
                            for (Method method3 : list) {
                                if (obj3 != null) {
                                    obj2 = method3.invoke(obj3, new Object[0]);
                                } else {
                                    Class<?> returnType = method3.getReturnType();
                                    AbstractC3557B.b0("getReturnType(...)", returnType);
                                    obj2 = A0.e(returnType);
                                }
                                c4436a.add(obj2);
                            }
                        } else {
                            c4436a.add(obj3);
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                int i13 = i10 + 1;
                int l32 = kf.q.l3(objArr);
                if (i13 <= l32) {
                    while (true) {
                        c4436a.add(objArr[i13]);
                        if (i13 == l32) {
                            break;
                        }
                        i13++;
                    }
                }
                objArr = AbstractC4344b.Q(c4436a).toArray(new Object[0]);
            } else {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                for (int i14 = 0; i14 < length; i14++) {
                    if (i14 <= i10 && i11 <= i14) {
                        List list2 = listArr[i14];
                        if (list2 != null) {
                            method = (Method) kf.t.B2(list2);
                        } else {
                            method = null;
                        }
                        obj = objArr[i14];
                        if (method != null) {
                            if (obj != null) {
                                obj = method.invoke(obj, new Object[0]);
                            } else {
                                Class<?> returnType2 = method.getReturnType();
                                AbstractC3557B.b0("getReturnType(...)", returnType2);
                                obj = A0.e(returnType2);
                            }
                        }
                    } else {
                        obj = objArr[i14];
                    }
                    objArr2[i14] = obj;
                }
                objArr = objArr2;
            }
        }
        Object call = this.f7690b.call(objArr);
        if (call == EnumC5000a.f41328Y) {
            return call;
        }
        if (method2 != null && (invoke = method2.invoke(null, call)) != null) {
            return invoke;
        }
        return call;
    }

    @Override // Hf.g
    public final Type getReturnType() {
        return this.f7690b.getReturnType();
    }
}
