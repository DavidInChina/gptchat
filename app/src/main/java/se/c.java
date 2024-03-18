package Se;

import V1.C1465f;
import Ve.r0;
import We.C;
import We.i;
import We.m;
import Xe.B;
import Xe.C1682d;
import Xe.l;
import Xe.o;
import Xe.s;
import Xe.v;
import Xe.z;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Locale;
import jf.C3959i;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.FrameCryptorAlgorithm;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import wf.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public r0 f16580a;

    /* renamed from: b  reason: collision with root package name */
    public a f16581b;

    /* renamed from: c  reason: collision with root package name */
    public PeerConnectionFactory f16582c;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashMap f16583d;

    /* renamed from: e  reason: collision with root package name */
    public FrameCryptorAlgorithm f16584e;

    /* renamed from: f  reason: collision with root package name */
    public k f16585f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16586g;

    public static int d(FrameCryptor.FrameCryptionState frameCryptionState) {
        int i10;
        if (frameCryptionState == null) {
            i10 = -1;
        } else {
            i10 = b.f16579a[frameCryptionState.ordinal()];
        }
        switch (i10) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 7;
        }
    }

    public final void a(z zVar, B b10, i iVar, r0 r0Var) {
        AbstractC3557B.c0("participant", iVar);
        AbstractC3557B.c0("room", r0Var);
        z a5 = b10.a();
        AbstractC3557B.Z(a5);
        RtpSender rtpSender = null;
        if (a5 instanceof C1682d) {
            z a10 = b10.a();
            AbstractC3557B.Z(a10);
            RtpTransceiver rtpTransceiver = ((C1682d) a10).f21887i;
            if (rtpTransceiver != null) {
                rtpSender = rtpTransceiver.getSender();
            }
        } else if (a5 instanceof l) {
            z a11 = b10.a();
            AbstractC3557B.Z(a11);
            RtpTransceiver rtpTransceiver2 = ((l) a11).f21906p;
            if (rtpTransceiver2 != null) {
                rtpSender = rtpTransceiver2.getSender();
            }
        } else {
            throw new IllegalArgumentException("unsupported track type");
        }
        if (rtpSender != null) {
            String b11 = iVar.b();
            AbstractC3557B.Z(b11);
            String str = b10.f21844c;
            z a12 = b10.a();
            AbstractC3557B.Z(a12);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", v.c(a12.f21949d).toLowerCase(Locale.ROOT));
            FrameCryptor createFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.f16582c, rtpSender, b11, this.f16584e, this.f16581b.f16578a);
            LinkedHashMap linkedHashMap = this.f16583d;
            C3959i c3959i = new C3959i(str, new m(b11));
            AbstractC3557B.b0("frameCryptor", createFrameCryptorForRtpSender);
            linkedHashMap.put(c3959i, createFrameCryptorForRtpSender);
            createFrameCryptorForRtpSender.setEnabled(this.f16586g);
            createFrameCryptorForRtpSender.setObserver(new C1465f(this, r0Var, b10, iVar, 2));
            return;
        }
        throw new IllegalArgumentException("rtpSender is null");
    }

    public final void b(r0 r0Var, C c10, z zVar, B b10) {
        RtpReceiver rtpReceiver;
        AbstractC3557B.c0("participant", c10);
        AbstractC3557B.c0("room", r0Var);
        z a5 = b10.a();
        AbstractC3557B.Z(a5);
        if (a5 instanceof o) {
            z a10 = b10.a();
            AbstractC3557B.Z(a10);
            rtpReceiver = ((o) a10).f21913i;
        } else if (a5 instanceof s) {
            z a11 = b10.a();
            AbstractC3557B.Z(a11);
            rtpReceiver = ((s) a11).f21930n;
        } else {
            throw new IllegalArgumentException("unsupported track type");
        }
        AbstractC3557B.Z(rtpReceiver);
        String b11 = c10.b();
        AbstractC3557B.Z(b11);
        String str = b10.f21844c;
        z a12 = b10.a();
        AbstractC3557B.Z(a12);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", v.c(a12.f21949d).toLowerCase(Locale.ROOT));
        FrameCryptor createFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.f16582c, rtpReceiver, b11, this.f16584e, this.f16581b.f16578a);
        LinkedHashMap linkedHashMap = this.f16583d;
        C3959i c3959i = new C3959i(str, new m(b11));
        AbstractC3557B.b0("frameCryptor", createFrameCryptorForRtpReceiver);
        linkedHashMap.put(c3959i, createFrameCryptorForRtpReceiver);
        createFrameCryptorForRtpReceiver.setEnabled(this.f16586g);
        createFrameCryptorForRtpReceiver.setObserver(new C1465f(this, r0Var, b10, c10, 3));
    }

    public final void c() {
        LinkedHashMap linkedHashMap = this.f16583d;
        for (FrameCryptor frameCryptor : linkedHashMap.values()) {
            frameCryptor.dispose();
        }
        linkedHashMap.clear();
    }
}
