package ah;

import Df.AbstractC0405d;
import bh.C2212b;
import bh.C2221k;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2704h0;
import dh.w0;
import id.AbstractC3557B;
import java.util.List;
import jf.C3964n;
import kf.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: ah.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1990a implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24191a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f24192b;

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f24193c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f24194d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f24195e;

    public C1990a(AbstractC0405d abstractC0405d, KSerializer[] kSerializerArr) {
        this.f24191a = 0;
        AbstractC3557B.c0("serializableClass", abstractC0405d);
        this.f24194d = abstractC0405d;
        this.f24192b = null;
        this.f24195e = q.Q2(kSerializerArr);
        this.f24193c = new C2212b(Ad.l.O("kotlinx.serialization.ContextualSerializer", C2221k.f26013a, new SerialDescriptor[0], new Xf.f(20, this)), abstractC0405d);
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        KSerializer kSerializer = this.f24192b;
        Object obj = this.f24194d;
        Object obj2 = this.f24195e;
        switch (this.f24191a) {
            case 0:
                AbstractC3557B.c0("decoder", decoder);
                AbstractC0405d abstractC0405d = (AbstractC0405d) obj;
                KSerializer a5 = decoder.a().a(abstractC0405d, (List) obj2);
                if (a5 == null) {
                    if (kSerializer == null) {
                        AbstractC2704h0.d(abstractC0405d);
                        throw null;
                    }
                } else {
                    kSerializer = a5;
                }
                return decoder.g(kSerializer);
            default:
                AbstractC3557B.c0("decoder", decoder);
                SerialDescriptor serialDescriptor = this.f24193c;
                AbstractC2430a c10 = decoder.c(serialDescriptor);
                Object obj3 = w0.f28500a;
                Object obj4 = obj3;
                Object obj5 = obj4;
                while (true) {
                    int t10 = c10.t(serialDescriptor);
                    if (t10 != -1) {
                        if (t10 != 0) {
                            if (t10 != 1) {
                                if (t10 == 2) {
                                    obj5 = c10.n(serialDescriptor, 2, (KSerializer) obj2, null);
                                } else {
                                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Unexpected index ", t10));
                                }
                            } else {
                                obj4 = c10.n(serialDescriptor, 1, (KSerializer) obj, null);
                            }
                        } else {
                            obj3 = c10.n(serialDescriptor, 0, kSerializer, null);
                        }
                    } else {
                        c10.b(serialDescriptor);
                        Object obj6 = w0.f28500a;
                        if (obj3 != obj6) {
                            if (obj4 != obj6) {
                                if (obj5 != obj6) {
                                    return new C3964n(obj3, obj4, obj5);
                                }
                                throw new IllegalArgumentException("Element 'third' is missing");
                            }
                            throw new IllegalArgumentException("Element 'second' is missing");
                        }
                        throw new IllegalArgumentException("Element 'first' is missing");
                    }
                }
        }
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f24193c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object obj2 = this.f24195e;
        Object obj3 = this.f24194d;
        KSerializer kSerializer = this.f24192b;
        switch (this.f24191a) {
            case 0:
                AbstractC3557B.c0("encoder", encoder);
                AbstractC3557B.c0("value", obj);
                AbstractC0405d abstractC0405d = (AbstractC0405d) obj3;
                KSerializer a5 = encoder.a().a(abstractC0405d, (List) obj2);
                if (a5 == null) {
                    if (kSerializer == null) {
                        AbstractC2704h0.d(abstractC0405d);
                        throw null;
                    }
                } else {
                    kSerializer = a5;
                }
                encoder.w(kSerializer, obj);
                return;
            default:
                C3964n c3964n = (C3964n) obj;
                AbstractC3557B.c0("encoder", encoder);
                AbstractC3557B.c0("value", c3964n);
                SerialDescriptor serialDescriptor = this.f24193c;
                AbstractC2431b c10 = encoder.c(serialDescriptor);
                c10.i(serialDescriptor, 0, kSerializer, c3964n.f36165Y);
                c10.i(serialDescriptor, 1, (KSerializer) obj3, c3964n.f36166Z);
                c10.i(serialDescriptor, 2, (KSerializer) obj2, c3964n.f36167h0);
                c10.b(serialDescriptor);
                return;
        }
    }

    public C1990a(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.f24191a = 1;
        this.f24192b = kSerializer;
        this.f24194d = kSerializer2;
        this.f24195e = kSerializer3;
        this.f24193c = Ad.l.N("kotlin.Triple", new SerialDescriptor[0], new Xf.f(25, this));
    }
}
