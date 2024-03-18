package K4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import o8.BinderC4950c;

/* loaded from: classes.dex */
public final class B extends ResultReceiver {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9338Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f9339Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Handler handler, Object obj, int i10) {
        super(handler);
        this.f9338Y = i10;
        this.f9339Z = obj;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        m mVar;
        int i11 = this.f9338Y;
        Object obj = this.f9339Z;
        switch (i11) {
            case 0:
                com.revenuecat.purchases.google.c cVar = (com.revenuecat.purchases.google.c) obj;
                if (bundle == null) {
                    int i12 = AbstractC2468q.f26955a;
                    mVar = new m(0);
                } else {
                    int i13 = AbstractC2468q.f26955a;
                    int i14 = bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
                    mVar = new m(i14);
                }
                cVar.a(mVar);
                return;
            case 1:
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            ((BinderC4950c) obj).f40937e.b(1);
                            return;
                        }
                        return;
                    }
                    ((BinderC4950c) obj).f40937e.b(2);
                    return;
                }
                ((BinderC4950c) obj).f40937e.b(3);
                return;
            default:
                ((N7.f) obj).b(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(BinderC4950c binderC4950c, Handler handler) {
        super(handler);
        this.f9338Y = 1;
        this.f9339Z = binderC4950c;
    }
}
