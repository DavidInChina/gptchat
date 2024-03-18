package kotlinx.serialization.internal;

import dh.AbstractC2680F;
import id.AbstractC3557B;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f37648l = true;

    public InlineClassDescriptor(String str, AbstractC2680F abstractC2680F) {
        super(str, abstractC2680F, 1);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC3557B.K(this.f37649a, serialDescriptor.a())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.f37648l && Arrays.equals((SerialDescriptor[]) this.f37658j.getValue(), (SerialDescriptor[]) inlineClassDescriptor.f37658j.getValue())) {
                    int f6 = serialDescriptor.f();
                    int i10 = this.f37651c;
                    if (i10 == f6) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (AbstractC3557B.K(i(i11).a(), serialDescriptor.i(i11).a()) && AbstractC3557B.K(i(i11).e(), serialDescriptor.i(i11).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f37648l;
    }
}
