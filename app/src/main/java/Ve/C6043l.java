package ve;

import Ng.AbstractC1085t;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.v0;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import me.x;
import me.y;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import wf.n;

/* renamed from: ve.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6043l {

    /* renamed from: a  reason: collision with root package name */
    public final C5760d f47518a;

    /* renamed from: b  reason: collision with root package name */
    public final ge.d f47519b;

    public C6043l(C5760d c5760d, ge.d dVar) {
        Set keySet;
        AbstractC3557B.c0("client", dVar);
        this.f47518a = c5760d;
        this.f47519b = dVar;
        Map map = (Map) c5760d.f46130f.d(je.f.f36131a);
        if (map != null && (keySet = map.keySet()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (obj instanceof x) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (y.b(this.f47519b, xVar) == null) {
                    throw new IllegalArgumentException(("Consider installing " + xVar + " plugin because the request requires it to be installed").toString());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC6034c abstractC6034c, AbstractC4825e abstractC4825e) {
        C6039h c6039h;
        int i10;
        if (abstractC4825e instanceof C6039h) {
            c6039h = (C6039h) abstractC4825e;
            int i11 = c6039h.f47507h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6039h.f47507h0 = i11 - Integer.MIN_VALUE;
                Object obj = c6039h.f47505Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6039h.f47507h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    AbstractC4829i abstractC4829i = abstractC6034c.i().get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    AbstractC1085t abstractC1085t = (AbstractC1085t) abstractC4829i;
                    ((C1079o0) abstractC1085t).q0();
                    try {
                        io.ktor.utils.io.x c10 = abstractC6034c.c();
                        AbstractC3557B.c0("<this>", c10);
                        ((t) c10).h(null);
                    } catch (Throwable unused) {
                    }
                    c6039h.getClass();
                    c6039h.f47507h0 = 1;
                    if (((v0) abstractC1085t).F(c6039h) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return jf.y.f36177a;
            }
        }
        c6039h = new C6039h(this, abstractC4825e);
        Object obj2 = c6039h.f47505Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6039h.f47507h0;
        if (i10 == 0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, wf.n] */
    public final Object b(AbstractC4825e abstractC4825e) {
        return c(new AbstractC5163j(2, null), abstractC4825e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:4|(8:6|8|53|(1:(1:(1:(1:(2:14|15)(3:16|17|46))(3:19|20|54))(5:21|49|22|37|(1:39)(2:40|41)))(2:25|26))(3:27|28|(1:30)(1:31))|32|51|33|(1:35)(3:36|37|(0)(0))))|53|(0)(0)|32|51|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n nVar, AbstractC4825e abstractC4825e) {
        C6040i c6040i;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        AbstractC6034c abstractC6034c;
        C6043l c6043l;
        AbstractC6034c abstractC6034c2;
        Object invoke;
        try {
            if (abstractC4825e instanceof C6040i) {
                c6040i = (C6040i) abstractC4825e;
                int i11 = c6040i.f47512j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c6040i.f47512j0 = i11 - Integer.MIN_VALUE;
                    Object obj = c6040i.f47510h0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = c6040i.f47512j0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    th2 = (Throwable) c6040i.f47508Y;
                                    N.B0(obj);
                                    throw th2;
                                }
                                Object obj2 = c6040i.f47508Y;
                                N.B0(obj);
                                return obj2;
                            }
                            abstractC6034c2 = (AbstractC6034c) c6040i.f47509Z;
                            c6043l = (C6043l) c6040i.f47508Y;
                            try {
                                N.B0(obj);
                                c6040i.f47508Y = obj;
                                c6040i.f47509Z = null;
                                c6040i.f47512j0 = 3;
                                if (c6043l.a(abstractC6034c2, c6040i) != enumC5000a) {
                                    return enumC5000a;
                                }
                                return obj;
                            } catch (Throwable th3) {
                                abstractC6034c = abstractC6034c2;
                                th2 = th3;
                                c6040i.f47508Y = th2;
                                c6040i.f47509Z = null;
                                c6040i.f47512j0 = 4;
                                if (c6043l.a(abstractC6034c, c6040i) == enumC5000a) {
                                    return enumC5000a;
                                }
                                throw th2;
                            }
                        }
                        nVar = (n) c6040i.f47509Z;
                        c6043l = (C6043l) c6040i.f47508Y;
                        N.B0(obj);
                    } else {
                        N.B0(obj);
                        c6040i.f47508Y = this;
                        c6040i.f47509Z = nVar;
                        c6040i.f47512j0 = 1;
                        obj = d(c6040i);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c6043l = this;
                    }
                    abstractC6034c = (AbstractC6034c) obj;
                    c6040i.f47508Y = c6043l;
                    c6040i.f47509Z = abstractC6034c;
                    c6040i.f47512j0 = 2;
                    invoke = nVar.invoke(abstractC6034c, c6040i);
                    if (invoke != enumC5000a) {
                        return enumC5000a;
                    }
                    obj = invoke;
                    abstractC6034c2 = abstractC6034c;
                    c6040i.f47508Y = obj;
                    c6040i.f47509Z = null;
                    c6040i.f47512j0 = 3;
                    if (c6043l.a(abstractC6034c2, c6040i) != enumC5000a) {
                    }
                }
            }
            if (i10 == 0) {
            }
            abstractC6034c = (AbstractC6034c) obj;
            c6040i.f47508Y = c6043l;
            c6040i.f47509Z = abstractC6034c;
            c6040i.f47512j0 = 2;
            invoke = nVar.invoke(abstractC6034c, c6040i);
            if (invoke != enumC5000a) {
            }
        } catch (CancellationException e10) {
            throw AbstractC3557B.I2(e10);
        }
        c6040i = new C6040i(this, abstractC4825e);
        Object obj3 = c6040i.f47510h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c6040i.f47512j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        C6042k c6042k;
        int i10;
        try {
            if (abstractC4825e instanceof C6042k) {
                c6042k = (C6042k) abstractC4825e;
                int i11 = c6042k.f47517h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c6042k.f47517h0 = i11 - Integer.MIN_VALUE;
                    Object obj = c6042k.f47515Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c6042k.f47517h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C5760d c5760d = new C5760d();
                        c5760d.d(this.f47518a);
                        ge.d dVar = this.f47519b;
                        c6042k.f47517h0 = 1;
                        obj = dVar.j(c5760d, c6042k);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return ((C3418c) obj).d();
                }
            }
            if (i10 == 0) {
            }
            return ((C3418c) obj).d();
        } catch (CancellationException e10) {
            throw AbstractC3557B.I2(e10);
        }
        c6042k = new C6042k(this, abstractC4825e);
        Object obj2 = c6042k.f47515Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6042k.f47517h0;
    }

    public final String toString() {
        return "HttpStatement[" + this.f47518a.f46125a + ']';
    }
}
