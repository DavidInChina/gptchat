package We;

import Ve.C1503i0;
import Ve.C1519y;
import cf.AbstractC2408g;
import com.google.android.gms.internal.play_billing.N;
import df.AbstractC2640e;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.List;
import jh.C4062p3;
import jh.EnumC4051n2;
import jh.EnumC4056o2;
import jh.N2;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$SimulcastCodec;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.VideoTrack;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* renamed from: We.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1655f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20996Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f20997Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Xe.l f20998h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ RtpTransceiver.RtpTransceiverInit f20999i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ F f21000j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Xe.t f21001k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Xe.B f21002l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ F f21003m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Xe.E f21004n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ List f21005o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655f(i iVar, Xe.l lVar, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, F f6, Xe.t tVar, Xe.B b10, F f10, Xe.E e10, List list, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20997Z = iVar;
        this.f20998h0 = lVar;
        this.f20999i0 = rtpTransceiverInit;
        this.f21000j0 = f6;
        this.f21001k0 = tVar;
        this.f21002l0 = b10;
        this.f21003m0 = f10;
        this.f21004n0 = e10;
        this.f21005o0 = list;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1655f(this.f20997Z, this.f20998h0, this.f20999i0, this.f21000j0, this.f21001k0, this.f21002l0, this.f21003m0, this.f21004n0, this.f21005o0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1655f) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        LivekitModels$TrackInfo livekitModels$TrackInfo;
        Object obj3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20996Y;
        jf.y yVar = jf.y.f36177a;
        Xe.E e10 = this.f21004n0;
        Xe.l lVar = this.f20998h0;
        i iVar = this.f20997Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    obj2 = obj;
                    livekitModels$TrackInfo = (LivekitModels$TrackInfo) obj2;
                    iVar.f21021s.i();
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                        Objects.toString(e10);
                        String str = lVar.f21950e;
                        Objects.toString(livekitModels$TrackInfo);
                        Mi.a.a(new Object[0]);
                    }
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
            obj3 = obj;
        } else {
            N.B0(obj);
            C1503i0 c1503i0 = iVar.f21021s;
            VideoTrack videoTrack = lVar.f21902l;
            this.f20996Y = 1;
            C1519y c1519y = c1503i0.f18790p;
            if (c1519y != null) {
                obj3 = c1519y.h(new Ve.N(videoTrack, this.f20999i0, null), this);
            } else {
                obj3 = null;
            }
            if (obj3 == enumC5000a) {
                return enumC5000a;
            }
        }
        RtpTransceiver rtpTransceiver = (RtpTransceiver) obj3;
        if (rtpTransceiver == null) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                Objects.toString(e10);
                Mi.a.f(new Object[0]);
            }
            return yVar;
        }
        AbstractC2640e.a(rtpTransceiver, this.f21000j0.f20973m, iVar.f21027y);
        RtpSender sender = rtpTransceiver.getSender();
        Xe.t tVar = this.f21001k0;
        tVar.f21933c = sender;
        N2 newBuilder = LivekitRtc$AddTrackRequest.newBuilder();
        String id2 = rtpTransceiver.getSender().id();
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).setCid(id2);
        Xe.B b10 = this.f21002l0;
        String str2 = b10.f21844c;
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).setSid(str2);
        EnumC4056o2 b11 = Xe.v.b(lVar.f21949d);
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).setType(b11);
        boolean enabled = true ^ lVar.f21902l.enabled();
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).setMuted(enabled);
        EnumC4051n2 a5 = Xe.v.a(b10.f21847f);
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).setSource(a5);
        C4062p3 newBuilder2 = LivekitRtc$SimulcastCodec.newBuilder();
        String str3 = e10.f21854Y;
        newBuilder2.d();
        ((LivekitRtc$SimulcastCodec) newBuilder2.f27507Z).setCodec(str3);
        String id3 = rtpTransceiver.getSender().id();
        newBuilder2.d();
        ((LivekitRtc$SimulcastCodec) newBuilder2.f27507Z).setCid(id3);
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).addSimulcastCodecs((LivekitRtc$SimulcastCodec) newBuilder2.b());
        String[] strArr = af.f.f24188a;
        Xe.u e11 = lVar.e();
        Xe.u e12 = lVar.e();
        List b12 = af.f.b(e11.f21935a, e12.f21936b, this.f21005o0, R4.b.x1(e10.f21854Y));
        newBuilder.d();
        ((LivekitRtc$AddTrackRequest) newBuilder.f27507Z).addAllLayers(b12);
        String id4 = tVar.f21932b.id();
        AbstractC3557B.b0("simulcastTrack.rtcTrack.id()", id4);
        String str4 = b10.f21843b;
        EnumC4056o2 b13 = Xe.v.b(b10.f21845d);
        String str5 = this.f21003m0.f20977q;
        this.f20996Y = 2;
        obj2 = iVar.f21021s.a(id4, str4, b13, str5, newBuilder, this);
        if (obj2 == enumC5000a) {
            return enumC5000a;
        }
        livekitModels$TrackInfo = (LivekitModels$TrackInfo) obj2;
        iVar.f21021s.i();
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(3, 7) >= 0) {
            Objects.toString(e10);
            String str6 = lVar.f21950e;
            Objects.toString(livekitModels$TrackInfo);
            Mi.a.a(new Object[0]);
        }
        return yVar;
    }
}
