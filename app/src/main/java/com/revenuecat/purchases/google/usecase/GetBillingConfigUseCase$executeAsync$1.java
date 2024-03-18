package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0816d;
import K4.C0818f;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import K4.y;
import U3.u;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import q.RunnableC5216j;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class GetBillingConfigUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ GetBillingConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase$executeAsync$1(GetBillingConfigUseCase getBillingConfigUseCase) {
        super(1);
        this.this$0 = getBillingConfigUseCase;
    }

    public static final void invoke$lambda$0(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, C0822j c0822j, C0818f c0818f) {
        AbstractC3557B.c0("$hasResponded", atomicBoolean);
        AbstractC3557B.c0("this$0", getBillingConfigUseCase);
        AbstractC3557B.c0("result", c0822j);
        if (atomicBoolean.getAndSet(true)) {
            AbstractC2469q0.t(new Object[]{Integer.valueOf(c0822j.f9439a)}, 1, OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, LogIntent.GOOGLE_ERROR);
            return;
        }
        BillingClientUseCase.processResult$default(getBillingConfigUseCase, c0822j, c0818f, null, null, 12, null);
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        b bVar = new b(new AtomicBoolean(false), this.this$0);
        C0816d c0816d = (C0816d) abstractC0815c;
        if (!c0816d.c()) {
            AbstractC2468q.e("BillingClient", "Service disconnected.");
            G g10 = c0816d.f9404f;
            C0822j c0822j = H.f9361j;
            ((u) g10).S(F.b(2, 13, c0822j));
            bVar.a(c0822j, null);
        } else if (!c0816d.f9418t) {
            AbstractC2468q.e("BillingClient", "Current client doesn't support get billing config.");
            G g11 = c0816d.f9404f;
            C0822j c0822j2 = H.f9374w;
            ((u) g11).S(F.b(32, 13, c0822j2));
            bVar.a(c0822j2, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", c0816d.f9400b);
            if (c0816d.j(new y(c0816d, bundle, bVar, 6), 30000L, new RunnableC5216j(c0816d, bVar, 19), c0816d.f()) != null) {
                return;
            }
            C0822j h10 = c0816d.h();
            ((u) c0816d.f9404f).S(F.b(25, 13, h10));
            bVar.a(h10, null);
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return jf.y.f36177a;
    }
}
