package mg;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class n extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final Set f39301Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final Set f39302h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final n f39303i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final n f39304j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final n f39305k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final n f39306l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final n f39307m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final n f39308n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final n f39309o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final n f39310p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final n f39311q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final n f39312r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final n f39313s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final n f39314t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final n f39315u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final n f39316v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ n[] f39317w0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f39318Y;

    static {
        n nVar = new n("VISIBILITY", 0, true);
        f39303i0 = nVar;
        n nVar2 = new n("MODALITY", 1, true);
        f39304j0 = nVar2;
        n nVar3 = new n("OVERRIDE", 2, true);
        f39305k0 = nVar3;
        n nVar4 = new n("ANNOTATIONS", 3, false);
        f39306l0 = nVar4;
        n nVar5 = new n("INNER", 4, true);
        f39307m0 = nVar5;
        n nVar6 = new n("MEMBER_KIND", 5, true);
        f39308n0 = nVar6;
        n nVar7 = new n("DATA", 6, true);
        f39309o0 = nVar7;
        n nVar8 = new n("INLINE", 7, true);
        f39310p0 = nVar8;
        n nVar9 = new n("EXPECT", 8, true);
        f39311q0 = nVar9;
        n nVar10 = new n("ACTUAL", 9, true);
        f39312r0 = nVar10;
        n nVar11 = new n("CONST", 10, true);
        f39313s0 = nVar11;
        n nVar12 = new n("LATEINIT", 11, true);
        f39314t0 = nVar12;
        n nVar13 = new n("FUN", 12, true);
        f39315u0 = nVar13;
        n nVar14 = new n("VALUE", 13, true);
        f39316v0 = nVar14;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14};
        f39317w0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
        n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar15 : values) {
            if (nVar15.f39318Y) {
                arrayList.add(nVar15);
            }
        }
        f39301Z = kf.t.P2(arrayList);
        f39302h0 = kf.q.B3(values());
    }

    public n(String str, int i10, boolean z10) {
        this.f39318Y = z10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f39317w0.clone();
    }
}
