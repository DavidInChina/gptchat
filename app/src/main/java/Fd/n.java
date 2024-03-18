package Fd;

import Cd.AbstractC0330o;
import Cd.C0326k;
import Cd.C0327l;
import Cd.C0328m;
import Cd.C0329n;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5254Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f5255Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f5256h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f5257i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Tc.f fVar, Context context, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5255Z = fVar;
        this.f5256h0 = context;
        this.f5257i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f5255Z, this.f5256h0, this.f5257i0, abstractC4825e);
        nVar.f5254Y = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((n) create((AbstractC0330o) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC0330o abstractC0330o = (AbstractC0330o) this.f5254Y;
        Pc.g i12 = Bi.c.i1(Pc.b.f13940r0);
        boolean z10 = abstractC0330o instanceof C0328m;
        Tc.f fVar = this.f5255Z;
        if (z10) {
            Tc.f.c(fVar, A7.b.G1(((C0328m) abstractC0330o).f3064a, fVar.f17059d, fVar.f17056a), 0, 14);
        } else {
            boolean z11 = abstractC0330o instanceof C0329n;
            Context context = this.f5256h0;
            if (z11) {
                try {
                    int i10 = VoiceModeForegroundService.f27708Y;
                    Wc.d.c(context, ((C0329n) abstractC0330o).f3065a);
                } catch (IllegalStateException e10) {
                    W.W(i12, "Failed to start foreground service", e10, null, 4);
                }
            } else if (abstractC0330o instanceof C0327l) {
                this.f5257i0.invoke(((C0327l) abstractC0330o).f3063a);
            } else if (abstractC0330o instanceof C0326k) {
                K8.d.O0(context, fVar, ((C0326k) abstractC0330o).f3062a);
            }
        }
        return jf.y.f36177a;
    }
}
