package B;

import B0.C0194k;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: B.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0150o0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public B0.u f1427Z;

    /* renamed from: h0  reason: collision with root package name */
    public kotlin.jvm.internal.A f1428h0;

    /* renamed from: i0  reason: collision with root package name */
    public B0.N f1429i0;

    /* renamed from: j0  reason: collision with root package name */
    public X0 f1430j0;

    /* renamed from: k0  reason: collision with root package name */
    public kotlin.jvm.internal.A f1431k0;

    /* renamed from: l0  reason: collision with root package name */
    public B0.u f1432l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f1433m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f1434n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1435o0;

    /* renamed from: p0  reason: collision with root package name */
    public /* synthetic */ Object f1436p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1437q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1438r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f1439s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f1440t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150o0(wf.k kVar, wf.n nVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1437q0 = kVar;
        this.f1438r0 = nVar;
        this.f1439s0 = abstractC6216a;
        this.f1440t0 = abstractC6216a2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0150o0 c0150o0 = new C0150o0(this.f1437q0, this.f1438r0, this.f1439s0, this.f1440t0, abstractC4825e);
        c0150o0.f1436p0 = obj;
        return c0150o0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0150o0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r12v13, types: [B.X0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:61:0x01c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011a -> B:61:0x01c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015b -> B:22:0x00c1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0198 -> B:54:0x019c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01c2 -> B:61:0x01c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0224 -> B:22:0x00c1). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a;
        kotlin.jvm.internal.A a5;
        B0.u uVar;
        B0.N n10;
        B0.u uVar2;
        kotlin.jvm.internal.A a10;
        float f6;
        kotlin.jvm.internal.A a11;
        long j6;
        B0.N n11;
        B0.u uVar3;
        Object obj3;
        C0123f0 c0123f0;
        int size;
        int i10;
        EnumC5000a enumC5000a2;
        B0.N n12;
        B0.u uVar4;
        ?? r16;
        Object obj4;
        kotlin.jvm.internal.A a12;
        long j10;
        Object obj5;
        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
        int i11 = this.f1435o0;
        int i12 = 2;
        B0.u uVar5 = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            obj2 = obj;
                            if (((Boolean) obj2).booleanValue()) {
                                this.f1439s0.mo122invoke();
                            } else {
                                this.f1440t0.mo122invoke();
                            }
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = this.f1434n0;
                    float f10 = this.f1433m0;
                    B0.u uVar6 = this.f1432l0;
                    kotlin.jvm.internal.A a13 = this.f1431k0;
                    ?? r12 = this.f1430j0;
                    B0.N n13 = this.f1429i0;
                    kotlin.jvm.internal.A a14 = this.f1428h0;
                    B0.u uVar7 = this.f1427Z;
                    B0.N n14 = (B0.N) this.f1436p0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    enumC5000a = enumC5000a3;
                    f6 = f10;
                    n10 = n13;
                    a10 = a13;
                    a11 = a14;
                    C0123f0 c0123f02 = r12;
                    if (!uVar6.b()) {
                        n10 = n14;
                        a5 = a11;
                        uVar = uVar7;
                        uVar2 = null;
                        if (uVar2 == null && !uVar2.b()) {
                            enumC5000a3 = enumC5000a;
                            i12 = 2;
                            uVar5 = null;
                            a12 = a5;
                            j10 = uVar.f1670a;
                            C0123f0 c0123f03 = AbstractC0170v0.f1536c;
                            if (!AbstractC0170v0.i(n10.f1614j0.f1619u0, j10)) {
                                enumC5000a = enumC5000a3;
                                uVar2 = uVar5;
                                a5 = a12;
                                if (uVar2 == null) {
                                }
                                if (uVar2 != null) {
                                }
                                return jf.y.f36177a;
                            }
                            float j11 = AbstractC0170v0.j(n10.e(), uVar.f1678i);
                            ?? obj6 = new Object();
                            obj6.f37621Y = j10;
                            j6 = C5251c.f43619b;
                            a10 = obj6;
                            f6 = j11;
                            C0123f0 c0123f04 = c0123f03;
                            a11 = a12;
                            uVar3 = uVar;
                            n11 = n10;
                            this.f1436p0 = n11;
                            this.f1427Z = uVar3;
                            this.f1428h0 = a11;
                            this.f1429i0 = n10;
                            this.f1430j0 = c0123f04;
                            this.f1431k0 = a10;
                            this.f1432l0 = uVar5;
                            this.f1433m0 = f6;
                            this.f1434n0 = j6;
                            this.f1435o0 = i12;
                            obj3 = n10.c(EnumC0195l.f1657Z, this);
                            c0123f0 = c0123f04;
                            if (obj3 == enumC5000a3) {
                                return enumC5000a3;
                            }
                            C0194k c0194k = (C0194k) obj3;
                            List list = c0194k.f1652a;
                            size = list.size();
                            i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    r16 = list.get(i10);
                                    enumC5000a2 = enumC5000a3;
                                    n12 = n10;
                                    uVar4 = uVar3;
                                    if (B0.t.a(((B0.u) r16).f1670a, a10.f37621Y)) {
                                        break;
                                    }
                                    i10++;
                                    n10 = n12;
                                    enumC5000a3 = enumC5000a2;
                                    uVar3 = uVar4;
                                } else {
                                    enumC5000a2 = enumC5000a3;
                                    n12 = n10;
                                    uVar4 = uVar3;
                                    r16 = 0;
                                    break;
                                }
                            }
                            uVar2 = r16;
                            if (uVar2 != null && !uVar2.b()) {
                                if (!r9.y.Y(uVar2)) {
                                    List list2 = c0194k.f1652a;
                                    int size2 = list2.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < size2) {
                                            obj4 = list2.get(i13);
                                            if (((B0.u) obj4).f1673d) {
                                                break;
                                            }
                                            i13++;
                                        } else {
                                            obj4 = null;
                                            break;
                                        }
                                    }
                                    B0.u uVar8 = (B0.u) obj4;
                                    if (uVar8 != null) {
                                        a10.f37621Y = uVar8.f1670a;
                                        n10 = n12;
                                        enumC5000a3 = enumC5000a2;
                                        uVar3 = uVar4;
                                        i12 = 2;
                                        C0123f0 c0123f05 = c0123f0;
                                        uVar5 = null;
                                        c0123f04 = c0123f05;
                                        this.f1436p0 = n11;
                                        this.f1427Z = uVar3;
                                        this.f1428h0 = a11;
                                        this.f1429i0 = n10;
                                        this.f1430j0 = c0123f04;
                                        this.f1431k0 = a10;
                                        this.f1432l0 = uVar5;
                                        this.f1433m0 = f6;
                                        this.f1434n0 = j6;
                                        this.f1435o0 = i12;
                                        obj3 = n10.c(EnumC0195l.f1657Z, this);
                                        c0123f0 = c0123f04;
                                        if (obj3 == enumC5000a3) {
                                        }
                                        C0194k c0194k2 = (C0194k) obj3;
                                        List list3 = c0194k2.f1652a;
                                        size = list3.size();
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < size) {
                                            }
                                            i10++;
                                            n10 = n12;
                                            enumC5000a3 = enumC5000a2;
                                            uVar3 = uVar4;
                                        }
                                        uVar2 = r16;
                                        if (uVar2 != null) {
                                            if (!r9.y.Y(uVar2)) {
                                                j6 = C5251c.h(j6, C5251c.g(uVar2.f1672c, uVar2.f1676g));
                                                C0123f0 c0123f06 = c0123f0;
                                                if (c0123f06.a(j6) < f6) {
                                                    EnumC0195l enumC0195l = EnumC0195l.f1658h0;
                                                    this.f1436p0 = n11;
                                                    B0.u uVar9 = uVar4;
                                                    this.f1427Z = uVar9;
                                                    this.f1428h0 = a11;
                                                    B0.N n15 = n12;
                                                    this.f1429i0 = n15;
                                                    this.f1430j0 = c0123f06;
                                                    this.f1431k0 = a10;
                                                    this.f1432l0 = uVar2;
                                                    this.f1433m0 = f6;
                                                    this.f1434n0 = j6;
                                                    this.f1435o0 = 3;
                                                    enumC5000a = enumC5000a2;
                                                    if (n15.c(enumC0195l, this) == enumC5000a) {
                                                        return enumC5000a;
                                                    }
                                                    n10 = n15;
                                                    uVar7 = uVar9;
                                                    n14 = n11;
                                                    uVar6 = uVar2;
                                                    c0123f02 = c0123f06;
                                                    if (!uVar6.b()) {
                                                        n11 = n14;
                                                        enumC5000a3 = enumC5000a;
                                                        uVar3 = uVar7;
                                                        i12 = 2;
                                                        c0123f05 = c0123f02;
                                                        uVar5 = null;
                                                        c0123f04 = c0123f05;
                                                        this.f1436p0 = n11;
                                                        this.f1427Z = uVar3;
                                                        this.f1428h0 = a11;
                                                        this.f1429i0 = n10;
                                                        this.f1430j0 = c0123f04;
                                                        this.f1431k0 = a10;
                                                        this.f1432l0 = uVar5;
                                                        this.f1433m0 = f6;
                                                        this.f1434n0 = j6;
                                                        this.f1435o0 = i12;
                                                        obj3 = n10.c(EnumC0195l.f1657Z, this);
                                                        c0123f0 = c0123f04;
                                                        if (obj3 == enumC5000a3) {
                                                        }
                                                        C0194k c0194k22 = (C0194k) obj3;
                                                        List list32 = c0194k22.f1652a;
                                                        size = list32.size();
                                                        i10 = 0;
                                                        while (true) {
                                                            if (i10 < size) {
                                                            }
                                                            i10++;
                                                            n10 = n12;
                                                            enumC5000a3 = enumC5000a2;
                                                            uVar3 = uVar4;
                                                        }
                                                        uVar2 = r16;
                                                        if (uVar2 != null) {
                                                        }
                                                    }
                                                } else {
                                                    B0.N n16 = n12;
                                                    enumC5000a = enumC5000a2;
                                                    uVar3 = uVar4;
                                                    long b10 = c0123f06.b(f6, j6);
                                                    uVar2.a();
                                                    a11.f37621Y = b10;
                                                    if (uVar2.b()) {
                                                        n10 = n11;
                                                        uVar = uVar3;
                                                        a5 = a11;
                                                        if (uVar2 == null) {
                                                        }
                                                        if (uVar2 != null) {
                                                        }
                                                        return jf.y.f36177a;
                                                    }
                                                    uVar5 = null;
                                                    j6 = C5251c.f43619b;
                                                    n10 = n16;
                                                    enumC5000a3 = enumC5000a;
                                                    i12 = 2;
                                                    c0123f04 = c0123f06;
                                                    this.f1436p0 = n11;
                                                    this.f1427Z = uVar3;
                                                    this.f1428h0 = a11;
                                                    this.f1429i0 = n10;
                                                    this.f1430j0 = c0123f04;
                                                    this.f1431k0 = a10;
                                                    this.f1432l0 = uVar5;
                                                    this.f1433m0 = f6;
                                                    this.f1434n0 = j6;
                                                    this.f1435o0 = i12;
                                                    obj3 = n10.c(EnumC0195l.f1657Z, this);
                                                    c0123f0 = c0123f04;
                                                    if (obj3 == enumC5000a3) {
                                                    }
                                                    C0194k c0194k222 = (C0194k) obj3;
                                                    List list322 = c0194k222.f1652a;
                                                    size = list322.size();
                                                    i10 = 0;
                                                    while (true) {
                                                        if (i10 < size) {
                                                        }
                                                        i10++;
                                                        n10 = n12;
                                                        enumC5000a3 = enumC5000a2;
                                                        uVar3 = uVar4;
                                                    }
                                                    uVar2 = r16;
                                                    if (uVar2 != null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            n10 = n11;
                            a5 = a11;
                            enumC5000a = enumC5000a2;
                            uVar = uVar4;
                            uVar2 = null;
                            if (uVar2 == null) {
                            }
                            if (uVar2 != null) {
                            }
                            return jf.y.f36177a;
                        }
                        if (uVar2 != null) {
                            this.f1437q0.invoke(new C5251c(uVar2.f1672c));
                            C5251c c5251c = new C5251c(a5.f37621Y);
                            wf.n nVar = this.f1438r0;
                            nVar.invoke(uVar2, c5251c);
                            C0147n0 c0147n0 = new C0147n0(nVar, 0);
                            this.f1436p0 = null;
                            this.f1427Z = null;
                            this.f1428h0 = null;
                            this.f1429i0 = null;
                            this.f1430j0 = null;
                            this.f1431k0 = null;
                            this.f1432l0 = null;
                            this.f1435o0 = 4;
                            obj2 = AbstractC0170v0.g(n10, uVar2.f1670a, c0147n0, this);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            if (((Boolean) obj2).booleanValue()) {
                            }
                        }
                        return jf.y.f36177a;
                    }
                } else {
                    long j12 = this.f1434n0;
                    float f11 = this.f1433m0;
                    kotlin.jvm.internal.A a15 = this.f1431k0;
                    ?? r10 = this.f1430j0;
                    B0.N n17 = this.f1429i0;
                    kotlin.jvm.internal.A a16 = this.f1428h0;
                    B0.u uVar10 = this.f1427Z;
                    B0.N n18 = (B0.N) this.f1436p0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    obj3 = obj;
                    f6 = f11;
                    n10 = n17;
                    a11 = a16;
                    c0123f0 = r10;
                    a10 = a15;
                    j6 = j12;
                    uVar3 = uVar10;
                    n11 = n18;
                    C0194k c0194k2222 = (C0194k) obj3;
                    List list3222 = c0194k2222.f1652a;
                    size = list3222.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size) {
                        }
                        i10++;
                        n10 = n12;
                        enumC5000a3 = enumC5000a2;
                        uVar3 = uVar4;
                    }
                    uVar2 = r16;
                    if (uVar2 != null) {
                    }
                    n10 = n11;
                    a5 = a11;
                    enumC5000a = enumC5000a2;
                    uVar = uVar4;
                    uVar2 = null;
                    if (uVar2 == null) {
                    }
                    if (uVar2 != null) {
                    }
                    return jf.y.f36177a;
                }
            } else {
                n10 = (B0.N) this.f1436p0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                obj5 = obj;
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f1436p0;
            this.f1436p0 = n10;
            this.f1435o0 = 1;
            obj5 = Z1.c(n10, this, 2);
            if (obj5 == enumC5000a3) {
                return enumC5000a3;
            }
        }
        uVar = (B0.u) obj5;
        ?? obj7 = new Object();
        obj7.f37621Y = C5251c.f43619b;
        a12 = obj7;
        j10 = uVar.f1670a;
        C0123f0 c0123f032 = AbstractC0170v0.f1536c;
        if (!AbstractC0170v0.i(n10.f1614j0.f1619u0, j10)) {
        }
    }
}
