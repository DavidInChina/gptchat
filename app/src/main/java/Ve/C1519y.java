package Ve;

import A.C0045u;
import Sg.C1394f;
import a.C1888h;
import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import ud.C5902a;
import z.AbstractC6708l;

/* renamed from: Ve.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1519y {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1494e f18919a;

    /* renamed from: b  reason: collision with root package name */
    public final C1888h f18920b;

    /* renamed from: c  reason: collision with root package name */
    public final PeerConnection f18921c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f18922d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18923e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18924f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashMap f18925g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f18926h;

    /* renamed from: i  reason: collision with root package name */
    public final C0045u f18927i;

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public C1519y(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, C c10, Ng.B b10, PeerConnectionFactory peerConnectionFactory, C1888h c1888h) {
        AbstractC3557B.c0("config", rTCConfiguration);
        AbstractC3557B.c0("pcObserver", observer);
        AbstractC3557B.c0("ioDispatcher", b10);
        AbstractC3557B.c0("connectionFactory", peerConnectionFactory);
        AbstractC3557B.c0("sdpFactory", c1888h);
        this.f18919a = c10;
        this.f18920b = c1888h;
        C1394f g10 = Ad.l.g(b10.plus(Bi.c.z()));
        PeerConnection createPeerConnection = peerConnectionFactory.createPeerConnection(rTCConfiguration, observer);
        if (createPeerConnection != null) {
            this.f18921c = createPeerConnection;
            this.f18922d = new ArrayList();
            this.f18925g = new LinkedHashMap();
            this.f18926h = new AtomicBoolean(false);
            this.f18927i = new C0045u(new Object(), g10, new C1510o(this, null));
            return;
        }
        throw new IllegalStateException("peer connection creation failed?");
    }

    public final Object a(AbstractC4825e abstractC4825e) {
        C1496f c1496f = new C1496f(this, null);
        if (this.f18926h.get()) {
            return null;
        }
        return ef.e.c(new C1509n(this, c1496f, null), abstractC4825e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MediaConstraints mediaConstraints, AbstractC4825e abstractC4825e) {
        C1500h c1500h;
        int i10;
        kotlin.jvm.internal.B b10;
        C1519y c1519y;
        Object obj;
        kotlin.jvm.internal.B b11;
        if (abstractC4825e instanceof C1500h) {
            c1500h = (C1500h) abstractC4825e;
            int i11 = c1500h.f18766j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1500h.f18766j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1500h.f18764h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1500h.f18766j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b11 = c1500h.f18763Z;
                        c1519y = c1500h.f18762Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    if (this.f18919a == null) {
                        return yVar;
                    }
                    ?? obj3 = new Object();
                    C1502i c1502i = new C1502i(mediaConstraints, this, obj3, null);
                    if (this.f18926h.get()) {
                        c1519y = this;
                        b10 = obj3;
                        obj = b10.f37622Y;
                        if (obj != null) {
                            C c10 = (C) c1519y.f18919a;
                            c10.getClass();
                            ef.e.b(new C5902a(c10, 6, (SessionDescription) obj));
                        }
                        return yVar;
                    }
                    C1509n c1509n = new C1509n(this, c1502i, null);
                    c1500h.f18762Y = this;
                    c1500h.f18763Z = obj3;
                    c1500h.f18766j0 = 1;
                    if (ef.e.c(c1509n, c1500h) == enumC5000a) {
                        return enumC5000a;
                    }
                    c1519y = this;
                    b11 = obj3;
                }
                b10 = b11;
                obj = b10.f37622Y;
                if (obj != null) {
                }
                return yVar;
            }
        }
        c1500h = new C1500h(this, abstractC4825e);
        Object obj22 = c1500h.f18764h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1500h.f18766j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        b10 = b11;
        obj = b10.f37622Y;
        if (obj != null) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(AbstractC4825e abstractC4825e) {
        C1504j c1504j;
        int i10;
        Object obj;
        PeerConnection.IceConnectionState iceConnectionState;
        if (abstractC4825e instanceof C1504j) {
            c1504j = (C1504j) abstractC4825e;
            int i11 = c1504j.f18803h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1504j.f18803h0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1504j.f18801Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1504j.f18803h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    obj = null;
                    C1506k c1506k = new C1506k(this, null);
                    if (!this.f18926h.get()) {
                        C1509n c1509n = new C1509n(this, c1506k, null);
                        c1504j.f18803h0 = 1;
                        obj2 = ef.e.c(c1509n, c1504j);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    iceConnectionState = (PeerConnection.IceConnectionState) obj;
                    if (iceConnectionState == null) {
                        return PeerConnection.IceConnectionState.CLOSED;
                    }
                    return iceConnectionState;
                }
                obj = obj2;
                iceConnectionState = (PeerConnection.IceConnectionState) obj;
                if (iceConnectionState == null) {
                }
            }
        }
        c1504j = new C1504j(this, abstractC4825e);
        Object obj22 = c1504j.f18801Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1504j.f18803h0;
        if (i10 == 0) {
        }
        obj = obj22;
        iceConnectionState = (PeerConnection.IceConnectionState) obj;
        if (iceConnectionState == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        C1507l c1507l;
        int i10;
        Object obj;
        Boolean bool;
        boolean z10;
        if (abstractC4825e instanceof C1507l) {
            c1507l = (C1507l) abstractC4825e;
            int i11 = c1507l.f18813h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1507l.f18813h0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1507l.f18811Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1507l.f18813h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    obj = null;
                    C1508m c1508m = new C1508m(this, null);
                    if (!this.f18926h.get()) {
                        C1509n c1509n = new C1509n(this, c1508m, null);
                        c1507l.f18813h0 = 1;
                        obj2 = ef.e.c(c1509n, c1507l);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    bool = (Boolean) obj;
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                obj = obj2;
                bool = (Boolean) obj;
                if (bool != null) {
                }
                return Boolean.valueOf(z10);
            }
        }
        c1507l = new C1507l(this, abstractC4825e);
        Object obj22 = c1507l.f18811Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1507l.f18813h0;
        if (i10 == 0) {
        }
        obj = obj22;
        bool = (Boolean) obj;
        if (bool != null) {
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(SessionDescription sessionDescription, String str, boolean z10, AbstractC4825e abstractC4825e) {
        C1511p c1511p;
        int i10;
        Object obj;
        SessionDescription sessionDescription2;
        C1519y c1519y;
        Object obj2;
        SessionDescription sessionDescription3;
        SessionDescription sessionDescription4;
        if (abstractC4825e instanceof C1511p) {
            c1511p = (C1511p) abstractC4825e;
            int i11 = c1511p.f18844l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1511p.f18844l0 = i11 - Integer.MIN_VALUE;
                Object obj3 = c1511p.f18842j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1511p.f18844l0;
                Object obj4 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sessionDescription = (SessionDescription) c1511p.f18838Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            obj4 = obj3;
                            obj = (AbstractC2406e) obj4;
                            if (obj == null) {
                                obj = new C2405d("PCT closed");
                            }
                            if (obj instanceof C2405d) {
                                Object obj5 = ((C2405d) obj).f26612a;
                                CharSequence charSequence = (CharSequence) obj5;
                                if (charSequence != null && !Lg.n.n2(charSequence)) {
                                    String str2 = (String) obj5;
                                }
                                AbstractC2408g.Companion.getClass();
                                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                    Objects.toString(sessionDescription.type);
                                    Mi.a.f(new Object[0]);
                                }
                                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                    Mi.a.f(new Object[0]);
                                }
                            }
                            return sessionDescription;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = c1511p.f18841i0;
                    sessionDescription4 = c1511p.f18840h0;
                    sessionDescription3 = c1511p.f18839Z;
                    c1519y = (C1519y) c1511p.f18838Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    SessionDescription sessionDescription5 = new SessionDescription(sessionDescription.type, str);
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                        Objects.toString(sessionDescription.type);
                        Mi.a.e(new Object[0]);
                    }
                    if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                        Objects.toString(sessionDescription5.type);
                        Mi.a.e(new Object[0]);
                    }
                    C1512q c1512q = new C1512q(z10, this, sessionDescription5, null);
                    if (this.f18926h.get()) {
                        c1519y = this;
                        sessionDescription2 = sessionDescription5;
                        obj3 = null;
                        obj2 = (AbstractC2406e) obj3;
                        if (obj2 == null) {
                            obj2 = new C2405d("PCT closed");
                        }
                        if (obj2 instanceof C2404c) {
                            return sessionDescription2;
                        }
                        if (obj2 instanceof C2405d) {
                            Object obj6 = ((C2405d) obj2).f26612a;
                            CharSequence charSequence2 = (CharSequence) obj6;
                            if (charSequence2 != null && !Lg.n.n2(charSequence2)) {
                                String str3 = (String) obj6;
                            }
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                Objects.toString(sessionDescription2.type);
                                Mi.a.f(new Object[0]);
                            }
                            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.f(new Object[0]);
                            }
                            r rVar = new r(z10, c1519y, sessionDescription, null);
                            if (!c1519y.f18926h.get()) {
                                C1509n c1509n = new C1509n(c1519y, rVar, null);
                                c1511p.f18838Y = sessionDescription;
                                c1511p.f18839Z = null;
                                c1511p.f18840h0 = null;
                                c1511p.f18841i0 = z10;
                                c1511p.f18844l0 = 2;
                                obj3 = ef.e.c(c1509n, c1511p);
                                if (obj3 == enumC5000a) {
                                    return enumC5000a;
                                }
                                obj4 = obj3;
                            }
                            obj = (AbstractC2406e) obj4;
                            if (obj == null) {
                            }
                            if (obj instanceof C2405d) {
                            }
                            return sessionDescription;
                        }
                        throw new RuntimeException();
                    }
                    C1509n c1509n2 = new C1509n(this, c1512q, null);
                    c1511p.f18838Y = this;
                    c1511p.f18839Z = sessionDescription;
                    c1511p.f18840h0 = sessionDescription5;
                    c1511p.f18841i0 = z10;
                    c1511p.f18844l0 = 1;
                    Object c10 = ef.e.c(c1509n2, c1511p);
                    if (c10 == enumC5000a) {
                        return enumC5000a;
                    }
                    c1519y = this;
                    sessionDescription3 = sessionDescription;
                    sessionDescription4 = sessionDescription5;
                    obj3 = c10;
                }
                SessionDescription sessionDescription6 = sessionDescription3;
                sessionDescription2 = sessionDescription4;
                sessionDescription = sessionDescription6;
                obj2 = (AbstractC2406e) obj3;
                if (obj2 == null) {
                }
                if (obj2 instanceof C2404c) {
                }
            }
        }
        c1511p = new C1511p(this, abstractC4825e);
        Object obj32 = c1511p.f18842j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1511p.f18844l0;
        Object obj42 = null;
        if (i10 == 0) {
        }
        SessionDescription sessionDescription62 = sessionDescription3;
        sessionDescription2 = sessionDescription4;
        sessionDescription = sessionDescription62;
        obj2 = (AbstractC2406e) obj32;
        if (obj2 == null) {
        }
        if (obj2 instanceof C2404c) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(SessionDescription sessionDescription, AbstractC4825e abstractC4825e) {
        C1513s c1513s;
        int i10;
        AbstractC2406e abstractC2406e;
        C1519y c1519y;
        Object obj;
        AbstractC2406e abstractC2406e2;
        AbstractC2406e abstractC2406e3;
        if (abstractC4825e instanceof C1513s) {
            c1513s = (C1513s) abstractC4825e;
            int i11 = c1513s.f18891i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1513s.f18891i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1513s.f18889Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1513s.f18891i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            abstractC2406e = (AbstractC2406e) c1513s.f18888Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            return abstractC2406e;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1519y = (C1519y) c1513s.f18888Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    obj = null;
                    C1514t c1514t = new C1514t(this, sessionDescription, null);
                    if (this.f18926h.get()) {
                        c1519y = this;
                        abstractC2406e2 = (AbstractC2406e) obj;
                        if (abstractC2406e2 == null) {
                            abstractC2406e3 = new C2405d("PCT is closed.");
                        } else {
                            abstractC2406e3 = abstractC2406e2;
                        }
                        if (c1519y.f18924f) {
                            c1519y.f18924f = false;
                            c1513s.f18888Y = abstractC2406e3;
                            c1513s.f18891i0 = 2;
                            if (c1519y.b(new MediaConstraints(), c1513s) == enumC5000a) {
                                return enumC5000a;
                            }
                            abstractC2406e = abstractC2406e3;
                            return abstractC2406e;
                        }
                        return abstractC2406e3;
                    }
                    C1509n c1509n = new C1509n(this, c1514t, null);
                    c1513s.f18888Y = this;
                    c1513s.f18891i0 = 1;
                    obj2 = ef.e.c(c1509n, c1513s);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    c1519y = this;
                }
                obj = obj2;
                abstractC2406e2 = (AbstractC2406e) obj;
                if (abstractC2406e2 == null) {
                }
                if (c1519y.f18924f) {
                }
            }
        }
        c1513s = new C1513s(this, abstractC4825e);
        Object obj22 = c1513s.f18889Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1513s.f18891i0;
        if (i10 == 0) {
        }
        obj = obj22;
        abstractC2406e2 = (AbstractC2406e) obj;
        if (abstractC2406e2 == null) {
        }
        if (c1519y.f18924f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum g(AbstractC4825e abstractC4825e) {
        C1515u c1515u;
        int i10;
        Object obj;
        PeerConnection.SignalingState signalingState;
        if (abstractC4825e instanceof C1515u) {
            c1515u = (C1515u) abstractC4825e;
            int i11 = c1515u.f18908h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1515u.f18908h0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1515u.f18906Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1515u.f18908h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    obj = null;
                    C1516v c1516v = new C1516v(this, null);
                    if (!this.f18926h.get()) {
                        C1509n c1509n = new C1509n(this, c1516v, null);
                        c1515u.f18908h0 = 1;
                        obj2 = ef.e.c(c1509n, c1515u);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    signalingState = (PeerConnection.SignalingState) obj;
                    if (signalingState == null) {
                        return PeerConnection.SignalingState.CLOSED;
                    }
                    return signalingState;
                }
                obj = obj2;
                signalingState = (PeerConnection.SignalingState) obj;
                if (signalingState == null) {
                }
            }
        }
        c1515u = new C1515u(this, abstractC4825e);
        Object obj22 = c1515u.f18906Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1515u.f18908h0;
        if (i10 == 0) {
        }
        obj = obj22;
        signalingState = (PeerConnection.SignalingState) obj;
        if (signalingState == null) {
        }
    }

    public final Object h(wf.n nVar, AbstractC4825e abstractC4825e) {
        C1518x c1518x = new C1518x(nVar, this, null);
        if (this.f18926h.get()) {
            return null;
        }
        return ef.e.c(new C1509n(this, c1518x, null), abstractC4825e);
    }
}
