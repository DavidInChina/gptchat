package dh;

import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class k0 extends O {

    /* renamed from: c  reason: collision with root package name */
    public final String f28463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        AbstractC3557B.c0("primitive", serialDescriptor);
        this.f28463c = serialDescriptor.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f28463c;
    }
}
