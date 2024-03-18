package dh;

import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wf.AbstractC6216a;

/* renamed from: dh.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2706i0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28458Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f28459Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2706i0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10) {
        super(0);
        this.f28458Y = i10;
        this.f28459Z = pluginGeneratedSerialDescriptor;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        KSerializer[] childSerializers;
        ArrayList arrayList;
        KSerializer[] typeParametersSerializers;
        int i10 = this.f28458Y;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f28459Z;
        switch (i10) {
            case 0:
                return Integer.valueOf(Bi.c.Z0(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f37658j.getValue()));
            case 1:
                AbstractC2680F abstractC2680F = pluginGeneratedSerialDescriptor.f37650b;
                if (abstractC2680F == null || (childSerializers = abstractC2680F.childSerializers()) == null) {
                    return AbstractC2704h0.f28456b;
                }
                return childSerializers;
            default:
                AbstractC2680F abstractC2680F2 = pluginGeneratedSerialDescriptor.f37650b;
                if (abstractC2680F2 != null && (typeParametersSerializers = abstractC2680F2.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (KSerializer kSerializer : typeParametersSerializers) {
                        arrayList.add(kSerializer.getDescriptor());
                    }
                } else {
                    arrayList = null;
                }
                return AbstractC2704h0.b(arrayList);
        }
    }
}
