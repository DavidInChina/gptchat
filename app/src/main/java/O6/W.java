package o6;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import q5.C5272b;
import q5.C5274d;
import q5.EnumC5273c;
import x6.A0;
import x6.AbstractC6287d;
import x6.B0;
import x6.C0;
import x6.C6312l0;
import x6.C6315m0;
import x6.C6318n0;
import x6.C6324p0;
import x6.C6327q0;
import x6.C6335t0;
import x6.C6338u0;
import x6.C6341v0;
import x6.C6344w0;
import x6.C6353z0;
import x6.D0;
import x6.E0;
import x6.EnumC6350y0;
import x6.F0;
import x6.H0;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class W extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ a0 f40730Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4562a f40731Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f40732h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4934m f40733i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f40734j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Map f40735k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(a0 a0Var, C4562a c4562a, long j6, C4934m c4934m, boolean z10, LinkedHashMap linkedHashMap) {
        super(1);
        this.f40730Y = a0Var;
        this.f40731Z = c4562a;
        this.f40732h0 = j6;
        this.f40733i0 = c4934m;
        this.f40734j0 = z10;
        this.f40735k0 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        E0 e02;
        int i10;
        C6312l0 c6312l0;
        F0 f02;
        int i11;
        List list;
        C6318n0 c6318n0;
        C6353z0 c6353z0;
        int i12;
        int ordinal;
        int i13;
        int i14;
        int i15;
        int i16;
        NoSuchElementException e10;
        int[] h10;
        int length;
        int i17;
        int i18;
        int[] iArr;
        String str;
        C5271a c5271a = (C5271a) obj;
        AbstractC3557B.c0("datadogContext", c5271a);
        a0 a0Var = this.f40730Y;
        k5.F f6 = a0Var.f40785f;
        C4562a c4562a = this.f40731Z;
        String str2 = c4562a.f38948d;
        if (str2 == null) {
            str2 = "";
        }
        f6.getClass();
        boolean d02 = k5.F.d0(c5271a, str2);
        String str3 = c4562a.f38955k;
        if (str3 != null && !Lg.n.n2(str3) && (str = c4562a.f38956l) != null && !Lg.n.n2(str)) {
            e02 = new E0(str3, str, null);
        } else {
            e02 = null;
        }
        if (e02 == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C4934m c4934m = this.f40733i0;
        long millis = this.f40732h0 - timeUnit.toMillis(c4934m.f40886j);
        C6353z0 c6353z02 = new C6353z0(null, c4934m.f40886j, Boolean.valueOf(this.f40734j0));
        String str4 = c4562a.f38951g;
        if (str4 != null) {
            c6312l0 = new C6312l0(AbstractC4344b.F0(str4));
        } else {
            c6312l0 = null;
        }
        String str5 = c4562a.f38948d;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c4562a.f38950f;
        if (str6 == null) {
            str6 = "";
        }
        B0 b02 = new B0(str5, null, str6, c4562a.f38949e);
        q5.g gVar = c5271a.f43907m;
        if (M3.H.Y(gVar)) {
            f02 = new F0(gVar.f43937a, gVar.f43938b, gVar.f43939c, AbstractC4268D.m1(gVar.f43940d));
        } else {
            f02 = null;
        }
        C5274d c5274d = c5271a.f43905k;
        AbstractC3557B.c0("<this>", c5274d);
        if (AbstractC4344b.A0(c5274d)) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        switch (AbstractC6708l.f(c5274d.f43924a)) {
            case 0:
                list = kf.v.f37483Y;
                break;
            case 1:
                list = AbstractC4344b.F0(EnumC6350y0.ETHERNET);
                break;
            case 2:
                list = AbstractC4344b.F0(EnumC6350y0.WIFI);
                break;
            case 3:
                list = AbstractC4344b.F0(EnumC6350y0.WIMAX);
                break;
            case 4:
                list = AbstractC4344b.F0(EnumC6350y0.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                list = AbstractC4344b.F0(EnumC6350y0.CELLULAR);
                break;
            case 11:
                list = AbstractC4344b.F0(EnumC6350y0.OTHER);
                break;
            default:
                throw new RuntimeException();
        }
        String str7 = c5274d.f43925b;
        String str8 = c5274d.f43930g;
        if (str8 == null && str7 == null) {
            c6318n0 = null;
        } else {
            c6318n0 = new C6318n0(str8, str7);
        }
        C6327q0 c6327q0 = new C6327q0(i11, list, 0, c6318n0);
        C6315m0 c6315m0 = new C6315m0(c4562a.f38945a);
        A0 a02 = new A0(c4562a.f38946b, i10, Boolean.valueOf(d02));
        AbstractC5091c l10 = a0Var.f40781b.l();
        String str9 = c5271a.f43901g;
        AbstractC3557B.c0("source", str9);
        AbstractC3557B.c0("internalLogger", l10);
        try {
            h10 = AbstractC6708l.h(7);
            length = h10.length;
            c6353z0 = c6353z02;
            i17 = 0;
        } catch (NoSuchElementException e11) {
            e10 = e11;
            c6353z0 = c6353z02;
        }
        while (i17 < length) {
            try {
                i18 = h10[i17];
                iArr = h10;
            } catch (NoSuchElementException e12) {
                e10 = e12;
                P4.a.m0(l10, 5, EnumC5090b.f42738Y, new C4929h(str9, 1), e10, false, 48);
                i12 = 0;
                C5272b c5272b = c5271a.f43906l;
                C0 c02 = new C0(c5272b.f43915f, c5272b.f43917h, null, c5272b.f43916g);
                EnumC5273c enumC5273c = c5272b.f43913d;
                AbstractC3557B.c0("<this>", enumC5273c);
                ordinal = enumC5273c.ordinal();
                if (ordinal == 0) {
                }
                C6344w0 c6344w0 = new C6344w0(i13, c5272b.f43910a, c5272b.f43912c, c5272b.f43911b, c5272b.f43918i);
                C6335t0 c6335t0 = new C6335t0(this.f40735k0);
                D0 d03 = D0.PLAN_1;
                i15 = c4562a.f38953i;
                AbstractC2469q0.q("<this>", i15);
                switch (AbstractC6708l.f(i15)) {
                }
                return new H0(millis, c6315m0, c5271a.f43897c, c5271a.f43899e, null, a02, i12, b02, f02, c6327q0, null, e02, null, c02, c6344w0, new C6338u0(new C6341v0(d03, i16), new C6324p0(Float.valueOf(a0Var.f40787h), null), null, null), c6335t0, c6312l0, null, c6353z0);
            }
            if (AbstractC3557B.K(AbstractC6287d.o(i18), str9)) {
                i12 = i18;
                C5272b c5272b2 = c5271a.f43906l;
                C0 c022 = new C0(c5272b2.f43915f, c5272b2.f43917h, null, c5272b2.f43916g);
                EnumC5273c enumC5273c2 = c5272b2.f43913d;
                AbstractC3557B.c0("<this>", enumC5273c2);
                ordinal = enumC5273c2.ordinal();
                if (ordinal == 0) {
                    i14 = 1;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                i13 = 7;
                            } else {
                                i13 = 2;
                            }
                        } else {
                            i13 = 4;
                        }
                    } else {
                        i13 = 3;
                    }
                } else {
                    i14 = 1;
                    i13 = 1;
                }
                C6344w0 c6344w02 = new C6344w0(i13, c5272b2.f43910a, c5272b2.f43912c, c5272b2.f43911b, c5272b2.f43918i);
                C6335t0 c6335t02 = new C6335t0(this.f40735k0);
                D0 d032 = D0.PLAN_1;
                i15 = c4562a.f38953i;
                AbstractC2469q0.q("<this>", i15);
                switch (AbstractC6708l.f(i15)) {
                    case 0:
                        i16 = i14;
                        break;
                    case 1:
                        i16 = 2;
                        break;
                    case 2:
                        i16 = 3;
                        break;
                    case 3:
                        i16 = 4;
                        break;
                    case 4:
                        i16 = 5;
                        break;
                    case 5:
                        i16 = 6;
                        break;
                    case 6:
                        i16 = 7;
                        break;
                    default:
                        throw new RuntimeException();
                }
                return new H0(millis, c6315m0, c5271a.f43897c, c5271a.f43899e, null, a02, i12, b02, f02, c6327q0, null, e02, null, c022, c6344w02, new C6338u0(new C6341v0(d032, i16), new C6324p0(Float.valueOf(a0Var.f40787h), null), null, null), c6335t02, c6312l0, null, c6353z0);
            }
            i17++;
            h10 = iArr;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
