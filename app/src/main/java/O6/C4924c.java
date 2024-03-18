package o6;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import q5.C5271a;
import q5.C5272b;
import x6.C6278a;
import x6.C6281b;
import x6.C6284c;
import x6.C6290e;
import x6.C6293f;
import x6.C6302i;
import x6.C6314m;
import x6.C6317n;
import x6.C6320o;
import x6.C6331s;
import x6.C6337u;
import x6.C6340v;
import x6.C6346x;
import x6.C6349y;
import x6.EnumC6352z;

/* renamed from: o6.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4924c extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4926e f40809Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40810Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i6.d f40811h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f40812i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f40813j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f40814k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f40815l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f40816m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ long f40817n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ List f40818o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f40819p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ Map f40820q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ x6.C f40821r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4924c(C4926e c4926e, C4562a c4562a, i6.d dVar, String str, long j6, long j10, long j11, long j12, long j13, ArrayList arrayList, int i10, LinkedHashMap linkedHashMap, x6.C c10) {
        super(1);
        this.f40809Y = c4926e;
        this.f40810Z = c4562a;
        this.f40811h0 = dVar;
        this.f40812i0 = str;
        this.f40813j0 = j6;
        this.f40814k0 = j10;
        this.f40815l0 = j11;
        this.f40816m0 = j12;
        this.f40817n0 = j13;
        this.f40818o0 = arrayList;
        this.f40819p0 = i10;
        this.f40820q0 = linkedHashMap;
        this.f40821r0 = c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i10;
        List list;
        C6340v c6340v;
        String str;
        String str2;
        q5.g gVar;
        x6.E e10;
        C5271a c5271a = (C5271a) obj;
        AbstractC3557B.c0("datadogContext", c5271a);
        C4926e c4926e = this.f40809Y;
        k5.F f6 = c4926e.f40828d;
        C4562a c4562a = this.f40810Z;
        String str3 = c4562a.f38948d;
        if (str3 == null) {
            str3 = "";
        }
        f6.getClass();
        boolean d02 = k5.F.d0(c5271a, str3);
        i6.d dVar = this.f40811h0;
        AbstractC3557B.c0("<this>", dVar);
        int ordinal = dVar.ordinal();
        int i11 = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i10 = 5;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                i10 = 1;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            i11 = 7;
                        }
                    } else {
                        i10 = 2;
                    }
                }
            } else {
                i10 = 4;
            }
            C6281b c6281b = new C6281b(this.f40812i0);
            C6337u c6337u = new C6337u(this.f40813j0);
            C6317n c6317n = new C6317n(this.f40814k0);
            C6346x c6346x = new C6346x(this.f40815l0);
            x6.B b10 = new x6.B(this.f40816m0);
            long max = Math.max(this.f40817n0 - c4926e.f40837m, 1L);
            list = this.f40818o0;
            if (!(!list.isEmpty())) {
                c6340v = new C6340v(list);
            } else {
                c6340v = null;
            }
            C6278a c6278a = new C6278a(i10, c4926e.f40834j, Long.valueOf(max), c6281b, c6340v, c6337u, c6317n, c6346x, b10);
            str = c4562a.f38948d;
            if (str == null) {
                str = "";
            }
            str2 = c4562a.f38950f;
            if (str2 == null) {
                str2 = "";
            }
            C6290e c6290e = new C6290e(str, str2, c4562a.f38949e);
            C6293f c6293f = new C6293f(c4562a.f38945a);
            C6284c c6284c = new C6284c(c4562a.f38946b, this.f40819p0, Boolean.valueOf(d02));
            int r12 = AbstractC4344b.r1(c5271a.f43901g, c4926e.f40826b.l());
            gVar = c5271a.f43907m;
            if (!M3.H.Y(gVar)) {
                e10 = new x6.E(gVar.f43937a, gVar.f43938b, gVar.f43939c, AbstractC4268D.m1(gVar.f43940d));
            } else {
                e10 = null;
            }
            C5272b c5272b = c5271a.f43906l;
            C6349y c6349y = new C6349y(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g);
            C6331s c6331s = new C6331s(AbstractC4344b.f1(c5272b.f43913d), c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i);
            C6314m c6314m = new C6314m(this.f40820q0);
            C6320o c6320o = new C6320o(new x6.r(EnumC6352z.PLAN_1, AbstractC4344b.g1(c4562a.f38953i)), new C6302i(Float.valueOf(c4926e.f40830f), null), null, null);
            return new x6.G(c4926e.f40833i, c6293f, c5271a.f43897c, c5271a.f43899e, c6284c, r12, c6290e, e10, AbstractC4344b.e1(c4926e.f40839o), this.f40821r0, c6349y, c6331s, c6320o, c6314m, c6278a);
        }
        i10 = i11;
        C6281b c6281b2 = new C6281b(this.f40812i0);
        C6337u c6337u2 = new C6337u(this.f40813j0);
        C6317n c6317n2 = new C6317n(this.f40814k0);
        C6346x c6346x2 = new C6346x(this.f40815l0);
        x6.B b102 = new x6.B(this.f40816m0);
        long max2 = Math.max(this.f40817n0 - c4926e.f40837m, 1L);
        list = this.f40818o0;
        if (!(!list.isEmpty())) {
        }
        C6278a c6278a2 = new C6278a(i10, c4926e.f40834j, Long.valueOf(max2), c6281b2, c6340v, c6337u2, c6317n2, c6346x2, b102);
        str = c4562a.f38948d;
        if (str == null) {
        }
        str2 = c4562a.f38950f;
        if (str2 == null) {
        }
        C6290e c6290e2 = new C6290e(str, str2, c4562a.f38949e);
        C6293f c6293f2 = new C6293f(c4562a.f38945a);
        C6284c c6284c2 = new C6284c(c4562a.f38946b, this.f40819p0, Boolean.valueOf(d02));
        int r122 = AbstractC4344b.r1(c5271a.f43901g, c4926e.f40826b.l());
        gVar = c5271a.f43907m;
        if (!M3.H.Y(gVar)) {
        }
        C5272b c5272b2 = c5271a.f43906l;
        C6349y c6349y2 = new C6349y(c5272b2.f43915f, c5272b2.f43917h, null, c5272b2.f43916g);
        C6331s c6331s2 = new C6331s(AbstractC4344b.f1(c5272b2.f43913d), c5272b2.f43910a, c5272b2.f43912c, c5272b2.f43911b, c5272b2.f43918i);
        C6314m c6314m2 = new C6314m(this.f40820q0);
        C6320o c6320o2 = new C6320o(new x6.r(EnumC6352z.PLAN_1, AbstractC4344b.g1(c4562a.f38953i)), new C6302i(Float.valueOf(c4926e.f40830f), null), null, null);
        return new x6.G(c4926e.f40833i, c6293f2, c5271a.f43897c, c5271a.f43899e, c6284c2, r122, c6290e2, e10, AbstractC4344b.e1(c4926e.f40839o), this.f40821r0, c6349y2, c6331s2, c6320o2, c6314m2, c6278a2);
    }
}
