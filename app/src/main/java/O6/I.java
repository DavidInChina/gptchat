package o6;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import jh.H1;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import q5.C5271a;
import q5.C5272b;
import x6.C6285c0;
import x6.C6291e0;
import x6.C6294f0;
import x6.C6297g0;
import x6.C6303i0;
import x6.C6309k0;
import x6.EnumC6288d0;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class I extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ L f40644Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40645Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f40646h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Long f40647i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f40648j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f40649k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ String f40650l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f40651m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Map f40652n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ C6297g0 f40653o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l10, C4562a c4562a, int i10, Long l11, String str, String str2, String str3, int i11, LinkedHashMap linkedHashMap, C6297g0 c6297g0) {
        super(1);
        this.f40644Y = l10;
        this.f40645Z = c4562a;
        this.f40646h0 = i10;
        this.f40647i0 = l11;
        this.f40648j0 = str;
        this.f40649k0 = str2;
        this.f40650l0 = str3;
        this.f40651m0 = i11;
        this.f40652n0 = linkedHashMap;
        this.f40653o0 = c6297g0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        long j6;
        Wh.s sVar;
        boolean z10;
        C6291e0 c6291e0;
        x6.H h10;
        String str;
        String str2;
        C6303i0 c6303i0;
        int i11;
        C5271a c5271a = (C5271a) obj;
        AbstractC3557B.c0("datadogContext", c5271a);
        L l10 = this.f40644Y;
        k5.F f6 = l10.f40675f;
        C4562a c4562a = this.f40645Z;
        String str3 = c4562a.f38948d;
        if (str3 == null) {
            str3 = "";
        }
        f6.getClass();
        boolean d02 = k5.F.d0(c5271a, str3);
        int m12 = AbstractC4344b.m1(this.f40646h0);
        int i12 = l10.f40672c;
        AbstractC2469q0.q("<this>", i12);
        switch (AbstractC6708l.f(i12)) {
            case 0:
                i11 = 1;
                i10 = i11;
                break;
            case 1:
                i11 = 2;
                i10 = i11;
                break;
            case 2:
                i11 = 3;
                i10 = i11;
                break;
            case 3:
                i11 = 4;
                i10 = i11;
                break;
            case 4:
                i11 = 5;
                i10 = i11;
                break;
            case 5:
                i11 = 6;
                i10 = i11;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i11 = 8;
                i10 = i11;
                break;
            case 8:
                i11 = 9;
                i10 = i11;
                break;
            default:
                throw new RuntimeException();
        }
        Long l11 = this.f40647i0;
        if (l11 != null) {
            j6 = l11.longValue();
        } else {
            j6 = 0;
        }
        D5.a aVar = l10.f40674e;
        aVar.getClass();
        String str4 = l10.f40671b;
        AbstractC3557B.c0("url", str4);
        char[] cArr = Wh.s.f21249j;
        try {
            sVar = H1.n(str4);
        } catch (IllegalArgumentException unused) {
            sVar = null;
        }
        if (sVar == null) {
            z10 = false;
        } else {
            z10 = aVar.c(sVar);
        }
        if (z10) {
            try {
                String host = new URL(str4).getHost();
                AbstractC3557B.b0("{\n            URL(url).host\n        }", host);
                str4 = host;
            } catch (MalformedURLException unused2) {
            }
            c6291e0 = new C6291e0(str4, null, 7);
        } else {
            c6291e0 = null;
        }
        x6.X x10 = new x6.X(this.f40648j0, m12, this.f40649k0, Boolean.FALSE, this.f40650l0, 1, new C6294f0(i10, j6, l10.f40671b, c6291e0), null, 62289);
        String str5 = c4562a.f38951g;
        if (str5 != null) {
            h10 = new x6.H(AbstractC4344b.F0(str5));
        } else {
            h10 = null;
        }
        String str6 = c4562a.f38948d;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = c4562a.f38950f;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        x6.Z z11 = new x6.Z(str, (String) null, str2, c4562a.f38949e, 18);
        q5.g gVar = c5271a.f43907m;
        if (M3.H.Y(gVar)) {
            c6303i0 = new C6303i0(gVar.f43937a, gVar.f43938b, gVar.f43939c, AbstractC4268D.m1(gVar.f43940d));
        } else {
            c6303i0 = null;
        }
        x6.O h12 = AbstractC4344b.h1(l10.f40682m);
        x6.I i13 = new x6.I(c4562a.f38945a);
        x6.Y y10 = new x6.Y(c4562a.f38946b, this.f40651m0, Boolean.valueOf(d02));
        int q12 = AbstractC4344b.q1(c5271a.f43901g, l10.f40670a.l());
        C5272b c5272b = c5271a.f43906l;
        C6285c0 c6285c0 = new C6285c0(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g);
        x6.V v10 = new x6.V(AbstractC4344b.i1(c5272b.f43913d), c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i);
        x6.S s10 = new x6.S(this.f40652n0);
        return new C6309k0(l10.f40680k, i13, c5271a.f43897c, c5271a.f43899e, y10, q12, z11, c6303i0, h12, this.f40653o0, c6285c0, v10, new x6.T(new x6.U(EnumC6288d0.PLAN_1, AbstractC4344b.j1(c4562a.f38953i)), new x6.N(Float.valueOf(l10.f40676g), null), null), s10, h10, x10, null, 1315856);
    }
}
