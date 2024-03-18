package Li;

import Df.AbstractC0405d;
import Ng.B;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static int f11212f = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f11213a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f11214b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.n f11215c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0405d f11216d;

    /* renamed from: e  reason: collision with root package name */
    public final B f11217e;

    public d(r rVar, wf.n nVar, AbstractC0405d abstractC0405d, B b10) {
        AbstractC3557B.c0("obj", rVar);
        AbstractC3557B.c0("handler", nVar);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, abstractC0405d);
        AbstractC3557B.c0("queue", b10);
        this.f11215c = nVar;
        this.f11216d = abstractC0405d;
        this.f11217e = b10;
        int i10 = f11212f;
        f11212f = i10 + 1;
        this.f11213a = i10;
        this.f11214b = new WeakReference(rVar);
    }
}
