package Ve;

import A.C0045u;
import java.util.List;
import livekit.org.webrtc.MediaConstraints;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class V extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18707Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18707Y = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new V(this.f18707Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((V) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C0045u c0045u;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C1503i0 c1503i0 = this.f18707Y;
        C1519y c1519y = c1503i0.f18790p;
        if (c1519y != null && (c0045u = c1519y.f18927i) != null) {
            MediaConstraints mediaConstraints = new MediaConstraints();
            List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
            list.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "false"));
            list.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
            if (c1503i0.f() == EnumC1486a.f18721i0 || c1503i0.f() == EnumC1486a.f18722j0) {
                list.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
            }
            c0045u.invoke(mediaConstraints);
        }
        return jf.y.f36177a;
    }
}
