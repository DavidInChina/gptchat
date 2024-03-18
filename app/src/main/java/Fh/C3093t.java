package fh;

import dh.C2723z;
import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3093t {

    /* renamed from: a  reason: collision with root package name */
    public final C2723z f30892a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30893b;

    /* JADX WARN: Type inference failed for: r8v0, types: [fh.s, kotlin.jvm.internal.j] */
    public C3093t(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        this.f30892a = new C2723z(serialDescriptor, new kotlin.jvm.internal.j(2, this, C3093t.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
