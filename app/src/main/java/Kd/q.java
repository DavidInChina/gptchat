package Kd;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements JavaAudioDeviceModule.SamplesReadyCallback, JavaAudioDeviceModule.PlaybackSamplesReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f9760a;

    public /* synthetic */ q(I i10) {
        this.f9760a = i10;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        I i10 = this.f9760a;
        AbstractC3557B.c0("this$0", i10);
        byte[] data = audioSamples.getData();
        AbstractC3557B.b0("getData(...)", data);
        Ld.e eVar = i10.f9672C;
        eVar.getClass();
        float[] O10 = r.f.O(data);
        ArrayList arrayList = new ArrayList(O10.length);
        for (float f6 : O10) {
            arrayList.add(Float.valueOf(N.o(f6 - eVar.f11051g, -1.0f, 1.0f)));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf((((Number) it.next()).floatValue() + 1.0f) / 2.0f));
        }
        float[] I22 = kf.t.I2(arrayList2);
        float f10 = eVar.f11050f;
        int i11 = eVar.f11049e;
        float[] fArr = eVar.f11048d;
        float f11 = f10 - fArr[i11];
        eVar.f11050f = f11;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (float f14 : O10) {
            f13 += f14;
        }
        float f15 = f13 + f11;
        eVar.f11050f = f15;
        eVar.f11051g = f15 / I22.length;
        int i12 = eVar.f11049e;
        for (float f16 : fArr) {
            f12 += f16;
        }
        fArr[i12] = f12;
        eVar.f11049e = (eVar.f11049e + 1) % I22.length;
        if (O10.length != 0) {
            float f17 = O10[0];
            Cf.f it2 = new Cf.e(1, O10.length - 1, 1).iterator();
            while (it2.f3111h0) {
                f17 = Math.max(f17, O10[it2.a()]);
            }
            eVar.f11046b = f17;
            eVar.f11045a.b(I22);
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.PlaybackSamplesReadyCallback
    public final void onWebRtcAudioTrackSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        I i10 = this.f9760a;
        AbstractC3557B.c0("this$0", i10);
        byte[] data = audioSamples.getData();
        AbstractC3557B.b0("getData(...)", data);
        Ld.d dVar = i10.f9671B;
        dVar.getClass();
        dVar.f11044a.b(r.f.O(data));
    }
}
