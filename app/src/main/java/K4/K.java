package K4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.N0;
import com.pairip.VMRunner;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9387a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9388b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9389c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L f9390d;

    public K(L l10, boolean z10) {
        this.f9390d = l10;
        this.f9388b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f9387a) {
                return;
            }
            L l10 = this.f9390d;
            this.f9389c = l10.f9396f;
            G g10 = l10.f9393c;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                arrayList.add(F.a(intentFilter.getAction(i10)));
            }
            int i11 = 2;
            ((U3.u) g10).U(2, arrayList, this.f9389c);
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f9388b) {
                    i11 = 4;
                }
                context.registerReceiver(this, intentFilter, i11);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f9387a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context) {
        if (this.f9387a) {
            context.unregisterReceiver(this);
            this.f9387a = false;
            return;
        }
        AbstractC2468q.e("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void c(Bundle bundle, C0822j c0822j, int i10) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        L l10 = this.f9390d;
        if (byteArray != null) {
            try {
                ((U3.u) l10.f9393c).S(N0.n(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.J.a()));
                return;
            } catch (Throwable unused) {
                AbstractC2468q.e("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        ((U3.u) l10.f9393c).S(F.b(23, i10, c0822j));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("qrlDyTh2DGsLGkpy", new Object[]{this, context, intent});
    }
}
