package h2;

import M1.AbstractC0928i;
import Qg.AbstractC1206i;
import Z1.C1767i0;
import Z1.p0;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: h2.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3309f implements AbstractC3304a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3309f f31773a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Wg.d f31774b = Wg.e.a();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f31775c = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Type inference failed for: r7v3, types: [h2.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, C3311h c3311h, String str, AbstractC4825e abstractC4825e) {
        C3305b c3305b;
        int i10;
        Wg.d dVar;
        C3311h c3311h2;
        try {
            if (abstractC4825e instanceof C3305b) {
                c3305b = (C3305b) abstractC4825e;
                int i11 = c3305b.f31758l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c3305b.f31758l0 = i11 - Integer.MIN_VALUE;
                    Object obj = c3305b.f31756j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c3305b.f31758l0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            Wg.d dVar2 = c3305b.f31755i0;
                            str = c3305b.f31754h0;
                            ?? r72 = c3305b.f31753Z;
                            Context context2 = c3305b.f31752Y;
                            N.B0(obj);
                            dVar = dVar2;
                            context = context2;
                            c3311h2 = r72;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        c3305b.f31752Y = context;
                        c3305b.f31753Z = c3311h;
                        c3305b.f31754h0 = str;
                        dVar = f31774b;
                        c3305b.f31755i0 = dVar;
                        c3305b.f31758l0 = 1;
                        c3311h2 = c3311h;
                        if (dVar.e(null, c3305b) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    f31775c.remove(str);
                    c3311h2.a(context, str).delete();
                    dVar.g(null);
                    return y.f36177a;
                }
            }
            f31775c.remove(str);
            c3311h2.a(context, str).delete();
            dVar.g(null);
            return y.f36177a;
        } catch (Throwable th2) {
            dVar.g(null);
            throw th2;
        }
        c3305b = new C3305b(this, abstractC4825e);
        Object obj2 = c3305b.f31756j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3305b.f31758l0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:21:0x006d, B:23:0x0075), top: B:36:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, AbstractC3310g abstractC3310g, String str, AbstractC4825e abstractC4825e) {
        C3306c c3306c;
        int i10;
        Wg.d dVar;
        Wg.d dVar2;
        Object obj;
        Map map;
        try {
            if (abstractC4825e instanceof C3306c) {
                c3306c = (C3306c) abstractC4825e;
                int i11 = c3306c.f31765l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c3306c.f31765l0 = i11 - Integer.MIN_VALUE;
                    Object obj2 = c3306c.f31763j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c3306c.f31765l0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                map = (Map) c3306c.f31761h0;
                                dVar2 = (Wg.a) c3306c.f31760Z;
                                str = (String) c3306c.f31759Y;
                                try {
                                    N.B0(obj2);
                                    obj = (AbstractC0928i) obj2;
                                    map.put(str, obj);
                                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>", obj);
                                    AbstractC0928i abstractC0928i = (AbstractC0928i) obj;
                                    ((Wg.d) dVar2).g(null);
                                    return abstractC0928i;
                                } catch (Throwable th2) {
                                    th = th2;
                                    dVar2.g(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Wg.d dVar3 = c3306c.f31762i0;
                        str = (String) c3306c.f31761h0;
                        abstractC3310g = (AbstractC3310g) c3306c.f31760Z;
                        N.B0(obj2);
                        dVar = dVar3;
                        context = (Context) c3306c.f31759Y;
                    } else {
                        N.B0(obj2);
                        c3306c.f31759Y = context;
                        c3306c.f31760Z = abstractC3310g;
                        c3306c.f31761h0 = str;
                        dVar = f31774b;
                        c3306c.f31762i0 = dVar;
                        c3306c.f31765l0 = 1;
                        if (dVar.e(null, c3306c) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    LinkedHashMap linkedHashMap = f31775c;
                    obj = linkedHashMap.get(str);
                    if (obj != null) {
                        c3306c.f31759Y = str;
                        c3306c.f31760Z = dVar;
                        c3306c.f31761h0 = linkedHashMap;
                        c3306c.f31762i0 = null;
                        c3306c.f31765l0 = 2;
                        Object b10 = abstractC3310g.b(context, str);
                        if (b10 == enumC5000a) {
                            return enumC5000a;
                        }
                        dVar2 = dVar;
                        obj2 = b10;
                        map = linkedHashMap;
                        obj = (AbstractC0928i) obj2;
                        map.put(str, obj);
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>", obj);
                        AbstractC0928i abstractC0928i2 = (AbstractC0928i) obj;
                        ((Wg.d) dVar2).g(null);
                        return abstractC0928i2;
                    }
                    dVar2 = dVar;
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>", obj);
                    AbstractC0928i abstractC0928i22 = (AbstractC0928i) obj;
                    ((Wg.d) dVar2).g(null);
                    return abstractC0928i22;
                }
            }
            LinkedHashMap linkedHashMap2 = f31775c;
            obj = linkedHashMap2.get(str);
            if (obj != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            dVar2 = dVar;
            dVar2.g(null);
            throw th;
        }
        c3306c = new C3306c(this, abstractC4825e);
        Object obj22 = c3306c.f31763j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3306c.f31765l0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:20:0x004e, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, AbstractC3310g abstractC3310g, String str, AbstractC4825e abstractC4825e) {
        C3307d c3307d;
        Object obj;
        Object obj2;
        int i10;
        if (abstractC4825e instanceof C3307d) {
            c3307d = (C3307d) abstractC4825e;
            int i11 = c3307d.f31768h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3307d.f31768h0 = i11 - Integer.MIN_VALUE;
                obj = c3307d.f31766Y;
                obj2 = EnumC5000a.f41328Y;
                i10 = c3307d.f31768h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c3307d.f31768h0 = 1;
                    obj = b(context, abstractC3310g, str, c3307d);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                AbstractC1206i a5 = ((AbstractC0928i) obj).a();
                c3307d.f31768h0 = 2;
                obj = L4.a.m0(a5, c3307d);
                if (obj != obj2) {
                    return obj2;
                }
                return obj;
            }
        }
        c3307d = new C3307d(this, abstractC4825e);
        obj = c3307d.f31766Y;
        obj2 = EnumC5000a.f41328Y;
        i10 = c3307d.f31768h0;
        if (i10 == 0) {
        }
        AbstractC1206i a52 = ((AbstractC0928i) obj).a();
        c3307d.f31768h0 = 2;
        obj = L4.a.m0(a52, c3307d);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v5 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x0051, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h2.f] */
    /* JADX WARN: Type inference failed for: r9v2, types: [wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, p0 p0Var, String str, C1767i0 c1767i0, AbstractC4825e abstractC4825e) {
        C3308e c3308e;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        C1767i0 c1767i02;
        if (abstractC4825e instanceof C3308e) {
            c3308e = (C3308e) abstractC4825e;
            int i11 = c3308e.f31772i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3308e.f31772i0 = i11 - Integer.MIN_VALUE;
                obj = c3308e.f31770Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c3308e.f31772i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r92 = c3308e.f31769Y;
                    N.B0(obj);
                    c1767i02 = r92;
                } else {
                    N.B0(obj);
                    c3308e.f31769Y = c1767i0;
                    c3308e.f31772i0 = 1;
                    obj = b(context, p0Var, str, c3308e);
                    c1767i02 = c1767i0;
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                c3308e.f31769Y = null;
                c3308e.f31772i0 = 2;
                obj = ((AbstractC0928i) obj).b(c1767i02, c3308e);
                if (obj != enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        c3308e = new C3308e(this, abstractC4825e);
        obj = c3308e.f31770Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c3308e.f31772i0;
        if (i10 == 0) {
        }
        c3308e.f31769Y = null;
        c3308e.f31772i0 = 2;
        obj = ((AbstractC0928i) obj).b(c1767i02, c3308e);
        if (obj != enumC5000a) {
        }
    }
}
