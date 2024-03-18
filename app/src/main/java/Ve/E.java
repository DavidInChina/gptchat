package Ve;

import Sg.C1394f;
import cf.AbstractC2408g;
import cf.C2409h;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2536r0;
import com.google.protobuf.C2532p;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jh.J1;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitModels$UserPacket;
import livekit.org.webrtc.DataChannel;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class E implements DataChannel.Observer {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f18623a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18624b;

    public E(C1503i0 c1503i0, DataChannel dataChannel) {
        AbstractC3557B.c0("dataChannel", dataChannel);
        this.f18624b = c1503i0;
        this.f18623a = dataChannel;
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onBufferedAmountChange(long j6) {
        this.f18624b.getClass();
        AbstractC3557B.c0("dataChannel", this.f18623a);
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onMessage(DataChannel.Buffer buffer) {
        int i10;
        We.C c10;
        byte[] bArr;
        AbstractC3557B.c0("p0", buffer);
        C1503i0 c1503i0 = this.f18624b;
        c1503i0.getClass();
        AbstractC3557B.c0("dataChannel", this.f18623a);
        ByteBuffer byteBuffer = buffer.data;
        C2532p c2532p = AbstractC2534q.f27581Z;
        int remaining = byteBuffer.remaining();
        AbstractC2534q.r(0, remaining, byteBuffer.remaining());
        byte[] bArr2 = new byte[remaining];
        byteBuffer.get(bArr2);
        LivekitModels$DataPacket parseFrom = LivekitModels$DataPacket.parseFrom(new C2532p(bArr2));
        J1 valueCase = parseFrom.getValueCase();
        if (valueCase == null) {
            i10 = -1;
        } else {
            i10 = G.f18654a[valueCase.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                } else {
                    F f6 = c1503i0.f18778d;
                    if (f6 != null) {
                        LivekitModels$UserPacket user = parseFrom.getUser();
                        AbstractC3557B.b0("dp.user", user);
                        AbstractC3557B.b0("dp.kind", parseFrom.getKind());
                        r0 r0Var = (r0) f6;
                        String participantSid = user.getParticipantSid();
                        AbstractC3557B.b0("packet.participantSid", participantSid);
                        We.w f10 = r0Var.f(participantSid);
                        if (f10 instanceof We.C) {
                            c10 = (We.C) f10;
                        } else {
                            c10 = null;
                        }
                        AbstractC2534q payload = user.getPayload();
                        int size = payload.size();
                        if (size == 0) {
                            bArr = AbstractC2536r0.f27585b;
                        } else {
                            byte[] bArr3 = new byte[size];
                            payload.I(size, bArr3);
                            bArr = bArr3;
                        }
                        if (user.hasTopic()) {
                            user.getTopic();
                        }
                        AbstractC3557B.b0("data", bArr);
                        Te.q qVar = new Te.q(r0Var, bArr);
                        C1394f c1394f = r0Var.f18872k;
                        if (c1394f != null) {
                            r0Var.f18873l.a(qVar, c1394f);
                            if (c10 != null) {
                                c10.f21062d.a(new Te.c(c10, bArr), c10.f21061c);
                                return;
                            }
                            return;
                        }
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                    return;
                }
            } else {
                F f11 = c1503i0.f18778d;
                if (f11 != null) {
                    List<LivekitModels$SpeakerInfo> speakersList = parseFrom.getSpeaker().getSpeakersList();
                    AbstractC3557B.b0("dp.speaker.speakersList", speakersList);
                    r0 r0Var2 = (r0) f11;
                    ArrayList arrayList = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakersList) {
                        String sid = livekitModels$SpeakerInfo.getSid();
                        AbstractC3557B.b0("speakerInfo.sid", sid);
                        linkedHashSet.add(new We.n(sid));
                        We.w f12 = r0Var2.f(sid);
                        if (f12 != null) {
                            f12.f(livekitModels$SpeakerInfo.getLevel());
                            f12.g(true);
                            arrayList.add(f12);
                        }
                    }
                    We.i iVar = r0Var2.f18883v;
                    if (!linkedHashSet.contains(new We.n(iVar.f21059a))) {
                        iVar.f(0.0f);
                        iVar.g(false);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : r0Var2.d().values()) {
                        if (!linkedHashSet.contains(new We.n(((We.C) obj).f21059a))) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        We.C c11 = (We.C) it.next();
                        c11.f(0.0f);
                        c11.g(false);
                    }
                    List K22 = kf.t.K2(arrayList);
                    Df.v[] vVarArr = r0.f18859C;
                    Df.v vVar = vVarArr[6];
                    C2409h c2409h = r0Var2.f18886y;
                    c2409h.h(K22, vVar);
                    Te.n nVar = new Te.n(r0Var2, (List) c2409h.d(vVarArr[6]));
                    C1394f c1394f2 = r0Var2.f18872k;
                    if (c1394f2 != null) {
                        r0Var2.f18873l.a(nVar, c1394f2);
                        return;
                    } else {
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                }
                return;
            }
        }
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public final void onStateChange() {
        this.f18624b.getClass();
        AbstractC3557B.c0("dataChannel", this.f18623a);
    }
}
