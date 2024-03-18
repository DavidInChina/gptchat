package Rh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import th.AbstractC5809q;

/* loaded from: classes.dex */
public final class g1 extends Nh.l implements AbstractC1315n {

    /* renamed from: h0  reason: collision with root package name */
    public final int f15855h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15856i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f15857j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f15858k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String[] f15859l0;

    /* renamed from: m0  reason: collision with root package name */
    public final HashMap f15860m0 = new HashMap();

    /* renamed from: n0  reason: collision with root package name */
    public final HashMap f15861n0 = new HashMap();

    /* renamed from: o0  reason: collision with root package name */
    public final HashMap f15862o0 = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    public final HashMap f15863p0 = new HashMap();

    /* renamed from: q0  reason: collision with root package name */
    public final HashMap f15864q0 = new HashMap();

    /* renamed from: r0  reason: collision with root package name */
    public final HashMap f15865r0 = new HashMap();

    /* renamed from: s0  reason: collision with root package name */
    public final ArrayList f15866s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final HashMap f15867t0 = new HashMap();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f15868u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final U3.l f15869v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f15870w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f15871x0;

    /* renamed from: y0  reason: collision with root package name */
    public th.h0 f15872y0;

    /* renamed from: z0  reason: collision with root package name */
    public final /* synthetic */ i1 f15873z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, int i10, String str, String str2, String str3, String[] strArr) {
        super(Sh.I.f16703b, null);
        this.f15873z0 = i1Var;
        this.f15855h0 = i10;
        this.f15856i0 = str;
        this.f15857j0 = str2;
        this.f15858k0 = str3;
        this.f15859l0 = strArr;
        this.f15869v0 = new U3.l(Nh.r.d(Nh.r.n(str2).h()));
    }

    @Override // Nh.l
    public final void B(int i10, String str) {
        this.f15868u0.add(new R0(str, Integer.valueOf(i10)));
    }

    @Override // Nh.l
    public final io.sentry.vendor.b C(String str, int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = this.f15870w0;
        } else {
            i11 = this.f15871x0;
        }
        int i12 = i10 + i11;
        HashMap hashMap = this.f15867t0;
        i1 i1Var = this.f15873z0;
        return new e1(i1Var, new C1305i(i12, str, hashMap), new C1319p(i1Var.f15910y, str));
    }

    @Override // Nh.l
    public final io.sentry.vendor.b G(int i10, I5.h hVar, String str, boolean z10) {
        AbstractC1315n abstractC1315n;
        int i11 = i10 >>> 24;
        if (i11 != 1) {
            switch (i11) {
                case 18:
                    abstractC1315n = new C1309k(str, hVar, (65280 & i10) >> 8, (i10 & 16711680) >> 16, this.f15861n0);
                    break;
                case 19:
                    return null;
                case 20:
                    abstractC1315n = new C1313m(str, hVar, this.f15862o0);
                    break;
                case 21:
                    abstractC1315n = new C1313m(str, hVar, this.f15865r0);
                    break;
                case 22:
                    abstractC1315n = new C1311l(str, hVar, (i10 & 16711680) >> 16, this.f15863p0);
                    break;
                case 23:
                    abstractC1315n = new C1311l(str, hVar, (i10 & 16776960) >> 8, this.f15864q0);
                    break;
                default:
                    throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected type reference on method: ", i11));
            }
        } else {
            abstractC1315n = new C1311l(str, hVar, (i10 & 16711680) >> 16, this.f15860m0);
        }
        i1 i1Var = this.f15873z0;
        return new e1(i1Var, abstractC1315n, new C1319p(i1Var.f15910y, str));
    }

    @Override // Nh.l
    public final void d(int i10, boolean z10) {
        String str = this.f15857j0;
        if (z10) {
            this.f15870w0 = Nh.r.d(Nh.r.n(str).h()).length - i10;
        } else {
            this.f15871x0 = Nh.r.d(Nh.r.n(str).h()).length - i10;
        }
    }

    @Override // Nh.l
    public final io.sentry.vendor.b e(String str, boolean z10) {
        ArrayList arrayList = this.f15866s0;
        i1 i1Var = this.f15873z0;
        return new e1(i1Var, str, arrayList, new C1319p(i1Var.f15910y, str));
    }

    @Override // Nh.l
    public final io.sentry.vendor.b f() {
        return new e1(this.f15873z0, this, new C1321q(this.f15857j0));
    }

    @Override // Rh.AbstractC1315n
    public final void h(String str, AbstractC5809q abstractC5809q) {
        this.f15872y0 = abstractC5809q;
    }

    @Override // Nh.l
    public final void j() {
        ArrayList arrayList;
        HashMap hashMap;
        int i10;
        U3.l lVar;
        R0 r02;
        ArrayList arrayList2 = this.f15873z0.f15894i;
        HashMap hashMap2 = this.f15860m0;
        HashMap hashMap3 = this.f15861n0;
        HashMap hashMap4 = this.f15862o0;
        HashMap hashMap5 = this.f15863p0;
        HashMap hashMap6 = this.f15864q0;
        HashMap hashMap7 = this.f15865r0;
        ArrayList arrayList3 = this.f15866s0;
        HashMap hashMap8 = this.f15867t0;
        ArrayList arrayList4 = this.f15868u0;
        if (arrayList4.isEmpty()) {
            if ((this.f15855h0 & 8) != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            U3.l lVar2 = this.f15869v0;
            lVar2.getClass();
            ArrayList arrayList5 = new ArrayList(((Nh.r[]) lVar2.f17423Z).length);
            int i11 = i10 ^ 1;
            Nh.r[] rVarArr = (Nh.r[]) lVar2.f17423Z;
            int length = rVarArr.length;
            hashMap = hashMap8;
            int i12 = 0;
            while (i12 < length) {
                Nh.r rVar = rVarArr[i12];
                Nh.r[] rVarArr2 = rVarArr;
                int i13 = length;
                String str = (String) ((Map) lVar2.f17424h0).get(Integer.valueOf(i11));
                if (str == null) {
                    r02 = new R0(null, null);
                    lVar = lVar2;
                } else {
                    lVar = lVar2;
                    r02 = new R0(str, null);
                }
                arrayList5.add(r02);
                i11 += rVar.r();
                i12++;
                rVarArr = rVarArr2;
                length = i13;
                lVar2 = lVar;
            }
            arrayList = arrayList5;
        } else {
            hashMap = hashMap8;
            arrayList = arrayList4;
        }
        arrayList2.add(new S0(this.f15856i0, this.f15855h0, this.f15857j0, this.f15858k0, this.f15859l0, hashMap2, hashMap3, hashMap4, hashMap5, hashMap6, hashMap7, arrayList3, hashMap, arrayList, this.f15872y0));
    }

    @Override // Nh.l
    public final void s(Nh.k kVar) {
        this.f15873z0.f15910y.getClass();
    }

    @Override // Nh.l
    public final void v(String str, String str2, String str3, Nh.k kVar, Nh.k kVar2, int i10) {
        this.f15873z0.f15910y.getClass();
    }

    @Override // Rh.AbstractC1315n
    public final void c() {
    }
}
