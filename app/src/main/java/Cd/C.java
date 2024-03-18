package Cd;

import android.content.Context;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2988Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f2989Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f2990h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f2991i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Tc.f fVar, Context context, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2989Z = fVar;
        this.f2990h0 = context;
        this.f2991i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C c10 = new C(this.f2989Z, this.f2990h0, this.f2991i0, abstractC4825e);
        c10.f2988Y = obj;
        return c10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C) create((AbstractC0330o) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC0330o abstractC0330o = (AbstractC0330o) this.f2988Y;
        boolean z10 = abstractC0330o instanceof C0328m;
        Tc.f fVar = this.f2989Z;
        if (z10) {
            Tc.f.c(fVar, A7.b.G1(((C0328m) abstractC0330o).f3064a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else {
            boolean z11 = abstractC0330o instanceof C0329n;
            Context context = this.f2990h0;
            if (z11) {
                try {
                    int i10 = VoiceModeForegroundService.f27708Y;
                    Wc.d.c(context, ((C0329n) abstractC0330o).f3065a);
                } catch (IllegalStateException e10) {
                    x8.W.W(Bi.c.i1(Pc.b.f13932j0), "Failed to start foreground service", e10, null, 4);
                }
            } else if (abstractC0330o instanceof C0327l) {
                this.f2991i0.invoke(((C0327l) abstractC0330o).f3063a);
            } else if (abstractC0330o instanceof C0326k) {
                K8.d.O0(context, fVar, ((C0326k) abstractC0330o).f3062a);
            }
        }
        return jf.y.f36177a;
    }
}
