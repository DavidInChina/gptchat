package Gd;

import android.content.Context;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6269Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f6270Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, int i10) {
        super(1);
        this.f6269Y = i10;
        this.f6270Z = gVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f6269Y;
        g gVar = this.f6270Z;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                AbstractC3557B.c0("context", context);
                V4.c cVar = new V4.c(context);
                cVar.setFragmentShaderRawResId(Integer.valueOf((int) R.raw.user_mic_frag));
                cVar.setVertexShaderRawResId(Integer.valueOf((int) R.raw.voice_vert));
                cVar.setUpdateContinuously(true);
                F4.a aVar = new F4.a(27);
                F4.a.a(aVar, "time");
                F4.a.a(aVar, "stateListen");
                F4.a.a(aVar, "listenTimestamp");
                F4.a.a(aVar, "readyTimestamp");
                F4.a.a(aVar, "stateListenIntently");
                F4.a.a(aVar, "stateListenGrace");
                F4.a.b(aVar, "userMagnitudes");
                ((W4.e) ((W4.b) aVar.f5033Z)).a("viewport", new W4.a(4, null));
                cVar.setShaderParams((W4.b) aVar.f5033Z);
                cVar.setOnDrawFrameListener(new Oc.c(gVar, 4, cVar));
                return cVar;
            default:
                W4.b bVar = (W4.b) obj;
                AbstractC3557B.c0("params", bVar);
                h b10 = gVar.b();
                W4.e eVar = (W4.e) bVar;
                eVar.b("time", b10.f6304a);
                eVar.b("smoothLevel", b10.f6305b);
                eVar.b("touchDownTimestamp", b10.f6306c);
                eVar.b("touchUpTimestamp", b10.f6307d);
                eVar.b("stateListen", b10.f6308e);
                eVar.b("listenTimestamp", b10.f6309f);
                eVar.b("stateListenIntently", b10.f6310g);
                eVar.b("listenIntentlyTimestamp", b10.f6311h);
                eVar.b("stateThink", b10.f6312i);
                eVar.b("thinkTimestamp", b10.f6313j);
                eVar.b("stateSpeak", b10.f6314k);
                eVar.b("speakTimestamp", b10.f6315l);
                eVar.b("readyTimestamp", b10.f6316m);
                eVar.b("stateHalt", b10.f6317n);
                eVar.b("haltTimestamp", b10.f6318o);
                eVar.b("stateFailedToConnect", b10.f6319p);
                eVar.b("failedToConnectTimestamp", b10.f6320q);
                eVar.b("stateListenGrace", b10.f6321r);
                eVar.b("graceStartTimestamp", b10.f6322s);
                eVar.b("graceEndTimestamp", b10.f6323t);
                eVar.c("assistantMagnitudes", b10.f6324u);
                return y.f36177a;
        }
    }
}
