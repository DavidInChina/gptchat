package Yc;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pe.AbstractC5152d;
import pf.AbstractC5156c;
import xe.C6410O;
import xe.C6419h;
import y.C6484w;

/* loaded from: classes.dex */
public final class t implements AbstractC5152d {

    /* renamed from: Y  reason: collision with root package name */
    public final v f22281Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicLong f22282Z = new AtomicLong(0);

    /* renamed from: h0  reason: collision with root package name */
    public final Wg.d f22283h0 = Wg.e.a();

    public t(v vVar) {
        this.f22281Y = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(4:(2:4|(7:6|8|45|(1:(1:(1:(7:13|14|33|(4:36|(3:49|38|53)(1:52)|51|34)|50|39|40)(2:16|17))(4:18|19|29|(1:31)(6:32|33|(1:34)|50|39|40)))(1:20))(2:21|(1:23)(1:24))|47|25|(1:27)(3:28|29|(0)(0))))|47|25|(0)(0))|7|8|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:19:0x004b, B:29:0x0086, B:33:0x009a, B:34:0x00a9, B:36:0x00af, B:38:0x00bc), top: B:45:0x0022 }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [Wg.a, Wg.d] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r9v13, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r9v16, types: [Wg.a] */
    @Override // pe.AbstractC5152d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable G0(C6410O c6410o, AbstractC4825e abstractC4825e) {
        r rVar;
        EnumC5000a enumC5000a;
        int i10;
        ?? r10;
        t tVar;
        C6410O c6410o2;
        C6410O c6410o3;
        t tVar2;
        C6410O c6410o4;
        Iterator it;
        try {
            if (abstractC4825e instanceof r) {
                rVar = (r) abstractC4825e;
                int i11 = rVar.f22274k0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    rVar.f22274k0 = i11 - Integer.MIN_VALUE;
                    Object obj2 = rVar.f22272i0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = rVar.f22274k0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    ?? r92 = (Wg.a) rVar.f22270Z;
                                    c6410o4 = (C6410O) rVar.f22269Y;
                                    N.B0(obj2);
                                    c6410o = r92;
                                    ArrayList r022 = Ad.l.r0((Vc.p) obj2);
                                    ArrayList arrayList2 = new ArrayList();
                                    it = r022.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (Ad.l.S0((C6419h) next, c6410o4)) {
                                            arrayList2.add(next);
                                        }
                                    }
                                    ((Wg.d) c6410o).g(null);
                                    return arrayList2;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r93 = rVar.f22271h0;
                            c6410o2 = (C6410O) rVar.f22270Z;
                            tVar2 = (t) rVar.f22269Y;
                            N.B0(obj2);
                            c6410o3 = r93;
                            v vVar2 = tVar2.f22281Y;
                            rVar.f22269Y = c6410o2;
                            rVar.f22270Z = c6410o3;
                            rVar.f22271h0 = null;
                            rVar.f22274k0 = 3;
                            obj2 = L4.a.m0(vVar2.f44961e, rVar);
                            if (obj2 != enumC5000a) {
                                return enumC5000a;
                            }
                            c6410o4 = c6410o2;
                            c6410o = c6410o3;
                            ArrayList r0222 = Ad.l.r0((Vc.p) obj2);
                            ArrayList arrayList22 = new ArrayList();
                            it = r0222.iterator();
                            while (it.hasNext()) {
                            }
                            ((Wg.d) c6410o).g(null);
                            return arrayList22;
                        }
                        Wg.a aVar = rVar.f22271h0;
                        tVar = (t) rVar.f22269Y;
                        N.B0(obj2);
                        r10 = aVar;
                        c6410o = (C6410O) rVar.f22270Z;
                    } else {
                        N.B0(obj2);
                        rVar.f22269Y = this;
                        rVar.f22270Z = c6410o;
                        r10 = this.f22283h0;
                        rVar.f22271h0 = r10;
                        rVar.f22274k0 = 1;
                        if (r10.e(null, rVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        tVar = this;
                    }
                    rVar.f22269Y = tVar;
                    rVar.f22270Z = c6410o;
                    rVar.f22271h0 = r10;
                    rVar.f22274k0 = 2;
                    if (tVar.a(rVar) != enumC5000a) {
                        return enumC5000a;
                    }
                    c6410o2 = c6410o;
                    c6410o3 = r10;
                    tVar2 = tVar;
                    v vVar22 = tVar2.f22281Y;
                    rVar.f22269Y = c6410o2;
                    rVar.f22270Z = c6410o3;
                    rVar.f22271h0 = null;
                    rVar.f22274k0 = 3;
                    obj2 = L4.a.m0(vVar22.f44961e, rVar);
                    if (obj2 != enumC5000a) {
                    }
                }
            }
            rVar.f22269Y = tVar;
            rVar.f22270Z = c6410o;
            rVar.f22271h0 = r10;
            rVar.f22274k0 = 2;
            if (tVar.a(rVar) != enumC5000a) {
            }
        } catch (Throwable th2) {
            C6410O c6410o5 = r10;
            Throwable th3 = th2;
            c6410o = c6410o5;
            ((Wg.d) c6410o).g(null);
            throw th3;
        }
        rVar = new r(this, abstractC4825e);
        Object obj22 = rVar.f22272i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = rVar.f22274k0;
        if (i10 == 0) {
        }
    }

    public final Object a(AbstractC5156c abstractC5156c) {
        Calendar calendar = Calendar.getInstance(He.a.f7667a, Locale.ROOT);
        AbstractC3557B.Z(calendar);
        He.b b10 = He.a.b(calendar, null);
        long j6 = this.f22282Z.get();
        long j10 = b10.f7676n0;
        int i10 = (j10 > j6 ? 1 : (j10 == j6 ? 0 : -1));
        y yVar = y.f36177a;
        if (i10 >= 0) {
            Object b11 = this.f22281Y.b(new C6484w(this, j10, 7), abstractC5156c);
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (b11 != enumC5000a) {
                b11 = yVar;
            }
            if (b11 == enumC5000a) {
                return b11;
            }
        }
        return yVar;
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
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(4:(2:4|(7:6|8|47|(1:(1:(1:(7:13|14|33|(2:34|(2:36|(2:51|38))(2:52|39))|40|41|42)(2:16|17))(4:18|19|29|(1:31)(6:32|33|(3:34|(0)(0)|37)|40|41|42)))(1:20))(2:21|(1:23)(1:24))|49|25|(1:27)(3:28|29|(0)(0))))|49|25|(0)(0))|7|8|47|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:19:0x004b, B:29:0x0086, B:33:0x009a, B:34:0x00a4, B:36:0x00aa, B:40:0x00bb), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [Wg.a, Wg.d] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r9v13, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r9v16, types: [Wg.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(java.lang.String r9, nf.AbstractC4825e r10) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Yc.t.h(java.lang.String, nf.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:22:0x0069, B:24:0x0071, B:28:0x008a, B:30:0x008e, B:32:0x009a, B:33:0x009f), top: B:38:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:22:0x0069, B:24:0x0071, B:28:0x008a, B:30:0x008e, B:32:0x009a, B:33:0x009f), top: B:38:0x0021 }] */
    /* JADX WARN: Type inference failed for: r11v6, types: [Wg.d] */
    /* JADX WARN: Type inference failed for: r9v11, types: [Wg.a] */
    /* JADX WARN: Type inference failed for: r9v8, types: [Wg.d] */
    @Override // pe.AbstractC5152d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(C6410O c6410o, C6419h c6419h, AbstractC4825e abstractC4825e) {
        p pVar;
        int i10;
        C6410O c6410o2;
        t tVar;
        He.b bVar;
        C6410O c6410o3;
        t tVar2;
        C6410O c6410o4;
        try {
            if (abstractC4825e instanceof p) {
                pVar = (p) abstractC4825e;
                int i11 = pVar.f22265l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    pVar.f22265l0 = i11 - Integer.MIN_VALUE;
                    Object obj = pVar.f22263j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = pVar.f22265l0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                ?? r92 = (Wg.a) pVar.f22261h0;
                                c6419h = (C6419h) pVar.f22260Z;
                                tVar = pVar.f22259Y;
                                N.B0(obj);
                                c6410o2 = r92;
                                bVar = c6419h.f49892e;
                                c6410o = c6410o2;
                                if (bVar != null) {
                                    long j6 = bVar.f7676n0;
                                    c6410o = c6410o2;
                                    if (tVar.f22282Z.get() > j6) {
                                        tVar.f22282Z.set(j6);
                                        c6410o = c6410o2;
                                    }
                                }
                                return y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r93 = pVar.f22262i0;
                        c6419h = (C6419h) pVar.f22261h0;
                        c6410o4 = (C6410O) pVar.f22260Z;
                        tVar2 = pVar.f22259Y;
                        N.B0(obj);
                        c6410o3 = r93;
                    } else {
                        N.B0(obj);
                        pVar.f22259Y = this;
                        pVar.f22260Z = c6410o;
                        pVar.f22261h0 = c6419h;
                        ?? r11 = this.f22283h0;
                        pVar.f22262i0 = r11;
                        pVar.f22265l0 = 1;
                        if (r11.e(null, pVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        tVar2 = this;
                        c6410o4 = c6410o;
                        c6410o3 = r11;
                    }
                    c6410o = c6410o3;
                    if (!Lg.n.n2(c6419h.f49888a)) {
                        v vVar = tVar2.f22281Y;
                        q qVar = new q(c6419h, c6410o4, 1);
                        pVar.f22259Y = tVar2;
                        pVar.f22260Z = c6419h;
                        pVar.f22261h0 = c6410o3;
                        pVar.f22262i0 = null;
                        pVar.f22265l0 = 2;
                        if (vVar.b(qVar, pVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        tVar = tVar2;
                        c6410o2 = c6410o3;
                        bVar = c6419h.f49892e;
                        c6410o = c6410o2;
                        if (bVar != null) {
                        }
                    }
                    return y.f36177a;
                }
            }
            if (i10 == 0) {
            }
            c6410o = c6410o3;
            if (!Lg.n.n2(c6419h.f49888a)) {
            }
            return y.f36177a;
        } finally {
            ((Wg.d) c6410o).g(null);
        }
        pVar = new p(this, abstractC4825e);
        Object obj2 = pVar.f22263j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = pVar.f22265l0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
