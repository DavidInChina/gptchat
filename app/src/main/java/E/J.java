package E;

import android.content.Context;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3779Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f3780Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f3781h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i10, Object obj, int i11) {
        super(1);
        this.f3779Y = i11;
        this.f3780Z = i10;
        this.f3781h0 = obj;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f3779Y;
        int i11 = this.f3780Z;
        Object obj2 = this.f3781h0;
        switch (i10) {
            case 0:
                ((E0.d0[]) obj2)[i11 + 1] = (E0.d0) obj;
                return yVar;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(i11, (Collection) obj2));
            case 2:
                B3.g gVar = (B3.g) obj;
                AbstractC3557B.c0("it", gVar);
                String str = (String) obj2;
                int i12 = i11 + 1;
                if (str == null) {
                    gVar.s0(i12);
                } else {
                    gVar.b(i12, str);
                }
                return yVar;
            case 3:
                String str2 = (String) obj;
                AbstractC3557B.c0("value", str2);
                ((wf.k) obj2).invoke(Lg.o.Z2(i11, Kb.q.d(str2)));
                return yVar;
            default:
                Context context = (Context) obj;
                AbstractC3557B.c0("context", context);
                V4.c cVar = new V4.c(context);
                cVar.setFragmentShaderRawResId(Integer.valueOf(i11));
                cVar.setVertexShaderRawResId(Integer.valueOf((int) R.raw.voice_vert));
                cVar.setUpdateContinuously(true);
                F4.a aVar = new F4.a(27);
                F4.a.a(aVar, "time");
                F4.a.a(aVar, "smoothLevel");
                F4.a.a(aVar, "touchDownTimestamp");
                F4.a.a(aVar, "touchUpTimestamp");
                F4.a.a(aVar, "stateListen");
                F4.a.a(aVar, "listenTimestamp");
                F4.a.a(aVar, "stateListenIntently");
                F4.a.a(aVar, "listenIntentlyTimestamp");
                F4.a.a(aVar, "stateThink");
                F4.a.a(aVar, "thinkTimestamp");
                F4.a.a(aVar, "stateSpeak");
                F4.a.a(aVar, "speakTimestamp");
                F4.a.a(aVar, "readyTimestamp");
                F4.a.a(aVar, "stateHalt");
                F4.a.a(aVar, "haltTimestamp");
                F4.a.a(aVar, "stateFailedToConnect");
                F4.a.a(aVar, "failedToConnectTimestamp");
                F4.a.a(aVar, "stateListenGrace");
                F4.a.a(aVar, "graceStartTimestamp");
                F4.a.a(aVar, "graceEndTimestamp");
                F4.a.b(aVar, "assistantMagnitudes");
                cVar.setShaderParams((W4.b) aVar.f5033Z);
                cVar.setOnDrawFrameListener(new Gd.a((Gd.g) obj2, 1));
                return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, int i10, int i11) {
        super(1);
        this.f3779Y = i11;
        this.f3781h0 = obj;
        this.f3780Z = i10;
    }
}
