package K4;

import Z.C1745x0;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.h1;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.q1;
import g.RunnableC3118k;

/* loaded from: classes.dex */
public final class C implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9340a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f9341b = false;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC0817e f9342c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0816d f9343d;

    public /* synthetic */ C(C0816d c0816d, AbstractC0817e abstractC0817e) {
        this.f9343d = c0816d;
        this.f9342c = abstractC0817e;
    }

    public final void a(C0822j c0822j) {
        synchronized (this.f9340a) {
            try {
                AbstractC0817e abstractC0817e = this.f9342c;
                if (abstractC0817e != null) {
                    abstractC0817e.onBillingSetupFinished(c0822j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q1 q1Var;
        AbstractC2468q.d("BillingClient", "Billing service connected.");
        C0816d c0816d = this.f9343d;
        int i10 = p1.f26954b;
        if (iBinder == null) {
            q1Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof q1) {
                q1Var = (q1) queryLocalInterface;
            } else {
                q1Var = new o1(iBinder);
            }
        }
        c0816d.f9405g = q1Var;
        o2.d dVar = new o2.d(1, this);
        RunnableC3118k runnableC3118k = new RunnableC3118k(13, this);
        C0816d c0816d2 = this.f9343d;
        if (c0816d2.j(dVar, 30000L, runnableC3118k, c0816d2.f()) == null) {
            C0816d c0816d3 = this.f9343d;
            C0822j h10 = c0816d3.h();
            ((U3.u) c0816d3.f9404f).S(F.b(25, 6, h10));
            a(h10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC2468q.e("BillingClient", "Billing service disconnected.");
        G g10 = this.f9343d.f9404f;
        m1 n10 = m1.n();
        U3.u uVar = (U3.u) g10;
        uVar.getClass();
        if (n10 != null) {
            try {
                g1 t10 = h1.t();
                a1 a1Var = (a1) uVar.f17492Z;
                if (a1Var != null) {
                    t10.e();
                    h1.q((h1) t10.f26877Z, a1Var);
                }
                t10.e();
                h1.n((h1) t10.f26877Z, n10);
                ((C1745x0) uVar.f17494i0).e((h1) t10.c());
            } catch (Throwable th2) {
                AbstractC2468q.f("BillingLogger", "Unable to log.", th2);
            }
        }
        this.f9343d.f9405g = null;
        this.f9343d.f9399a = 0;
        synchronized (this.f9340a) {
            try {
                AbstractC0817e abstractC0817e = this.f9342c;
                if (abstractC0817e != null) {
                    abstractC0817e.onBillingServiceDisconnected();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
