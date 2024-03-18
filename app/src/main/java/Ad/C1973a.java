package ad;

import Ad.l;
import Yg.o;
import Yg.p;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: ad.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1973a implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C1973a f24152a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f24153b = l.t("Instant", C2215e.f25989d);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        o oVar = p.Companion;
        long D6 = (long) decoder.D();
        oVar.getClass();
        try {
            Instant ofEpochSecond = Instant.ofEpochSecond(D6, 0L);
            AbstractC3557B.b0("ofEpochSecond(...)", ofEpochSecond);
            return new p(ofEpochSecond);
        } catch (Exception e10) {
            if (!(e10 instanceof ArithmeticException) && !(e10 instanceof DateTimeException)) {
                throw e10;
            }
            if (D6 > 0) {
                return p.f22418j0;
            }
            return p.f22417i0;
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f24153b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p pVar = (p) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", pVar);
        encoder.g(pVar.c());
    }
}
