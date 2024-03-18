package We;

import com.google.android.gms.internal.play_billing.N;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20954Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f20955Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ MediaStreamTrack f20956h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f20957i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f20958j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ RtpReceiver f20959k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f20960l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f20961m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, MediaStreamTrack mediaStreamTrack, String str, wf.k kVar, RtpReceiver rtpReceiver, boolean z10, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20955Z = c10;
        this.f20956h0 = mediaStreamTrack;
        this.f20957i0 = str;
        this.f20958j0 = kVar;
        this.f20959k0 = rtpReceiver;
        this.f20960l0 = z10;
        this.f20961m0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B(this.f20955Z, this.f20956h0, this.f20957i0, this.f20958j0, this.f20959k0, this.f20960l0, this.f20961m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20954Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f20954Y = 1;
            if (R4.b.p0(150L, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f20955Z.j(this.f20956h0, this.f20957i0, this.f20958j0, this.f20959k0, this.f20960l0, this.f20961m0 - 1);
        return jf.y.f36177a;
    }
}
