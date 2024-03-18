package C2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J2.h f2500b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f2501c;

    public /* synthetic */ a(j jVar, J2.h hVar, int i10) {
        this.f2499a = i10;
        this.f2501c = jVar;
        this.f2500b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j6, long j10) {
        J2.h hVar = this.f2500b;
        int i10 = this.f2499a;
        j jVar = this.f2501c;
        switch (i10) {
            case 0:
                ((c) jVar).getClass();
                hVar.getClass();
                if (AbstractC5530A.f45131a < 30) {
                    Handler handler = hVar.f8752Y;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j6 >> 32), (int) j6));
                    return;
                }
                hVar.a(j6);
                return;
            default:
                ((z) jVar).getClass();
                hVar.getClass();
                if (AbstractC5530A.f45131a < 30) {
                    Handler handler2 = hVar.f8752Y;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j6 >> 32), (int) j6));
                    return;
                }
                hVar.a(j6);
                return;
        }
    }
}
