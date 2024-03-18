package Xe;

import A.C0045u;
import Ng.D0;
import Ve.E0;
import cf.C2409h;
import id.AbstractC3557B;
import jh.C4027i3;
import jh.EnumC4085u2;
import jh.N3;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$UpdateTrackSettings;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.VideoTrack;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class r extends B {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f21918q = 0;

    /* renamed from: j  reason: collision with root package name */
    public final Ng.B f21919j;

    /* renamed from: k  reason: collision with root package name */
    public D0 f21920k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f21921l;

    /* renamed from: n  reason: collision with root package name */
    public u f21923n;

    /* renamed from: p  reason: collision with root package name */
    public final C0045u f21925p;

    /* renamed from: m  reason: collision with root package name */
    public final int f21922m = 3;

    /* renamed from: o  reason: collision with root package name */
    public boolean f21924o = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public r(LivekitModels$TrackInfo livekitModels$TrackInfo, We.C c10, Ng.B b10) {
        super(livekitModels$TrackInfo, null, c10);
        AbstractC3557B.c0("participant", c10);
        AbstractC3557B.c0("ioDispatcher", b10);
        this.f21919j = b10;
        this.f21925p = new C0045u(new Object(), Ad.l.g(b10), new p(this, null));
    }

    public static final void d(r rVar) {
        We.C c10;
        MediaStreamTrack mediaStreamTrack;
        EnumC4085u2 enumC4085u2;
        Object obj = rVar.f21849h.get();
        EnumC4085u2 enumC4085u22 = null;
        if (obj instanceof We.C) {
            c10 = (We.C) obj;
        } else {
            c10 = null;
        }
        if (c10 != null) {
            z a5 = super.a();
            if (a5 != null) {
                mediaStreamTrack = a5.b();
            } else {
                mediaStreamTrack = null;
            }
            if (mediaStreamTrack instanceof VideoTrack) {
                ((VideoTrack) mediaStreamTrack).setShouldReceive(!rVar.f21921l);
            }
            String str = rVar.f21844c;
            boolean z10 = rVar.f21921l;
            u uVar = rVar.f21923n;
            EnumC4085u2 enumC4085u23 = EnumC4085u2.HIGH;
            int i10 = rVar.f21922m;
            if (i10 != 0) {
                int f6 = AbstractC6708l.f(i10);
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 == 2) {
                            enumC4085u22 = enumC4085u23;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        enumC4085u2 = EnumC4085u2.MEDIUM;
                    }
                } else {
                    enumC4085u2 = EnumC4085u2.LOW;
                }
                enumC4085u22 = enumC4085u2;
            }
            E0 e02 = c10.f20962r;
            e02.getClass();
            AbstractC3557B.c0("sid", str);
            N3 newBuilder = LivekitRtc$UpdateTrackSettings.newBuilder();
            newBuilder.d();
            ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).addTrackSids(str);
            newBuilder.d();
            ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).setDisabled(z10);
            if (uVar != null) {
                newBuilder.d();
                ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).setWidth(uVar.f21935a);
                newBuilder.d();
                ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).setHeight(uVar.f21936b);
            } else if (enumC4085u22 != null) {
                newBuilder.d();
                ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).setQuality(enumC4085u22);
            } else {
                newBuilder.d();
                ((LivekitRtc$UpdateTrackSettings) newBuilder.f27507Z).setQuality(enumC4085u23);
            }
            C4027i3 newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
            newBuilder2.d();
            ((LivekitRtc$SignalRequest) newBuilder2.f27507Z).setTrackSetting((LivekitRtc$UpdateTrackSettings) newBuilder.b());
            e02.s((LivekitRtc$SignalRequest) newBuilder2.b());
        }
    }

    @Override // Xe.B
    public final z a() {
        return super.a();
    }

    @Override // Xe.B
    public final void b(boolean z10) {
        We.C c10;
        Df.v[] vVarArr = B.f21841i;
        Df.v vVar = vVarArr[1];
        C2409h c2409h = this.f21846e;
        if (((Boolean) c2409h.d(vVar)).booleanValue() == z10) {
            return;
        }
        c2409h.h(Boolean.valueOf(z10), vVarArr[1]);
        Object obj = this.f21849h.get();
        if (obj instanceof We.C) {
            c10 = (We.C) obj;
        } else {
            c10 = null;
        }
        if (c10 == null) {
            return;
        }
        if (z10) {
            c10.d(this);
        } else {
            c10.e(this);
        }
    }

    public final void e(z zVar) {
        if (!AbstractC3557B.K(zVar, super.a())) {
            D0 d02 = this.f21920k;
            if (d02 != null) {
                d02.k(null);
            }
            this.f21920k = null;
        }
        this.f21842a.h(zVar, B.f21841i[0]);
        if (zVar != null) {
            this.f21920k = Ad.l.O0(Ad.l.g(this.f21919j), null, null, new q(zVar, this, null), 3);
            if (zVar instanceof s) {
                s sVar = (s) zVar;
                if (sVar.f21926j) {
                    this.f21923n = sVar.f21929m;
                    C0045u c0045u = this.f21925p;
                    AbstractC3557B.c0("<this>", c0045u);
                    jf.y yVar = jf.y.f36177a;
                    c0045u.invoke(yVar);
                    this.f21921l = true;
                    AbstractC3557B.c0("<this>", c0045u);
                    c0045u.invoke(yVar);
                }
            }
        }
    }
}
