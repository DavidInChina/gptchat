package qc;

import com.revenuecat.purchases.interfaces.Callback;
import nf.AbstractC4825e;
import nf.C4833m;

/* loaded from: classes2.dex */
public final class f implements Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC4825e f44045a;

    public f(C4833m c4833m) {
        this.f44045a = c4833m;
    }

    @Override // com.revenuecat.purchases.interfaces.Callback
    public final void onReceived(Object obj) {
        this.f44045a.resumeWith((Boolean) obj);
    }
}
