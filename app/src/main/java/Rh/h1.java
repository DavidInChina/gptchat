package Rh;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h1 extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final String f15876d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15877e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15878f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f15879g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f15880h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i1 f15881i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, String str, String str2, String str3) {
        super(Sh.I.f16703b, 5);
        this.f15881i = i1Var;
        this.f15876d = str;
        this.f15877e = str2;
        this.f15878f = str3;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        ArrayList arrayList = this.f15880h;
        i1 i1Var = this.f15881i;
        return new e1(i1Var, str, arrayList, new C1319p(i1Var.f15910y, str));
    }

    @Override // io.sentry.vendor.b
    public final void g() {
        ArrayList arrayList = this.f15881i.f15895j;
        HashMap hashMap = this.f15879g;
        ArrayList arrayList2 = this.f15880h;
        arrayList.add(new T0(this.f15876d, this.f15877e, this.f15878f, hashMap, arrayList2));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        int i11 = i10 >>> 24;
        if (i11 == 19) {
            C1313m c1313m = new C1313m(str, hVar, this.f15879g);
            i1 i1Var = this.f15881i;
            return new e1(i1Var, c1313m, new C1319p(i1Var.f15910y, str));
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected type reference on record component: ", i11));
    }
}
