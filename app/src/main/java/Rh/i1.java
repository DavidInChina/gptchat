package Rh;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i1 extends io.sentry.vendor.b {

    /* renamed from: k  reason: collision with root package name */
    public int f15896k;

    /* renamed from: l  reason: collision with root package name */
    public int f15897l;

    /* renamed from: m  reason: collision with root package name */
    public String f15898m;

    /* renamed from: n  reason: collision with root package name */
    public String f15899n;

    /* renamed from: o  reason: collision with root package name */
    public String f15900o;

    /* renamed from: p  reason: collision with root package name */
    public String[] f15901p;

    /* renamed from: r  reason: collision with root package name */
    public String f15903r;

    /* renamed from: u  reason: collision with root package name */
    public String f15906u;

    /* renamed from: x  reason: collision with root package name */
    public ph.f f15909x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ j1 f15910y;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15889d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f15890e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f15891f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15892g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f15893h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f15894i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f15895j = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public boolean f15902q = false;

    /* renamed from: t  reason: collision with root package name */
    public c1 f15905t = Z0.f15781Y;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f15904s = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f15907v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f15908w = new ArrayList();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var) {
        super(Sh.I.f16703b, 2);
        this.f15910y = j1Var;
    }

    @Override // io.sentry.vendor.b
    public final void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        this.f15897l = 65535 & i11;
        this.f15896k = i11;
        this.f15898m = str;
        this.f15900o = str2;
        this.f15899n = str3;
        this.f15901p = strArr;
        this.f15909x = ph.f.h(i10);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        return new e1(this, str, this.f15892g, new C1319p(this.f15910y, str));
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b j(int i10, Object obj, String str, String str2, String str3) {
        return new f1(this, i10 & 65535, str, str2, str3);
    }

    @Override // io.sentry.vendor.b
    public final void k(String str, int i10, String str2, String str3) {
        if (str.equals(this.f15898m)) {
            if (str2 != null) {
                this.f15906u = str2;
                if (this.f15905t.n()) {
                    this.f15905t = new b1(str2, false);
                }
            }
            if (str3 == null && !this.f15905t.n()) {
                this.f15902q = true;
            }
            this.f15897l = 65535 & i10;
        } else if (str2 != null && str3 != null && str2.equals(this.f15898m)) {
            ArrayList arrayList = this.f15907v;
            arrayList.add(TokenNames.f24315L + str + Separators.SEMICOLON);
        }
    }

    @Override // io.sentry.vendor.b
    public final Nh.l m(int i10, String str, String str2, String str3, String[] strArr) {
        if (str.equals("<clinit>")) {
            int i11 = j1.f15917k0;
            return null;
        }
        return new g1(this, i10 & 65535, str, str2, str3, strArr);
    }

    @Override // io.sentry.vendor.b
    public final void o(String str) {
        this.f15903r = str;
    }

    @Override // io.sentry.vendor.b
    public final void p(String str) {
        this.f15904s.add(str);
    }

    @Override // io.sentry.vendor.b
    public final void r(String str, String str2, String str3) {
        if (str2 != null && !str2.equals("<clinit>")) {
            this.f15905t = new a1(str, str2, str3);
        } else if (str != null) {
            this.f15905t = new b1(str, true);
        }
    }

    @Override // io.sentry.vendor.b
    public final void t(String str) {
        this.f15908w.add(str);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b v(String str, String str2, String str3) {
        return new h1(this, str, str2, str3);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        AbstractC1315n abstractC1315n;
        int i11 = i10 >>> 24;
        if (i11 != 0) {
            if (i11 != 16) {
                if (i11 == 17) {
                    abstractC1315n = new C1309k(str, hVar, (65280 & i10) >> 8, (i10 & 16711680) >> 16, this.f15891f);
                } else {
                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Unexpected type reference: ", i11));
                }
            } else {
                abstractC1315n = new C1311l(str, hVar, (short) ((i10 & 16776960) >> 8), this.f15889d);
            }
        } else {
            abstractC1315n = new C1311l(str, hVar, (i10 & 16711680) >> 16, this.f15890e);
        }
        return new e1(this, abstractC1315n, new C1319p(this.f15910y, str));
    }
}
