package dh;

import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: dh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2693c extends O {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f28436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693c(SerialDescriptor serialDescriptor, int i10) {
        super(serialDescriptor);
        this.f28436c = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    AbstractC3557B.c0("elementDesc", serialDescriptor);
                    return;
                }
                AbstractC3557B.c0("elementDesc", serialDescriptor);
                super(serialDescriptor);
                return;
            }
            AbstractC3557B.c0("elementDesc", serialDescriptor);
            super(serialDescriptor);
            return;
        }
        AbstractC3557B.c0("elementDesc", serialDescriptor);
        super(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        switch (this.f28436c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
