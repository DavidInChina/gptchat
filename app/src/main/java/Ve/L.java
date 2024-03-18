package Ve;

import id.AbstractC3557B;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class L extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18675Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ DataChannel.Init f18676Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18677h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(DataChannel.Init init, C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18676Z = init;
        this.f18677h0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        L l10 = new L(this.f18676Z, this.f18677h0, abstractC4825e);
        l10.f18675Y = obj;
        return l10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        DataChannel createDataChannel = ((PeerConnection) this.f18675Y).createDataChannel("_lossy", this.f18676Z);
        AbstractC3557B.b0("dataChannel", createDataChannel);
        createDataChannel.registerObserver(new E(this.f18677h0, createDataChannel));
        return createDataChannel;
    }
}
