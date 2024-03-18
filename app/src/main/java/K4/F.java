package K4;

import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.C2454j;
import com.google.android.gms.internal.play_billing.C2464o;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.N0;
import com.google.android.gms.internal.play_billing.P0;
import com.google.android.gms.internal.play_billing.Q0;
import com.google.android.gms.internal.play_billing.R0;
import com.google.android.gms.internal.play_billing.T0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.android.gms.internal.play_billing.W0;
import com.google.android.gms.internal.play_billing.Y0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9348a = 0;

    static {
        C2464o c2464o = G.f9349l;
    }

    public static V0 a(String str) {
        C2464o c2464o = G.f9349l;
        V0 v02 = V0.BROADCAST_ACTION_UNSPECIFIED;
        Object obj = c2464o.get(str);
        if (obj != null) {
            v02 = obj;
        }
        return v02;
    }

    public static N0 b(int i10, int i11, C0822j c0822j) {
        try {
            M0 r10 = N0.r();
            R0 q10 = T0.q();
            int i12 = c0822j.f9439a;
            q10.e();
            T0.n((T0) q10.f26877Z, i12);
            String str = c0822j.f9440b;
            q10.e();
            T0.o((T0) q10.f26877Z, str);
            q10.e();
            T0.p((T0) q10.f26877Z, i10);
            r10.e();
            N0.o((N0) r10.f26877Z, (T0) q10.c());
            r10.e();
            N0.q((N0) r10.f26877Z, i11);
            return (N0) r10.c();
        } catch (Exception e10) {
            AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static Q0 c(int i10) {
        try {
            P0 p10 = Q0.p();
            p10.e();
            Q0.o((Q0) p10.f26877Z, i10);
            return (Q0) p10.c();
        } catch (Exception e10) {
            AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static Y0 d(C2454j c2454j) {
        try {
            W0 u10 = Y0.u();
            u10.e();
            Y0.t((Y0) u10.f26877Z, 3);
            u10.e();
            Y0.s((Y0) u10.f26877Z, c2454j);
            return (Y0) u10.c();
        } catch (Exception e10) {
            AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
