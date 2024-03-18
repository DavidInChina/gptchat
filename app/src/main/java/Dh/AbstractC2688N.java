package dh;

import Df.AbstractC0405d;
import bh.C2213c;
import bh.C2220j;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import eh.AbstractC2910j;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2688N implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28409a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f28410b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f28411c;

    public /* synthetic */ AbstractC2688N(KSerializer kSerializer, KSerializer kSerializer2, int i10) {
        this(kSerializer, kSerializer2);
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract KSerializer c(kotlinx.serialization.json.b bVar);

    public abstract Object d(Object obj, Object obj2);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        switch (this.f28409a) {
            case 0:
                AbstractC3557B.c0("decoder", decoder);
                SerialDescriptor descriptor = getDescriptor();
                AbstractC2430a c10 = decoder.c(descriptor);
                Object obj = w0.f28500a;
                Object obj2 = obj;
                while (true) {
                    int t10 = c10.t(getDescriptor());
                    if (t10 != -1) {
                        if (t10 != 0) {
                            if (t10 == 1) {
                                obj2 = c10.n(getDescriptor(), 1, (KSerializer) this.f28411c, null);
                            } else {
                                throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid index: ", t10));
                            }
                        } else {
                            obj = c10.n(getDescriptor(), 0, (KSerializer) this.f28410b, null);
                        }
                    } else {
                        Object obj3 = w0.f28500a;
                        if (obj != obj3) {
                            if (obj2 != obj3) {
                                Object d10 = d(obj, obj2);
                                c10.b(descriptor);
                                return d10;
                            }
                            throw new IllegalArgumentException("Element 'value' is missing");
                        }
                        throw new IllegalArgumentException("Element 'key' is missing");
                    }
                }
            default:
                AbstractC3557B.c0("decoder", decoder);
                AbstractC2910j b02 = A7.b.b0(decoder);
                kotlinx.serialization.json.b k10 = b02.k();
                KSerializer c11 = c(k10);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>", c11);
                return b02.u().a(c11, k10);
        }
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f28411c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC0405d abstractC0405d;
        int i10 = this.f28409a;
        Object obj2 = this.f28410b;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("encoder", encoder);
                AbstractC2431b c10 = encoder.c(getDescriptor());
                c10.i(getDescriptor(), 0, (KSerializer) obj2, a(obj));
                c10.i(getDescriptor(), 1, (KSerializer) this.f28411c, b(obj));
                c10.b(getDescriptor());
                return;
            default:
                AbstractC3557B.c0("encoder", encoder);
                AbstractC3557B.c0("value", obj);
                KSerializer b10 = encoder.a().b(obj, (AbstractC0405d) obj2);
                if (b10 == null) {
                    Class<?> cls = obj.getClass();
                    kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                    b10 = Bi.c.G1(d10.b(cls));
                    if (b10 == null) {
                        AbstractC0405d b11 = d10.b(obj.getClass());
                        String o10 = b11.o();
                        if (o10 == null) {
                            o10 = String.valueOf(b11);
                        }
                        throw new IllegalArgumentException("Class '" + o10 + "' is not registered for polymorphic serialization " + ("in the scope of '" + abstractC0405d.o() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
                    }
                }
                b10.serialize(encoder, obj);
                return;
        }
    }

    public AbstractC2688N(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f28410b = kSerializer;
        this.f28411c = kSerializer2;
    }

    public AbstractC2688N(AbstractC0405d abstractC0405d) {
        AbstractC3557B.c0("baseClass", abstractC0405d);
        this.f28410b = abstractC0405d;
        this.f28411c = Ad.l.O("JsonContentPolymorphicSerializer<" + abstractC0405d.o() + '>', C2213c.f25985b, new SerialDescriptor[0], C2220j.f26012Y);
    }
}
