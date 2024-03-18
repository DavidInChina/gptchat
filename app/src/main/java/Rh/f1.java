package Rh;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f1 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final int f15842d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15843e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15844f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15845g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f15846h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f15847i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i1 f15848j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i1 i1Var, int i10, String str, String str2, String str3) {
        super(Sh.I.f16703b, 3);
        this.f15848j = i1Var;
        this.f15842d = i10;
        this.f15843e = str;
        this.f15844f = str2;
        this.f15845g = str3;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        ArrayList arrayList = this.f15847i;
        i1 i1Var = this.f15848j;
        return new e1(i1Var, str, arrayList, new C1319p(i1Var.f15910y, str));
    }

    @Override // io.sentry.vendor.b
    public final void g() {
        ArrayList arrayList = this.f15848j.f15893h;
        HashMap hashMap = this.f15846h;
        ArrayList arrayList2 = this.f15847i;
        arrayList.add(new L(this.f15843e, this.f15842d, this.f15844f, this.f15845g, hashMap, arrayList2));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        int i11 = i10 >>> 24;
        if (i11 == 19) {
            C1313m c1313m = new C1313m(str, hVar, this.f15846h);
            i1 i1Var = this.f15848j;
            return new e1(i1Var, c1313m, new C1319p(i1Var.f15910y, str));
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected type reference on field: ", i11));
    }
}
