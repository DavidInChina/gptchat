package na;

import Cd.C0338x;
import G0.C0588q;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.C1209l;
import Z.AbstractC1710f0;
import android.gov.nist.core.Separators;
import ca.AbstractC2313e;
import ca.C2311c;
import e9.C2814g;
import fa.C2969F;
import he.C3418c;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import jd.AbstractC3949a;
import kd.C4255s;
import nf.AbstractC4825e;
import oe.C4999h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import qe.AbstractC5321m;
import qe.C5312d;
import qe.C5320l;
import rb.C5426p;
import ve.AbstractC6034c;
import ve.C6033b;
import ve.C6035d;
import wa.C6151c;
import wd.C6168C;
import wd.EnumC6212z;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6410O;
import xe.C6417f;
import xe.C6427p;

/* loaded from: classes2.dex */
public final class L0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39821Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39822Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f39823h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f39824i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f39825j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(Object obj, Object obj2, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f39821Y = i10;
        this.f39824i0 = obj;
        this.f39825j0 = obj2;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        Object obj4 = this.f39825j0;
        switch (i10) {
            case 0:
                L0 l02 = new L0((B1) obj4, (AbstractC4825e) obj3, 0);
                l02.f39823h0 = (C2311c) obj;
                l02.f39824i0 = (Ba.c) obj2;
                return l02.invokeSuspend(yVar);
            case 1:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 2:
                L0 l03 = new L0((C6151c) obj4, (AbstractC4825e) obj3, 2);
                l03.f39823h0 = (Sc.c) obj;
                l03.f39824i0 = (T9.c) obj2;
                return l03.invokeSuspend(yVar);
            case 3:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 4:
                return u((B.Y0) obj, ((C5251c) obj2).f43623a, (AbstractC4825e) obj3);
            case 5:
                return u((B.Y0) obj, ((C5251c) obj2).f43623a, (AbstractC4825e) obj3);
            case 6:
                L0 l04 = new L0((ge.d) obj4, (AbstractC4825e) obj3, 6);
                l04.f39823h0 = (Ie.e) obj;
                l04.f39824i0 = obj2;
                return l04.invokeSuspend(yVar);
            case 7:
                return p((Ie.e) obj, (C6035d) obj2, (AbstractC4825e) obj3);
            case 8:
                return p((Ie.e) obj, (C6035d) obj2, (AbstractC4825e) obj3);
            case 9:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 10:
                return t((AbstractC1207j) obj, (Object[]) obj2, (AbstractC4825e) obj3);
            default:
                return t((AbstractC1207j) obj, (Object[]) obj2, (AbstractC4825e) obj3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02aa, code lost:
        if (r4 == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r3 == r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cc, code lost:
        if (R4.b.q0(r3, r17) == r1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
        if (r3 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v61, types: [Ie.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x017b -> B:64:0x0144). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017e -> B:68:0x0180). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ba.c cVar;
        boolean z10;
        String str;
        String str2;
        String str3;
        C2969F c2969f;
        String str4;
        Sc.n nVar;
        Object obj2;
        Sc.n nVar2;
        Object obj3;
        Object obj4;
        AbstractC1206i abstractC1206i;
        AbstractC1207j abstractC1207j;
        Object obj5;
        Ie.e eVar;
        Object obj6;
        Je.a aVar;
        Ie.e eVar2;
        Object obj7;
        Charset charset;
        C5320l c5320l;
        Throwable th2;
        C5312d c5312d;
        C5320l c5320l2;
        Throwable th3;
        Object obj8;
        AbstractC1207j abstractC1207j2;
        Object obj9;
        AbstractC1207j abstractC1207j3;
        Object obj10;
        AbstractC1207j abstractC1207j4;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        boolean z11 = false;
        String str5 = null;
        Sc.n nVar3 = null;
        Object obj11 = this.f39825j0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                if (this.f39822Z == 0) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C2311c c2311c = (C2311c) this.f39823h0;
                    Ba.c cVar2 = (Ba.c) this.f39824i0;
                    if (c2311c != null) {
                        cVar = L4.a.t0(c2311c);
                    } else {
                        cVar = null;
                    }
                    if (Bi.c.e1(cVar) == Bi.c.e1(cVar2)) {
                        if (!Bi.c.e1(cVar) && !Bi.c.e1(cVar2)) {
                            z10 = true;
                            ((B1) obj11).l(new A.B(cVar2, cVar, z10, c2311c, 3));
                            return yVar;
                        }
                        if (cVar != null) {
                            str = cVar.f2009b;
                        } else {
                            str = null;
                        }
                        if (cVar2 != null) {
                            str2 = cVar2.f2009b;
                        } else {
                            str2 = null;
                        }
                        if (AbstractC3557B.K(str, str2)) {
                            if (cVar != null) {
                                str3 = cVar.f2010c;
                            } else {
                                str3 = null;
                            }
                            if (cVar2 != null) {
                                str5 = cVar2.f2010c;
                            }
                            if (AbstractC3557B.K(str3, str5)) {
                                z11 = true;
                            }
                        }
                    }
                    z10 = z11;
                    ((B1) obj11).l(new A.B(cVar2, cVar, z10, c2311c, 3));
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i11 = this.f39822Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                String str6 = ((C6168C) this.f39824i0).f48321a;
                C4255s c4255s = (C4255s) ((AbstractC3949a) obj11);
                c4255s.getClass();
                AbstractC3557B.c0("conversationId", str6);
                C5426p c5426p = new C5426p(new C2814g(c4255s.f37354g, str6, null, 3), 16);
                this.f39822Z = 1;
                if (L4.a.j0(this, c5426p, (AbstractC1207j) this.f39823h0) == enumC5000a2) {
                    return enumC5000a2;
                }
                return yVar;
            case 2:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                if (this.f39822Z == 0) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Sc.c cVar3 = (Sc.c) this.f39823h0;
                    List list = ((T9.c) this.f39824i0).f16971f;
                    String str7 = T9.b.f16964a;
                    AbstractC3557B.c0("<this>", list);
                    AbstractC2313e a5 = T9.b.a(list);
                    if (a5 != null) {
                        c2969f = a5.c();
                    } else {
                        c2969f = null;
                    }
                    if (c2969f != null) {
                        str4 = c2969f.f30023p;
                    } else {
                        str4 = null;
                    }
                    String str8 = ((C6151c) obj11).f48260a;
                    if (str8 != null) {
                        nVar = cVar3.a(str8);
                    } else {
                        Iterator it = cVar3.f16507a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (((Sc.f) obj3).f16512a.f16521a == EnumC6212z.f48475Z) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        Sc.f fVar = (Sc.f) obj3;
                        if (fVar == null) {
                            Iterator it2 = cVar3.f16507a.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj4 = it2.next();
                                    if (((Sc.f) obj4).f16512a.f16521a == EnumC6212z.f48474Y) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            fVar = (Sc.f) obj4;
                        }
                        if (fVar != null) {
                            nVar = fVar.f16514c;
                        } else {
                            nVar = null;
                        }
                    }
                    Iterator it3 = cVar3.f16507a.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((Sc.f) obj2).f16512a.f16521a == EnumC6212z.f48474Y) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Sc.f fVar2 = (Sc.f) obj2;
                    if (fVar2 != null) {
                        nVar2 = fVar2.f16514c;
                    } else {
                        nVar2 = null;
                    }
                    if (str4 != null) {
                        nVar3 = cVar3.a(str4);
                    }
                    return new J9.d(nVar, nVar2, nVar3);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            case 3:
                EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                int i12 = this.f39822Z;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1207j = (AbstractC1207j) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    abstractC1207j = (AbstractC1207j) this.f39823h0;
                    boolean booleanValue = ((Boolean) this.f39824i0).booleanValue();
                    if (booleanValue) {
                        abstractC1206i = ((C4255s) obj11).f37353f;
                        this.f39823h0 = null;
                        this.f39822Z = 2;
                        if (L4.a.j0(this, abstractC1206i, abstractC1207j) != enumC5000a4) {
                            return yVar;
                        }
                        return enumC5000a4;
                    } else if (!booleanValue) {
                        long j6 = C4255s.f37345h;
                        this.f39823h0 = abstractC1207j;
                        this.f39822Z = 1;
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                }
                abstractC1206i = new C1209l(1, null);
                this.f39823h0 = null;
                this.f39822Z = 2;
                if (L4.a.j0(this, abstractC1206i, abstractC1207j) != enumC5000a4) {
                }
                return enumC5000a4;
            case 4:
                EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                int i13 = this.f39822Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f39822Z = 1;
                    if (((B.Y0) this.f39823h0).y(this) == enumC5000a5) {
                        return enumC5000a5;
                    }
                }
                if (((Boolean) ((AbstractC1710f0) this.f39824i0).getValue()).booleanValue()) {
                    x8.W.F(Pc.e.a(), "VoiceModeScreen onLongPress {false}", null, 6);
                    ((AbstractC1710f0) this.f39824i0).setValue(Boolean.FALSE);
                    ((wf.k) obj11).invoke(new C0338x(false));
                    return yVar;
                }
                return yVar;
            case 5:
                EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                int i14 = this.f39822Z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f39822Z = 1;
                    if (((B.Y0) this.f39823h0).y(this) == enumC5000a6) {
                        return enumC5000a6;
                    }
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj11;
                if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                    abstractC1710f0.setValue(Boolean.FALSE);
                    ((Cd.J) this.f39824i0).j(new C0338x(false));
                    return yVar;
                }
                return yVar;
            case 6:
                EnumC5000a enumC5000a7 = EnumC5000a.f41328Y;
                int i15 = this.f39822Z;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj6 = this.f39824i0;
                    eVar = (Ie.e) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj5 = obj;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    eVar = (Ie.e) this.f39823h0;
                    obj6 = this.f39824i0;
                    if (obj6 instanceof C3418c) {
                        C6033b c6033b = ((ge.d) obj11).f31601n0;
                        AbstractC6034c d10 = ((C3418c) obj6).d();
                        this.f39823h0 = eVar;
                        this.f39824i0 = obj6;
                        this.f39822Z = 1;
                        obj5 = c6033b.a(yVar, d10, this);
                        break;
                    } else {
                        throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj6 + '(' + kotlin.jvm.internal.C.f37623a.b(obj6.getClass()) + ").").toString());
                    }
                }
                AbstractC6034c abstractC6034c = (AbstractC6034c) obj5;
                C3418c c3418c = (C3418c) obj6;
                c3418c.getClass();
                AbstractC3557B.c0("response", abstractC6034c);
                c3418c.f32272h0 = abstractC6034c;
                this.f39823h0 = null;
                this.f39824i0 = null;
                this.f39822Z = 2;
                if (eVar.d(obj6, this) != enumC5000a7) {
                    return yVar;
                }
                return enumC5000a7;
            case 7:
                EnumC5000a enumC5000a8 = EnumC5000a.f41328Y;
                int i16 = this.f39822Z;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = (Ie.e) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    aVar = (Je.a) this.f39824i0;
                    obj7 = obj;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ie.e eVar3 = (Ie.e) this.f39823h0;
                    C6035d c6035d = (C6035d) this.f39824i0;
                    aVar = c6035d.f47491a;
                    C6417f k02 = AbstractC3557B.k0(((C3418c) eVar3.f8578Y).d());
                    if (k02 == null) {
                        oe.i.f41324a.c("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                        return yVar;
                    }
                    C3418c c3418c2 = (C3418c) eVar3.f8578Y;
                    AbstractC6432u a10 = c3418c2.c().a();
                    Charset charset2 = Lg.a.f11131a;
                    AbstractC3557B.c0("<this>", a10);
                    AbstractC3557B.c0("defaultCharset", charset2);
                    List list2 = AbstractC6435x.f49956a;
                    Iterator it4 = kf.t.F2(R4.b.N1(a10.e("Accept-Charset")), new C0588q(16)).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            String str9 = ((C6427p) it4.next()).f49945a;
                            if (AbstractC3557B.K(str9, Separators.STAR)) {
                                charset = charset2;
                            } else if (Charset.isSupported(str9)) {
                                charset = Charset.forName(str9);
                            }
                        } else {
                            charset = null;
                        }
                    }
                    if (charset != null) {
                        charset2 = charset;
                    }
                    C6410O O10 = c3418c2.c().O();
                    this.f39823h0 = eVar3;
                    this.f39824i0 = aVar;
                    this.f39822Z = 1;
                    obj7 = ((C4999h) obj11).b(O10, aVar, c6035d.f47492b, k02, charset2, this);
                    if (obj7 != enumC5000a8) {
                        eVar2 = eVar3;
                    }
                    return enumC5000a8;
                }
                if (obj7 != null) {
                    C6035d c6035d2 = new C6035d(aVar, obj7);
                    this.f39823h0 = null;
                    this.f39824i0 = null;
                    this.f39822Z = 2;
                    if (eVar2.d(c6035d2, this) != enumC5000a8) {
                        return yVar;
                    }
                    return enumC5000a8;
                }
                return yVar;
            case 8:
                Object obj12 = EnumC5000a.f41328Y;
                ?? r22 = this.f39822Z;
                try {
                } catch (Throwable th4) {
                    StringBuilder sb2 = new StringBuilder();
                    C5312d c5312d2 = (C5312d) ((C3418c) r22.f8578Y).h().b(AbstractC5321m.f44118a);
                    C5320l c5320l3 = (C5320l) obj11;
                    C5320l.b(c5320l3, sb2, ((C3418c) r22.f8578Y).c(), th4);
                    String sb3 = sb2.toString();
                    AbstractC3557B.b0("log.toString()", sb3);
                    this.f39824i0 = th4;
                    this.f39823h0 = c5312d2;
                    this.f39822Z = 2;
                    Object d11 = c5312d2.d(sb3, this);
                    th3 = d11;
                    c5320l2 = c5320l3;
                    if (d11 != obj12) {
                        th2 = th4;
                        c5312d = c5312d2;
                        c5320l = c5320l3;
                    }
                }
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th5 = (Throwable) this.f39824i0;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            throw th5;
                        }
                        c5312d = (C5312d) this.f39823h0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        th2 = (Throwable) this.f39824i0;
                        c5320l = obj11;
                        this.f39824i0 = th2;
                        this.f39823h0 = null;
                        this.f39822Z = 3;
                        th3 = th2;
                        c5320l2 = c5320l;
                        if (c5312d.b(this) != obj12) {
                            throw th2;
                        }
                        yVar = obj12;
                        r22 = th3;
                        obj11 = c5320l2;
                    } else {
                        Ie.e eVar4 = (Ie.e) this.f39824i0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        r22 = eVar4;
                        obj11 = obj11;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ie.e eVar5 = (Ie.e) this.f39824i0;
                    if (((C5320l) obj11).f44115b != 5 && !((C3418c) eVar5.f8578Y).h().a(AbstractC5321m.f44119b)) {
                        this.f39824i0 = eVar5;
                        this.f39822Z = 1;
                        Object c10 = eVar5.c(this);
                        th3 = c10;
                        c5320l2 = obj11;
                        r22 = c10;
                        obj11 = obj11;
                        break;
                    }
                    return yVar;
                }
                return yVar;
            case 9:
                EnumC5000a enumC5000a9 = EnumC5000a.f41328Y;
                int i17 = this.f39822Z;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1207j2 = (AbstractC1207j) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj8 = obj;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    abstractC1207j2 = (AbstractC1207j) this.f39823h0;
                    Object obj13 = this.f39824i0;
                    this.f39823h0 = abstractC1207j2;
                    this.f39822Z = 1;
                    obj8 = ((wf.n) obj11).invoke(obj13, this);
                    break;
                }
                this.f39823h0 = null;
                this.f39822Z = 2;
                if (abstractC1207j2.c(obj8, this) != enumC5000a9) {
                    return yVar;
                }
                return enumC5000a9;
            case 10:
                EnumC5000a enumC5000a10 = EnumC5000a.f41328Y;
                int i18 = this.f39822Z;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1207j3 = (AbstractC1207j) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj9 = obj;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    abstractC1207j3 = (AbstractC1207j) this.f39823h0;
                    Object[] objArr = (Object[]) this.f39824i0;
                    Object obj14 = objArr[0];
                    Object obj15 = objArr[1];
                    Object obj16 = objArr[2];
                    this.f39823h0 = abstractC1207j3;
                    this.f39822Z = 1;
                    obj9 = ((wf.p) obj11).h(obj14, obj15, obj16, this);
                    break;
                }
                this.f39823h0 = null;
                this.f39822Z = 2;
                if (abstractC1207j3.c(obj9, this) != enumC5000a10) {
                    return yVar;
                }
                return enumC5000a10;
            default:
                EnumC5000a enumC5000a11 = EnumC5000a.f41328Y;
                int i19 = this.f39822Z;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1207j4 = (AbstractC1207j) this.f39823h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj10 = obj;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    abstractC1207j4 = (AbstractC1207j) this.f39823h0;
                    Object[] objArr2 = (Object[]) this.f39824i0;
                    Object obj17 = objArr2[0];
                    Object obj18 = objArr2[1];
                    this.f39823h0 = abstractC1207j4;
                    this.f39822Z = 1;
                    obj10 = ((wf.o) obj11).invoke(obj17, obj18, this);
                    break;
                }
                this.f39823h0 = null;
                this.f39822Z = 2;
                if (abstractC1207j4.c(obj10, this) != enumC5000a11) {
                    return yVar;
                }
                return enumC5000a11;
        }
    }

    public final Object p(Ie.e eVar, C6035d c6035d, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        Object obj = this.f39825j0;
        switch (i10) {
            case 7:
                L0 l02 = new L0((C4999h) obj, abstractC4825e, 7);
                l02.f39823h0 = eVar;
                l02.f39824i0 = c6035d;
                return l02.invokeSuspend(yVar);
            default:
                L0 l03 = new L0((C5320l) obj, abstractC4825e, 8);
                l03.f39824i0 = eVar;
                return l03.invokeSuspend(yVar);
        }
    }

    public final Object r(AbstractC1207j abstractC1207j, Object obj, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        Object obj2 = this.f39825j0;
        switch (i10) {
            case 1:
                L0 l02 = new L0(abstractC4825e, (AbstractC3949a) obj2, 1);
                l02.f39823h0 = abstractC1207j;
                l02.f39824i0 = obj;
                return l02.invokeSuspend(yVar);
            case 2:
            default:
                L0 l03 = new L0((wf.n) obj2, abstractC4825e, 9);
                l03.f39823h0 = abstractC1207j;
                l03.f39824i0 = obj;
                return l03.invokeSuspend(yVar);
            case 3:
                L0 l04 = new L0(abstractC4825e, (C4255s) obj2, 3);
                l04.f39823h0 = abstractC1207j;
                l04.f39824i0 = obj;
                return l04.invokeSuspend(yVar);
        }
    }

    public final Object t(AbstractC1207j abstractC1207j, Object[] objArr, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        Object obj = this.f39825j0;
        switch (i10) {
            case 10:
                L0 l02 = new L0(abstractC4825e, (wf.p) obj, 10);
                l02.f39823h0 = abstractC1207j;
                l02.f39824i0 = objArr;
                return l02.invokeSuspend(yVar);
            default:
                L0 l03 = new L0((wf.o) obj, abstractC4825e, 11);
                l03.f39823h0 = abstractC1207j;
                l03.f39824i0 = objArr;
                return l03.invokeSuspend(yVar);
        }
    }

    public final Object u(B.Y0 y02, long j6, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39821Y;
        Object obj = this.f39825j0;
        switch (i10) {
            case 4:
                L0 l02 = new L0((AbstractC1710f0) this.f39824i0, (wf.k) obj, abstractC4825e, 4);
                l02.f39823h0 = y02;
                return l02.invokeSuspend(yVar);
            default:
                L0 l03 = new L0((Cd.J) this.f39824i0, (AbstractC1710f0) obj, abstractC4825e, 5);
                l03.f39823h0 = y02;
                return l03.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(Object obj, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f39821Y = i10;
        this.f39825j0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(AbstractC4825e abstractC4825e, Object obj, int i10) {
        super(3, abstractC4825e);
        this.f39821Y = i10;
        this.f39825j0 = obj;
    }
}
