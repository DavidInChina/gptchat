package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class B0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18613Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18614Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(E0 e02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18614Z = e02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B0(this.f18614Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((B0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r9.f18613Y
            r2 = 1
            Ve.E0 r3 = r9.f18614Z
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            com.google.android.gms.internal.play_billing.N.B0(r10)
            goto L25
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            com.google.android.gms.internal.play_billing.N.B0(r10)
        L1a:
            long r4 = r3.f18630D0
            r9.f18613Y = r2
            java.lang.Object r10 = R4.b.p0(r4, r9)
            if (r10 != r0) goto L25
            return r0
        L25:
            r3.getClass()
            java.util.Date r10 = new java.util.Date
            r10.<init>()
            long r4 = r10.getTime()
            jh.i3 r10 = livekit.LivekitRtc$SignalRequest.newBuilder()
            r10.d()
            com.google.protobuf.d0 r1 = r10.f27507Z
            livekit.LivekitRtc$SignalRequest r1 = (livekit.LivekitRtc$SignalRequest) r1
            livekit.LivekitRtc$SignalRequest.access$3800(r1, r4)
            com.google.protobuf.d0 r10 = r10.b()
            livekit.LivekitRtc$SignalRequest r10 = (livekit.LivekitRtc$SignalRequest) r10
            r3.s(r10)
            jh.i3 r10 = livekit.LivekitRtc$SignalRequest.newBuilder()
            jh.a3 r1 = livekit.LivekitRtc$Ping.newBuilder()
            long r6 = r3.f18631E0
            r1.d()
            com.google.protobuf.d0 r8 = r1.f27507Z
            livekit.LivekitRtc$Ping r8 = (livekit.LivekitRtc$Ping) r8
            livekit.LivekitRtc$Ping.access$50800(r8, r6)
            r1.d()
            com.google.protobuf.d0 r6 = r1.f27507Z
            livekit.LivekitRtc$Ping r6 = (livekit.LivekitRtc$Ping) r6
            livekit.LivekitRtc$Ping.access$50600(r6, r4)
            com.google.protobuf.d0 r1 = r1.b()
            livekit.LivekitRtc$Ping r1 = (livekit.LivekitRtc$Ping) r1
            r10.d()
            com.google.protobuf.d0 r6 = r10.f27507Z
            livekit.LivekitRtc$SignalRequest r6 = (livekit.LivekitRtc$SignalRequest) r6
            livekit.LivekitRtc$SignalRequest.access$4300(r6, r1)
            com.google.protobuf.d0 r10 = r10.b()
            livekit.LivekitRtc$SignalRequest r10 = (livekit.LivekitRtc$SignalRequest) r10
            r3.s(r10)
            Ng.D0 r10 = r3.f18628B0
            if (r10 == 0) goto L84
            goto L1a
        L84:
            androidx.lifecycle.f r10 = r3.f18646t0
            r1 = 0
            if (r10 == 0) goto L96
            Ve.C0 r6 = new Ve.C0
            r6.<init>(r3, r4, r1)
            r4 = 3
            Ng.D0 r10 = Ad.l.O0(r10, r1, r1, r6, r4)
            r3.f18628B0 = r10
            goto L1a
        L96:
            java.lang.String r10 = "coroutineScope"
            id.AbstractC3557B.C2(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ve.B0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
