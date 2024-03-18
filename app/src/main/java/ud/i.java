package ud;

import bh.C2215e;
import dh.C2678D;
import dh.m0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import r0.r;
import s0.C5503e;

/* loaded from: classes.dex */
public final class i implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final i f46694a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f46695b = Ad.l.t("Color", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        float f6;
        AbstractC3557B.c0("decoder", decoder);
        Float f10 = null;
        if (!decoder.s()) {
            return null;
        }
        float[] fArr = (float[]) decoder.g(C2678D.f28385c);
        float f11 = fArr[0] / 255.0f;
        float f12 = fArr[1] / 255.0f;
        float f13 = fArr[2] / 255.0f;
        if (3 <= fArr.length - 1) {
            f10 = Float.valueOf(fArr[3]);
        }
        if (f10 != null) {
            f6 = f10.floatValue();
        } else {
            f6 = 1.0f;
        }
        return new r(androidx.compose.ui.graphics.a.a(f11, f12, f13, f6, C5503e.f45028c));
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46695b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        AbstractC3557B.c0("encoder", encoder);
        if (rVar == null) {
            encoder.e();
            return;
        }
        long j6 = rVar.f44265a;
        encoder.w(C2678D.f28385c, new float[]{r.h(j6) * 255.0f, r.g(j6) * 255.0f, r.e(j6) * 255.0f, r.d(j6) * 255.0f});
    }
}
