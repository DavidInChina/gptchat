package Zg;

import Df.AbstractC0405d;
import ah.AbstractC1991b;
import ah.C1996g;
import ch.AbstractC2430a;
import dh.AbstractC2691b;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class c extends AbstractC2691b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f23737a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC3957g f23738b = R4.b.C1(EnumC3958h.f36152Y, a.f23730h0);

    @Override // dh.AbstractC2691b
    public final AbstractC1991b a(AbstractC2430a abstractC2430a, String str) {
        AbstractC3557B.c0("decoder", abstractC2430a);
        return ((C1996g) f23738b.getValue()).a(abstractC2430a, str);
    }

    @Override // dh.AbstractC2691b
    public final KSerializer b(Encoder encoder, Object obj) {
        Yg.l lVar = (Yg.l) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", lVar);
        return ((C1996g) f23738b.getValue()).b(encoder, lVar);
    }

    @Override // dh.AbstractC2691b
    public final AbstractC0405d c() {
        return C.f37623a.b(Yg.l.class);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return ((C1996g) f23738b.getValue()).getDescriptor();
    }
}
