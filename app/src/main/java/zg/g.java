package Zg;

import Ad.t;
import Lg.n;
import Yg.o;
import Yg.p;
import bh.C2215e;
import dh.m0;
import id.AbstractC3557B;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class g implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final g f23747a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f23748b = Ad.l.t("Instant", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        o oVar = p.Companion;
        String o10 = decoder.o();
        oVar.getClass();
        AbstractC3557B.c0("isoString", o10);
        try {
            int k22 = n.k2(o10, 'T', 0, true, 2);
            if (k22 != -1) {
                int length = o10.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        char charAt = o10.charAt(length);
                        if (charAt == '+' || charAt == '-') {
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            length = i10;
                        }
                    }
                }
                length = -1;
                if (length >= k22 && n.k2(o10, ':', length, false, 4) == -1) {
                    o10 = o10 + ":00";
                }
            }
            Instant instant = OffsetDateTime.parse(o10).toInstant();
            AbstractC3557B.b0("toInstant(...)", instant);
            return new p(instant);
        } catch (DateTimeParseException e10) {
            throw new t(1, e10);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23748b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p pVar = (p) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", pVar);
        encoder.D(pVar.toString());
    }
}
