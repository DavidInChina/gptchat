package Nd;

import Li.q;
import Qd.A;
import Qd.B;
import Qd.i;
import android.content.Context;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e implements B {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12794a = new Object();

    @Override // Qd.B
    public final A a(i iVar, q qVar, String str, Ng.B b10, Object obj) {
        AbstractC3557B.c0("analytics", iVar);
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, qVar);
        AbstractC3557B.c0("writeKey", str);
        AbstractC3557B.c0("ioDispatcher", b10);
        return new d((Context) obj, qVar, str, b10);
    }
}
