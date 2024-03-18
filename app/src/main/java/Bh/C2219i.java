package bh;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xf.AbstractC6438a;

/* renamed from: bh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2219i implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f26011Z;

    public /* synthetic */ C2219i(SerialDescriptor serialDescriptor, int i10) {
        this.f26010Y = i10;
        this.f26011Z = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f26010Y;
        SerialDescriptor serialDescriptor = this.f26011Z;
        switch (i10) {
            case 0:
                return new C2218h(serialDescriptor, 0);
            default:
                return new C2218h(serialDescriptor, 1);
        }
    }
}
