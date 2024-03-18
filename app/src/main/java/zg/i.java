package Zg;

import Yg.t;
import Yg.u;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class i implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final i f23751a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23752b = Ad.l.t("LocalDateTime", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        t tVar = u.Companion;
        String o10 = decoder.o();
        tVar.getClass();
        AbstractC3557B.c0("isoString", o10);
        try {
            return new u(LocalDateTime.parse(o10));
        } catch (DateTimeParseException e10) {
            throw new Ad.t(1, e10);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23752b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", uVar);
        encoder.D(uVar.toString());
    }
}
