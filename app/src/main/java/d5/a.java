package D5;

import L3.B;
import L3.C;
import L3.C0892d;
import L3.g;
import L3.h;
import L3.u;
import Lg.n;
import M3.F;
import Ng.C1072l;
import U3.e;
import W3.i;
import Wh.s;
import Z1.C1771m;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import androidx.glance.session.SessionWorker;
import androidx.lifecycle.D;
import com.google.android.gms.internal.play_billing.N;
import g2.AbstractC3155m;
import g2.AbstractC3156n;
import g2.RunnableC3157o;
import g2.p;
import g2.q;
import g2.r;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jf.C3959i;
import jf.y;
import kf.t;
import kf.x;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q1.AbstractC5260f;
import y.AbstractC6463a;
import yf.AbstractC6583a;
import z1.RunnableC6742a;

/* loaded from: classes2.dex */
public final class a implements AbstractC3156n {

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap f3417a;

    public a(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        int n02 = P4.a.n0(AbstractC6583a.H1(entrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
        for (Map.Entry entry : entrySet) {
            Locale locale = Locale.US;
            linkedHashMap.put(AbstractC6463a.j("US", locale, (String) entry.getKey(), locale, "this as java.lang.String).toLowerCase(locale)"), entry.getValue());
        }
        this.f3417a = linkedHashMap;
    }

    public AbstractC3155m a(String str) {
        AbstractC3155m abstractC3155m;
        synchronized (this.f3417a) {
            abstractC3155m = (AbstractC3155m) this.f3417a.get(str);
        }
        return abstractC3155m;
    }

    public Set b(s sVar) {
        AbstractC3557B.c0("url", sVar);
        LinkedHashMap linkedHashMap = this.f3417a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!AbstractC3557B.K(entry.getKey(), Separators.STAR)) {
                Object key = entry.getKey();
                String str = sVar.f21253d;
                if (!AbstractC3557B.K(key, str)) {
                    Object key2 = entry.getKey();
                    if (n.c2(str, Separators.DOT + key2, false)) {
                    }
                }
            }
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        return t.P2(AbstractC6583a.I1(linkedHashMap2.values()));
    }

    public boolean c(s sVar) {
        AbstractC3557B.c0("url", sVar);
        Set<String> keySet = this.f3417a.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        for (String str : keySet) {
            if (!AbstractC3557B.K(str, Separators.STAR)) {
                String str2 = sVar.f21253d;
                if (!AbstractC3557B.K(str2, str)) {
                    if (n.c2(str2, Separators.DOT + str, false)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:167)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:286)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:265)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0 A[EDGE_INSN: B:53:0x00d0->B:47:0x00d0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object d(android.content.Context r8, java.lang.String r9, nf.AbstractC4825e r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.d(android.content.Context, java.lang.String, nf.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(Context context, C1771m c1771m, AbstractC4825e abstractC4825e) {
        r rVar;
        int i10;
        a aVar;
        Context context2;
        Set set;
        AbstractC3155m abstractC3155m;
        if (abstractC4825e instanceof r) {
            rVar = (r) abstractC4825e;
            int i11 = rVar.f31133j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f31133j0 = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f31131h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = rVar.f31133j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        context2 = rVar.f31130Z;
                        aVar = rVar.f31129Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    synchronized (this.f3417a) {
                        abstractC3155m = (AbstractC3155m) this.f3417a.put(c1771m.f31117a, c1771m);
                    }
                    if (abstractC3155m != null) {
                        abstractC3155m.f31118b.l(null);
                    }
                    C c10 = new C(SessionWorker.class);
                    C3959i[] c3959iArr = {new C3959i("KEY", c1771m.f31117a)};
                    D d10 = new D(2);
                    C3959i c3959i = c3959iArr[0];
                    d10.n((String) c3959i.f36155Y, c3959i.f36156Z);
                    g gVar = new g(d10.f25290b);
                    g.b(gVar);
                    c10.f10678b.f17454e = gVar;
                    i iVar = (i) ((e) F.g0(context).e0(c1771m.f31117a, 1, Collections.singletonList(c10.a()))).f17401Z;
                    if (iVar.isDone()) {
                        try {
                            iVar.get();
                            context2 = context;
                            aVar = this;
                        } catch (ExecutionException e10) {
                            Throwable cause = e10.getCause();
                            if (cause == null) {
                                throw e10;
                            }
                            throw cause;
                        }
                    } else {
                        rVar.f31129Y = this;
                        rVar.f31130Z = context;
                        rVar.getClass();
                        rVar.f31133j0 = 1;
                        C1072l c1072l = new C1072l(1, AbstractC5260f.z(rVar));
                        c1072l.u();
                        iVar.a(new RunnableC3157o(c1072l, iVar, 1), h.f10716Y);
                        c1072l.w(new p(iVar, 1));
                        Object t10 = c1072l.t();
                        if (t10 == enumC5000a) {
                            N.k0(rVar);
                        }
                        if (t10 == enumC5000a) {
                            return enumC5000a;
                        }
                        aVar = this;
                        context2 = context;
                    }
                }
                aVar.getClass();
                F g02 = F.g0(context2);
                u b10 = new C(SessionWorker.class).b(3650L, TimeUnit.DAYS);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (Build.VERSION.SDK_INT < 24) {
                    set = t.P2(linkedHashSet);
                } else {
                    set = x.f37485Y;
                }
                b10.f10678b.f17459j = new C0892d(1, true, false, false, false, -1L, -1L, set);
                g02.e0("sessionWorkerKeepEnabled", 2, Collections.singletonList(b10.a()));
                return y.f36177a;
            }
        }
        rVar = new r(this, abstractC4825e);
        Object obj2 = rVar.f31131h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = rVar.f31133j0;
        if (i10 == 0) {
        }
        aVar.getClass();
        F g022 = F.g0(context2);
        u b102 = new C(SessionWorker.class).b(3650L, TimeUnit.DAYS);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (Build.VERSION.SDK_INT < 24) {
        }
        b102.f10678b.f17459j = new C0892d(1, true, false, false, false, -1L, -1L, set);
        g022.e0("sessionWorkerKeepEnabled", 2, Collections.singletonList(b102.a()));
        return y.f36177a;
    }

    public a() {
        this.f3417a = new LinkedHashMap();
    }
}
