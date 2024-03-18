package K4;

import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.r1;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class E extends r1 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f9346b;

    /* renamed from: c  reason: collision with root package name */
    public final ResultReceiver f9347c;

    public E(WeakReference weakReference, ResultReceiver resultReceiver) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 2);
        this.f9346b = weakReference;
        this.f9347c = resultReceiver;
    }
}
