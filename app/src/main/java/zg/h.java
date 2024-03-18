package Zg;

import Ad.t;
import Yg.q;
import Yg.r;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class h implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final h f23749a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23750b = Ad.l.t("LocalDate", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        q qVar = r.Companion;
        String o10 = decoder.o();
        qVar.getClass();
        AbstractC3557B.c0("isoString", o10);
        try {
            return new r(LocalDate.parse(o10));
        } catch (DateTimeParseException e10) {
            throw new t(1, e10);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23750b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", rVar);
        encoder.D(rVar.toString());
    }
}
