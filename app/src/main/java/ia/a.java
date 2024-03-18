package Ia;

import Ja.p;
import Ng.F;
import Ng.Q;
import Qg.F0;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.AbstractC4268D;
import kf.t;
import kf.v;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import vd.AbstractC6027b;
import vd.AbstractC6030e;
import vd.EnumC6026a;
import wd.C6168C;
import wf.n;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public l f8481Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC6027b f8482Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f8483h0;

    /* renamed from: i0  reason: collision with root package name */
    public Iterator f8484i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8485j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l f8486k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8486k0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f8486k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[Catch: all -> 0x0025, SQLException -> 0x003d, TryCatch #1 {SQLException -> 0x003d, blocks: (B:17:0x0038, B:53:0x00cc, B:54:0x00ce, B:56:0x00d6, B:57:0x00de, B:59:0x00e4, B:62:0x00ff, B:65:0x0116, B:66:0x011f, B:68:0x0125, B:69:0x0137), top: B:75:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x0025, SQLException -> 0x003d, TryCatch #1 {SQLException -> 0x003d, blocks: (B:17:0x0038, B:53:0x00cc, B:54:0x00ce, B:56:0x00d6, B:57:0x00de, B:59:0x00e4, B:62:0x00ff, B:65:0x0116, B:66:0x011f, B:68:0x0125, B:69:0x0137), top: B:75:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[Catch: all -> 0x0025, SQLException -> 0x003d, LOOP:1: B:66:0x011f->B:68:0x0125, LOOP_END, TryCatch #1 {SQLException -> 0x003d, blocks: (B:17:0x0038, B:53:0x00cc, B:54:0x00ce, B:56:0x00d6, B:57:0x00de, B:59:0x00e4, B:62:0x00ff, B:65:0x0116, B:66:0x011f, B:68:0x0125, B:69:0x0137), top: B:75:0x0038 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [vd.b] */
    /* JADX WARN: Type inference failed for: r5v22, types: [vd.b] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [vd.b] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        List list;
        Iterator it;
        k9.c cVar;
        SQLException e10;
        int n02;
        AbstractC6027b abstractC6027b;
        IllegalArgumentException e11;
        AbstractC6027b abstractC6027b2;
        Object n12;
        Object e12;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8485j0;
        y yVar = y.f36177a;
        l lVar = this.f8486k0;
        k9.c cVar2 = 3;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                it = this.f8484i0;
                                List list2 = this.f8483h0;
                                cVar2 = this.f8482Z;
                                l lVar2 = this.f8481Y;
                                try {
                                    N.B0(obj);
                                    list = list2;
                                    lVar = lVar2;
                                    cVar2 = cVar2;
                                    while (it.hasNext()) {
                                        p pVar = lVar.f8526a;
                                        String str = ((C2311c) it.next()).f26374a;
                                        this.f8481Y = lVar;
                                        this.f8482Z = cVar2;
                                        this.f8483h0 = list;
                                        this.f8484i0 = it;
                                        this.f8485j0 = 4;
                                        if (pVar.d(str, this) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                    }
                                    F0 f02 = lVar.f8530e;
                                    Map map = (Map) f02.getValue();
                                    n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                                    if (n02 < 16) {
                                        n02 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                                    for (Object obj2 : list) {
                                        linkedHashMap.put(new C6168C(((C2311c) obj2).f26374a), obj2);
                                    }
                                    f02.setValue(AbstractC4268D.e1(map, linkedHashMap));
                                    cVar = cVar2;
                                } catch (SQLException e13) {
                                    e10 = e13;
                                    lVar = lVar2;
                                    W.G(lVar.f8528c, "Database error", e10, 4);
                                    cVar = cVar2;
                                    cVar.a();
                                    return yVar;
                                }
                                cVar.a();
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = this.f8482Z;
                        lVar = this.f8481Y;
                        try {
                            N.B0(obj);
                            abstractC6027b = cVar2;
                            list = v.f37483Y;
                            cVar2 = abstractC6027b;
                            if (list.size() > 1000) {
                                it = t.Z1(list, 1000).iterator();
                                cVar2 = cVar2;
                                while (it.hasNext()) {
                                }
                            }
                            F0 f022 = lVar.f8530e;
                            Map map2 = (Map) f022.getValue();
                            n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                            if (n02 < 16) {
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(n02);
                            while (r12.hasNext()) {
                            }
                            f022.setValue(AbstractC4268D.e1(map2, linkedHashMap2));
                            cVar = cVar2;
                        } catch (SQLException e14) {
                            e10 = e14;
                            W.G(lVar.f8528c, "Database error", e10, 4);
                            cVar = cVar2;
                            cVar.a();
                            return yVar;
                        }
                        cVar.a();
                        return yVar;
                    }
                    abstractC6027b2 = this.f8482Z;
                    lVar = this.f8481Y;
                    try {
                        try {
                            N.B0(obj);
                            list = (List) obj;
                            cVar2 = abstractC6027b2;
                        } catch (IllegalArgumentException e15) {
                            e11 = e15;
                            W.W(lVar.f8528c, "Error deserializing persisted conversations", e11, null, 4);
                            p pVar2 = lVar.f8526a;
                            this.f8481Y = lVar;
                            this.f8482Z = abstractC6027b2;
                            this.f8485j0 = 3;
                            pVar2.f8948a.getClass();
                            n12 = Ad.l.n1(this, Q.f12906c, new Ja.f(pVar2, null));
                            if (n12 != EnumC5000a.f41328Y) {
                                n12 = yVar;
                            }
                            if (n12 != enumC5000a) {
                                return enumC5000a;
                            }
                            abstractC6027b = abstractC6027b2;
                            list = v.f37483Y;
                            cVar2 = abstractC6027b;
                            if (list.size() > 1000) {
                            }
                            F0 f0222 = lVar.f8530e;
                            Map map22 = (Map) f0222.getValue();
                            n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                            if (n02 < 16) {
                            }
                            LinkedHashMap linkedHashMap22 = new LinkedHashMap(n02);
                            while (r12.hasNext()) {
                            }
                            f0222.setValue(AbstractC4268D.e1(map22, linkedHashMap22));
                            cVar = cVar2;
                            cVar.a();
                            return yVar;
                        }
                        if (list.size() > 1000) {
                        }
                        F0 f02222 = lVar.f8530e;
                        Map map222 = (Map) f02222.getValue();
                        n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                        if (n02 < 16) {
                        }
                        LinkedHashMap linkedHashMap222 = new LinkedHashMap(n02);
                        while (r12.hasNext()) {
                        }
                        f02222.setValue(AbstractC4268D.e1(map222, linkedHashMap222));
                        cVar = cVar2;
                    } catch (SQLException e16) {
                        e10 = e16;
                        cVar2 = abstractC6027b2;
                        W.G(lVar.f8528c, "Database error", e10, 4);
                        cVar = cVar2;
                        cVar.a();
                        return yVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        cVar2 = abstractC6027b2;
                        ((k9.c) cVar2).a();
                        throw th2;
                    }
                    cVar.a();
                    return yVar;
                }
                N.B0(obj);
            } else {
                N.B0(obj);
                this.f8485j0 = 1;
                obj = lVar.d(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return yVar;
            }
            k9.c a5 = ((k9.d) AbstractC6030e.a()).a(EnumC6026a.f47473i0);
            try {
                a5.b();
                try {
                    p pVar3 = lVar.f8526a;
                    boolean a10 = l.a(lVar);
                    this.f8481Y = lVar;
                    this.f8482Z = a5;
                    this.f8485j0 = 2;
                    e12 = pVar3.e(a10, this);
                } catch (IllegalArgumentException e17) {
                    abstractC6027b2 = a5;
                    e11 = e17;
                    W.W(lVar.f8528c, "Error deserializing persisted conversations", e11, null, 4);
                    p pVar22 = lVar.f8526a;
                    this.f8481Y = lVar;
                    this.f8482Z = abstractC6027b2;
                    this.f8485j0 = 3;
                    pVar22.f8948a.getClass();
                    n12 = Ad.l.n1(this, Q.f12906c, new Ja.f(pVar22, null));
                    if (n12 != EnumC5000a.f41328Y) {
                    }
                    if (n12 != enumC5000a) {
                    }
                } catch (SQLException e18) {
                    cVar2 = a5;
                    e10 = e18;
                    W.G(lVar.f8528c, "Database error", e10, 4);
                    cVar = cVar2;
                    cVar.a();
                    return yVar;
                }
                if (e12 == enumC5000a) {
                    return enumC5000a;
                }
                abstractC6027b2 = a5;
                obj = e12;
                list = (List) obj;
                cVar2 = abstractC6027b2;
                if (list.size() > 1000) {
                }
                F0 f022222 = lVar.f8530e;
                Map map2222 = (Map) f022222.getValue();
                n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                if (n02 < 16) {
                }
                LinkedHashMap linkedHashMap2222 = new LinkedHashMap(n02);
                while (r12.hasNext()) {
                }
                f022222.setValue(AbstractC4268D.e1(map2222, linkedHashMap2222));
                cVar = cVar2;
                cVar.a();
                return yVar;
            } catch (Throwable th4) {
                cVar2 = a5;
                th2 = th4;
                ((k9.c) cVar2).a();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }
}
