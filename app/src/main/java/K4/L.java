package K4;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9391a;

    /* renamed from: b  reason: collision with root package name */
    public final t f9392b;

    /* renamed from: c  reason: collision with root package name */
    public final G f9393c;

    /* renamed from: d  reason: collision with root package name */
    public final K f9394d = new K(this, true);

    /* renamed from: e  reason: collision with root package name */
    public final K f9395e = new K(this, false);

    /* renamed from: f  reason: collision with root package name */
    public boolean f9396f;

    public L(Context context, t tVar, G g10) {
        this.f9391a = context;
        this.f9392b = tVar;
        this.f9393c = g10;
    }

    public final void a(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f9396f = z10;
        K k10 = this.f9395e;
        Context context = this.f9391a;
        k10.a(context, intentFilter2);
        if (this.f9396f) {
            synchronized (J.class) {
                if (!J.f9379Y) {
                    J.f9379Y = true;
                }
            }
        }
        this.f9394d.a(context, intentFilter);
    }
}
