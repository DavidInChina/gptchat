package Ve;

import id.AbstractC3557B;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class K extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18672Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ DataChannel.Init f18673Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18674h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(DataChannel.Init init, C1503i0 c1503i0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18673Z = init;
        this.f18674h0 = c1503i0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        K k10 = new K(this.f18673Z, this.f18674h0, abstractC4825e);
        k10.f18672Y = obj;
        return k10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        DataChannel createDataChannel = ((PeerConnection) this.f18672Y).createDataChannel("_reliable", this.f18673Z);
        AbstractC3557B.b0("dataChannel", createDataChannel);
        createDataChannel.registerObserver(new E(this.f18674h0, createDataChannel));
        return createDataChannel;
    }
}
