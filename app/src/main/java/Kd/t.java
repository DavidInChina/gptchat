package Kd;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.N;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5042g;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f9766Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I f9767Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9767Z = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        t tVar = new t(this.f9767Z, abstractC4825e);
        tVar.f9766Y = ((Boolean) obj).booleanValue();
        return tVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jf.y yVar = jf.y.f36177a;
        ((t) create(bool, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        boolean z10 = this.f9766Y;
        I i10 = this.f9767Z;
        if (z10) {
            W.F(i10.f9691n, "Starting voice mode foreground service", null, 6);
            p pVar = i10.f9683f;
            pVar.f9758e = true;
            AbstractC5042g.d(pVar.f9754a, pVar, new IntentFilter("End"), 4);
        } else {
            W.F(i10.f9691n, "Stopping voice mode foreground service", null, 6);
            int i11 = VoiceModeForegroundService.f27708Y;
            Application application = i10.f9680c;
            AbstractC3557B.c0("context", application);
            application.stopService(new Intent(application, VoiceModeForegroundService.class));
            p pVar2 = i10.f9683f;
            if (pVar2.f9758e) {
                pVar2.f9758e = false;
                pVar2.f9754a.unregisterReceiver(pVar2);
            }
        }
        return jf.y.f36177a;
    }
}
