package Qe;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import cf.AbstractC2408g;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import jf.C3959i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14700Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f14701Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14701Z = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        j jVar = new j(this.f14701Z, abstractC4825e);
        jVar.f14700Y = obj;
        return jVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((j) create((C3959i) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C3959i c3959i = (C3959i) this.f14700Y;
        boolean booleanValue = ((Boolean) c3959i.f36155Y).booleanValue();
        boolean booleanValue2 = ((Boolean) c3959i.f36156Z).booleanValue();
        m mVar = this.f14701Z;
        mVar.getClass();
        if (booleanValue && booleanValue2) {
            if (mVar.f14708e.compareAndSet(false, true)) {
                AudioTrack audioTrack = mVar.f14707d;
                if (audioTrack == null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(320);
                    AudioTrack build = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build()).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setBufferSizeInBytes(allocateDirect.capacity()).setTransferMode(0).setSessionId(0).build();
                    AbstractC3557B.b0("Builder()\n            .s\u2026ATE)\n            .build()", build);
                    build.write(allocateDirect, allocateDirect.remaining(), 0);
                    build.setLoopPoints(0, 159, -1);
                    mVar.f14707d = build;
                    audioTrack = build;
                }
                synchronized (audioTrack) {
                    try {
                        if (audioTrack.getState() == 1) {
                            audioTrack.play();
                        } else {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.c(new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            mVar.c();
        }
        return y.f36177a;
    }
}
