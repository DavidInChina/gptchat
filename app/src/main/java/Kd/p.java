package Kd;

import Qg.r0;
import Qg.s0;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.pairip.VMRunner;
import id.AbstractC3557B;
import ld.C4431d;

/* loaded from: classes2.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final Application f9754a;

    /* renamed from: b  reason: collision with root package name */
    public final C4431d f9755b;

    /* renamed from: c  reason: collision with root package name */
    public final Pc.g f9756c = Bi.c.i1(Pc.b.f13932j0);

    /* renamed from: d  reason: collision with root package name */
    public final r0 f9757d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9758e;

    /* renamed from: f  reason: collision with root package name */
    public final r0 f9759f;

    public p(Application application, C4431d c4431d) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("scope", c4431d);
        this.f9754a = application;
        this.f9755b = c4431d;
        r0 b10 = s0.b(0, 0, null, 7);
        this.f9757d = b10;
        this.f9759f = b10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("XfU0h2Oc0Z8FZfpk", new Object[]{this, context, intent});
    }
}
