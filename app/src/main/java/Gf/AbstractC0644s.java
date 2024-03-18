package Gf;

import Df.AbstractC0404c;
import Mf.AbstractC0994c;
import Mf.AbstractC1007p;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kg.C4291c;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import oe.C4992a;
import yf.AbstractC6583a;

/* renamed from: Gf.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0644s implements AbstractC0404c, t0 {

    /* renamed from: Y  reason: collision with root package name */
    public final v0 f6464Y = AbstractC4344b.C0(new C0643q(this, 1));

    /* renamed from: Z  reason: collision with root package name */
    public final v0 f6465Z = AbstractC4344b.C0(new C0643q(this, 2));

    /* renamed from: h0  reason: collision with root package name */
    public final v0 f6466h0 = AbstractC4344b.C0(new C0643q(this, 4));

    /* renamed from: i0  reason: collision with root package name */
    public final v0 f6467i0 = AbstractC4344b.C0(new C0643q(this, 5));

    /* renamed from: j0  reason: collision with root package name */
    public final v0 f6468j0 = AbstractC4344b.C0(new C0643q(this, 0));

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC3957g f6469k0 = R4.b.C1(EnumC3958h.f36152Y, new C0643q(this, 6));

    public static Object f(r0 r0Var) {
        Class k12 = R4.b.k1(com.google.android.gms.internal.play_billing.N.Z(r0Var));
        if (k12.isArray()) {
            Object newInstance = Array.newInstance(k12.getComponentType(), 0);
            AbstractC3557B.b0("run(...)", newInstance);
            return newInstance;
        }
        throw new Lc.l("Cannot instantiate the default empty array of type " + k12.getSimpleName() + ", because it is not an array type", 3);
    }

    @Override // Df.AbstractC0404c
    public final Object call(Object... objArr) {
        AbstractC3557B.c0("args", objArr);
        try {
            return g().call(objArr);
        } catch (IllegalAccessException e10) {
            throw new C4992a(e10, 6);
        }
    }

    @Override // Df.AbstractC0404c
    public final Object callBy(Map map) {
        int i10;
        Object obj;
        AbstractC3557B.c0("args", map);
        boolean z10 = false;
        if (u()) {
            List<Df.o> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
            for (Df.o oVar : parameters) {
                if (map.containsKey(oVar)) {
                    obj = map.get(oVar);
                    if (obj == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + oVar + ')');
                    }
                } else {
                    Z z11 = (Z) oVar;
                    if (z11.j()) {
                        obj = null;
                    } else if (z11.k()) {
                        obj = f(z11.h());
                    } else {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + z11);
                    }
                }
                arrayList.add(obj);
            }
            Hf.g m10 = m();
            if (m10 != null) {
                try {
                    return m10.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e10) {
                    throw new C4992a(e10, 6);
                }
            }
            throw new Lc.l("This callable does not support a default call: " + s(), 3);
        }
        List<Df.o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return g().call(isSuspend() ? new AbstractC4825e[]{null} : new AbstractC4825e[0]);
            } catch (IllegalAccessException e11) {
                throw new C4992a(e11, 6);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f6468j0.mo122invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean booleanValue = ((Boolean) this.f6469k0.getValue()).booleanValue();
        int i11 = 0;
        for (Df.o oVar2 : parameters2) {
            if (booleanValue) {
                i10 = t(oVar2);
            } else {
                i10 = 1;
            }
            if (map.containsKey(oVar2)) {
                objArr[((Z) oVar2).f6379Z] = map.get(oVar2);
            } else {
                Z z12 = (Z) oVar2;
                if (z12.j()) {
                    if (booleanValue) {
                        int i12 = i11 + i10;
                        for (int i13 = i11; i13 < i12; i13++) {
                            int i14 = (i13 / 32) + size;
                            Object obj2 = objArr[i14];
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj2);
                            objArr[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i13 % 32)));
                        }
                    } else {
                        int i15 = (i11 / 32) + size;
                        Object obj3 = objArr[i15];
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj3);
                        objArr[i15] = Integer.valueOf(((Integer) obj3).intValue() | (1 << (i11 % 32)));
                    }
                    z10 = true;
                } else if (!z12.k()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + z12);
                }
            }
            if (((Z) oVar2).f6380h0 == Df.n.f3645h0) {
                i11 += i10;
            }
        }
        if (!z10) {
            try {
                Hf.g g10 = g();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                AbstractC3557B.b0("copyOf(...)", copyOf);
                return g10.call(copyOf);
            } catch (IllegalAccessException e12) {
                throw new C4992a(e12, 6);
            }
        }
        Hf.g m11 = m();
        if (m11 != null) {
            try {
                return m11.call(objArr);
            } catch (IllegalAccessException e13) {
                throw new C4992a(e13, 6);
            }
        }
        throw new Lc.l("This callable does not support a default call: " + s(), 3);
    }

    public abstract Hf.g g();

    @Override // Df.AbstractC0403b
    public final List getAnnotations() {
        Object mo122invoke = this.f6464Y.mo122invoke();
        AbstractC3557B.b0("invoke(...)", mo122invoke);
        return (List) mo122invoke;
    }

    @Override // Df.AbstractC0404c
    public final List getParameters() {
        Object mo122invoke = this.f6465Z.mo122invoke();
        AbstractC3557B.b0("invoke(...)", mo122invoke);
        return (List) mo122invoke;
    }

    @Override // Df.AbstractC0404c
    public final Df.w getReturnType() {
        Object mo122invoke = this.f6466h0.mo122invoke();
        AbstractC3557B.b0("invoke(...)", mo122invoke);
        return (Df.w) mo122invoke;
    }

    @Override // Df.AbstractC0404c
    public final List getTypeParameters() {
        Object mo122invoke = this.f6467i0.mo122invoke();
        AbstractC3557B.b0("invoke(...)", mo122invoke);
        return (List) mo122invoke;
    }

    @Override // Df.AbstractC0404c
    public final Df.B getVisibility() {
        AbstractC1007p visibility = s().getVisibility();
        AbstractC3557B.b0("getVisibility(...)", visibility);
        C4291c c4291c = A0.f6330a;
        if (AbstractC3557B.K(visibility, Mf.r.f12105e)) {
            return Df.B.f3622Y;
        }
        if (AbstractC3557B.K(visibility, Mf.r.f12103c)) {
            return Df.B.f3623Z;
        }
        if (AbstractC3557B.K(visibility, Mf.r.f12104d)) {
            return Df.B.f3624h0;
        }
        if (AbstractC3557B.K(visibility, Mf.r.f12101a) || AbstractC3557B.K(visibility, Mf.r.f12102b)) {
            return Df.B.f3625i0;
        }
        return null;
    }

    @Override // Df.AbstractC0404c
    public final boolean isAbstract() {
        if (s().h() == Mf.A.f12054j0) {
            return true;
        }
        return false;
    }

    @Override // Df.AbstractC0404c
    public final boolean isFinal() {
        if (s().h() == Mf.A.f12051Z) {
            return true;
        }
        return false;
    }

    @Override // Df.AbstractC0404c
    public final boolean isOpen() {
        if (s().h() == Mf.A.f12053i0) {
            return true;
        }
        return false;
    }

    public abstract H j();

    public abstract Hf.g m();

    public abstract AbstractC0994c s();

    public final int t(Df.o oVar) {
        if (((Boolean) this.f6469k0.getValue()).booleanValue()) {
            Z z10 = (Z) oVar;
            if (A0.h(z10.h())) {
                ArrayList H6 = r.f.H(K4.J.i(z10.h().f6460Y));
                AbstractC3557B.Z(H6);
                return H6.size();
            }
            return 1;
        }
        throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
    }

    public final boolean u() {
        if (AbstractC3557B.K(getName(), "<init>") && j().f().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean v();
}
