package dh;

import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2681G extends W {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2681G(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, int i10) {
        super("kotlin.collections.HashMap", serialDescriptor, serialDescriptor2);
        if (i10 != 1) {
            AbstractC3557B.c0("keyDesc", serialDescriptor);
            AbstractC3557B.c0("valueDesc", serialDescriptor2);
            return;
        }
        AbstractC3557B.c0("keyDesc", serialDescriptor);
        AbstractC3557B.c0("valueDesc", serialDescriptor2);
        super("kotlin.collections.LinkedHashMap", serialDescriptor, serialDescriptor2);
    }
}
