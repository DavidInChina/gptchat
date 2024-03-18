package Nd;

import Df.AbstractC0405d;
import E9.f;
import Li.q;
import Li.r;
import Ng.B;
import Qd.A;
import Qd.E;
import Qd.H;
import Vd.g;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.File;
import jf.y;
import kf.t;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import ud.C5902a;
import z.AbstractC6708l;
import zc.u;

/* loaded from: classes.dex */
public final class d implements r, A {

    /* renamed from: Y  reason: collision with root package name */
    public final q f12790Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B f12791Z;

    /* renamed from: h0  reason: collision with root package name */
    public final SharedPreferences f12792h0;

    /* renamed from: i0  reason: collision with root package name */
    public final g f12793i0;

    public d(Context context, q qVar, String str, B b10) {
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, qVar);
        AbstractC3557B.c0("writeKey", str);
        AbstractC3557B.c0("ioDispatcher", b10);
        this.f12790Y = qVar;
        this.f12791Z = b10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("analytics-android-".concat(str), 0);
        AbstractC3557B.b0("context.getSharedPrefere\u2026y\", Context.MODE_PRIVATE)", sharedPreferences);
        this.f12792h0 = sharedPreferences;
        File dir = context.getDir("segment-disk-queue", 0);
        AbstractC3557B.b0("context.getDir(\"segment-\u2026e\", Context.MODE_PRIVATE)", dir);
        this.f12793i0 = new g(dir, str, new Pd.a(sharedPreferences));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    @Override // Qd.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        b bVar;
        EnumC5000a enumC5000a;
        int i10;
        d dVar;
        q qVar;
        c cVar;
        AbstractC0405d b10;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f12788i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f12788i0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f12786Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f12788i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d dVar2 = bVar.f12785Y;
                    N.B0(obj);
                    dVar = dVar2;
                } else {
                    N.B0(obj);
                    c cVar2 = new c(0, this);
                    AbstractC0405d b11 = C.f37623a.b(H.class);
                    bVar.f12785Y = this;
                    bVar.f12788i0 = 1;
                    if (this.f12790Y.f(this, b11, true, this.f12791Z, cVar2, bVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    dVar = this;
                }
                qVar = dVar.f12790Y;
                cVar = new c(1, dVar);
                b10 = C.f37623a.b(E.class);
                bVar.f12785Y = null;
                bVar.f12788i0 = 2;
                if (qVar.f(dVar, b10, true, dVar.f12791Z, cVar, bVar) == enumC5000a) {
                    return enumC5000a;
                }
                return y.f36177a;
            }
        }
        bVar = new b(this, abstractC4825e);
        Object obj2 = bVar.f12786Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = bVar.f12788i0;
        if (i10 == 0) {
        }
        qVar = dVar.f12790Y;
        cVar = new c(1, dVar);
        b10 = C.f37623a.b(E.class);
        bVar.f12785Y = null;
        bVar.f12788i0 = 2;
        if (qVar.f(dVar, b10, true, dVar.f12791Z, cVar, bVar) == enumC5000a) {
        }
        return y.f36177a;
    }

    @Override // Qd.A
    public final String b(int i10) {
        AbstractC2469q0.q(SubscriberAttributeKt.JSON_NAME_KEY, i10);
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 4) {
            String q10 = f.q(i10);
            SharedPreferences sharedPreferences = this.f12792h0;
            if (f6 != 7) {
                return sharedPreferences.getString(q10, null);
            }
            int i11 = sharedPreferences.getInt(q10, -1);
            if (i11 == -1) {
                return null;
            }
            return String.valueOf(i11);
        }
        return t.m2(this.f12793i0.c(), null, null, null, null, 63);
    }

    @Override // Qd.A
    public final Object c(AbstractC4825e abstractC4825e) {
        g gVar = this.f12793i0;
        gVar.getClass();
        Object d10 = gVar.d(new u(8, gVar), abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        y yVar = y.f36177a;
        if (d10 != enumC5000a) {
            d10 = yVar;
        }
        if (d10 == enumC5000a) {
            return d10;
        }
        return yVar;
    }

    @Override // Qd.A
    public final boolean d(String str) {
        this.f12793i0.getClass();
        return new File(str).delete();
    }

    @Override // Qd.A
    public final Object e(int i10, String str, AbstractC4825e abstractC4825e) {
        int i11 = a.f12784a[AbstractC6708l.f(i10)];
        y yVar = y.f36177a;
        if (i11 == 1) {
            if (str.length() < 32000) {
                g gVar = this.f12793i0;
                gVar.getClass();
                Object d10 = gVar.d(new C5902a(gVar, 1, str), abstractC4825e);
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                if (d10 != enumC5000a) {
                    d10 = yVar;
                }
                if (d10 == enumC5000a) {
                    return d10;
                }
                return yVar;
            }
            throw new Exception("enqueued payload is too large");
        }
        this.f12792h0.edit().putString(f.q(i10), str).apply();
        return yVar;
    }

    @Override // Qd.A
    public final void remove(int i10) {
        AbstractC2469q0.q(SubscriberAttributeKt.JSON_NAME_KEY, i10);
        if (a.f12784a[AbstractC6708l.f(i10)] != 1) {
            this.f12792h0.edit().putString(f.q(i10), null).apply();
        }
    }
}
