package Ve;

import af.C1988e;
import android.gov.nist.javax.sdp.MediaDescriptionImpl;
import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.parser.SDPAnnounceParser;
import android.gov.nist.javax.sip.header.ParameterNames;
import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import df.AbstractC2638c;
import df.C2641f;
import df.C2642g;
import df.C2643h;
import df.C2644i;
import id.AbstractC3557B;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import jf.C3959i;
import kf.C4270F;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* renamed from: Ve.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1502i extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f18769Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f18770Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ MediaConstraints f18771h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18772i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f18773j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502i(MediaConstraints mediaConstraints, C1519y c1519y, kotlin.jvm.internal.B b10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18771h0 = mediaConstraints;
        this.f18772i0 = c1519y;
        this.f18773j0 = b10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1502i(this.f18771h0, this.f18772i0, this.f18773j0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1502i) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jf.y yVar;
        kotlin.jvm.internal.B b10;
        Object obj2;
        Object obj3;
        AbstractC2406e abstractC2406e;
        EnumC5000a enumC5000a;
        jf.y yVar2;
        Iterator it;
        C2643h c2643h;
        String str;
        Object obj4;
        C1519y c1519y;
        String str2;
        Iterator it2;
        String str3;
        String str4;
        C2642g c2642g;
        C3959i c3959i;
        C2644i c2644i;
        String str5;
        boolean z10;
        boolean z11;
        EnumC5000a enumC5000a2;
        jf.y yVar3;
        Iterator it3;
        Iterator it4;
        C2641f c2641f;
        C3959i c3959i2;
        Object obj5;
        String str6;
        Object obj6;
        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
        int i10 = this.f18770Z;
        jf.y yVar4 = jf.y.f36177a;
        MediaConstraints mediaConstraints = this.f18771h0;
        boolean z12 = true;
        C1519y c1519y2 = this.f18772i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        kotlin.jvm.internal.B b11 = this.f18769Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        yVar = yVar4;
                        b10 = b11;
                        obj2 = obj;
                        b10.f37622Y = obj2;
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                obj3 = obj;
                abstractC2406e = (AbstractC2406e) obj3;
                if (!(abstractC2406e instanceof C2404c)) {
                    SessionDescription sessionDescription = (SessionDescription) ((C2404c) abstractC2406e).f26611a;
                    if (c1519y2.f18926h.get()) {
                        return yVar4;
                    }
                    String str7 = sessionDescription.description;
                    c1519y2.f18920b.getClass();
                    try {
                        SessionDescriptionImpl parse = new SDPAnnounceParser(str7).parse();
                        Iterator it5 = parse.getMediaDescriptions(true).iterator();
                        while (it5.hasNext()) {
                            Object next = it5.next();
                            if (next instanceof MediaDescriptionImpl) {
                                MediaDescriptionImpl mediaDescriptionImpl = (MediaDescriptionImpl) next;
                                if (!AbstractC3557B.K(mediaDescriptionImpl.getMedia().getMediaType(), MediaStreamTrack.AUDIO_TRACK_KIND) && AbstractC3557B.K(mediaDescriptionImpl.getMedia().getMediaType(), MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                    C3959i c3959i3 = (C3959i) kf.t.h2(AbstractC2638c.a(mediaDescriptionImpl));
                                    String str8 = "it.value";
                                    String str9 = "getAttributes(true)";
                                    if (c3959i3 == null || (c2644i = (C2644i) c3959i3.f36156Z) == null || (str5 = c2644i.f28274b) == null || !R4.b.x1(str5)) {
                                        enumC5000a = enumC5000a3;
                                        yVar2 = yVar4;
                                        it = it5;
                                    } else {
                                        Vector attributes = mediaDescriptionImpl.getAttributes(z12);
                                        AbstractC3557B.b0(str9, attributes);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj7 : attributes) {
                                            if (obj7 instanceof AttributeField) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it6 = arrayList.iterator();
                                        while (it6.hasNext()) {
                                            Object next2 = it6.next();
                                            if (AbstractC3557B.K(((AttributeField) next2).getAttribute().getName(), "extmap")) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it7 = arrayList2.iterator();
                                        while (it7.hasNext()) {
                                            AttributeField attributeField = (AttributeField) it7.next();
                                            String value = attributeField.getValue();
                                            AbstractC3557B.b0(str8, value);
                                            Lg.g a5 = AbstractC2638c.f28263c.a(value);
                                            if (a5 == null) {
                                                enumC5000a2 = enumC5000a3;
                                                yVar3 = yVar4;
                                                it4 = it7;
                                                it3 = it5;
                                                c2641f = null;
                                            } else {
                                                it4 = it7;
                                                it3 = it5;
                                                yVar3 = yVar4;
                                                enumC5000a2 = enumC5000a3;
                                                c2641f = new C2641f(AbstractC2638c.b((String) ((C4270F) a5.a()).get(2)), AbstractC2638c.b((String) ((C4270F) a5.a()).get(3)), (String) ((C4270F) a5.a()).get(4), AbstractC2638c.b((String) ((C4270F) a5.a()).get(5)), Long.parseLong((String) ((C4270F) a5.a()).get(1)));
                                            }
                                            if (c2641f == null) {
                                                AbstractC2408g.Companion.getClass();
                                                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                                    attributeField.encode();
                                                    Mi.a.f(new Object[0]);
                                                }
                                                c3959i2 = null;
                                            } else {
                                                c3959i2 = new C3959i(attributeField, c2641f);
                                            }
                                            if (c3959i2 != null) {
                                                arrayList3.add(c3959i2);
                                            }
                                            it7 = it4;
                                            it5 = it3;
                                            yVar4 = yVar3;
                                            enumC5000a3 = enumC5000a2;
                                        }
                                        enumC5000a = enumC5000a3;
                                        yVar2 = yVar4;
                                        it = it5;
                                        long j6 = 0;
                                        if (!arrayList3.isEmpty()) {
                                            Iterator it8 = arrayList3.iterator();
                                            while (it8.hasNext()) {
                                                C2641f c2641f2 = (C2641f) ((C3959i) it8.next()).f36156Z;
                                                if (AbstractC3557B.K(c2641f2.f28268d, "https://aomediacodec.github.io/av1-rtp-spec/#dependency-descriptor-rtp-header-extension")) {
                                                    z11 = true;
                                                    continue;
                                                } else {
                                                    long j10 = c2641f2.f28265a;
                                                    if (j10 > j6) {
                                                        j6 = j10;
                                                    }
                                                    z11 = false;
                                                    continue;
                                                }
                                                if (z11) {
                                                    z10 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (!z10) {
                                            AttributeField attributeField2 = new AttributeField();
                                            attributeField2.setName("extmap");
                                            String str10 = (j6 + 1) + " https://aomediacodec.github.io/av1-rtp-spec/#dependency-descriptor-rtp-header-extension";
                                            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", str10);
                                            attributeField2.setValue(str10);
                                            mediaDescriptionImpl.addAttribute(attributeField2);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap = c1519y2.f18925g;
                                    AbstractC3557B.c0("trackBitrates", linkedHashMap);
                                    Lg.i iVar = AbstractC2638c.f28261a;
                                    String attribute = mediaDescriptionImpl.getAttribute("msid");
                                    if (attribute == null) {
                                        c2643h = null;
                                    } else {
                                        c2643h = new C2643h(attribute);
                                    }
                                    if (c2643h != null && (str = c2643h.f28272a) != null) {
                                        Iterator it9 = linkedHashMap.entrySet().iterator();
                                        while (it9.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it9.next();
                                            J0 j02 = (J0) entry.getKey();
                                            I0 i02 = (I0) entry.getValue();
                                            if ((j02 instanceof J0) && Lg.n.Z1(str, j02.f18671a, false)) {
                                                Iterator it10 = AbstractC2638c.a(mediaDescriptionImpl).iterator();
                                                while (true) {
                                                    if (it10.hasNext()) {
                                                        obj4 = it10.next();
                                                        if (Lg.n.f2(((C2644i) ((C3959i) obj4).f36156Z).f28274b, i02.f18668a)) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj4 = null;
                                                        break;
                                                    }
                                                }
                                                C3959i c3959i4 = (C3959i) obj4;
                                                if (c3959i4 != null) {
                                                    long j11 = ((C2644i) c3959i4.f36156Z).f28273a;
                                                    Vector attributes2 = mediaDescriptionImpl.getAttributes(true);
                                                    AbstractC3557B.b0(str9, attributes2);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj8 : attributes2) {
                                                        if (obj8 instanceof AttributeField) {
                                                            arrayList4.add(obj8);
                                                        }
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    Iterator it11 = arrayList4.iterator();
                                                    while (it11.hasNext()) {
                                                        Object next3 = it11.next();
                                                        Iterator it12 = it9;
                                                        if (AbstractC3557B.K(((AttributeField) next3).getAttribute().getName(), "fmtp")) {
                                                            arrayList5.add(next3);
                                                        }
                                                        it9 = it12;
                                                    }
                                                    Iterator it13 = it9;
                                                    ArrayList arrayList6 = new ArrayList();
                                                    Iterator it14 = arrayList5.iterator();
                                                    while (it14.hasNext()) {
                                                        AttributeField attributeField3 = (AttributeField) it14.next();
                                                        String value2 = attributeField3.getValue();
                                                        AbstractC3557B.b0(str8, value2);
                                                        String str11 = str;
                                                        Lg.g a10 = AbstractC2638c.f28262b.a(value2);
                                                        if (a10 == null) {
                                                            str4 = str9;
                                                            str3 = str8;
                                                            it2 = it14;
                                                            c2642g = null;
                                                        } else {
                                                            str4 = str9;
                                                            str3 = str8;
                                                            it2 = it14;
                                                            c2642g = new C2642g(Long.parseLong((String) ((C4270F) a10.a()).get(1)), (String) ((C4270F) a10.a()).get(2));
                                                        }
                                                        if (c2642g == null) {
                                                            AbstractC2408g.Companion.getClass();
                                                            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                                                attributeField3.encode();
                                                                Mi.a.f(new Object[0]);
                                                            }
                                                            c3959i = null;
                                                        } else {
                                                            c3959i = new C3959i(attributeField3, c2642g);
                                                        }
                                                        if (c3959i != null) {
                                                            arrayList6.add(c3959i);
                                                        }
                                                        str = str11;
                                                        str9 = str4;
                                                        str8 = str3;
                                                        it14 = it2;
                                                    }
                                                    String str12 = str;
                                                    String str13 = str9;
                                                    String str14 = str8;
                                                    Iterator it15 = arrayList6.iterator();
                                                    boolean z13 = false;
                                                    while (true) {
                                                        if (it15.hasNext()) {
                                                            C3959i c3959i5 = (C3959i) it15.next();
                                                            AttributeField attributeField4 = (AttributeField) c3959i5.f36155Y;
                                                            C2642g c2642g2 = (C2642g) c3959i5.f36156Z;
                                                            if (c2642g2.f28270a == j11) {
                                                                String str15 = c2642g2.f28271b;
                                                                if (!Lg.n.Z1(str15, "x-google-start-bitrate", false)) {
                                                                    StringBuilder r10 = android.gov.nist.core.a.r(str15, ";x-google-start-bitrate=");
                                                                    c1519y = c1519y2;
                                                                    r10.append(AbstractC4344b.Z0(i02.f18669b * 0.7d));
                                                                    str2 = r10.toString();
                                                                } else {
                                                                    c1519y = c1519y2;
                                                                    str2 = str15;
                                                                }
                                                                if (!Lg.n.Z1(str15, "x-google-max-bitrate", false)) {
                                                                    StringBuilder r11 = android.gov.nist.core.a.r(str2, ";x-google-max-bitrate=");
                                                                    r11.append(i02.f18669b);
                                                                    str2 = r11.toString();
                                                                }
                                                                if (!AbstractC3557B.K(str15, str2)) {
                                                                    attributeField4.setValue(c2642g2.f28270a + ' ' + str2);
                                                                    break;
                                                                }
                                                                c1519y2 = c1519y;
                                                                z13 = true;
                                                            }
                                                        } else {
                                                            c1519y = c1519y2;
                                                            if (!z13) {
                                                                String str16 = "x-google-start-bitrate=" + (i02.f18669b * 0.7d) + ";x-google-max-bitrate=" + i02.f18669b;
                                                                AbstractC3557B.c0("config", str16);
                                                                AttributeField attributeField5 = new AttributeField();
                                                                attributeField5.setName("fmtp");
                                                                attributeField5.setValue(j11 + ' ' + str16);
                                                                mediaDescriptionImpl.addAttribute(attributeField5);
                                                            }
                                                        }
                                                    }
                                                    str = str12;
                                                    it9 = it13;
                                                    str9 = str13;
                                                    str8 = str14;
                                                    c1519y2 = c1519y;
                                                }
                                            }
                                        }
                                    }
                                    it5 = it;
                                    yVar4 = yVar2;
                                    enumC5000a3 = enumC5000a;
                                    c1519y2 = c1519y2;
                                    z12 = true;
                                }
                            }
                        }
                        EnumC5000a enumC5000a4 = enumC5000a3;
                        yVar = yVar4;
                        String sessionDescriptionImpl = parse.toString();
                        b10 = this.f18773j0;
                        this.f18769Y = b10;
                        this.f18770Z = 3;
                        obj2 = c1519y2.e(sessionDescription, sessionDescriptionImpl, false, this);
                        if (obj2 == enumC5000a4) {
                            return enumC5000a4;
                        }
                        b10.f37622Y = obj2;
                        return yVar;
                    } catch (ParseException e10) {
                        e10.printStackTrace();
                        throw new Exception("Could not parse message");
                    }
                } else if (abstractC2406e instanceof C2405d) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                        String str17 = (String) ((C2405d) abstractC2406e).f26612a;
                        Mi.a.a(new Object[0]);
                    }
                    return yVar4;
                } else {
                    throw new RuntimeException();
                }
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC3557B.c0("<this>", mediaConstraints);
            List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
            AbstractC3557B.b0("mandatory", list);
            Iterator<T> it16 = list.iterator();
            while (true) {
                if (it16.hasNext()) {
                    obj5 = it16.next();
                    if (AbstractC3557B.K(((MediaConstraints.KeyValuePair) obj5).getKey(), "IceRestart")) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            MediaConstraints.KeyValuePair keyValuePair = (MediaConstraints.KeyValuePair) obj5;
            if (keyValuePair == null || (str6 = keyValuePair.getValue()) == null) {
                List<MediaConstraints.KeyValuePair> list2 = mediaConstraints.optional;
                AbstractC3557B.b0(ParameterNames.OPTIONAL, list2);
                Iterator<T> it17 = list2.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        obj6 = it17.next();
                        if (AbstractC3557B.K(((MediaConstraints.KeyValuePair) obj6).getKey(), "IceRestart")) {
                            break;
                        }
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                MediaConstraints.KeyValuePair keyValuePair2 = (MediaConstraints.KeyValuePair) obj6;
                if (keyValuePair2 != null) {
                    str6 = keyValuePair2.getValue();
                } else {
                    str6 = null;
                }
            }
            boolean K10 = AbstractC3557B.K(str6, "true");
            if (K10) {
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                    Mi.a.a(new Object[0]);
                }
                c1519y2.f18923e = true;
            }
            if (c1519y2.f18921c.signalingState() == PeerConnection.SignalingState.HAVE_LOCAL_OFFER) {
                PeerConnection peerConnection = c1519y2.f18921c;
                SessionDescription remoteDescription = peerConnection.getRemoteDescription();
                if (K10 && remoteDescription != null) {
                    this.f18770Z = 1;
                    C1988e c1988e = new C1988e();
                    peerConnection.setRemoteDescription(c1988e, remoteDescription);
                    if (c1988e.b(this) == enumC5000a3) {
                        return enumC5000a3;
                    }
                } else {
                    c1519y2.f18924f = true;
                    return yVar4;
                }
            }
        }
        PeerConnection peerConnection2 = c1519y2.f18921c;
        this.f18770Z = 2;
        C1988e c1988e2 = new C1988e();
        peerConnection2.createOffer(c1988e2, mediaConstraints);
        obj3 = c1988e2.a(this);
        if (obj3 == enumC5000a3) {
            return enumC5000a3;
        }
        abstractC2406e = (AbstractC2406e) obj3;
        if (!(abstractC2406e instanceof C2404c)) {
        }
    }
}
