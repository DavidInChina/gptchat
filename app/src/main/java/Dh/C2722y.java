package dh;

import android.gov.nist.javax.sip.parser.TokenNames;
import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2722y implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2722y f28505a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28506b = new m0("kotlin.time.Duration", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        Mg.a aVar = Mg.b.f12127Z;
        String o10 = decoder.o();
        AbstractC3557B.c0("value", o10);
        try {
            return new Mg.b(Df.H.l(o10));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(android.gov.nist.core.a.A("Invalid ISO duration string format: '", o10, "'."), e10);
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28506b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j6;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        long j10 = ((Mg.b) obj).f12130Y;
        AbstractC3557B.c0("encoder", encoder);
        Mg.a aVar = Mg.b.f12127Z;
        StringBuilder sb2 = new StringBuilder();
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        if (i12 < 0) {
            j6 = Mg.b.o(j10);
        } else {
            j6 = j10;
        }
        long l10 = Mg.b.l(j6, Mg.d.f12136k0);
        boolean z12 = false;
        if (Mg.b.h(j6)) {
            i10 = 0;
        } else {
            i10 = (int) (Mg.b.l(j6, Mg.d.f12135j0) % 60);
        }
        if (Mg.b.h(j6)) {
            i11 = 0;
        } else {
            i11 = (int) (Mg.b.l(j6, Mg.d.f12134i0) % 60);
        }
        int f6 = Mg.b.f(j6);
        if (Mg.b.h(j10)) {
            l10 = 9999999999999L;
        }
        if (l10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 0 && f6 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 != 0 || (z11 && z10)) {
            z12 = true;
        }
        if (z10) {
            sb2.append(l10);
            sb2.append('H');
        }
        if (z12) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z12)) {
            Mg.b.b(sb2, i11, f6, 9, TokenNames.S, true);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        encoder.D(sb3);
    }
}
