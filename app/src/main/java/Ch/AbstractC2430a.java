package ch;

import ah.AbstractC1991b;
import dh.k0;
import gh.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: ch.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC2430a {
    byte A(k0 k0Var, int i10);

    Decoder E(k0 k0Var, int i10);

    d a();

    void b(SerialDescriptor serialDescriptor);

    char h(k0 k0Var, int i10);

    long i(SerialDescriptor serialDescriptor, int i10);

    short j(k0 k0Var, int i10);

    int m(SerialDescriptor serialDescriptor, int i10);

    Object n(SerialDescriptor serialDescriptor, int i10, AbstractC1991b abstractC1991b, Object obj);

    boolean q(SerialDescriptor serialDescriptor, int i10);

    String r(SerialDescriptor serialDescriptor, int i10);

    int t(SerialDescriptor serialDescriptor);

    Object v(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj);

    double x(SerialDescriptor serialDescriptor, int i10);

    float y(k0 k0Var, int i10);
}
