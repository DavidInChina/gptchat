package Ve;

import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import livekit.org.webrtc.RtpReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class S extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18692Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1519y f18693Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ RTCStatsCollectorCallback f18694h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ RtpReceiver f18695i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C1519y c1519y, RTCStatsCollectorCallback rTCStatsCollectorCallback, RtpReceiver rtpReceiver, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18693Z = c1519y;
        this.f18694h0 = rTCStatsCollectorCallback;
        this.f18695i0 = rtpReceiver;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new S(this.f18693Z, this.f18694h0, this.f18695i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jf.y yVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18692Y;
        RTCStatsCollectorCallback rTCStatsCollectorCallback = this.f18694h0;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            yVar = null;
            C1519y c1519y = this.f18693Z;
            if (c1519y != null) {
                Q q10 = new Q(this.f18695i0, rTCStatsCollectorCallback, null);
                this.f18692Y = 1;
                obj = c1519y.h(q10, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (yVar == null) {
                rTCStatsCollectorCallback.onStatsDelivered(new RTCStatsReport(0L, kf.w.f37484Y));
            }
            return jf.y.f36177a;
        }
        yVar = (jf.y) obj;
        if (yVar == null) {
        }
        return jf.y.f36177a;
    }
}
