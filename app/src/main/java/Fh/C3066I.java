package fh;

import Df.AbstractC0405d;
import bh.AbstractC2214d;
import bh.AbstractC2216f;
import bh.AbstractC2223m;
import bh.C2221k;
import bh.C2222l;
import bh.C2224n;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3066I {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30822a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30823b;

    public C3066I(String str, boolean z10) {
        AbstractC3557B.c0("discriminator", str);
        this.f30822a = z10;
        this.f30823b = str;
    }

    public final void a(AbstractC0405d abstractC0405d, AbstractC0405d abstractC0405d2, KSerializer kSerializer) {
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        AbstractC2223m e10 = descriptor.e();
        if (!(e10 instanceof AbstractC2214d) && !AbstractC3557B.K(e10, C2221k.f26013a)) {
            boolean z10 = this.f30822a;
            if (z10 || (!AbstractC3557B.K(e10, C2224n.f26016b) && !AbstractC3557B.K(e10, C2224n.f26017c) && !(e10 instanceof AbstractC2216f) && !(e10 instanceof C2222l))) {
                if (!z10) {
                    int f6 = descriptor.f();
                    for (int i10 = 0; i10 < f6; i10++) {
                        String g10 = descriptor.g(i10);
                        if (AbstractC3557B.K(g10, this.f30823b)) {
                            throw new IllegalArgumentException("Polymorphic serializer for " + abstractC0405d2 + " has property '" + g10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Serializer for " + abstractC0405d2.o() + " of kind " + e10 + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + abstractC0405d2.o() + " can't be registered as a subclass for polymorphic serialization because its kind " + e10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
