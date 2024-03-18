package ch;

import dh.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: ch.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC2431b {
    void A(k0 k0Var, int i10, float f6);

    void B(SerialDescriptor serialDescriptor, int i10, long j6);

    boolean C(SerialDescriptor serialDescriptor);

    void b(SerialDescriptor serialDescriptor);

    void d(k0 k0Var, int i10, byte b10);

    void f(k0 k0Var, int i10, char c10);

    void i(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj);

    void l(k0 k0Var, int i10, short s10);

    void m(int i10, int i11, SerialDescriptor serialDescriptor);

    void p(SerialDescriptor serialDescriptor, int i10, boolean z10);

    void q(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj);

    Encoder r(k0 k0Var, int i10);

    void x(SerialDescriptor serialDescriptor, int i10, double d10);

    void z(int i10, String str, SerialDescriptor serialDescriptor);
}
