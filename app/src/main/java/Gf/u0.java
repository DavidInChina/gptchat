package Gf;

import Bg.C0223p;
import Pf.C1157o;
import Sf.AbstractC1385d;
import Uf.AbstractC1439a;
import Uf.C1455q;
import android.gov.nist.core.Separators;
import dg.C2673m;
import h.C3280f;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import kg.C4294f;
import l8.AbstractC4344b;
import lg.C4464i;
import tg.C5768a;
import xg.AbstractC6446a;
import xg.C6449d;
import yg.C6584a;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f6478a = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r12v0, types: [Xf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Uf.a, Uf.d] */
    /* JADX WARN: Type inference failed for: r30v0, types: [dg.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, dg.o] */
    public static final Rf.g a(Class cls) {
        Lf.j jVar;
        Of.b bVar;
        Of.e eVar;
        AbstractC3557B.c0("<this>", cls);
        ClassLoader d10 = AbstractC1385d.d(cls);
        B0 b02 = new B0(d10);
        ConcurrentHashMap concurrentHashMap = f6478a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(b02);
        if (weakReference != null) {
            Rf.g gVar = (Rf.g) weakReference.get();
            if (gVar != null) {
                return gVar;
            }
            concurrentHashMap.remove(b02, weakReference);
        }
        Rf.d dVar = new Rf.d(d10);
        ClassLoader classLoader = jf.y.class.getClassLoader();
        AbstractC3557B.b0("getClassLoader(...)", classLoader);
        Rf.d dVar2 = new Rf.d(classLoader);
        Rf.b bVar2 = new Rf.b(d10);
        String str = "runtime module for " + d10;
        Rf.f fVar = Rf.f.f15504b;
        Rf.f fVar2 = Rf.f.f15505c;
        AbstractC3557B.c0("moduleName", str);
        Ag.q qVar = new Ag.q("DeserializationComponentsForJava.ModuleData");
        Lf.h[] hVarArr = Lf.h.f11092Y;
        Lf.j jVar2 = new Lf.j(qVar);
        Pf.G g10 = new Pf.G(C4294f.g(Separators.LESS_THAN + str + '>'), qVar, jVar2, 56);
        Jf.j jVar3 = new Jf.j(jVar2, 0, g10);
        Ag.t tVar = qVar.f871a;
        tVar.b();
        try {
            jVar3.mo122invoke();
            tVar.a();
            jVar2.f11096f = new C3280f((Object) g10, true, 4);
            ?? obj = new Object();
            ?? obj2 = new Object();
            U3.i iVar = new U3.i(qVar, g10);
            dg.q qVar2 = dg.q.f28354c;
            Cf.k kVar = Vf.m.f18959u;
            Vf.h hVar = Vf.h.f18953a;
            C5768a c5768a = new C5768a(qVar);
            Mf.Y y10 = Mf.Y.f12077a;
            Tf.b bVar3 = Tf.b.f17210a;
            Jf.o oVar = new Jf.o(g10, iVar);
            Uf.y yVar = Uf.y.f17847d;
            AbstractC3557B.c0("javaTypeEnhancementState", yVar);
            ?? abstractC1439a = new AbstractC1439a(yVar);
            Xf.b bVar4 = Xf.b.f21976a;
            y7.b bVar5 = new y7.b(new S4.o());
            C1455q c1455q = C1455q.f17830a;
            Cg.n.f3142b.getClass();
            Cg.o oVar2 = Cg.m.f3141b;
            B0 b03 = b02;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            Xf.e eVar2 = new Xf.e(new Xf.a(qVar, bVar2, dVar, obj, kVar, fVar, hVar, c5768a, fVar2, obj2, qVar2, y10, bVar3, g10, oVar, abstractC1439a, bVar5, c1455q, bVar4, oVar2, yVar, new Object()));
            jg.g gVar2 = jg.g.f36187g;
            AbstractC3557B.c0("jvmMetadataVersion", gVar2);
            dg.p pVar = new dg.p(dVar, obj);
            C2673m c2673m = new C2673m(g10, iVar, qVar, dVar);
            c2673m.f28344f = gVar2;
            List F02 = AbstractC4344b.F0(C0223p.f2145a);
            Jf.l lVar = g10.f13994i0;
            if (lVar instanceof Lf.j) {
                jVar = (Lf.j) lVar;
            } else {
                jVar = null;
            }
            dg.q qVar3 = dg.q.f28353b;
            kf.v vVar = kf.v.f37483Y;
            if (jVar == null || (bVar = jVar.I()) == null) {
                bVar = Of.a.f13750a;
            }
            Of.b bVar6 = bVar;
            if (jVar == null || (eVar = jVar.I()) == null) {
                eVar = Of.d.f13752a;
            }
            Of.e eVar3 = eVar;
            C4464i c4464i = jg.i.f36194a;
            C5768a c5768a2 = new C5768a(qVar);
            xg.v vVar2 = xg.v.f50048b;
            xg.m mVar = new xg.m(qVar, g10, pVar, c2673m, eVar2, fVar, qVar3, vVar, iVar, bVar6, eVar3, c4464i, oVar2, c5768a2, F02, vVar2);
            obj.f28350a = mVar;
            C3636c1 c3636c1 = new C3636c1(eVar2);
            obj2.f21991a = c3636c1;
            Lf.q I10 = jVar2.I();
            Lf.q I11 = jVar2.I();
            C5768a c5768a3 = new C5768a(qVar);
            AbstractC3557B.c0("additionalClassPartsProvider", I10);
            AbstractC3557B.c0("platformDependentDeclarationFilter", I11);
            AbstractC6446a abstractC6446a = new AbstractC6446a(qVar, dVar2, g10);
            xg.p pVar2 = new xg.p(abstractC6446a);
            C6584a c6584a = C6584a.f50909q;
            abstractC6446a.f49990d = new xg.m(qVar, g10, pVar2, new C6449d(g10, iVar, c6584a), abstractC6446a, AbstractC4344b.G0(new Kf.a(qVar, g10), new Lf.g(qVar, g10)), iVar, I10, I11, c6584a.f48501a, oVar2, c5768a3, vVar2, 262144);
            g10.f13997l0 = new Pf.E(kf.q.z3(new Pf.G[]{g10}));
            g10.f13998m0 = new C1157o("CompositeProvider@RuntimeModuleData for " + g10, AbstractC4344b.G0((Xf.e) c3636c1.f34285Z, abstractC6446a));
            Rf.g gVar3 = new Rf.g(mVar, new io.sentry.android.core.z((dg.o) obj, dVar));
            while (true) {
                B0 b04 = b03;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(b04, new WeakReference(gVar3));
                if (weakReference2 == null) {
                    return gVar3;
                }
                Rf.g gVar4 = (Rf.g) weakReference2.get();
                if (gVar4 != null) {
                    return gVar4;
                }
                concurrentHashMap3.remove(b04, weakReference2);
                b03 = b04;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } finally {
        }
    }
}
