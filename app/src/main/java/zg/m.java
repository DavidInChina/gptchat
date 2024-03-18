package Zg;

import Ad.t;
import Yg.x;
import Yg.y;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class m implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final m f23759a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23760b = Ad.l.t("UtcOffset", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        x xVar = y.Companion;
        String o10 = decoder.o();
        xVar.getClass();
        AbstractC3557B.c0("offsetString", o10);
        try {
            return new y(ZoneOffset.of(o10));
        } catch (DateTimeException e10) {
            throw new t(1, e10);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23760b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", yVar);
        encoder.D(yVar.toString());
    }
}
